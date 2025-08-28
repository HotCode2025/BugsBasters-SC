const cola = ["Juan", "Martina", "Sofia", "Julian", "Andrea", "Olga"]; // Valores agregados manualmente

while (cola.length > 0) {
    const seRetira = cola.shift();
    console.log(`Atendido el cliente/a: ${seRetira}`);
    console.log(cola);
}