package ejercicio20;

public class ReservaVuelo extends Reserva {

//    Atributos
    private String destino;
    private double impuestoAeropuerto;

//    Constructor
    public ReservaVuelo(String codigoReserva, String nombreCliente, double precioBase, String destino, double impuestoAeropuerto) {
        super(codigoReserva, nombreCliente, precioBase);
        setDestino(destino);
        setImpuestoAeropuerto(impuestoAeropuerto);
    }

//    Getters
    public String getDestino() {
        return destino;
    }

    public double getImpuestoAeropuerto() {
        return impuestoAeropuerto;
    }

//    Setters
    public void setDestino(String destino) {
        if (destino == null || destino.strip().isEmpty()) {
            throw new IllegalArgumentException("El destino no puede estar vacío.");
        }
        this.destino = destino;
    }

    public void setImpuestoAeropuerto(double impuestoAeropuerto) {
        if (impuestoAeropuerto < 0) {
            throw new IllegalArgumentException("El impuesto no puede ser negativo.");
        }
        this.impuestoAeropuerto = impuestoAeropuerto;
    }

//    Métodos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información propia---");
        System.out.println("Destino: " + destino);
        System.out.printf("Impuesto aeropuerto: $%.2f\n", impuestoAeropuerto);
    }

    @Override
    public double calcularCostoFinal() {
        return getPrecioBase() + impuestoAeropuerto;
    }

    @Override
    public String tipoReserva() {
        return "Reserva de vuelo";
    }

}
