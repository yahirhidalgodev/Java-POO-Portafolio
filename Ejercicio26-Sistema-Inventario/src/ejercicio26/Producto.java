package ejercicio26;

public class Producto {
//    Atributos 

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
//    Cosntructor

    public Producto(String codigo, String nombre, double precio, int stock) {
        setCodigo(codigo);
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
    }
//    Getters

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
//    Setters

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.strip().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre  no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0.");
        }
        this.precio = precio;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }
//    Métodos

    public void mostrarInformacion() {
        System.out.printf("%-5s %-6s %-10s %-5s\n", codigo, nombre, precio, stock);
    }
}
