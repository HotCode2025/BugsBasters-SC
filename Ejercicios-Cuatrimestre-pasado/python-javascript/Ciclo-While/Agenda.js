const agenda = {};
const operaciones = [
    {opcion: 1, nombre: 'Juan Perez', telefono: '123456789'},
    {opcion: 1, nombre: 'Maria Garcia', telefono: '987654321'},
    {opcion: 3}, // Ver contactos
    {opcion: 2, nombre: 'Juan Perez'}, // Borrar contacto
    {opcion: 3}, // Ver contactos
    {opcion: 4}  // Salir
]; // Valores agregados manualmente

let indiceOperaciones = 0;

while (indiceOperaciones < operaciones.length) {
    console.log('\t.:MENÚ:.');
    console.log('1. Nuevo contacto.');
    console.log('2. Borrar contacto.');
    console.log('3. Ver contactos existentes.');
    console.log('4. Salir.');
    
    const operacion = operaciones[indiceOperaciones];
    const opcion = operacion.opcion;
    console.log(`Opción seleccionada: ${opcion}`);
    indiceOperaciones++;
    
    if (opcion === 1) {
        const nombre = operacion.nombre;
        const telefono = operacion.telefono;
        console.log(`Agregando contacto: ${nombre} - ${telefono}`);
        
        if (!(nombre in agenda)) {
            agenda[nombre] = telefono;
            console.log('¡Contacto agregado exitosamente!');
        } else {
            console.log('Nombre de contacto ya existente.');
        }
    } else if (opcion === 2) {
        const nombre = operacion.nombre;
        console.log(`Borrando contacto: ${nombre}`);
        
        if (nombre in agenda) {
            delete agenda[nombre];
            console.log('Se ha eliminado el contacto seleccionado.');
        } else {
            console.log('Este contacto no existe en la agenda.');
        }
    } else if (opcion === 3) {
        console.log('Agenda de contactos:');
        for (const [nombre, telefono] of Object.entries(agenda)) {
            console.log(`Nombre: ${nombre}, Teléfono: ${telefono}`);
        }
    } else if (opcion === 4) {
        console.log('¡GRACIAS por utilizar su agenda de contactos!');
        break;
    } else {
        console.log('Se ha equivocado de opción de MENÚ.');
    }
    console.log(); // Salto de línea
}