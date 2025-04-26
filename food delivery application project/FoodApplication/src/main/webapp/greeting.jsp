<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MealHut - Food Delivery</title>
    
    <link rel="stylesheet" href="greeting.css">
    <link rel="icon" href="imagesResturent/best food.jpg" type="png/icon">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"
        integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</head>

<body>
    <header class="container">
        <div class="header-box">
            <a class="navbar" href="contact us.jsp">Contact us</a>
            <a class="navbar" href="login" >Sign In</a>
         
        </div>

        <div class="content">
            <p id="heading"><img id="logo" width="60px" height="60px" src="imagesResturent/best food.jpg" alt="Best Food">MealHut
            </p>
            <h1 id="lines">Get your favorite meals delivered straight to your doorstep in minutes!</h1>
            <div id="navigates">
                <span><a class="navigate" href="home">Explore Restaurants</a></span>
                <span><a class="navigate" href="registration" >Register Now</a></span>
            </div>
        </div>

        <div class="video-container">
            <video autoplay muted loop id="bg-video">
                <source src="imagesResturent/Wow_Kitchens_Jaipur___Cinematic_Food_Commercial___Tarun_Gupta_Photography(1080p)_001.mp4"
                    type="video/mp4">
            </video>
        </div>
    </header>



    <div class="foodInfo">
        <p id="header">Savor Every Bite: A Tribute to the Power of Food</p>
        <div id="info-1">
            <img class="food-image" style="border-radius: 15px;" width="700px" height="340px" src="imagesResturent/foodimage.jpg" alt="">
        </div>
        <div id="info-2">
            <p>"Every meal is a gift, a symbol of hard work, love, and resources <br>that many don’t have. Wasting food
                is
                not just a loss for us, but <br>for those who struggle to find their next meal. Let’s make every <br>
                bite count.
                Appreciate what you have, and remember that food <br>is not just about filling your stomach—it’s about
                respecting what<br> nourishes us."</p>
        </div>
    </div>


<div class="card-cantainer">
    <div class="card" id="card-1">
        <div class="card" style="width: 18rem;">
            <img height="220px" src="imagesResturent/prashanth.JPG" class="card-img-top" alt="img loading">
            <div class="card-body">
                <h5 class="card-title">Prashanth Nilankar</h5>
                <p class="card-text">"The food was amazing! I loved the <br> spice levels and the textures were
                    perfect. Will definitely recommend it <br>to others!". </p>
                <p>
                    Rating:
                    <span class="star">★ ★ ★ ★ ★</span> <!-- 5 stars -->
                </p>
                <a class="navigate" href="https://www.instagram.com/prashanth_nilankar?igsh=YzljYTk1ODg3Zg=="
                    class="btn btn-primary" target="_blank">Contact for Queries</a>
            </div>
        </div>
    </div>

    <div class="card" id="card-2">
        <div class="card" style="width: 18rem;">
            <img height="220px" src="imagesResturent/1743953476500.jpg"
                class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">Prabhu</h5>
                <p class="card-text">"It was good,but the presentation <br> could be improved. The flavors were <br>
                    a bit too strong for me, but others <br> may enjoy it."</p>
                <p>
                    Rating:
                    <span class="star">★ ★ ★ ★ ★</span> <!-- 5 stars -->
                </p>
                <a class="navigate" href="https://www.instagram.com/prabhupanchal74?utm_source=ig_web_button_share_sheet&igsh=ZDNlZDc0MzIxNw=="
                    class="btn btn-primary" target="_blank">Contact for Queries</a>
            </div>
        </div>
    </div>

    <div class="card" id="card-3">
        <div class="card" style="width: 18rem;">
            <img height="220px" src="imagesResturent/mounesh.JPG" class="card-img-top" alt="image loading">
            <div class="card-body">
                <h5 class="card-title">Mounesh</h5>
                <p class="card-text">"I loved the texture of the food, especially how soft and well-cooked <br> the
                    rice was. However, I felt it was <br> a little too salty."</p>
                <p>
                    Rating:
                    <span class="star">★ ★ ★ ★ ★</span> <!-- 5 stars -->
                </p>
                <a class="navigate" href="https://www.instagram.com/mounesh_pattar_67?igsh=YzljYTk1ODg3Zg=="
                    class="btn btn-primary" target="_blank">Contact for Queries</a>
            </div>
        </div>
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
                    <a id="email"
                        href="mailto:manikanthpattar0@gmail.com?subject=Subject%20Here&body=Body%20Text%20Here">
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
                    <p>24/7</p>
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