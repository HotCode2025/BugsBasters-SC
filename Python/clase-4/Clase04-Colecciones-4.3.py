# Ejercicio 3: Agregar personajes a una lista

# Creamos la lista de personajes del Señor de los Anillos
personajes = [
    {
        "Nombre": "Aragon",
        "Clase": "Guerrero",
        "Raza": "Dúnadan del norte"
    },
    {
        "Nombre": "Gandalf",
        "Clase": "Mago",
        "Raza": "Istar"
    },
    {
        "Nombre": "Legolas",
        "Clase": "Arquero",
        "Raza": "Elfo Sindar"
    },
    {
        "Nombre": "Gimli",
        "Clase": "Bárbaro",
        "Raza": "Enano"
    },
    {
        "Nombre": "Boromir",
        "Clase": "Caballero",
        "Raza": "Hombre de Gondor"
    },
    {
        "Nombre": "Sam",
        "Clase": "Cocinero",
        "Raza": "Hobbit"
    },
    {
        "Nombre": "Frodo",
        "Clase": "Bandido",
        "Raza": "Hobbit"

    },
    {

        "Nombre": "Pippin",
        "Clase": "Bandido",
        "Raza": "Hobbit"
    },
    {

        "Nombre": "Meriadoc",
        "Clase": "Bandido",
        "Raza": "Hobbit"
    }
]

# Mostramos la lista de personajes
for personaje in personajes:
    print("Nombre:", personaje["Nombre"])
    print("Clase:", personaje["Clase"])
    print("Raza:", personaje["Raza"])
    print("-------------------------")