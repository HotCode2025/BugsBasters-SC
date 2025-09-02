const numeros = [5, -3, 0, 8, -1, 2, 0, -7, 10, 0]; // ejemplo de 10 números

let conteoPositivos = 0;
let conteoNegativos = 0;
let conteoNeutros = 0;

for (let i = 0; i < numeros.length; i++) {
  let num = numeros[i];

  if (num === 0) {
    conteoNeutros++;
  } else if (num > 0) {
    conteoPositivos++;
  } else {
    conteoNegativos++;
  }
}

console.log("Resultados:");
console.log("Positivos:", conteoPositivos);
console.log("Negativos:", conteoNegativos);
console.log("Neutros:", conteoNeutros);
