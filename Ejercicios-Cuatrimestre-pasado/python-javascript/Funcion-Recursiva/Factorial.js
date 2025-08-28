function factorial(numero) {
    if (numero === 1) {
        return 1;
    } else {
        return numero * factorial(numero - 1);
    }
}

const numeroFactorial = 5; // Valor agregado manualmente
const resultado = factorial(numeroFactorial);
console.log(`El factorial del número ${numeroFactorial} es: ${resultado}`);