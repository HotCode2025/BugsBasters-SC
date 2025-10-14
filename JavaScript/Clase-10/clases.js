// ======================= CLASE PRODUCTO =======================
class Producto {
    static contador = 0;

    constructor(nombre, precioVenta, stock) {
        this.id = ++Producto.contador;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    toString() {
        return `Producto: ${this.nombre} | Precio: $${this.precioVenta.toFixed(2)} | Stock: ${this.stock}`;
    }
}

// ======================= CLASE ORDEN =======================
class Orden {
    static contador = 0;

    constructor() {
        this.id = ++Orden.contador;
        this.fecha = new Date().toLocaleDateString();
        this.productos = [];
    }

    agregarProducto(producto) {
        if (!(producto instanceof Producto)) return console.error("Solo se pueden agregar productos válidos.");
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

// ======================= CLASE VENDEDORTEST =======================
class VendedorTest {
    ejecutarLaPrueba() {   // ← nombre viejo
        console.log("========== INICIO PRUEBA DE VENTAS ==========\n");

        const p1 = new Producto("Televisor Smart 55\"", 850.50, 25);
        const p2 = new Producto("Cable HDMI 2m", 15.00, 150);
        const p3 = new Producto("Soporte Pared", 30.75, 50);

        const o1 = new Orden();
        o1.agregarProducto(p1);
        o1.agregarProducto(p2);
        o1.agregarProducto(p2);

        const o2 = new Orden();
        o2.agregarProducto(p3);
        o2.agregarProducto(p1);
        o2.quitarProducto(p3);

        [o1, o2].forEach(o => o.mostrarOrden());
        console.log("========== PRUEBA FINALIZADA ==========");
    }
}
new VendedorTest().ejecutarPrueba();
