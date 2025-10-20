//¿Cómo creamos funciones en JavaScript de manera descriptiva?
//Tenemos que tener presente que utilizamos el tipo de escritura Camel case y sus identificadores normalemente los vamos a encontrar en ingles, veamos varios ejemplos:
//Estas funciones tienen que ver con la manipulación de datos

//calculateTotalPrice()

//formatUserInput()

//validateEmailAddress()

//convertToCamelCase()

//filterActiveUsers()



//Eventos o Interacción

//handleButtonClick()

//onFormSubmit()

//toggleDarkMode()

//updateProgressBar()

//initializeApp()



//Operaciones CRUD

//createNewUser()

//fetchUserData()

//updateUserProfile()

//deleteUserAccount()



//Utilidades

//generateRandomId()

//formatCurrency()

//debounceSearch()

//sanitizeInput()

//checkPermissions()



//Veamos un ejemplo en código:

// En lugar de:

//function abc() { }



// Mejor:

//function calculateMonthlyRevenue() {

    // código aquí

}



//function validateUserCredentials() {

    // código aquí


}



//Otro ejemplo es una función para sumar todo lo que recibe:

// Más específica o más utilizada

//calculateTotalSum()



// Clara y directa

//sumAllInputs()



// Concisa pero descriptiva

//computeTotal()



// Alternativas excelentes

//calculateSum()

//getTotalAmount()


//sumAllValues()



//Implementando los ejemplos:

//function calculateTotalSum(...inputs) {

    return inputs.reduce((total, current) => total + current, 0);

}



// Uso:

//console.log(calculateTotalSum(1, 2, 3, 4)); // 10


//console.log(calculateTotalSum(10, 20)); // 30



//Aunque todavía no vamos a avanzar en funciones flechas y otras cosas más avanzadas, ya que lo veremos más adelante, es importante comenzar a tener en cuenta esta forma productiva de trabajar a la hora de programar en JavaScript.

//A la hora de trabajar tenemos que tener en cuenta los siguientes items para un identificador de función, en este ejemplo sería una función para sumar todo lo que recibe:


✅ Es muy descriptiva

✅ Indica que hace un cálculo

✅ Específica que es una suma

✅ Suena natural en inglés

✅ Fácil de entender para otros desarrolladores


//Tarea:
//Así como yo aclare 5 puntos importantes de la función para sumar, deben mostrar el significado al español de las diferentes funciones y sus puntos importantes para saber que hacen, de los temas que están más arriba:
1 -funciones tienen que ver con la manipulación de datos
2 - Eventos o Interacción
3 - Operaciones CRUD
4 - Utilidades


## Funciones de Manipulación de Dato: 

-> calculateTotalPrice()
Significado en español: calcular el precio total.
5 puntos que debemos tener en cuenta:
- Suma los precios de varios productos o servicios.
- Puede incluir impuestos o descuentos.
- Se usa en carritos de compra o facturación.
- Recibe un arreglo de precios o productos.
- Devuelve un número con el total final


-> formatUserInput()
Significado en español: formatear la entrada del usuario.
5 pntos que debemos tener en cuenta:
- Limpia y ajusta el texto ingresado por el usuario.
- Puede eliminar espacios, convertir a minúsculas/mayúsculas, etc.
- Se usa antes de guardar o validar datos.
- Mejora la consistencia de la información.
- Evita errores por formatos inesperados.


-> validateEmailAddress()
Significado en español: validar una dirección de correo electrónico.
5 puntos que debemos tener en cuenta:
- Verifica que el email tenga un formato correcto (usuario@dominio.com).
- Se usa en formularios de registro o contacto.
- Puede incluir expresiones regulares (RegExp).
- Previene el envío de datos inválidos.
- Devuelve true o false según la validez.


-> convertToCamelCase()
Significado en español: convertir texto al formato camelCase.
5 puntos que debemos tener en cuenta:
- Transforma cadenas como "nombre completo" en "nombreCompleto".
- Se usa para crear identificadores en JavaScript.
- Mejora la legibilidad del código.
- Elimina espacios y capitaliza palabras intermedias.
- Útil para normalizar nombres de variables o propiedades.


-> filterActiveUsers()
Significado en español: filtrar usuarios activos.
5 puntos que debemos tener en cuenta:
- Selecciona solo los usuarios con estado activo (isActive === true).
- Se aplica sobre un arreglo de objetos (usuarios).
- Devuelve un nuevo arreglo con los resultados filtrados.
- No modifica el arreglo original.
- Útil para mostrar solo usuarios válidos o conectados.


## Eventos ó Interacción

-> handleButtonClick()
Significado en español: manejar el clic de un botón.
5 puntos que debemos tener en cuenta:
- Se ejecuta cuando el usuario hace clic en un botón.
- Permite definir qué acción ocurre (ej. enviar datos, mostrar alerta).
- Se conecta con addEventListener('click', ...) o atributos como @click.
- Mejora la interactividad de la interfaz.
- Puede acceder al estado actual de la app para modificarlo


-> onFormSubmit()
Significado en español: al enviar el formulario.
5 puntos que debemos tener en cuenta:
- Se activa cuando el usuario envía un formulario.
- Permite validar los datos antes de enviarlos.
- Puede prevenir el comportamiento por defecto con event.preventDefault().
- Se usa para enviar datos a una API o guardar en base de datos.
- Es clave para controlar el flujo de registro o contacto


-> toggleDarkMode()
Significado en español: alternar entre modo claro y oscuro.
5 puntos que debemos tener en cuenta:
- Cambia el tema visual de la app entre claro y oscuro.
- Se activa por clic, preferencia del sistema o configuración del usuario.
- Usa clases CSS o variables para aplicar estilos.
- Mejora la accesibilidad y comodidad visual.
- Puede guardar la preferencia en localStorage para mantenerla.


-> updateProgressBar()
Significado en español: actualizar la barra de progreso.
5 puntos que debemos tener en cuenta:
- Modifica visualmente el avance de una tarea (ej. carga, envío).
- Se usa en formularios, descargas o procesos largos.
- Recibe un valor numérico (porcentaje) para ajustar el ancho.
- Mejora la experiencia del usuario al mostrar progreso.
- Puede combinarse con animaciones o eventos de carga.


-> initializeApp()
Significado en español: inicializar la aplicación.
5 puntos que debemos tener en cuenta:
- Se ejecuta al cargar la app o componente.
- Configura estados iniciales, datos o eventos.
- Puede cargar información desde una API.
- Prepara la interfaz para que esté lista para el usuario.
- Es clave para establecer el punto de partida del sistema.


## Operaciones CRUD:

-> createNewUser()
Significado en español: crear un nuevo usuario.
5 puntos que debemos tener en cuenta:
- Representa la operación Create del modelo CRUD.
- Recibe datos como nombre, email, contraseña, etc.
- Se usa en formularios de registro o alta de usuarios.
- Envía los datos a una base de datos o API.
- Devuelve una confirmación o el usuario creado.


-> fetchUserData()
Significado en español: obtener los datos de un usuario.
5 puntos que debemos tener en cuenta:
- Representa la operación Read de CRUD.
- Recupera información desde una base de datos o API.
- Se usa para mostrar datos en pantalla (perfil, dashboard).
- Puede requerir un identificador como userId.
- Devuelve un objeto con los datos del usuario.


-> updateUserProfile()
Significado en español: actualizar el perfil del usuario.
5 puntos que debemos tener en cuenta:
- Representa la operación Update de CRUD.
- Modifica datos existentes (nombre, foto, preferencias).
- Requiere validación de los nuevos datos.
- Se usa en formularios de edición de perfil.
- Devuelve una confirmación o el perfil actualizado


-> deleteUserAccount()
Significado en español: eliminar la cuenta de un usuario.
5 puntos que debemos tener en cuenta:
- Representa la operación Delete de CRUD.
- Elimina todos los datos asociados al usuario.
- Puede requerir confirmación o autenticación.
- Se usa en configuraciones o paneles de usuario.
- Devuelve un mensaje de éxito o error según el resultado.


## Utilidades

-> generateRandomId()
Significado en español: generar un identificador aleatorio.
5 puntos que debemos tener en cuenta:
- Crea un valor único para identificar elementos (usuarios, productos, etc.).
- Se usa en formularios, bases de datos o componentes dinámicos.
- Puede usar Math.random(), Date.now() o librerías como uuid.
- Ayuda a evitar duplicados o colisiones.
- Devuelve un string o número que no se repite fácilmente.


-> formatCurrency()
Significado en español: formatear un número como moneda.
5 puntos que debemos tener en cuenta:
- Convierte valores numéricos en formato monetario (ej. $1.000,00).
- Usa Intl.NumberFormat() para adaptarse a la región.
- Mejora la presentación de precios en interfaces.
- Se aplica en tiendas, reportes, dashboards, etc.
- Puede incluir símbolo de moneda, separadores y decimales.

-> debounceSearch()
Significado en español: limitar la frecuencia de búsqueda mientras el usuario escribe.
5 puntos que debemos tener en cuenta:
- Evita ejecutar búsquedas en cada tecla presionada.
- Espera un tiempo antes de lanzar la función (ej. 300ms).
- Mejora el rendimiento y reduce llamadas innecesarias.
- Se usa en barras de búsqueda o filtros dinámicos.
- Implementa lógica con setTimeout() y clearTimeout().

-> sanitizeInput()
Significado en español: limpiar la entrada del usuario.
5 puntos que debemos tener en cuenta:
- Elimina caracteres peligrosos o no deseados.
- Previene ataques como XSS o inyecciones SQL.
- Se aplica antes de guardar o mostrar datos.
- Asegura que la entrada sea segura y válida.
- Devuelve el texto limpio y confiable.

-> checkPermissions()
Significado en español: verificar los permisos de un usuario.
5 puntos que debemos tener en cuenta:
- Determina si el usuario puede realizar cierta acción.
- Se usa en sistemas con roles (admin, editor, visitante).
- Compara permisos contra una lista o configuración.
- Protege rutas, botones o funciones sensibles.
- Devuelve true o false según el nivel de acceso.
