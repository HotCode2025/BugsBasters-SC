const cadena = 'programacion'; // Valor agregado manualmente
const lista = [];
for (const char of cadena) {
    if (!lista.includes(char)) {
        lista.push(char);
    }
}
console.log(`\nLista de caracteres sin repetir: \n [${lista.join(', ')}]`);