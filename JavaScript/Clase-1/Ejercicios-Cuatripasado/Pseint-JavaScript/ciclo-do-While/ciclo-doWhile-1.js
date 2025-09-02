const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function pedirNumero() {
  rl.question("Digite un número (mayor o igual a 0): ", (input) => {
    let num = parseInt(input);

    if (num < 0) {
      console.log("El número debe ser mayor o igual a 0.");
      pedirNumero(); // volver a preguntar
    } else {
      let factorial = 1;
      let i = 1;

      // Ciclo do...while
      do {
        factorial *= i;
        i++;
      } while (i <= num);

      console.log(`El factorial de ${num} es: ${factorial}`);
      rl.close();
    }
  });
}

pedirNumero();


