# Ejercicio modificar los elementos de una lista
# Llenar una lista con los números del 1 al 10, luego modificar los
# elementos de la lista multiplicándolos por un valor ingresado por el usuario

lista = list(range(1, 10))
multiplicarlos = int(input("Ingrese un número para multiplicar los elementos de la lista: "))
lista_modificada = [x * multiplicarlos for x in lista]
print("Lista modificada:", lista_modificada)
