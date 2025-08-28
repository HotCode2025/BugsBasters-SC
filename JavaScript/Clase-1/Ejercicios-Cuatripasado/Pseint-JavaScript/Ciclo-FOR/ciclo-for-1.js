// Calcular la suma de los "N" primeros números

// Pedimos el valor al usuario
let N = parseInt(prompt("Digite la cantidad de números a sumarse: "));

let suma = 0;

// Bucle para sumar del 1 hasta N
for (let i = 1; i <= N; i++) {
    suma = suma + i;  // suma += i;
}

alert("La suma es: " + suma);

