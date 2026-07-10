package ejercicio24;

public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto("P001", "Laptop Lenovo", 14500.00);
        Producto producto2 = new Producto("P002", "Mouse Inalámbrico", 350.00);
        Producto producto3 = new Producto("P003", "Teclado Mecánico", 1200.00);
        Producto producto4 = new Producto("P004", "Monitor 24 Pulgadas", 3200.00);
        Producto producto5 = new Producto("P005", "Audífonos Bluetooth", 950.00);
        Producto producto6 = new Producto("P006", "Memoria USB 64GB", 250.00);
        Producto producto7 = new Producto("P007", "Disco Duro Externo 1TB", 1800.00);
        Producto producto8 = new Producto("P008", "Webcam HD", 700.00);
        Producto producto9 = new Producto("P009", "Silla Gamer", 4200.00);
        Producto producto10 = new Producto("P010", "Impresora Multifuncional", 2850.00);

        CarritoCompras carrito = new CarritoCompras("C001", "Yahir Hidalgo", 10);

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);
        carrito.agregarProducto(producto4);
        carrito.agregarProducto(producto5);
        carrito.agregarProducto(producto6);
        carrito.agregarProducto(producto7);
        carrito.agregarProducto(producto8);
        carrito.agregarProducto(producto9);
        carrito.agregarProducto(producto10);

        // Intentar agregar un duplicado
        carrito.agregarProducto(producto3);
        // Mostrar carrito
        carrito.mostrarCarrito();
        // Buscar un producto existente
        carrito.buscarProducto("P002");
        // Buscar un producto inexistente
        carrito.buscarProducto("P999");
        // Eliminar un producto
        carrito.eliminarProducto("P004");
        // Mostrar nuevamente
        carrito.mostrarCarrito();
        // Calcular total
        System.out.printf("Total: $%.2f\n", carrito.calcularTotal());
        // Contar productos
        System.out.println("Cantidad de productos: " + carrito.contarProductos());
        // Vaciar carrito
        carrito.vaciarCarrito();
        // Comprobar que quedó vacío
        System.out.println("¿Carrito vacío? " + carrito.estaVacio());
    }
}
