#Diccionarios en python
#Estructura de datos que almacena datos en pares de llave:valor

#una llave y un valor
# dict(key,value)

diccionario = {
    "ide":"Integrated Develomopment Environment",
    "oop":"Object Oriented Programming",
    "dbms":"Database Management System"
}
print(len(diccionario))

#Acceder a un diccionario con la llave
print(diccionario["ide"])
#Acceder a un diccionario con el metodo get
print(diccionario.get("oop"))
#Modificamos un valor
diccionario["dbms"] = "DataBase Management System"
print(diccionario["dbms"])
#Agregar un nuevo par llave:valor      
diccionario["api"] = "Application Programming Interface"
print(diccionario);

#Como recorrer un diccionario
for termino in diccionario:
    print(termino) #Imprime las llaves
    print(diccionario[termino]) #Imprime los valores
#Otra forma de recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, ":", valor)
#Otra forma de recorrer un diccionario
for termino in diccionario.keys():
    print(termino) #Imprime las llaves

for valor in diccionario.values():
    print(valor)

#Comprueba si existe una llave en el diccionario
print("ide" in diccionario) #True

#Agregar un elemento si no existe
diccionario["json"] = "JavaScript Object Notation"
print(diccionario)

#Eliminar un elemento
diccionario.pop("dbms") 
print(diccionario)

#vaciar un diccionario
diccionario.clear()
print(diccionario)

#Eliminar un diccionario
del diccionario 