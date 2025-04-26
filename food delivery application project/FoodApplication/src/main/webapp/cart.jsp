

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, com.tap.models.Cart, com.tap.models.CartItem" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <link rel="icon" type="image/svg+xml" href="/vite.svg" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Food Order Cart</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="icon" href="imagesResturent/best food.jpg" type="png/icon">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="cart.css">
</head>
<body>

<%
    Cart cart = (Cart) session.getAttribute("cart");
	Integer restaurantId = (Integer) session.getAttribute("newRestaurantId");
    restaurantId = restaurantId != null ? restaurantId : 0;  //default value if null
   
    float tax = 0.0f;
    if (cart != null && !cart.getItems().isEmpty()) {
        tax = (18.0f / 100.0f) * cart.getTotalPrice();
    }
%>

<div class="container py-5">
  <h1 class="text-center mb-5 main-title">Your Food Cart</h1>
  <div class="row g-4">
    <!-- Cart Items Section -->
    <div class="col-lg-8">
      <div class="card mb-4 cart-card">
        <div class="card-header bg-primary text-white py-3">
          <h5 class="mb-0 fw-bold">
            <i class="bi bi-bag me-2"></i>Order Items <%= cart != null ? cart.getTotalItems() : 0 %>
          </h5>
        </div>
        <div class="card-body p-4">
          <% 
            if (cart != null && !cart.getItems().isEmpty()) {
                for (CartItem item : cart.getItems().values()) {
          %>  
            <div class="row mb-4 border-bottom pb-4 cart-item">
              <div class="col-md-4">
                <h5 class="product-name"><%= item.getName() %></h5>
              </div>
              <div class="col-md-4">
                <div class="d-flex align-items-center quantity-control">
                    <!-- Decrease Quantity Button -->
                    <form action="cart" method="post"  style="display: inline;">
                    	<input type="hidden" name="restaurantId" value="<%= restaurantId%>">
                        <input type="hidden" name="itemId" value="<%= item.getItemId() %>">
                        <input type="hidden" name="action" value="update">
                        <input type="hidden" name="quantity" value="<%= item.getQuantity() - 1 %>">
                        <button type="submit" class="quantity-btn minus-btn" <% if (item.getQuantity() == 1) { %> disabled <% } %> >-</button>
                    </form>
                    
                    <!-- Quantity Input -->
                    <input type="text" class="quantity-input" value="<%= item.getQuantity() %>" readonly>
                    
                    <!-- Increase Quantity Button -->
                    <form action="cart" method="post"  style="display: inline;">
                    	<input type="hidden" name="restaurantId" value="<%= restaurantId%>">
                        <input type="hidden" name="itemId" value="<%= item.getItemId() %>">
                        <input type="hidden" name="action" value="update">
                        <input type="hidden" name="quantity" value="<%= item.getQuantity() + 1 %>">
                        <button type="submit" class="quantity-btn plus-btn">+</button>
                    </form>
                </div>
              </div>
              <div class="col-md-2">
                <h6 class="mb-0 price">₹<%= item.getPrice() %></h6>
              </div>
              <div class="col-md-2 text-end">
                <!-- Remove Item Button -->
                <form action="cart" method="post" >
                	<input type="hidden" name="restaurantId" value="<%= restaurantId%>">
                    <input type="hidden" name="itemId" value="<%= item.getItemId() %>">
                    <input type="hidden" name="action" value="remove">
                    <button type="submit" class="btn btn-sm btn-outline-danger rounded-circle">
                        <i class="bi bi-trash"></i>
                    </button>
                </form>
              </div>
            </div>
          <% 
                }
            } else {
          %>
            <p class="empty-cart-message">Your cart is empty.</p>
            <a href="home" class="btn btn-outline-danger"><i class="bi bi-bag-check me-2"></i>See restaurants near you</a>
          <% } %>
        </div>
      </div>

      <!-- Action Buttons -->
      <% boolean cartHasItems = (cart != null && cart.getItems() != null && !cart.getItems().isEmpty());
      
      if(cartHasItems){
      %>
      <div class="d-flex justify-content-between action-buttons">
        <a href="menu?restaurantId=<%= session.getAttribute("newRestaurantId") %>" class="btn btn-outline-danger"><i class="bi bi-bag-check me-2"></i>Continue Ordering</a>
        
        
        <form action="cart" method="post"  style="display: inline;">
			<input type="hidden" name="restaurantId" value="<%= restaurantId%>">
            <input type="hidden" name="action" value="removeAll">
            <button type="submit" class="btn btn-outline-danger">
                <i class="bi bi-trash me-2"></i>Clear Cart
            </button>
        </form>
      </div>
      <% } %>
    </div>

    <!-- Bill Details Section -->
    <div class="col-lg-4">
      <div class="card bill-card">
        <div class="card-header bg-primary text-white py-3">
          <h5 class="mb-0 fw-bold">
            <i class="bi bi-receipt me-2"></i>Order Summary
          </h5>
        </div>
        <div class="card-body p-4">
          <div class="d-flex justify-content-between mb-3 bill-item">
            <h6>Subtotal:</h6>
            <h6 class="bill-amount">
              <% if (cart != null) { %>
                <%= cart.getTotalPrice() %>
              <% } else { %>
                0
              <% } %>
            </h6>
          </div>
          <div class="d-flex justify-content-between mb-3 bill-item">
            <h6>Delivery Fee:</h6>
            <h6 class="bill-amount">
              <% if (cart != null && cart.getTotalPrice() != 0) { %>
                  ₹ 50.00
              <% } else { %>
                  0
              <% } %>
            </h6>
          </div>
          <div class="d-flex justify-content-between mb-3 bill-item">
            <h6>Tax (18%):</h6>
            <h6 class="bill-amount">₹ <%= tax %></h6>
          </div>
          <hr class="my-4">
          <div class="d-flex justify-content-between mb-4 total-section">
            <h5 class="fw-bold">Total:</h5>
            <% if (cart != null && cart.getTotalPrice() != 0) { %>
              <h5 class="fw-bold total-amount"><%= cart.getTotalPrice() + tax + 50 %></h5>
            <% } else { %>
              <h5 class="fw-bold total-amount">0</h5>
            <% } %>
          </div>

          <!-- Delivery Options -->
          <div class="mb-4 delivery-options">
            <h6 class="fw-medium mb-3">Delivery Options</h6>
            <div class="form-check mb-2">
              <input class="form-check-input" type="radio" name="deliveryOption" id="deliveryOption1" checked>
              <label class="form-check-label" for="deliveryOption1">Home Delivery</label>
            </div>
            <div class="form-check">
              <input class="form-check-input" type="radio" name="deliveryOption" id="deliveryOption2">
              <label class="form-check-label" for="deliveryOption2">Pickup from Restaurant</label>
            </div>
          </div>

          <!-- Coupon Code -->
          <div class="mb-4 coupon-section">
            <label for="couponCode" class="form-label fw-medium">Apply Promo Code</label>
            <div class="input-group">
              <input type="text" class="form-control" id="couponCode" placeholder="Enter promo code">
              <button class="btn btn-outline-primary" type="button">Apply</button>
            </div>
          </div>

          <!-- Checkout Button -->
          	<form action="checkout">
          	<button type="submit" class="btn btn-success w-100 py-3 checkout-btn">
            <i class="bi bi-bag-check me-2"></i>Proceed to Checkout
          </button>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
