let loader = new THREE.GLTFLoader();

//_____________________CODE FOR VIDEO______________________________

// Code to handle video playback based on scroll position
// (Similar to what you had before)

//__________________CODE FOR 3D MODEL__________________

document.addEventListener('DOMContentLoaded', function () {
    // Code to manipulate the position of a 3D model when the DOM content is loaded
    // (Similar to what you had before)
});




loader.load('result.gltf', 
   function(gltf) {
      car = gltf.scene.children[0];
      car.scale.set(0.5, 0.5, 0.5);
      scene.add(gltf.scene);
      animate();
   },
   undefined,
   function(error) {
      console.error("Error loading 3D model:", error);
   }
);

