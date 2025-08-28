let saldo = 1000;
const opciones = [1, 2, 3, 1, 4]; // Valores agregados manualmente
const montos = [500, 200]; // Valores para ingresar y retirar
let indiceOpciones = 0;
let indiceMontos = 0;

while (indiceOpciones < opciones.length) {
    console.log("\t.:MENÚ:.");
    console.log("1. Ingresar dinero en la cuenta.");
    console.log("2. Retirar dinero de la cuenta.");
    console.log("3. Mostrar dinero disponible.");
    console.log("4. Salir.");
    
    const opcion = opciones[indiceOpciones];
    console.log(`Opción seleccionada: ${opcion}`);
    indiceOpciones++;
    
    if (opcion === 1) {
        const extra = montos[indiceMontos++];
        saldo += extra;
        console.log(`Dinero ingresado: $${extra}`);
        console.log(`Dinero en la cuenta al momento: $${saldo}`);
    } else if (opcion === 2) {
        const retirar = montos[indiceMontos++];
        console.log(`Intentando retirar: $${retirar}`);
        if (retirar > saldo) {
            console.log("NO tiene esa cantidad de dinero.");
        } else {
            saldo -= retirar;
            console.log(`Dinero en la cuenta al momento: $${saldo}`);
        }
    } else if (opcion === 3) {
        console.log(`Dinero en la cuenta al momento: $${saldo}`);
    } else if (opcion === 4) {
        console.log("GRACIAS por utilizar su cajero automático, hasta pronto.");
        break;
    } else {
        console.log("ERROR, Se equivocó de opción de MENÚ.");
    }
    console.log(); // Salto de línea
}