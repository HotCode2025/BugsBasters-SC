// Iterar tupla con FOR

const tupla = [13, 1, 8, 3, 2, 5, 8]; // Valores agregados manualmente
const lista = [];
for (const elemento of tupla) {
    if (elemento < 5) {
        lista.push(elemento);
    }
}
console.log(lista);