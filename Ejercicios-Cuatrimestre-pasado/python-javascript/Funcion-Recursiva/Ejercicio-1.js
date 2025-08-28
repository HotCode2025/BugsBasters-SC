function imprimirNumerosRecursivos(numero) {
    if (numero >= 1) {
        console.log(numero);
        imprimirNumerosRecursivos(numero - 1);
    } else if (numero <= 0 && numero !== 0) {
        console.log('Valor ingresado incorrecto...');
    }
}

const numero = 5; // Valor agregado manualmente
if (numero > 0) {
    imprimirNumerosRecursivos(numero);
} else {
    console.log("No se pueden imprimir números negativos o cero.");
}