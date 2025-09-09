def sumar_valores(*args):
    """
    Función que suma todos los valores numéricos pasados como argumentos.
    :param args: cantidad variable de numeros
    :return: la suma de todos los números
    """
    return sum(args)

# Ejemplo de uso:
Resultado = sumar_valores(10, 5, 3, 7)
print(f"la suma es: {Resultado}")
