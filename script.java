// script.js

// Text for typing animation
const textToType = "This should be typing live....wow";

// Time delay between each character (in milliseconds)
const typingSpeed = 100;

// Function to simulate typing animation
function typeWriterEffect() {
    let index = 0;
    const headerText = document.getElementById('typing-text');
    const textLength = textToType.length;

    function type() {
        if (index < textLength) {
            headerText.textContent += textToType.charAt(index);
            index++;
            setTimeout(type, typingSpeed);
        }
    }

    type();
}

// Start typing animation when the page loads
window.onload = typeWriterEffect;





//console.log("Hello, Engineering World!");

//3D Effect

//window.addEventListener('scroll', function() {
 // var header = document.querySelector('header');
  //header.classList.toggle('scroll', window.scrollY > 0);
});

