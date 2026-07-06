package ejercicio20;

public class ReservaEvento extends Reserva {

//Atributos
    private int cantidadPersonas;
    private double precioPorPersona;

//    Constructor
    public ReservaEvento(String codigoReserva, String nombreCliente, double precioBase, int cantidadPersonas, double precioPorPersona) {
        super(codigoReserva, nombreCliente, precioBase);
        setCantidadPersonas(cantidadPersonas);
        setPrecioPorPersona(precioPorPersona);
    }

//    Getters
    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public double getPrecioPorPersona() {
        return precioPorPersona;
    }

//    Setters
    public void setCantidadPersonas(int cantidadPersonas) {
        if (cantidadPersonas <= 0) {
            throw new IllegalArgumentException("La cantidad de personas debe ser mayor a 0.");
        }
        this.cantidadPersonas = cantidadPersonas;
    }

    public void setPrecioPorPersona(double precioPorPersona) {
        if (precioPorPersona <= 0) {
            throw new IllegalArgumentException("El precio por persona debe ser mayor a 0.");
        }
        this.precioPorPersona = precioPorPersona;
    }
//    Métodos

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información propia---");
        System.out.println("Cantidad de personas: " + cantidadPersonas);
        System.out.printf("Precio por personas: $%.2f\n", precioPorPersona);

    }

    @Override
    public double calcularCostoFinal() {
        return getPrecioBase() + (cantidadPersonas * precioPorPersona);
    }

    @Override
    public String tipoReserva() {
        return "Reserva de evento";
    }
}
