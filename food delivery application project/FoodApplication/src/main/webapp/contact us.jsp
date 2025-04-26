<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&family=Montserrat:wght@400;700&family=Playfair+Display:wght@700&display=swap" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
       <link rel="icon" href="imagesResturent/best food.jpg" type="png/icon">
    <link rel="stylesheet" href="contact-us.css"> <!-- Link to external stylesheet -->
	    <script src="restaurantList.js"></script>
	

</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-light">
            <div class="container-fluid">
                <div class="logo">
                    <img width="30px" height="30px" src="imagesResturent/best food.jpg" alt="logo">
                    <a id="logo-name" href="#">MealHut</a>
                </div>
                <ul class="nav-links navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="home" ><i class="fa-solid fa-backward-step"></i> Back</a></li>
                    <li class="nav-item"><a class="nav-link" href="#contact"><i class="fas fa-phone-alt"></i> Contact</a></li>
                    <li class="nav-item"><a class="nav-link" href="cart"><i class="fas fa-shopping-cart"></i> Cart</a></li>
                    <li class="nav-item"><a class="nav-link" href="login" ><i class="fas fa-sign-in-alt"></i> Sign In</a></li>
                    <li class="nav-item"><a class="nav-link" href="registration"><i class="fas fa-user-plus"></i> Sign Up</a></li>
                </ul>
                <div class="hamburger" onclick="toggleMenu()">
                <div class="line"></div>
                <div class="line"></div>
                <div class="line"></div>
            </div>
            </div>
        </nav>
    </header>
    
    
    
    <div class="mobile-menu">
        <ul>
            
           	<li><a href="home"><i class="fa-solid fa-backward-step"></i> Back</a></li>
            <li><a href="contact us.jsp"><i class="fas fa-phone-alt"></i> Contact</a></li>
            <li><a href="login?action=login"><i class="fas fa-sign-in-alt"></i> Sign In</a></li>
            <li><a href="registration?action=register"><i class="fas fa-user-plus"></i> Sign Up</a></li>
        </ul>
    </div>
    

    <main>
        <!-- Contact Information Section -->
        <section class="contact-info">
            <h1>Contact Us</h1>
            <p>We would love to hear from you. Here is how you can get in touch with us:</p>
            
            <div class="contact-details">
                <h2>Our Contact Information:</h2>
                <ul>
                    <li><strong>Email:</strong> <a href="mailto:manikanthpattar0@gmai.com">manikanthpattar0@gmail.com</a></li>
                    <li><strong>Phone:</strong> <a href="tel:+6361273857">6361273857</a></li>
                    <li><strong>Address:</strong> BTM Layout Bengaluru</li>
                </ul>
            </div>

            <!-- Google Maps Embed -->
            <div class="map">
                <h2>Find Us Here:</h2>
                <iframe
                src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d390578.7622125065!2d77.5522539!3d12.909019!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bae167575775679%3A0x53cc5f6f6f26b453!2sBTM%20Layout%2C%20Bengaluru%2C%20Karnataka%20560029!5e0!3m2!1sen!2sin!4v1671216842260!5m2!1sen!2sin"
                width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy">
            </iframe>
            
            </div>

            <!-- Social Media Links -->
            <div class="social-media">
                <h2>Follow Us:</h2>
                <ul>
                    <li><a href="https://www.linkedin.com/in/manikanth-pattar/" target="_blank">Linkdian</a></li>
                    <li><a href="https://twitter.com" target="_blank">github</a></li>
                    <li><a href="https://www.instagram.com/manikanth_vishwakarm/" target="_blank">Instagram</a></li>
                </ul>
            </div>
        </section>

        <!-- Contact Form Section -->
        <section class="contact-form" id="contact-form">
            <h2>Send Us a Message</h2>
            <p>If you have any questions or feedback, feel free to send us a message. We will get back to you as soon as possible!</p>
            
            <form action="#" method="POST">
                <div class="form-group">
                    <label for="name">Your Name</label>
                    <input type="text" id="name" name="name" class="form-control" placeholder="Enter your full name" required>
                </div>

                <div class="form-group">
                    <label for="email">Email Address</label>
                    <input type="email" id="email" name="email" class="form-control" placeholder="Enter your email address" required>
                </div>

                <div class="form-group">
                    <label for="message">Your Message</label>
                    <textarea id="message" name="message" class="form-control" rows="5" placeholder="Write your message here" required></textarea>
                </div>

                <button type="submit" class="btn btn-primary">Send Message</button>
            </form>
        </section>

       

        <!-- Additional Section: FAQ -->
        <section class="faq">
            <h2>Frequently Asked Questions</h2>
            <div class="accordion" id="accordionExample">
                <div class="accordion-item">
                    <h2 class="accordion-header" id="headingOne">
                        <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                            What is MealHut?
                        </button>
                    </h2>
                    <div id="collapseOne" class="accordion-collapse collapse show" data-bs-parent="#accordionExample">
                        <div class="accordion-body">
                            MealHut is an online platform that helps you find and order food from various local restaurants. You can explore a wide range of cuisines and place an order right from our site.
                        </div>
                    </div>
                </div>
                <div class="accordion-item">
                    <h2 class="accordion-header" id="headingTwo">
                        <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                            How can I place an order?
                        </button>
                    </h2>
                    <div id="collapseTwo" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                        <div class="accordion-body">
                            Simply visit the menu section, choose the food items you want, and proceed to checkout. You can pay securely through our website, and your order will be delivered to your address.
                        </div>
                    </div>
                </div>
                <div class="accordion-item">
                    <h2 class="accordion-header" id="headingThree">
                        <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                            Can I track my order?
                        </button>
                    </h2>
                    <div id="collapseThree" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                        <div class="accordion-body">
                            Yes, you can track your order through the "My Orders" section on our website after placing your order. You will also receive notifications about your order status.
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <!-- Bootstrap JS (requires Popper.js) -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>
</body>
</html>
