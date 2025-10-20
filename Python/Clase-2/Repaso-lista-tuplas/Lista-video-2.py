#Concatenamos una lista

lista1 = [1, 2, 3]
lista2 = [4, 5, 6]
lista_concatenada = lista1 + lista2
print(lista_concatenada)  # Output: [1, 2, 3, 4, 5, 6]

#extend  agregar muchos elementos a una lista
lista_concatenada.extend([7, 8, 9])
print(lista_concatenada)  # Output: [1, 2, 3, 7, 8, 9]

print(lista_concatenada.index(5))  # Output: [4, 5, 6]
#Como saber si un elemento esta  repetido en una lista

print(lista_concatenada.count(5))  # Output: 1
#una lista al reves 

lista_concatenada.reverse()
print(lista_concatenada)  # Output: [9, 8, 7
