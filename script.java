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

//___________________3D Model__________________________//
// Create a scene
const scene = new THREE.Scene();

// Create a camera
const camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);
camera.position.z = 5;

// Create a renderer
const renderer = new THREE.WebGLRenderer();
renderer.setSize(window.innerWidth, window.innerHeight);

// Append the renderer's DOM element to your container
const container = document.getElementById('model-container');
container.appendChild(renderer.domElement);

// Load the STL file and render the model in the scene
const loader = new THREE.STLLoader();
loader.load('path_to_your_model.stl', function (geometry) {
    const material = new THREE.MeshNormalMaterial();
    const mesh = new THREE.Mesh(geometry, material);
    scene.add(mesh);
    renderer.render(scene, camera);
});

// Animate/render loop
function animate() {
    requestAnimationFrame(animate);
    renderer.render(scene, camera);
}
animate();
