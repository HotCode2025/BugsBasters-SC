# Agenda Telefónica Optimizada

# Función para mostrar el menú principal
def mostrar_menu():
    print("\n--- Agenda Telefónica ---")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

# Función para agregar un nuevo contacto a la agenda
def agregar_contacto(agenda):
    nombre = input("Ingrese el nombre del contacto: ").strip()  # Solicita el nombre
    if not nombre:
        print(" El nombre no puede estar vacío.")  # Valida que no esté vacío
        return
    if nombre in agenda:
        print(" El contacto ya existe.")  # Valida que no exista ya el contacto
    else:
        telefono = input("Ingrese el número de teléfono: ").strip()  # Solicita el teléfono
        if not telefono:
            print(" El número no puede estar vacío.")  # Valida que no esté vacío
            return
        agenda[nombre] = telefono  # Agrega el contacto a la agenda
        print(" Contacto agregado.")

# Función para borrar un contacto existente
def borrar_contacto(agenda):
    nombre = input("Ingrese el nombre del contacto a borrar: ").strip()  # Solicita el nombre
    if nombre in agenda:
        del agenda[nombre]  # Elimina el contacto si existe
        print(" Contacto borrado.")
    else:
        print(" El contacto no existe.")  # Informa si el contacto no existe

# Función para mostrar todos los contactos de la agenda
def ver_contactos(agenda):
    if agenda:
        print("\n Contactos en la agenda:")
        for nombre, telefono in agenda.items():  # Recorre todos los contactos
            print(f"- {nombre}: {telefono}")
    else:
        print(" La agenda está vacía.")  # Informa si la agenda está vacía

# Función principal que ejecuta el programa
def main():
    agenda = {}  # Diccionario vacío para almacenar los contactos
    while True:
        mostrar_menu()  # Muestra el menú en cada iteración
        opcion = input("Elija una opción: ").strip()  # Solicita la opción al usuario
        if opcion == "1":
            agregar_contacto(agenda)  # Agrega un contacto
        elif opcion == "2":
            borrar_contacto(agenda)  # Borra un contacto
        elif opcion == "3":
            ver_contactos(agenda)  # Muestra los contactos
        elif opcion == "4":
            print(" Saliendo de la agenda...")  # Sale del programa
            break
        else:
            print(" Opción inválida, intente nuevamente.")  # Opción no válida

# Punto de entrada del programa
if __name__ == "__main__":
    main()