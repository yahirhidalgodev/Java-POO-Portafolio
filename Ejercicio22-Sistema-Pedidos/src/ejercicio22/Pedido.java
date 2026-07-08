package ejercicio22;

public class Pedido {

//    Atributos
    private String numeroPedido;
    private String cliente;
    private Producto[] productos;
    private int cantidadProductos;

//    Constuctor 
    public Pedido(String numeroPedido, String cliente, int capacidadMaxima) {
        setNumeroPedido(numeroPedido);
        setCliente(cliente);

        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero.");
        }

        productos = new Producto[capacidadMaxima];
        cantidadProductos = 0;
    }

//    Getters
    public String getNumeroPedido() {
        return numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

//    Setters
    public void setNumeroPedido(String numeroPedido) {
        if (numeroPedido == null || numeroPedido.strip().isEmpty()) {
            throw new IllegalArgumentException("El número pedido no puede estar vacío.");
        }
        this.numeroPedido = numeroPedido;
    }

    public void setCliente(String cliente) {
        if (cliente == null || cliente.strip().isEmpty()) {
            throw new IllegalArgumentException("El cliente no puede estar vacío.");
        }
        this.cliente = cliente;
    }

//    Métodos
    public void agregarProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("Producto inválido.");
        }
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].getCodigo().equals(producto.getCodigo())) {
                System.out.println("Ya existe un producto con el código " + producto.getCodigo());
                return;
            }

        }
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
        } else {
            System.out.println("No hay espacio disponible.");
        }

    }

    public void mostrarPedido() {
        System.out.println("==========================");
        System.out.println("PEDIDO");
        System.out.println("==========================");
        System.out.println("Número: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("--------------------------");
        for (int i = 0; i < cantidadProductos; i++) {
            productos[i].mostrarInformacion();
        }

        System.out.println("-----------------------");
        System.out.println("Total del pedido: " + calcularTotal());
        System.out.println("==========================");

    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void buscarProducto(String codigo) {
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                System.out.println("Producto encontrado: " + productos[i].getNombre());
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }

    public void eliminarProducto(String codigo) {
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                for (int j = i; j < cantidadProductos - 1; j++) {
                    productos[j] = productos[j + 1];
                }
                System.out.println("Producto eliminado correctamente");
                productos[cantidadProductos - 1] = null;
                cantidadProductos--;
                return;
            }
        }
        System.out.println("No se encotro el producto.");
    }
}
