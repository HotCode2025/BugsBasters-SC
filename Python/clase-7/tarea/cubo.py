class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad


# Ejemplo de uso
ancho = float(input("Ingrese el ancho del cubo: "))
alto = float(input("Ingrese el alto del cubo: "))
profundidad = float(input("Ingrese la profundidad del cubo: "))

cubo = Cubo(ancho, alto, profundidad)
print("El volumen del cubo es:", cubo.calcular_volumen())
