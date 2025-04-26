function LoginPassword() {
    const passwordField = document.getElementById('password');
    const eyeIcon = document.getElementById('eye');
    const eyeSlashIcon = document.getElementById('eye-slash');

    if (passwordField.type === 'password') {
        passwordField.type = 'text';
        eyeIcon.style.display = 'none';
        eyeSlashIcon.style.display = 'inline';
    } else {
        passwordField.type = 'password';
        eyeIcon.style.display = 'inline';
        eyeSlashIcon.style.display = 'none';
    }
}


function RegisterPassword() {
    const passwordField = document.getElementById('register-password');
    const eyeIcon = document.getElementById('eye-2');
    const eyeSlashIcon = document.getElementById('eye-slash-2');

    if (passwordField.type === 'password') {
        passwordField.type = 'text';
        eyeIcon.style.display = 'none';
        eyeSlashIcon.style.display = 'inline';
    } else {
        passwordField.type = 'password';
        eyeIcon.style.display = 'inline';
        eyeSlashIcon.style.display = 'none';
    }
}


function login() {
    document.getElementById('login').style.left = "27px";
    document.getElementById('register').style.left = "350px";
    document.getElementById('btn').style.left = "0px";
}



function register() {
    document.getElementById('login').style.left = "-350px";
    document.getElementById('register').style.left = "25px";
    document.getElementById('btn').style.left = "150px";
}


document.addEventListener('click', function(event) {
    var successMessages = document.querySelectorAll('.success-message');
    successMessages.forEach(function(successMessage) {
        if (!successMessage.contains(event.target)) {
            successMessage.style.display = 'none';
        }
    });
});
