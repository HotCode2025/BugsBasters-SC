function miFuncion(a, b) {
    //console.log("Sumamos: " + (a + b)); // Sumamos: 9

    return a + b;
}

miFuncion(5, 4); // 9


//let resultado = miFuncion(6,7);
console.log(resultado); // 13

let x = function(a, b) { return a + b }; // necesita cierre con punto y coma
let resultado = x(5, 6); // al llamarla se pone la variable y paréntesis
console.log(resultado); // 11

// Funciones autoejecutables (self-invoking)
(function(a, b) {
    console.log('Ejecutando la función: ' + (a * b));
})(9, 6);


console.log(typeof miFuncion); // function

function mifuncionDos(a, b) {
    console.log(arguments.length); // 4
}

mifuncionDos(5, 7, 3, 6);

// toString
var miFuncio = function() {}; // Función vacía
console.log(miFuncio.toString()); // Muestra el código fuente de la función (vacía)