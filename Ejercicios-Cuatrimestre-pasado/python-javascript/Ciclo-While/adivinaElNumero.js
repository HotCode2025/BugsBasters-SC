console.log("\t.:Juego Adivina el Número:.");
const aleatorio = 42; // Valor agregado manualmente
const intentos = [50, 30, 40, 45, 42]; // Valores agregados manualmente
let contador = 0;

for (const numero of intentos) {
    contador++;
    console.log(`Intento ${contador}: ${numero}`);
    
    if (numero > aleatorio) {
        console.log("\tNO es el número, digite un número MENOR.");
    } else if (numero < aleatorio) {
        console.log("\tNO es el número, digite un número MAYOR.");
    } else {
        console.log(`¡FELICIDADES! Acabas de adivinar el número: ${aleatorio}`);
        break;
    }
}
console.log(`\nNúmero de intentos: ${contador}`);