package ejercicio9;

public class Videojuego {

//    Atributos
    private String codigo;
    private String titulo;
    private String plataforma;
    private double precio;
    private int stock;

//    Contructor
    public Videojuego(String codigo, String titulo, String plataforma, double precio, int stock) {
        setCodigo(codigo);
        setTitulo(titulo);
        setPlataforma(plataforma);
        setPrecio(precio);
        setStock(stock);
    }

//    Getter
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

//    Setter
    // Setters
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("Código inválido.");
        }
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("Título inválido.");
        }
    }

    public void setPlataforma(String plataforma) {
        if (plataforma != null && !plataforma.trim().isEmpty()) {
            this.plataforma = plataforma;
        } else {
            throw new IllegalArgumentException("Plataforma inválida.");
        }
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
    }

//    Métodos
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            precio -= precio * (porcentaje / 100);
            System.out.println("Descuento aplicado a " + titulo);
        } else {
            System.out.println("Porcentaje inválido.");
        }
    }

    public void vender(int cantidad) {
        if (cantidad < 0) {
            System.out.println("No se puede vender cantidades negativas");
        }
        if (stock >= cantidad) {
            stock -= cantidad;
            System.out.println("Compra exitosa");
        }
        if (stock < cantidad) {
            System.out.println("No hay suficiente stock.");
        }
    }

    public void reabastecer(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede reabastecer con cantidades negativas.");
        } else {
            stock += cantidad;
            System.out.println("Ahora es stock es de " + stock);
        }
    }

    public double valorInventario() {
        return precio * stock;
    }

    public boolean necesitaReabastecimiento() {
        return stock < 5;
    }

}
