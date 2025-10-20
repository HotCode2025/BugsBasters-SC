# Ejercicio 1 con Matemáticas y la clase math
# Sacar la raíz cuadrada de un número positivo

import math  # Importamos la librería math para usar sqrt()

numero = int(input("Digite un número positivo: "))

if numero < 0:
    print("Error -> Debe ingresar un número positivo")
else:
    raiz = math.sqrt(numero)
    print(f"\nLa raíz cuadrada de {numero} es: {raiz:.2f}")
