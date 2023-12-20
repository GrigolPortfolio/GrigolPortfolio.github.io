// script.js
console.log("Hello, Engineering World!");

//3D Effect

window.addEventListener('scroll', function() {
  var header = document.querySelector('header');
  header.classList.toggle('scroll', window.scrollY > 0);
});