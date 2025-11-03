class Orden:
    contador_ordenes = 0
    
    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)
        
    def agregar_producto(self, producto):
        self._productos.append(producto) # Esto es para agregar un nuevo producto