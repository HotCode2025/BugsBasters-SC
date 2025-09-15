class Persona {
  constructor(apellido) {
    this._apellido = apellido; // el guión bajo indica que es "privado" 
  }

  // Get
  get apellido() {
    return this._apellido;
  }

  // Set
  set apellido(nuevoApellido) {
    this._apellido = nuevoApellido;
  }
}

// Crear objeto con un apellido inicial
let persona = new Persona("Gómez");

// Mostrar apellido inicial con get
console.log("Apellido inicial:", persona.apellido);

// Modificar el apellido con set
persona.apellido = "Fernández";

// Mostrar apellido modificado con get
console.log("Apellido modificado:", persona.apellido);
