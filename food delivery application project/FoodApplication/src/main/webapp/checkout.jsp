<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, com.tap.models.Restaurant, com.tap.models.Cart, com.tap.models.CartItem" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="icon" type="image/svg+xml" href="/vite.svg" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Checkout Page</title>
    <link rel="icon" href="imagesResturent/best food.jpg" type="png/icon">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/MaterialDesign-Webfont/5.3.45/css/materialdesignicons.css" integrity="sha256-NAxhqDvtY0l4xn+YVa6WjAcmd94NNfttjNsDmNatFVc=" crossorigin="anonymous" />
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="checkout.css">
  </head>
  <body>
    <div class="container">
      <div class="row">
        <div class="col-xl-8">
          <div class="card">
            <div class="card-body">
              <ol class="activity-checkout mb-0 px-4 mt-3">
                <!-- Billing Info Section -->
                <li class="checkout-item">
                  <div class="avatar checkout-icon p-1">
                    <div class="avatar-title rounded-circle bg-primary">
                      <i class="bx bxs-receipt text-white font-size-20"></i>
                    </div>
                  </div>
                  <div class="feed-item-list">
                    <h5 class="font-size-16 mb-1">Billing Info</h5>
                    <p class="text-muted text-truncate mb-4">🔒 Your data is secure and will only be used for order processing.</p>
                    <div class="mb-3">
                      <form>
                        <div class="row">
                          <div class="col-lg-4">
                            <div class="mb-3">
                              <label class="form-label" for="billing-name">Name</label>
                              <input type="text" class="form-control" id="billing-name" placeholder="Enter name">
                            </div>
                          </div>
                          <div class="col-lg-4">
                            <div class="mb-3">
                              <label class="form-label" for="billing-email-address">Email Address</label>
                              <input type="email" class="form-control" id="billing-email-address" placeholder="Enter email">
                            </div>
                          </div>
                          <div class="col-lg-4">
                            <div class="mb-3">
                              <label class="form-label" for="billing-phone">Phone</label>
                              <input type="text" class="form-control" id="billing-phone" placeholder="Enter Phone no.">
                            </div>
                          </div>
                        </div>

                        <div class="mb-3">
                          <label class="form-label">Address</label>
                          <textarea class="form-control" id="billing-address" rows="3" placeholder="Enter full address" oninput="updateAddressCards(this.value)"></textarea>

                          <div class="row">
                            <div class="col-lg-4">
                              <div class="mb-4 mb-lg-0">
                                <label class="form-label">Country</label>
                                <select class="form-control form-select" title="Country">
                                  <option value="0">Select Country</option>
                                  <option value="AF">India</option>
                                  <option value="AL">Nepal</option>
                                  <option value="DZ">Indonesia</option>
                                  <option value="AS">America</option>
                                  <option value="AD">Mauritius</option>
                                  <option value="AO">Bhutan</option>
                                  <option value="AI">Sri Lanka</option>                                   
                                </select>
                              </div>
                            </div>

                            <div class="col-lg-4">
                              <div class="mb-4 mb-lg-0">
                                <label class="form-label" for="billing-city">City</label>
                                <input type="text" class="form-control" id="billing-city" placeholder="Enter City">
                              </div>
                            </div>

                            <div class="col-lg-4">
                              <div class="mb-0">
                                <label class="form-label" for="zip-code">Zip / Postal code</label>
                                <input type="text" class="form-control" id="zip-code" placeholder="Enter Postal code">
                              </div>
                            </div>
                          </div>
                        </div>
                      </form>
                    </div>
                  </div>
                </li>
                
                <!-- Shipping Info Section -->
                <li class="checkout-item">
                  <div class="avatar checkout-icon p-1">
                    <div class="avatar-title rounded-circle bg-primary">
                      <i class="bx bxs-truck text-white font-size-20"></i>
                    </div>
                  </div>
                  <div class="feed-item-list">
                    <h5 class="font-size-16 mb-1">Shipping Info</h5>
                    <p class="text-muted text-truncate mb-4">Enter your delivery details to get your order fast and fresh.</p>
                    <div class="mb-3">
                      <div class="row">
                        <div class="col-lg-4 col-sm-6">
                          <div data-bs-toggle="collapse">
                            <label class="card-radio-label mb-0">
                              <input type="radio" name="address" id="info-address1" class="card-radio-input" checked=""/>
                              <div class="card-radio text-truncate p-3">
                                <span class="fs-14 mb-4 d-block">Normal</span>
                                <span class="fs-14 mb-2 d-block">40-55min</span>
                                <span class="text-muted fw-normal text-wrap mb-1 d-block" id="address-details-1">Bengaluru, Karnataka</span>
                                <span class="text-muted fw-normal d-block">Mo. 6361273857</span>
                              </div>
                            </label>
                          </div>
                        </div>
                        <div class="col-lg-4 col-sm-6">
                          <div>
                            <label class="card-radio-label mb-0">
                              <input type="radio" name="address" id="info-address2" class="card-radio-input"/>
                              <div class="card-radio text-truncate p-3">
                                <span class="fs-14 mb-4 d-block">Standard</span>
                                <span class="fs-14 mb-2 d-block">20-25min</span>
                                <span class="text-muted fw-normal text-wrap mb-1 d-block" id="address-details-2">Bengaluru, Karnataka</span>
                                <span class="text-muted fw-normal d-block">Mo. 6361273857</span>
                              </div>
                            </label>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </li>
                
                <!-- Payment Info Section -->
                
                
               
                
                <li class="checkout-item">
                  <div class="avatar checkout-icon p-1">
                    <div class="avatar-title rounded-circle bg-primary">
                      <i class="bx bxs-wallet-alt text-white font-size-20"></i>
                    </div>
                  </div>
                  <div class="feed-item-list">
                    <h5 class="font-size-16 mb-1">Payment Info</h5>
                    <p class="text-muted text-truncate mb-4">Securely complete your purchase with these payment options:</p>
                    <div>
                      <h5 class="font-size-14 mb-3">Payment method :</h5>
                      <div class="row">
                        <div class="col-lg-3 col-sm-6">
                          <div data-bs-toggle="collapse">
                            <label class="card-radio-label">
                              <input type="radio" name="pay-method" id="pay-methodoption1" class="card-radio-input" value="Credit / Debit Card"/>
                              <span class="card-radio py-3 text-center text-truncate">
                                <i class="bx bx-credit-card d-block h2 mb-3"></i>
                                Credit / Debit Card
                              </span>
                            </label>
                          </div>
                        </div>
                        
                        <div class="col-lg-3 col-sm-6">
                          <div>
                            <label class="card-radio-label">
                              <input type="radio" name="pay-method" id="pay-methodoption2" class="card-radio-input" value="Paypal/UPI"/>
                              <span class="card-radio py-3 text-center text-truncate">
                                <i class="bx bxl-paypal d-block h2 mb-3"></i>
                                Paypal/UPI
                              </span>
                            </label>
                          </div>
                        </div>

                        <div class="col-lg-3 col-sm-6">
                          <div>
                            <label class="card-radio-label">
                              <input type="radio" name="pay-method" id="pay-methodoption3" class="card-radio-input" checked="" value="Cash on Delivery"/>
                              <span class="card-radio py-3 text-center text-truncate">
                                <i class="bx bx-money d-block h2 mb-3"></i>
                                Cash on Delivery
                              </span>
                            </label>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </li>
                
                
              </ol>
            </div>
          </div>

          <div class="row my-4">
            <div class="col">
              <a href="menu?restaurantId=<%= session.getAttribute("newRestaurantId") %>" class="btn btn-link text-muted">
                <i class="mdi mdi-arrow-left me-1"></i> Continue Shopping 
              </a>
            </div>
            <div class="col">
              <div class="text-end mt-2 mt-sm-0">
              
              
              
                <form action="checkout" method="post">
                  <button type="submit" class="btn btn-success">
                    <i class="mdi mdi-cart-outline me-1"></i> Proceed
                  </button>
               
              </div>
            </div>
          </div>
        </div>
        
        <!-- Order Summary Section -->
        <div class="col-xl-4">
          <div class="card checkout-order-summary">
            <div class="card-body">
              <div class="p-3 bg-light mb-3">
                <h5 class="font-size-16 mb-0">Order Summary <span class="float-end ms-2">#ITEMS</span></h5>
              </div>
              <div class="table-responsive">
                <table class="table table-centered mb-0 table-nowrap">
                  <thead>
                    <tr>
                      <th class="border-top-0" style="width: 110px;" scope="col">Product</th>
                      <th class="border-top-0" scope="col">Product Desc</th>
                     <th class="border-top-0" scope="col">Quantity</th>
                      <th class="border-top-0" scope="col">Price</th>
                    </tr>
                  </thead>
                  <%
    Cart cart = (Cart) session.getAttribute("cart");
    Double subtotal = (Double) session.getAttribute("subtotal");
    Double tax = (Double) session.getAttribute("tax");
    Double deliveryFee = (Double) session.getAttribute("deliveryFee");
    Double finalAmount = (Double) session.getAttribute("finalAmount");

    for (CartItem item : cart.getItems().values()) {
    	double itemSubtotal = item.getPrice() * item.getQuantity();
    
    if (subtotal == null) {
        subtotal = 0.0;
    }
    if (tax == null) {
        tax = 0.0;
    }
    if (deliveryFee == null) {
        deliveryFee = 50.0;
    }
    if (finalAmount == null) {
        finalAmount = subtotal + tax + deliveryFee;
    }

    System.out.println("JSP Retrieved Values:");
    System.out.println("Subtotal: " + subtotal);
    System.out.println("Tax: " + tax);
%>
									
									<tr>
										<td><h6 class="mb-0"><%=item.getName()%></h6></td>
										<td>₹ <%=item.getPrice()%></td>
										<td><%=item.getQuantity()%></td>
										<td>₹ <%=itemSubtotal%></td>
									</tr>
									
									<%} %>


<tfoot>
    <tr>
        <td colspan="3"><strong>Subtotal:</strong></td>
        <td>₹ <%= subtotal %></td>
    </tr>
    <tr>
        <td colspan="3"><strong>Tax (18%):</strong></td>
        <td>₹ <%= tax %></td>
    </tr>
    <tr>
        <td colspan="3"><strong>Delivery Fee:</strong></td>
        <td>₹ <%= deliveryFee %></td>
    </tr>
    <tr>
        <td colspan="3"><strong>Total:</strong></td>
        <td><strong>₹ <%= finalAmount %></strong></td>
        </form>
    </tr>
</tfoot>

                </table>
                 
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  
  </body>
  
 <script>
//Function to update both address cards dynamically
 function updateAddressCards(address) {
   // Get both address details elements
   const addressElement1 = document.getElementById("address-details-1");
   const addressElement2 = document.getElementById("address-details-2");

   // Update the text content of both address elements with the entered address
   addressElement1.textContent = address || "Enter full address";
   addressElement2.textContent = address || "Enter full address";
 }



 </script>
</html>
