# Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name + ' ' + lastName)

# Desempaquetando una lista
person = ["Ariel", "Betancud"]
# Opción 1: Pasar cada elemento individualmente
show(person[0], person[1])  # Pasamos uno por uno los datos de la lista a la función

# Opción 2: Usar el operador de desempaquetado (*)
show(*person)  # Esto es lo mismo que lo anterior, pero le pasamos todo junto

# Desempaquetando una tupla
person2 = ("Osvaldo", "Giordanini")
show(*person2)  # Desempaquetamos a través de una tupla

# Desempaquetando un diccionario
person3 = {"lastName": "Lucero", "name": "Natalia"}
show(**person3)