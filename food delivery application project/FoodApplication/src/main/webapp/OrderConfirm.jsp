<%@ page
	import="java.util.List, com.tap.models.Restaurant, com.tap.models.Cart, com.tap.models.CartItem,com.tap.models.Order"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/svg+xml" href="/vite.svg" />
<link rel="icon" href="imagesResturent/best food.jpg" type="png/icon">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Order Confirmed</title>
<link rel="stylesheet" href="OrderConfirm.css">
<script src="OrderConfirm.js"></script>

<!-- </head>
<body> -->

   
</head>
<body style="Margin: 0;padding-left: 0; padding-right: 0; padding-top: 0; padding-bottom: 0;background-color: #F5F5F5;min-width: 100%;">
  
   <center style="table-layout: fixed; background-color: #F5F5F5; width: 100%; padding-bottom: 100px;">
      <div style="background-color: #F5F5F5; max-width: 600px;box-shadow: 0 0 10px rgba(0, 0, 0, 0.4);">
      
         

         
           
                  
            

                           <table role="presentation" style="border-spacing: 0;width: 100%;text-align: center;">
                              <tr>
                                 <td style="padding-top: 0;padding-bottom: 0;padding-left: 0;padding-right: 0;">
                                    <img src="imagesResturent/best food.jpg" alt="checked-logo" width="90" style="max-width: 90px;height: auto;" border="0">
                                 </td>
                              </tr>
                           </table>
            
         
                  <table role="presentation" style="width: 100%;border-spacing: 0;text-align: center;">
                     <tr>
                        <td style="padding-left: 20px;padding-right: 20px;padding-bottom: 10px;padding-top: 0px;">
                           <p style="font-size: 32px;font-weight: bold;color: #3B4856;padding-bottom: 0;">Thank you for your Order</p> 
                           <p style="color: #80C4F4;font-size: 20px;font-weight: bold;line-height: 30px;">We received your order<br> <span>thanks for shopping!</span> <p>                            
                           <p style="font-size: 15px;font-weight: 300;color: #2E2E31;line-height: 23px;"> We believe this is the start of a wonderful friendship! </p>
                           <p style="font-size: 15px;font-weight: 300;color: #2E2E31;line-height: 23px;"> We're giving you 10% off an order of min 100Rs or more to help us get to know one another a little better! </p>   
                        </td>
                     </tr>
                  </table>
       

                          
                           <table class="btn" role="presentation"cellpadding="0"cellspacing="0">
                              <tr>
                                 <td class="s-btn s-btn__primary" align="center" bgcolor="#434656" style="border-radius: 3px;">
                                    <a class="s-btn s-btn__primary" href="#"  style="font-size: 15px; font-weight: bold; color: #ffffff; border-radius: 3px;border: 1px solid #48B1FC;padding-left: 15px;padding-right: 15px;padding-bottom: 10px;padding-top: 10px;text-decoration: none;background-color: #434656;display: inline-block;">Check Order Status</a>
                                 </td>
                              </tr>
                           </table>
                    

                  

            
               <td style="padding-top: 20px;padding-bottom: 20px;padding-left: 10px;padding-right: 10px;">
                  <table class="bg-darkmode" role="presentation" style="border-spacing: 0;width: 100%;text-align: center;background-color: #D9D9D9;">
                     <tr>
                       	<div class="order-details">
                       	
                       	
                       	
             		<%
    			Order order = (Order) session.getAttribute("order");
				Cart cart = (Cart) session.getAttribute("cart");
				

				 Double tax = (Double) session.getAttribute("tax");
                 Double delivery = (Double) session.getAttribute("deliveryFee");
                 Double subtotal = (Double) session.getAttribute("subtotal");
                 Double finalAmount = (Double) session.getAttribute("finalAmount");

                 
                 
               
                	 
                           
%>          	
                       	
                       	
                       	
				<h2>Order Details</h2>
				<div class="order-number">
					<span>Order Number:</span> <span id="order-number">ORD-<%= order.getOrderId() %> </span>
				</div>
				
				<div class="order-items">
					<h3>Your Meal</h3>
				
				
		<%
		if (cart != null && order != null && cart.getItems() != null && !cart.getItems().isEmpty()) {
            for (CartItem item : cart.getItems().values()) {
		
		
		%>
		

					<div class="item">
						<div class="item-details">
							<span class="item-name"><%= item.getName() %></span> <span
								class="item-quantity">x<%= item.getQuantity() %></span>
						</div>
						<span class="item-price">&#x20B9;<%= item.getPrice() * item.getQuantity() %></span>
					</div>
					
					<% 
        } // End of loop
                	 }
                	 
                	 %>


		
					

				<div class="order-summary">
					<h3>Order Summary</h3>
					<div class="summary-item">
						<span>Subtotal:</span> <span> &#x20B9; <%= subtotal %></span>
					</div>
					<div class="summary-item">
						<span>Tax (18%):</span> <span>&#x20B9; <%=tax %> Rs</span>
					</div>
					<div class="summary-item">
						<span>Delivery:</span> <span> &#x20B9; <%= delivery %></span>
					</div>
					<div class="summary-item total">
						<span><strong>Total:</strong></span> <span><strong> &#x20B9;<%= finalAmount %></strong></span>
					</div>
				</div>

		
	
                	 
         <%--        	 <% else {%>
                 
                 
                 
                	 
                

	<p class="text-center">Your cart is empty.</p>
	<%
}
%> --%>



				<div class="order-total">
					<span>Total:</span> <span id="order-total">&#x20B9;<%= finalAmount %></span>
				</div>

				<!-- Delivery Address Section - Now positioned below order details and summary -->
				

				<div class="actions">
					<form action="#">
						<button class="button">Track Order</button>
					</form>
					<form action="home">
						<button class="button">Order Again</button>
					</form>
					
				</div>
			</div>
		
					<div class="estimated-time">
  				<p><strong>Estimated Delivery Time:</strong> <span id="estimated-time"></span></p>
				   </div>
                              <tr>
                                 <td style="padding-top:20px;padding-right: 0;padding-bottom:5px;padding-left:0;">
                                    <p style="font-size: 15px;font-weight: bold; color: #000000;"> &copy 2018 - 2022 FoodPanda | All Rights Reserved</p>
                                    <p style="font-size: 15px;font-weight: 400; color: #000000;padding-top: 10px;">Please see our returns policy for more information. 
                                    </p>
                                    <p style="font-size: 15px;font-weight: 400; color: #000000;padding-left: 10px;padding-right: 10px;">We will always keep your data safe and secure. Click here to know why we need it
                                    </p>
                                    <div  class="footer-copyright-text">
                                         <a href="https://www.linkedin.com/in/manikanth-pattar/" style=" font-weight: bold; text-decoration: underline; padding-right: 10px; color:#ff7300;">CodeWithMani</a>
              					    </div>
                                 </td>
                              </tr>

                  <script src="https://run.confettipage.com/here.js" data-confetticode="U2FsdGVkX19Ew4b6qpdBudIEJDMEYvPbX3wQxcR+cg8spbiceJ/LFttQwZjL+PbhOGqTJmiqTo2ZWVlD9X70vCDwWNzeftXCBZStCJ0ya+mGMvq6I4wykE6CMM5PewYhe0VGZF0/4vpGzI4h5VY4Ndm7zo+f5EtWihsHEpEF3CNZDwJ+CEOtIGww5faWROgL14yVGV4tdWq0wmr2xnLjgYK4BKMsRuAoRgoVdZPW10soukQZTsUc4epF7ERgAhDv6svZdv5JWribjVYBCawpg7mmHDA4OxDTkaPurYbNjv6xA0l12su7ILytuDzTBNvNMrSDk26R+wHd/f6s+gQ33i24qJKcBk90uRcxXzCCOAauTJMNpLRzCHvqR/giQkzTDDtewBnKjGHRsb4y8czYqUXawPtnzAE9oF9vMPzktx+Sw71DsagDZqv2G9gZ2gZCC/p/sZZ1sja7NAo6fDCun2cZsQwPctLs6PMpRSBQFYQTBwsptha01Vn2//eVs2SjzOiEr/X1fbRhClqyRD6TCFd41szAPZC8fV0BCDZM+mlQ75RBnyFLf5coVr2SGMuwE/pA/t7kmwFuiDjY35GFPQIWq9QaRFRbm3sFr4CL9AGcOtbX8rU1R1ovWrq10uH07UHy0fYdJ7JTNdXGrvCqX7/OgiFxYdHNW5Vg9ziq2kmDRTxoPFaSK312kjV9ygBE5XSxAl07SJac2X+Ct1vCTlHgeX2AYtBsUac8Gw0Pxjg="></script>
                  <table role="presentation" style="border-spacing: 0;width: 100%;text-align: center;">
                     <tr>
                        <td style="padding-left: 0;padding-right: 0;padding-top: 0;padding-bottom: 10px; background-color:#D9D9D9">
                           <a href="#" target="_blank" style="text-decoration: underline; color: DarkRed;padding-right: 10px;">Unsubscribe</a>
                           <span style="border-right: 1px solid #000000;"></span>
                           <a href="#" target="_blank" style="text-decoration: underline; color: DarkRed;padding-left: 10px;">Help & Contact</a>     
                        </td>
                     </tr>
                  </table>
                           
      </div>
   </center>
   
   
</body>
</html>
