# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación
# elimine los elementos repetidos, por último mostrar la lista.

# Creamos una lista
listaOriginal = [1,2,3,4,5,1,5,6,7,8,9,7,10]

# Eliminamos los duplicados
listaSinRepetidos = list(set(listaOriginal))
print("Lista sin elementos repetidos :", listaSinRepetidos)

