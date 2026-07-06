package ejercicio20;

public abstract class Reserva {

//    Atributos 
    private String codigoReserva;
    private String nombreCliente;
    private double precioBase;

//    Constructor
    public Reserva(String codigoReserva, String nombreCliente, double precioBase) {
        setCodigoReserva(codigoReserva);
        setNombreCliente(nombreCliente);
        setPrecioBase(precioBase);
    }

//    Getters
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getPrecioBase() {
        return precioBase;
    }

//    Setters
    public void setCodigoReserva(String codigoReserva) {
        if (codigoReserva == null || codigoReserva.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el código de reserva.");
        }
        this.codigoReserva = codigoReserva;
    }

    public void setNombreCliente(String nombreCliente) {
        if (nombreCliente == null || nombreCliente.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el nombre del cliente.");
        }
        this.nombreCliente = nombreCliente;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase <= 0) {
            throw new IllegalArgumentException("El precio base debe ser mayor a 0.");
        }
        this.precioBase = precioBase;
    }

//    Métodos
    public void mostrarInformacion() {
        System.out.println("---Información general---");
        System.out.println("Código: " + codigoReserva);
        System.out.println("Cliente: " + nombreCliente);
        System.out.printf("Precio base: $%.2f\n", precioBase);
    }

//    Métodos Abstracto
    public abstract double calcularCostoFinal();

//    Método polimórfico
    abstract String tipoReserva();

}
