class Persona:  # Creamos una clase
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):  # Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni  # Este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):  # self es igual a this
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad} {self.args} {self.kwargs}')


print('--- Creación y modificación de objetos ---')
persona1 = Persona('Ariel', 'Betancud', 32567890, 40)
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')
persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

persona2 = Persona('Osvaldo', 'Giordanini', 30321456, 45)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

print('\n--- Llamada a métodos de la clase ---')
# Los atributos son: caracteristicas
# Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()  # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# persona.mostrar_detalle(persona1) # Debemos pasarle una referencia para el self o dará error
persona1.telefono = '4444555289'
print(f'Este es el telefono de: {persona1.nombre} {persona1.telefono}')  # Hemos creado un atributo de un objeto

# print(persona2.telefono) el objeto persona2 no tiene este atributo, da error
persona3 = Persona('Rogelio', 'Romero', 35789456, 22, 'Teléfono', '2614445557', 'Calle Lopez', 823, 'Manzana', 77, 'Casa', 10,
                   'Teléfono', '2614445557', 'Calle Lopez', 823, 'Manzana', 77, 'Casa', 10)
persona3.mostrar_detalle()