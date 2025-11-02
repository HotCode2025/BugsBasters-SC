from Color import Color
from FiguraGeometrica import FiguraGeometrica
class Cuadrado(FiguraGeometrica, Color):
    def __init__(self, ancho, lado, color):
        FiguraGeometrica.__init__(self, ancho, lado)
        Color.__init__(self, color)

    def calcular_area(self):
        return self.ancho * self.lado


    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)}, {Color.__str__(self)}'