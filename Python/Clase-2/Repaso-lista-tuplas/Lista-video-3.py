# Concatenamos una lista
lista1 = [1, 2, 3]
lista2 = [4, 5, 6]
lista_concatenada = lista1 + lista2
print(lista_concatenada)  # Output: [1, 2, 3, 4, 5, 6]

# extend - agregar muchos elementos a una lista
lista_concatenada.extend([7, 8, 9])
print(lista_concatenada)  # Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

# Como encontrar el indice de un elemento
print(lista_concatenada.index(5))  # Output: 4

# Como saber si un elemento esta repetido en una lista
print(lista_concatenada.count(5))  # Output: 1

# Una lista al reves
lista_concatenada.reverse()
print(lista_concatenada)  # Output: [9, 8, 7, 6, 5, 4, 3, 2, 1]

# Multiplicar una lista repitiendo sus elementos
lista_multiplicada = lista_concatenada * 2
print(lista_multiplicada)  # Output: [9, 8, 7, 6, 5, 4, 3, 2, 1, 9, 8, 7, 6, 5, 4, 3, 2, 1]

# Métodos de ordenamiento
lista_multiplicada.sort()  # Ordena los elementos ascendentemente
print(lista_multiplicada)  # Output: [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9]

lista_multiplicada.sort(reverse=True)  # Ordena descendentemente
print(lista_multiplicada)  # Output: [9, 9, 8, 8, 7, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1, 1]