def celsius_a_fahrenheit(celsius):
    return celsius * 9 / 5 + 32

def fahrenheit_a_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9
while True:
    print("\nConvertidor de Temperaturas")
    print("1. Celsius a Fahrenheit")
    print("2. Fahrenheit a Celsius")
    print("3. Salir")
    
    opcion = input("Seleccione una opción (1-3): ")
    
    if opcion == "1":
        try:
            c = float(input("Ingrese temperatura en Celsius: "))
            f = celsius_a_fahrenheit(c)
            print(f"{c}°C equivalen a {f:.2f}°F")
        except ValueError:
            print("Entrada inválida. Ingrese un número.")
    
    elif opcion == "2":
        try:
            f = float(input("Ingrese temperatura en Fahrenheit: "))
            c = fahrenheit_a_celsius(f)
            print(f"{f}°F equivalen a {c:.2f}°C")
        except ValueError:
            print("Entrad inválida. Ingrese un número.")
    
    elif opcion == "3":
        print("Programa acabado.")
        break
    else:
        print("Opción no válida. Intentalo nuevamente.")