/**
 * 
 */
function toggleMenu() {
    const hamburger = document.querySelector('.hamburger');
    const mobileMenu = document.querySelector('.mobile-menu');
    
    // Toggle 'active' class to show/hide the mobile menu and animate the hamburger icon
    hamburger.classList.toggle('active');
    mobileMenu.classList.toggle('active');
}




document.addEventListener('DOMContentLoaded', function() {
    const searchIcon = document.getElementById('searchIcon');
    const searchOverlay = document.getElementById('searchOverlay');
    const closeIcon = document.getElementById('closeIcon');

    searchIcon.addEventListener('click', function() {
        searchOverlay.classList.add('active');
    });

   
    closeIcon.addEventListener('click', function() {
        searchOverlay.classList.remove('active');
    });
});