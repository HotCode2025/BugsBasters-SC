# ejercicio numero 6 tabla de multiplicar
n = int(input("¿Introduce el número del cual quieres generar la tabla?: "))

for i in range(1, 11):
    print(f'{n} x {i} = {n*i}') 
#ejercicio numero 7 juego adivina el numero
import random

print(" Bienvenido : Adivina el número ")
print("He pensado un número entre 1 y 10... ¡Intenta adivinarlo!")

# Generar número aleatorio entre 1 y 10
numero_secreto = random.randint(1, 10)

intentos = 0
adivinado = False

while not adivinado:
    # Pedir número al usuario
    try:
        intento = int(input("Introduce un número entre 1 y 10: "))
        intentos += 1
    except ValueError:
        print(" Por favor introduce un número válido.")
        continue

    # Comprobar el intento
    if intento < numero_secreto:
        print("El número secreto es MAYOR ")
    elif intento > numero_secreto:
        print("El número secreto es MENOR ")
    else:
        print(f" ¡Felicitaciones! Adivinaste el número {numero_secreto} en {intentos} intentos.")
        adivinado = True