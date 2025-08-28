// Tienda de Libros de Java a  JavaScript

// Solicitar datos al usuario
let nombreLibro = prompt("Ingrese el nombre del libro:");

let idLibro = parseInt(prompt("Ingrese el ID del libro:"));

let precioLibro = parseFloat(prompt("Ingrese el precio del libro:"));

// Preguntar si el envío es gratuito
let respuesta = prompt("¿El envío es gratuito? (sí/no):");
let envioGratuito = respuesta.toLowerCase() === "sí" || respuesta.toLowerCase() === "true";

// Mostrar los datos del libro
console.log("\n--- Datos del Libro ---");
console.log("Nombre: " + nombreLibro);
console.log("ID: " + idLibro);
console.log("Precio: $" + precioLibro);
console.log("Envío Gratuito?: " + envioGratuito);
