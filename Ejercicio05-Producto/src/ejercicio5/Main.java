package ejercicio5;

public class Main {

    public static void main(String[] args) {

        Producto[] productos = {
            new Producto("001", "Laptop Lenovo ThinkPad", 12000, 10),
            new Producto("002", "Mouse Inalámbrico Logitech", 200, 10),
            new Producto("003", "Teclado Mecánico Redragon", 1200, 18),
            new Producto("004", "Monitor Samsung 24 Pulgadas", 3200, 10),
            new Producto("005", "Disco SSD Kingston 1TB", 1500, 22),
            new Producto("006", "Memoria RAM Corsair 16GB", 1100, 15),
            new Producto("007", "Impresora HP DeskJet", 2500, 8),
            new Producto("008", "Audífonos Sony Bluetooth", 1800, 20),
            new Producto("009", "Webcam Logitech HD", 950, 14),
            new Producto("010", "Router TP-Link AX1800", 2100, 9)
        };

        //Ventas válidas
        productos[1].vender(5);
        productos[8].vender(2);
        productos[2].vender(5);
        productos[2].vender(5);
        productos[6].vender(5);

        //Ventas inválidas
        productos[1].vender(-5);
        productos[8].vender(13);
        productos[2].vender(5);

        //Reabastecimientos válidos
        productos[0].reabastecer(10);
        productos[8].reabastecer(10);
        productos[3].reabastecer(10);
        productos[2].reabastecer(10);
        productos[8].reabastecer(10);
        productos[9].reabastecer(10);

        //Reabastecimientos inválidos
        productos[0].reabastecer(-10);
        productos[8].reabastecer(-61);

        System.out.println("-------------");
        for (int i = 0; i < productos.length; i++) {

            productos[i].mostrarProducto();
            System.out.printf("Valor inventario %.2f\n", productos[i].valorInventario());
            System.out.println("Necesita reabasteciminto: " + productos[i].necesitaReabastecimiento());
            System.out.println("--------------");

        }

    }
}
