def desplegarNombres(carlos):
    for nombre in nombres:
        print(carla)

nombres2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')

# desplegarNombres(10, 11)  # No es un objeto iterable
desplegarNombres((10, 11))  # La convertimos a una tupla
desplegarNombres([22, 55])  # La convertimos en una lista



def crear_lista():
    return ['manzana', 'banana', 'pera', 'uva']

def agregar_elemento(lista, elemento):
    lista.append(elemento)

def eliminar_elemento(lista, elemento):
    if elemento in lista:
        lista.remove(elemento)

def mostrar_lista(lista):
    for item in lista:
        print(f"- {item}")

def buscar_elemento(lista, elemento):
    if elemento in lista:
        print(f"'{elemento}' está en la lista.")
    else:
        print(f"'{elemento}' no está en la lista.")