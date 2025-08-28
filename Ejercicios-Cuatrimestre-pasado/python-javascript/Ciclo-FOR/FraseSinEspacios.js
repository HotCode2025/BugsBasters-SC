const frase1 = "vivir por siempre en paz"; // Valor agregado manualmente
let frase2 = "";
for (const char of frase1) {
    if (char !== " ") {
        frase2 += char;
    }
}
console.log(`\nFrase final: ${frase2}`);
console.log(`N° de caracteres: ${frase2.length}`);