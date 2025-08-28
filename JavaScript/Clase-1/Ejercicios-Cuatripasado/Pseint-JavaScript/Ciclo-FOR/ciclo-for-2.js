// Se desea calcular independientemente la suma de los números pares e impares entre 1 y 50

let suma_pares = 0;
let suma_impares = 0;

for (let i = 2; i <= 49; i++) {
    if (i % 2 === 0) {
        suma_pares += i;
    } else {
        suma_impares += i;
    }
}

console.log("La suma de pares es: " + suma_pares);
console.log("La suma de impares es: " + suma_impares);

