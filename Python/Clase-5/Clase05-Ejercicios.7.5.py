def imprimir_descendente(n):
    if n <= 0:
        return 
    print(n)
    imprimir_descendente(n - 1)

while True:
    try:
        numero = int(input("Ingrese un número positivo (o negativo para salir): "))
        if numero < 0:
            print("Programa finalizado.")
            break
        elif numero > 5:
            print("Número mayor a 5. Imprimiendo solo del 5 al 1:")
            imprimir_descendente(5)
        else:
            imprimir_descendente(numero)
    except ValueError:
        print("Entrada inválida. Por favor, ingrese un número entero.")