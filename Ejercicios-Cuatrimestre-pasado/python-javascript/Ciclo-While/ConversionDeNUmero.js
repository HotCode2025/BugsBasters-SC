const numeros = [1, 2, 3, 4, 5, 6]; // Valores agregados manualmente

for (const num of numeros) {
    let numTexto = '';
    
    if (num === 1) {
        numTexto = 'Número uno';
    } else if (num === 2) {
        numTexto = 'Número dos';
    } else if (num === 3) {
        numTexto = 'Número tres';
    } else if (num === 4) {
        numTexto = 'Número cuatro';
    } else if (num === 5) {
        numTexto = 'Número cinco';
    } else {
        numTexto = 'Número no encontrado';
    }
    
    console.log(`El número ingresado es: ${num} - ${numTexto}`);
}