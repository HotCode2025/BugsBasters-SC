class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura


# Ejemplo de uso
base = float(input("Ingrese la base del rectángulo: "))
altura = float(input("Ingrese la altura del rectángulo: "))

rectangulo = Rectangulo(base, altura)
print("El área del rectángulo es:", rectangulo.calcular_area())
