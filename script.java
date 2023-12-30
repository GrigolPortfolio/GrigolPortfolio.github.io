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
