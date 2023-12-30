//____________________CODE FOR TYPEWRITER EFFECT_____________________

const words = ["This should be typing live....wow "];
let wordIndex = 0;
let charIndex = 0;

const typeEffect = () => {
    const currentWord = words[wordIndex];
    const currentChar = currentWord.substring(0, charIndex);

    const headerH4 = document.querySelector('header h4 span');
    headerH4.textContent = currentChar;

    charIndex++;

    if (charIndex <= currentWord.length) {
        setTimeout(typeEffect, 100); // Adjust the interval for typing speed (milliseconds)
    }
};

document.addEventListener('DOMContentLoaded', typeEffect);


//_____________________CODE FOR 3D VIDEO______________________________

const video = document.getElementById('scrollVideo');
const videoContainer = document.getElementById('videoContainer');

// Function to check if an element is in the viewport
function isInViewport(element) {
    const rect = element.getBoundingClientRect();
    return (
        rect.top >= 0 &&
        rect.bottom <= (window.innerHeight || document.documentElement.clientHeight)
    );
}

// Function to handle video playback based on scroll
function handleVideoPlayback() {
    if (isInViewport(videoContainer)) {
        video.play();
    } else {
        video.pause();
    }
}

// Event listener for scroll
window.addEventListener('scroll', handleVideoPlayback);

// Initial check when the page loads
handleVideoPlayback();

//__________________CODE FOR 3D MODEL IMPORT__________________

document.addEventListener('DOMContentLoaded', function () {
    // When the DOM content is loaded

    // Get the entity (3D model) by its ID
    var modelEntity = document.querySelector('#yourModelID'); // Replace 'yourModelID' with the ID of your 3D model entity

    // Manipulate the position of the model
    modelEntity.setAttribute('position', { x: 1, y: 2, z: -3 }); // Modify the position (change x, y, z values)
});
