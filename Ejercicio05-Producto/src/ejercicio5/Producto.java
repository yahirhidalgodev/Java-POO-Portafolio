package ejercicio5;

public class Producto {
//Atributos

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

//    Constructor
    public Producto(String codigo, String nombre, double precio, int stock) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }

        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

//    Métodos
    public void mostrarProducto() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.printf("Precio: %.2f\n", precio);
        System.out.println("Cantidad existente en Stock: " + stock);
    }

    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se pueden vender cantidades negativas.");
            return;
        }

        if (cantidad > stock) {
            System.out.println("Cantidad mayor al stock.");
            return;
        }

        stock -= cantidad;
        System.out.println("Compra exitosa.");

        if (stock == 0) {
            System.out.println("Agotado.");

        }
    }

    public void reabastecer(int cantidad) {
        if (cantidad < 0) {
            System.out.println("No puedes ingresar cantidades negativas");
            return;
        }

        System.out.println("Reabastecimiento exitoso.");
        stock += cantidad;

    }

    public double valorInventario() {
        return precio * stock;
    }

    public boolean necesitaReabastecimiento() {
        return stock < 10;
    }

}
