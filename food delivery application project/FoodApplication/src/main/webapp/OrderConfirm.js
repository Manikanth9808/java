// Initialize countdown (30 minutes in seconds)
let timeRemaining = 30 * 60;

window.onload = function() {
  const updateCountdown = () => {
    let minutes = Math.floor(timeRemaining / 60);
    let seconds = timeRemaining % 60;
    document.getElementById('estimated-time').innerHTML = `${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}`;
    if (timeRemaining-- <= 0) clearInterval(interval);
  };

  // Start countdown interval
  const interval = setInterval(updateCountdown, 1000);
  updateCountdown(); // Display the initial time
};
