package ejercicio22;

public class Main{
    public static void main(String[] args){
        
        // Crear productos
        Producto p1 = new Producto("P001", "Laptop", 15000);
        Producto p2 = new Producto("P002", "Mouse", 350);
        Producto p3 = new Producto("P003", "Monitor", 5000);
        Producto p4 = new Producto("P004", "Teclado", 800);
        Producto p5 = new Producto("P005", "USB", 200);
        Producto p6 = new Producto("P006", "Disco SSD", 1800);
        Producto p7 = new Producto("P007", "Audífonos", 1200);
        Producto p8 = new Producto("P008", "Webcam", 900);
        Producto p9 = new Producto("P009", "Bocinas", 700);
        Producto p10 = new Producto("P010", "Impresora", 4500);
        
        Pedido pedido1 = new Pedido("001", "Yahir",10);
        
        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);
        pedido1.agregarProducto(p3);
        pedido1.agregarProducto(p2);
        pedido1.agregarProducto(p5);
        pedido1.agregarProducto(p6);
        pedido1.agregarProducto(p7);
        pedido1.agregarProducto(p8);
        pedido1.agregarProducto(p9);
        pedido1.agregarProducto(p10);
        
        pedido1.mostrarPedido();
       
        
        pedido1.buscarProducto("P001");
        pedido1.buscarProducto("P002");        
        

        pedido1.eliminarProducto("P001");
        pedido1.mostrarPedido();
        
    }
}