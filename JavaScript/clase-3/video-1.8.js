function miFuncion(a, b) {
    //console.log("Sumamos: " + (a + b)); // Sumamos: 9

    return a + b;
}

miFuncion(5, 4); // 9

//let resultado = miFuncion(6,7);
console.log(resultado); // 13

let x = function(a, b) { return a + b }; // necesita cierre con punto y coma
//let resultado = x(5, 6); // al llamarla se pone la variable y paréntesis
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

//Funciones flecha
const sumarFuncionFlecha = (a, b) => a + b;

//let resultado = sumarFuncionFlecha(3, 7); //Asignamos el valor a una variable

console.log(resultado); // 10

let sumar = function(a = 4, b = 8) {
    console.log(arguments[0]); //muestra el parametro de: a  // Output: 3
    console.log(arguments[1]); //muestra el parametro de: b  // Output: 2
    console.log(arguments[2]); // Output: 9
    return a + b;
}

let resultado = sumar(3, 2, 9);
console.log(resultado); // Output: 5

// Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta); // 41

function sumarTodo() {
    let suma = 0;
    // recorremos los argumentos
    for (let i = 0; i < arguments.length; i++) {// arguments es un arreglo
        suma += arguments[i]; // suma = suma + arguments[i];
    }
    return suma;
}