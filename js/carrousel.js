// Array de imágenes del carrousel
const imagenes = [
  "img/1.jpeg",
  "img/2.jpeg",
  "img/3.jpeg",
  "img/4.jpeg",
  "img/5.jpeg"
];

// Índice actual
let indice = 0;

// Función para mostrar la imagen actual
function mostrarImagen() {
  const imagen = document.getElementById("imagen");
  imagen.src = imagenes[indice];
}

// Función para avanzar en el carrousel (circular)
function avanzar() {
  indice = (indice + 1) % imagenes.length;
  mostrarImagen();
}

// Función para retroceder en el carrousel (circular)
function retroceder() {
  indice = (indice - 1 + imagenes.length) % imagenes.length;
  mostrarImagen();
}

// Mostrar la primera imagen al cargar la página
window.onload = mostrarImagen;