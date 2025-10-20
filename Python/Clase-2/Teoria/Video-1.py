#tipo de set

planetas = {'Marte', 'Jupiter', 'Venus'}
print(len(planetas)) #usamos len =length  significa longitud


#revisar si un elemento esta en el set
print('Marte' in planetas)

#agregar elementos a un set
planetas.add('Tierra')# Funcion add = agregar
print(planetas)

#eliminar elementos de un set
planetas.remove('Jupiter') #Funcion remove = eliminar

print(planetas)

#Eliminar elementos con discard
planetas.discard('Venus') #Funcion discard = descartar
print(planetas)

#limpiar un set
planetas.clear() #Funcion clear = limpiar

print(planetas)
#eliminar un set
del planetas #Funcion del = eliminar