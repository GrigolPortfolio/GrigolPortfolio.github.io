window.addEventListener('DOMContentLoaded', (event) => {
    const welcomeText = document.getElementById('welcome-text');
    const whiteOverlay = document.getElementById('white-overlay');
    const sentences = [
        "",
        "გამარჯობა",
        "Bonjour",
        "Hallo",
        "你好",
        "привет",
        "こんにちは",
        "مرحبا ",
        "Hola",
        "Hello"

    ];
    let currentSentenceIndex = 0;
    let typing = false;

    function displaySentence() {
        const scrollPosition = window.scrollY;
        const fadeStart = 0; // Start fading at the top of the page
        const fadeEnd = 450; // Scroll down 400px to fully fade out
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
    }

    function typeSentence(sentence) {
        typing = true;
        let charIndex = 0;
        const typingInterval = setInterval(() => {
            welcomeText.textContent += sentence.charAt(charIndex);
            charIndex++;

            if (charIndex >= sentence.length) {
                typing = false;
                clearInterval(typingInterval);
            }
        }, 100); // Adjust typing speed here (milliseconds)
    }

    function changeWelcomeText() {
        currentSentenceIndex = (currentSentenceIndex + 1) % sentences.length;
        welcomeText.textContent = '';
        typeSentence(sentences[currentSentenceIndex]);
    }

    // Initial display of the first sentence
    typeSentence(sentences[currentSentenceIndex]);

    // Change welcome text to "Hello" after 3 seconds
    setTimeout(changeWelcomeText, 3000);

    // Loop the changing of the welcome text
    setInterval(() => {
        changeWelcomeText();
    }, 6000); // Change every 6 seconds

    window.addEventListener('scroll', displaySentence);
});

// Calculate the total scrolling length including the spacer
const totalScrollLength = document.body.clientHeight + document.getElementById('spacer').offsetHeight;
