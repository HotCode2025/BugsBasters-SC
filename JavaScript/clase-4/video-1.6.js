let x = 10; // variable primitiva
console.log(x.length); // undefined, las variables primitivas no tienen propiedades
console.log('tipos primitivos'); // number



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
console.log('Ejecutamos con un objeto'); // Gil
let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5492618282821';

console.log(persona2.telefono); // 5492618282821
console.log(persona2.nombre); // Juan
console.log(persona2.direccion); 
console.log(persona["apellido"]);  
console.log("crreamos un nuevo objeto");
// Iteramos sobre las propiedades del objeto 'persona'
for (propiedad in persona) {
    // Imprime el nombre de cada propiedad (la 'clave')
    console.log(propiedad);
    // Salida: nombre, apellido, email, edad, nombreCompleto

    // Imprime el valor asociado a cada propiedad
    console.log(persona[propiedad]);
    // Salida: Carlos, Gil, cgil@gmail.com, 30, [Function: nombreCompleto]
}
// Añade o modifica la propiedad 'apellido' a 'Betancur'. 
// (Note: La línea en la imagen parece incompleta o tiene un error tipográfico.)
persona.apellido = 'Betancur'; 

// Elimina dinámicamente la propiedad 'apellido' del objeto.
delete persona.apellido; 

console.log(persona); 
// El objeto impreso después de la eliminación (asumiendo que había más propiedades): 
// { nombre: 'Carlos', email: 'cgil@gmail.com', ... }