<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="imagesResturent/best food.jpg" type="png/icon">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="account.css">
    <script src="account.js"></script>
    <title> MealHut Login</title>
</head>
<body>
    <div class="container">
        <div class="box">
            
           <%   String failedMessage = (String) request.getAttribute("errorMessage");
                if (failedMessage != null) {
            %>
                <div class="success-message">
                    <p class="message"><%= failedMessage %></p>
                </div>
            <% 
                }
            %>
            
			<form action="login" method="post">
            <div class="box-login" id="login">
                <div class="header">
                    <img class="logo" src="imagesResturent/best food.jpg" alt="Best Food">
                    <h3>Hello, Again</h3>
                    <small>We are so happy to have you back with us!</small>
                </div>
                <div class="input">
                    <div class="userInput">
                        <input type="text" class="input-box" id="emailLogin" name="username" required>
                        <label for="emailLogin">Username</label>
                    </div>
                    <div class="userInput">
                        <input type="password" class="input-box" id="password" name="loginPassword" required>
                        <label for="password">Password</label>
                        <div class="eye">
                            <div class="eye-icon" onclick="LoginPassword()">
                                <i class="fa-solid fa-eye" id="eye"></i>
                                <i class="fa-solid fa-eye-slash" id="eye-slash"></i>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="remember-me">
                    <input type="checkbox" id="checkTic" class="check-box">
                    <label for="checkTic">Remember Me</label>
                </div>
                <div class="submit">
                    <a href="home"><input type="submit" class="input-submit" value="Sign In"></a>	
                </div>
                <div class="forgot-sms">
                    <a href="#">Forgot password?</a>
                </div>
            </div>
</form>

			<%
            String successMessage = (String) session.getAttribute("successMessage");
            if (successMessage != null) {
                session.removeAttribute("successMessage");  // To prevent showing the message after refresh
            %>
                <div class="success-message">
                    <h3 class="message"><%= successMessage %></h3>
                </div>
            <% } %>


            <form action="registration" method="post">
                <div class="register-box" id="register">
                    <div class="header">
                        <img class="logo" src="imagesResturent/best food.jpg" alt="Best Food">
                        <h3>Welcome to MealHut</h3>
                    </div>
                    <div class="input">
                        <div class="userInput">
                            <input type="text" class="input-box" id="fullname" name="name" required>
                            <label for="fullname">Full Name</label>
                        </div>
                        <div class="userInput">
                            <input type="text" class="input-box" id="register-emailLogin" name="email" required>
                            <label for="register-emailLogin">Email</label>
                        </div>
                        <div class="userInput">
                            <input type="text" class="input-box" id="register-phone" name="phone" required>
                            <label for="register-phone">Phone Number</label>
                        </div>
                        <div class="userInput">
                            <input type="password" class="input-box" id="register-password" name="password" required>
                            <label for="register-password">Password</label>
                            <div class="eye">
                                <div class="eye-icon" onclick="RegisterPassword()">
                                    <i class="fa-solid fa-eye" id="eye-2"></i>
                                    <i class="fa-solid fa-eye-slash" id="eye-slash-2"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="submit">
                        <input type="submit" class="input-submit" value="Sign Up">
                    </div>
                </div>
            </form>

            <div class="switch">
                <a href="#" id="login-link" onclick="login()">Login</a>
                <a href="#" id="register-link" onclick="register()">Register</a>
                <div class="button" id="btn"></div>
            </div>
        </div>
    </div>
    
</body>
</html>
