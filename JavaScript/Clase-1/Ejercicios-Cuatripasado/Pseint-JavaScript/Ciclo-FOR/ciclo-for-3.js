const numeros = [5, -3, 0, 8, -1, 2, 0, -7, 10, 0]; // ejemplo de 10 números

//definimos las variables
let conteoPositivos = 0;
let conteoNegativos = 0;
let conteoNeutros = 0;

//utilizamos el ciclo for para contar los numeros
for (let i = 0; i < numeros.length; i++) {
  let num = numeros[i];

  //los dividimos en neutros, positivos y negativos
  if (num === 0) {
    conteoNeutros++;
  } else if (num > 0) {
    conteoPositivos++;
  } else {
    conteoNegativos++;
  }
}

//mostramos los resultados
console.log("Resultados:");
console.log("Positivos:", conteoPositivos);
console.log("Negativos:", conteoNegativos);
console.log("Neutros:", conteoNeutros);
