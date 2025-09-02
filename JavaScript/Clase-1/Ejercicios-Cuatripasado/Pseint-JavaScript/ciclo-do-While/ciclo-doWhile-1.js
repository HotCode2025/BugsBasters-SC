const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

//creamos la funcion preguntar para mostrarla cada vez que necesitemos
function preguntar() {
  rl.question("Ingrese el año: ", (input) => {
    let anio = parseInt(input);

    //definimos cuando es un año bisiesto, si no lo cumple entonces NO es bisiesto
    if ((anio % 4 === 0 && anio % 100 !== 0) || (anio % 400 === 0)) {
      console.log(`El año ${anio} es BISIESTO.`);
    } else {
      console.log(`El año ${anio} NO es bisiesto.`);
    }

    //damos la opcion al usuario para ver si desea continuar
    rl.question("¿Desea continuar? Digite 1 para seguir, otro número para salir: ", (op) => {
      if (op === "1") {
        preguntar(); // vuelve a iniciar
      } else {
        console.log("Programa finalizado.");
        rl.close();
      }
    });
  });
}

preguntar();

