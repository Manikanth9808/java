<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List,com.tap.models.Menu,com.tap.models.Restaurant,com.tap.models.Cart" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu</title>
    <link rel="stylesheet" href="menu.css">
   
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
       <link rel="icon" href="imagesResturent/best food.jpg" type="png/icon">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/remixicon/3.5.0/remixicon.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">
         <script src="restaurantList.js"></script>
</head>

<body>

	
	<header>
        <nav class="navbar">
            <div class="logo">
                <img width="30px" height="30px" src="imagesResturent/best food.jpg" alt="logo">
                <a id="logo-name" href="#">MealHut</a>
            </div>
            
            <ul class="nav-links">
                <li><a href="home" ><i class="fa-solid fa-backward-step"></i> Restaurants</a></li>
                <li><a href="contact us.html"><i class="fas fa-phone-alt"></i> Contact</a></li>
                
               
                <li><a href="cart"><span
						class="position-absolute top-2 end-1 translate-middle badge rounded-pill bg-danger px-2 py-1"
						style="font-size: 20px; transform: translate(50%, -50%);">
						<%
    Cart cart = (Cart) session.getAttribute("cart");
    Integer restaurantId = (Integer) session.getAttribute("restaurantId");
    float tax = 0.0f;
    int totalItems = 0;
    
    if (cart != null && cart.getItems() != null) {
        totalItems = cart.getTotalItems();
        if (totalItems > 0) {
            tax = (18.0f / 100.0f) * cart.getTotalPrice();
        }
    }
    
    out.print(totalItems); // Output the item count (0 if empty)
%>
		</span><i class="fas fa-shopping-cart" ></i> Cart</a></li>
                <li><a href="login" target="_blank"><i class="fas fa-sign-in-alt"></i> Sign In</a></li>
                <li><a href="registration" target="_blank"><i class="fas fa-user-plus"></i> Sign Up</a></li>
                
                <div class="container">
                    <!-- Search Icon -->
                    <div class="search-icon" id="searchIcon">
                        <i id="search" class="ri-search-line search__icon"></i>
                    </div>
            
                    <!-- Search Overlay -->
                    <div class="search-overlay" id="searchOverlay">
                        <!-- Close Icon -->
                        <div class="close-icon" id="closeIcon">
                            <i class="ri-close-line search__close" id="search-close"></i>
                            
                        </div>
                        <!-- Search Bar -->
                        <input type="text" class="search-bar" placeholder="Search...">
                    </div>
                </div>
            </ul>
            <div class="hamburger" onclick="toggleMenu()">
                <div class="line"></div>
                <div class="line"></div>
                <div class="line"></div>
            </div>
        </nav>
        
    </header>

    <div class="mobile-menu">
        <ul>
            <li><a href="home"><i class="fas fa-home"></i> Restaurants</a></li>
            <li><a href="contact us.jsp"><i class="fas fa-phone-alt"></i> Contact</a></li>
            <li><a href="login?action=login"><i class="fas fa-sign-in-alt"></i> Sign In</a></li>
            <li><a href="registration?action=register"><i class="fas fa-user-plus"></i> Sign Up</a></li>
        </ul>
    </div>

        </ul>
    </div>

 
	
	
	
	
	
	
	<% 
	Restaurant details =(Restaurant) request.getAttribute("restaurants");
%>

<div class="restaurant-menu-container">
   
        <div class="restaurant-card">
            <div class="restaurant-info">
                <h2 class="restaurant-name"><%= details.getName() %></h2>
                <div class="restaurant-details">
                    <span class="rating">⭐<%= details.getRating() %> </span>
                    <span class="price">💰 <%= details.getPriceRange() %></span>
                    <span class="time">⏰ <%= details.getDeliveryTime() %></span>
                </div>
                <p class="cuisine-type"><strong>Cuisine:</strong> <%=details.getCuisineType() %></p>
                <p class="opening-hours"><strong>Open Hours:</strong> <%= details.getOpeningHours() %></p>
                <p class="restaurant-address">📍<%= details.getAddress() %></p>
            </div>
            <div>
                <img class="header-image" width="250px" height="235px" src="<%= details.getImagePath() %>" alt="">
            </div>
        </div>
   



        <div class="menu-items">
            <h3 class="name">Menu</h3>
            
            
            
            <% 
            
            List<Menu> menuList=( List<Menu> )request.getAttribute("menus");
            for(Menu travel:menuList) {
            	
            	
            %>
            
            <div class="food-item">
                <img class="food-image" src="<%= travel.getImagePath() %>" alt="<%= travel.getItemName() %>" >
                <div class="food-info">
                    <p class="food-name"><%=travel.getItemName()%></p>
                    <div class="menu-details">
                        <div class="food-details">
                           
                            <p class="food-price"><del style="opacity: .6;">₹<%= travel.getActualPrice() %></del> ₹<%= travel.getPrice() %></p>
                            <p class="food-rating">⭐ <%= travel.getRatings() %> (<%= travel.getPeopleRated() %>)</p>
                            <p class="food-description"><%= travel.getDescription() %> </p>
                       
                        </div>
                        <div class="quantity">
                            
                            <div class="cart">
                            	<form action="cart">
                            	
                            	<div class="plus-minus">
                               
                                <input type="number" name="quantity" class="form-control me-2"  id="quantity" value="1" min="1" required>
                            	</div>
                            	<input type="hidden" name="restaurantId" value="<%= request.getParameter("restaurantId") %>"> 
                            	<input type="hidden" name="itemId" value="<%= travel.getMenuId() %>">
                            	
                            	<input type="hidden" name="action" value="add">
                                <button class="add-to-cart">Add to Cart</button>
                            	</form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

		<% } %>

        </div>
    </div>

    <footer class="details">
        <div class="contact">
            <h1>Contact</h1>
            <ul>
                <li>
                    <p><i class="fa-solid fa-location-dot"></i> BTM Circle, Bengaluru, Karnataka</p>
                </li>

                <li>
                    <p><i class="fa-solid fa-phone"></i> +91 6361273857</p>
                </li>
                <li>
                    <a id="email" href="mailto:manikanthpattar0@gmail.com?subject=Subject%20Here&body=Body%20Text%20Here">
                        <p><i class="fa-solid fa-envelope"></i> manikanthpattar0@gmail.com</p>
                    </a>
                </li>
            </ul>
        </div>

        <div class="opening">
            <h1>Opening Hours</h1>
            <ul>
                <li>
                    <p>Monday - Sunday</p>
                </li>
                <li>
                    <p>24/7 <br></p>
                </li>
                <li>
                    <p>Fast Delivery in 10 mins</p>
                </li>
            </ul>
        </div>

        <div class="social-media">
            <h1>Social Media</h1>
            <ul>
                <li>
                    <p><a
                            href="https://www.linkedin.com/in/manikanth-pattar?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"><i
                                class="fa-brands fa-linkedin"></i> LinkedIn</a></p>
                </li>
                <li>
                    <p><a href="mailto:manikanthpattar0@gmail.com?subject=Subject%20Here&body=Body%20Text%20Here"><i
                                class="fa-solid fa-envelope"></i> manikanthpattar0@gmail.com</a></p>
                </li>
                <li><a href="https://github.com/Manikanth9808"><i class="fa-brands fa-github"></i> GitHub</a></li>
            </ul>
        </div>

        <div class="privacy">
            <h1>Legal</h1>
            <ul>
                <li>
                    <p><a href="#">Privacy Policy</a></p>
                </li>
                <li><a href="#">Terms of Service</a></li>
            </ul>
        </div>
        <p class="copyright">Copyright &copy; 2024 All rights reserved | This template is made with <i
                class="fa fa-heart-o" arial-hidden="true"></i> by <a
                href="https://www.linkedin.com/in/manikanth-pattar?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"
                target="_blank">CodingWithMani</a></p>
    </footer>

    
   
    
</body>

</html>