class Producto {
    static contador = 0;

    constructor(nombre, precioVenta, stock) {
        this.id = ++Producto.contador;
        this._nombre = nombre;
        this._precioVenta = precioVenta;
        this._stock = stock;
    }

    get nombre() {
        return this._nombre;
    }

    get precioVenta() {
        return this._precioVenta;
    }

    get stock() {
        return this._stock;
    }

    set nombre(nuevoNombre) {
        this._nombre = nuevoNombre;
    }

    set precioVenta(nuevoPrecio) {
        this._precioVenta = nuevoPrecio;
    }

    set stock(nuevoStock) {
        this._stock = nuevoStock;
    }

    toString() {
        return `Producto: ${this.nombre} | Precio: $${this.precioVenta.toFixed(2)} | Stock: ${this.stock}`;
    }
}

// 1. La clase Producto representa un artículo vendible dentro del inventario.
// Su objetivo es almacenar los datos básicos de cada producto:el ID, nombre, precio de venta y stock disponible.

class Orden {
    static contador = 0;

    constructor() {
        this.id = ++Orden.contador;
        this.fecha = new Date().toLocaleDateString();
        this.productos = [];
        this.limiteProductos = 3;
    }

    agregarProducto(producto) {
        if (!(producto instanceof Producto)) {
            console.error("Solo se pueden agregar productos válidos.");
            return;
        }
        if (this.productos.length >= this.limiteProductos) {
            console.warn(`Orden #${this.id} ya tiene el máximo de ${this.limiteProductos} productos.`);
            return;
        }
        producto.stock = producto.stock - 1;
        this.productos.push(producto);
    }

    quitarProducto(producto) {
        this.productos = this.productos.filter(p => p.id !== producto.id);
    }

    get total() {
        return this.productos.reduce((t, p) => t + p.precioVenta, 0);
    }

    mostrarOrden() {
        const lista = this.productos.map(p => `  - ${p.toString()}`).join('\n');
        console.log(`
--- ORDEN #${this.id} ---
Fecha: ${this.fecha}
Productos: ${this.productos.length}
Total: $${this.total.toFixed(2)}
${lista}
-------------------------
        `);
    }
}


// 2. La clase Orden representa una transacción de venta. Agrupa productos seleccionados para una compra y calcula su costo total.
// Utiliza un contador estático para asignar un ID único a cada orden.
// Incluye métodos para agregarProducto y quitarProducto.
// El método clave es get total, que usa reduce para sumar automáticamente los precios de todos los productos incluidos.

class VendedorTest {
    ejecutarLaPrueba() {
        console.log("========== INICIO PRUEBA DE VENTAS ==========\n");

        const p1 = new Producto("Televisor Smart 55\"", 850.50, 25);
        const p2 = new Producto("Cable HDMI 2m", 15.00, 150);
        const p3 = new Producto("Soporte Pared", 30.75, 50);
        const p4 = new Producto("Control remoto", 45.00, 80);
        const p5 = new Producto("Pilas AAA (pack x4)", 12.50, 200);
        const p6 = new Producto("Cargador de pilas", 60.00, 40);

        const o1 = new Orden();
        o1.agregarProducto(p1);
        o1.agregarProducto(p2);
        o1.agregarProducto(p2);

        const o2 = new Orden();
        o2.agregarProducto(p3);
        o2.agregarProducto(p1);
        o2.quitarProducto(p3);

        const o3 = new Orden();
        o3.agregarProducto(p4);
        o3.agregarProducto(p5);
        o3.agregarProducto(p6);

        [o1, o2, o3].forEach(o => o.mostrarOrden());

        console.log("========== PRUEBA FINALIZADA ==========");
    }
}

new VendedorTest().ejecutarLaPrueba();
// 3. La clase VendedorTest funciona como demostración del sistema.
// Crea instancias de productos y órdenes, añade y quita productos para probar la funcionalidad.
// Llama a mostrarOrden() para imprimir un resumen con el total calculado automáticamente, verificando que todo el sistema opera correctamente
