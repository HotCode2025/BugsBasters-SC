let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function() { // método o función en JavaScript
        return this.nombre + ' ' + this.apellido;
    }
};

console.log(persona.nombre); // Carlos
console.log(persona.apellido); // Gil
console.log(persona.email); // cgil@gmail.com
console.log(persona.edad); // 30
console.log(persona); // { nombre: 'Carlos', apellido: 'Gil', email: 'cgil@gmail.com', edad: 30, nombreCompleto: [Function: nombreCompleto] }
console.log(persona.nombreCompleto()); // Carlos Gil