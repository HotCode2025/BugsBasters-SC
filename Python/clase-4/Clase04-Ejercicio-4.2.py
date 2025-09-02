# Ejercicio 2: Operaciones de conjuntos con listas
primerLista = ["Hermes", "Artemisa", "Apolo", "Poseidón", "Hermes"]
segundaLista = ["Poseidón", "Démeter", "Artemisa", "Eolo", "Démeter"]
set1 = set(primerLista)
set2 = set(segundaLista)

# 1 Lista de palabras que aparecen en las listas
union = list(set1 | set2)

# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
solo_en_primerLista = list(set1 - set2)

# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
solo_en_segundaLista = list(set2 - set1)

# 4 Lista de palabras que aparecen en ambas listas
interseccion = list(set1 & set2)

print("1. Unión de ambas listas:", union)
print("2. Solo en la primera lista:", solo_en_primerLista)
print("3. Solo en la segunda lista:", solo_en_segundaLista)
print("4. En ambas listas:", interseccion)

