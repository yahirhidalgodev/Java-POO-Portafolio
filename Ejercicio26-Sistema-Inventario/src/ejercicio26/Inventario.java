package ejercicio26;

import java.util.ArrayList;

public class Inventario {

//    Atributos
    private String nombre;
    private ArrayList<Producto> productos;

//    Constructor
    public Inventario(String nombre) {
        setNombre(nombre);
        productos = new ArrayList<>();
    }

//    Getter
    public String getNombre() {
        return nombre;
    }
//    Setter

    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

//    Métodos
    private Producto buscarPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public void agregarProducto(Producto producto) {

        if (producto == null) {
            System.out.println("Producto inválido.");
            return;
        }

        if (buscarPorCodigo(producto.getCodigo()) != null) {
            System.out.println("Código duplicado.");
            return;
        }

        productos.add(producto);
        System.out.println("Producto agregado.");
    }

    public void buscarProducto(String codigo) {

        Producto producto = buscarPorCodigo(codigo);

        if (producto == null) {
            System.out.println("Producto no encontrado.");
        } else {
            System.out.println("Producto encontrado:");
            producto.mostrarInformacion();
        }

    }

    public void eliminarProducto(String codigo) {

        Producto producto = buscarPorCodigo(codigo);

        if (producto == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        productos.remove(producto);
        System.out.println("Producto eliminado.");

    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos que mostar.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInformacion();
        }
    }

    public double calcularValorInventario() {
        double total = 0;
        if (productos.isEmpty()) {
            System.out.println("no hay productos.");
            return 0;
        }
        for (Producto p : productos) {
            total += p.getPrecio() * p.getStock();
        }
        return total;
    }

    public void contarProductos() {
        if (productos.isEmpty()) {
            System.out.println("no hay productos.");
            return;
        }
        System.out.println("Cantidad de productos registrados: " + productos.size());
    }

    public boolean hayStock(String codigo) {

        Producto producto = buscarPorCodigo(codigo);

        if (producto == null) {
            return false;
        }

        return producto.getStock() > 0;
    }

}
