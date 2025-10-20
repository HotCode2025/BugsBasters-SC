def cajero():
    saldo = 1000
    while True:
        print("\n=== Cajero Automático ===")
        print("1. Ingresar dinero en la cuenta")
        print("2. Retirar dinero de la cuenta")
        print("3. Mostrar dinero disponible")
        print("4. Salir")
        
        opcion = input("Seleccione una opción: ")
        
        if opcion == "1":
            monto = float(input("Ingrese el monto a depositar: $"))
            if monto > 0:
                saldo += monto
                print(f"Se han depositado ${monto:.2f}. Saldo actual: ${saldo:.2f}")
            else:
                print("El monto debe ser mayor a 0.")
        
        elif opcion == "2":
            monto = float(input("Ingrese el monto a retirar: $"))
            if 0 < monto <= saldo:
                saldo -= monto
                print(f"Se han retirado ${monto:.2f}. Saldo actual: ${saldo:.2f}")
            else:
                print("Fondos insuficientes o monto inválido.")
        
        elif opcion == "3":
            print(f"Su saldo disponible es: ${saldo:.2f}")
        
        elif opcion == "4":
            print("Gracias por usar el cajero automático. ¡Hasta luego!")
            break
        
        else:
            print("Opción no válida. Intente nuevamente.")


cajero()
