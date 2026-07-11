package ejercicio26;

public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario("Tienda de Tecnología");

        Producto p1 = new Producto("P001", "Laptop", 18000, 5);
        Producto p2 = new Producto("P002", "Mouse", 250, 20);
        Producto p3 = new Producto("P003", "Monitor", 4200, 8);
        Producto p4 = new Producto("P004", "Teclado", 700, 15);
        Producto p5 = new Producto("P005", "SSD", 1800, 12);
        Producto p6 = new Producto("P006", "USB", 180, 30);
        Producto p7 = new Producto("P007", "Webcam", 950, 6);
        Producto p8 = new Producto("P008", "Impresora", 3200, 4);
        Producto p9 = new Producto("P009", "Audífonos", 1200, 0);
        Producto p10 = new Producto("P010", "Bocinas", 1500, 7);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        inventario.agregarProducto(p7);
        inventario.agregarProducto(p8);
        inventario.agregarProducto(p9);
        inventario.agregarProducto(p10);

        inventario.agregarProducto(
                new Producto("P001", "Tablet", 5000, 3));

        inventario.mostrarProductos();

        inventario.buscarProducto("P004");
        inventario.buscarProducto("P020");

        inventario.eliminarProducto("P005");

        inventario.mostrarProductos();

        System.out.println("\nValor del inventario: $"
                + inventario.calcularValorInventario());

        inventario.contarProductos();

        System.out.println("¿Laptop tiene stock?: "
                + inventario.hayStock("P001"));

        System.out.println("¿Audífonos tiene stock?: "
                + inventario.hayStock("P009"));

    }

}
