const diccionario = {
    "IDE": "Integrated Development Environment",
    "POO": "Programacion Orientada a Objetos", 
    "SABD": "Sistema de Administracion de Base de Datos"
}; // Valores agregados manualmente

// Iterar solo las llaves
for (const termino in diccionario) {
    console.log(termino);
}

// Iterar llave y valor
for (const [termino, valor] of Object.entries(diccionario)) {
    console.log(termino, valor);
}