window.addEventListener('scroll', function() {
    const welcomeText = document.getElementById('welcome-text');
    const whiteOverlay = document.getElementById('white-overlay');
    const scrollPosition = window.scrollY;
    const fadeStart = 0; // Start fading at the top of the page
    const fadeEnd = 4400; // Scroll down 400px to fully fade out
    let opacity;

    // Calculate opacity based on scroll position
    if (scrollPosition <= fadeEnd) {
        opacity = 1 - (scrollPosition / fadeEnd);
    } else {
        opacity = 0;
    }

    // Apply the opacity to the welcome text and white overlay
    welcomeText.style.opacity = opacity;
    whiteOverlay.style.opacity = opacity;
});


