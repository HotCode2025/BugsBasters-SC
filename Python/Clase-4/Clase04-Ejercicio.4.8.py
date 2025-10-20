# Insertar elementos y ordenarlos
# Pedir números y meterlos en una lista, cuando el usuario introduzca un número 0
# nuestro programa dejaría de insertar.
# Por ultimo, mostrar los números ordenados de menor a mayor

#Crear lista vacía
numeros = []

print("Ingrese números (0 para terminar):")

# Pedir números al usuario
while True:
    num = int(input("Número: "))
    if num == 0:  # condición de salida
        break
    numeros.append(num)

# Ordenar la lista
numeros.sort()

# Mostrar números ordenados
print("Números ordenados de menor a mayor:", numeros)

