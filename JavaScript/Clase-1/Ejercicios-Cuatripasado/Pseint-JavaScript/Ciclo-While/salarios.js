// Calcular salarios y sumatoria de 5 empleados

let i = 1;
let suma = 0;

while (i <= 5) {
    console.log("Salario del empleado " + i + ":");

    // Pedir horas trabajadas
    let horas = parseFloat(prompt("Digite las horas trabajadas: "));

    // Pedir tarifa por hora
    let tarifa = parseFloat(prompt("Digite la tarifa por hora: "));

    // Calcular salario
    let salario = horas * tarifa;

    // Mostrar salario individual
    console.log("El salario es: $" + salario);

    // Acumular en la sumatoria
    suma += salario;

    i++;
}

// Mostrar la sumatoria de todos los salarios
console.log("La suma de todos los salarios es: $" + suma);

