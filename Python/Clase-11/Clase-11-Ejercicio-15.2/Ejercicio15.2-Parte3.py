from Producto import Producto

class Orden:
    contador_ordenes = 0
    
    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)
        
    def agregar_producto(self, producto):
        self._productos.append(producto)# Esto es para agregar un nuevo producto
    
    def calcular_total(self):
        total = 0 # Variable temporal para almacenar el total temporal
        for producto in self._productos:
            total += producto.precio
        return total
        
    def __str__(self):
        productos_str = ''
        for producto in self._productos:
            productos_str += producto.__str__() + '|'
        return f'Orden: {self.id_orden}, \nProducto: {productos_str}'

if __name__ == '__main__':
    producto1 = Producto('Camiseta', 100.00)
    producto2 = Producto('Pantalon', 150.00)
    
    productos1 = [producto1, producto2] 
    orden1 = Orden(productos1) 
    print('--- ORDEN 1 ---')
    print(orden1)
    
   
    productos2 = [producto1, producto2]
    orden2 = Orden(productos2)
    print('\n--- ORDEN 2 (Inicial) ---')
    print(orden2)

    # --- SOLUCIÓN DE LA TAREA ---
    # Tarea: Modificar la orden2, ingresando nuevos productos con sus nombres y precios
    
    print('\n--- ORDEN 2 (Modificada con Tarea) ---')
    
    # 1. Creamos los nuevos productos
    producto3 = Producto('Medias', 50.00)
    producto4 = Producto('Campera', 350.00)
    
    # 2. Los agregamos a la orden2 usando el método
    orden2.agregar_producto(producto3)
    orden2.agregar_producto(producto4)
    
    # 3. Imprimimos la orden 2 modificada (verá 4 productos)
    print(orden2)
    
    # 4. Imprimimos la orden 1 para verificar que no cambió (verá 2 productos)
    print('\n--- ORDEN 1 (Verificación) ---')
    print(orden1)