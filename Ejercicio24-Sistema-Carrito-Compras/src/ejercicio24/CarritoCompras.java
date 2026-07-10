package ejercicio24;

public class CarritoCompras {
//    Atributos 

    private String idCarrito;
    private String cliente;
    private Producto[] productos;
    private int cantidadProductos;
//    Constructor

    public CarritoCompras(String idCarrito, String cliente, int capacidadMaxima) {
        setIdCarrito(idCarrito);
        setCliente(cliente);

        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a  0.");
        }

        cantidadProductos = 0;
        productos = new Producto[capacidadMaxima];
    }
//    Getters

    public String getIdCarrito() {
        return idCarrito;
    }

    public String getCliente() {
        return cliente;
    }
//    Setters

    public void setIdCarrito(String idCarrito) {
        if (idCarrito == null || idCarrito.strip().isEmpty()) {
            throw new IllegalArgumentException("El cliente no puede estar vacío.");
        }
        this.idCarrito = idCarrito;
    }

    public void setCliente(String cliente) {
        if (cliente == null || cliente.strip().isEmpty()) {
            throw new IllegalArgumentException("El cliente no puede estar vacío.");
        }
        this.cliente = cliente;
    }
//   Métodos

    public void agregarProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede estar nulo.");
        }

        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].getCodigo().equals(producto.getCodigo())) {
                System.out.println("El código esta duplicado " + producto.getCodigo());
                return;
            }
        }
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = producto;
            System.out.println("Se agregó el producto:" + producto.getNombre());
            cantidadProductos++;
        } else {
            System.out.println("El carrito esta lleno.");
        }
    }

    public void eliminarProducto(String codigo) {

        for (int i = 0; i < cantidadProductos; i++) {

            if (productos[i].getCodigo().equals(codigo)) {
                for (int j = i; j < cantidadProductos - 1; j++) {
                    productos[j] = productos[j + 1];

                }
                System.out.println("Se elimino el producto");
                productos[cantidadProductos - 1] = null;
                cantidadProductos--;
                return;
            }

        }
        System.out.println("Producto no encontrado");
    }

    public void buscarProducto(String codigo) {
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                System.out.println("Producto encontrado: " + productos[i].getNombre());
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void mostrarCarrito() {
        if (cantidadProductos > 0) {
            System.out.println("Cliente: " + cliente);
            System.out.println("Id carrito: " + idCarrito);
            System.out.println("-------------------------------");

            System.out.printf("%-10s %-25s %-3s\n", "Código", "Nombre", "Precio");
            for (int i = 0; i < cantidadProductos; i++) {
                productos[i].mostrarInformacion();
            }
        } else {
            System.out.println("No hay productos en existencia.");
        }
    }

    public double calcularTotal() {
        double calculoTotal = 0;

        for (int i = 0; i < cantidadProductos; i++) {
            calculoTotal += productos[i].getPrecio();
        }
        return calculoTotal;
    }

    public void vaciarCarrito() {
        for (int i = 0; i < cantidadProductos; i++) {
            productos[i] = null;
        }
        cantidadProductos = 0;
        System.out.println("Carrito vacío.");
    }

    public int contarProductos() {
        return cantidadProductos;
    }

    public boolean estaVacio() {
        return cantidadProductos == 0;
    }
}
