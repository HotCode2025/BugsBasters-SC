const numero = 5; // Valor agregado manualmente
const lista = [];
for (let i = 1; i <= 10; i++) {
    lista.push(i * numero);
}

console.log(`\nTabla de multiplicar del ${numero}: \n [${lista.join(', ')}]`);

for (let indice = 0; indice < lista.length; indice++) {
    console.log(`${numero} x ${indice + 1} = ${lista[indice]}`);
}