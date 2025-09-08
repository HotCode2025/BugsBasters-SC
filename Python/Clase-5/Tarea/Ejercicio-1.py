# Ejercicio 1: No repetir caracteres

cadena = input("Ingrese una cadena de texto: ")

# Lista vacía para guardar los caracteres sin repetir
caracteres = []

for c in cadena:
    if c not in caracteres:  # Si no está repetido lo agregamos
        caracteres.append(c)

print("Lista de caracteres sin repetir:", caracteres)
