const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
//definimos las variables
let suma = 0;
let calificacionBaja = 99999;
let i = 1;

//funcion pedirCalificacion, que se mostrara la cantidad de veces que sea necesaria
function pedirCalificacion() {
  rl.question(`Digite la calificación ${i}: `, (input) => {
    let calificacion = parseFloat(input);
    suma += calificacion;

    //buscamos la calificación mas baja
    if (calificacion < calificacionBaja) {
      calificacionBaja = calificacion;
    }
//liitamos la cantidad de veces que se piden los datos, para corresponder a los 10 alumnos
    if (i < 10) {
      i++;
      pedirCalificacion();
    } else {
      let promedio = suma / 10;
      console.log("\nResultados:");
      console.log("La calificación promedio es:", promedio);
      console.log("La calificación más baja es:", calificacionBaja);
      rl.close();
    }
  });
}

pedirCalificacion();
