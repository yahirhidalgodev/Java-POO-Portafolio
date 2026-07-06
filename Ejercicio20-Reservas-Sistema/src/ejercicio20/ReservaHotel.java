package ejercicio20;

public class ReservaHotel extends Reserva {

// Atributos
    private int numeroNoches;
    private double precioPorNoche;

// Constructor
    public ReservaHotel(String codigoReserva, String nombreCliente, double precioBase, int numeroNoches, double precioPorNoche) {

        super(codigoReserva,nombreCliente,precioBase);

        setNumeroNoches(numeroNoches);
        setPrecioPorNoche(precioPorNoche);
    }

// Getters
    public int getNumeroNoches() {
        return numeroNoches;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

// Setters
    public void setNumeroNoches(int numeroNoches) {
        if (numeroNoches <= 0) {
            throw new IllegalArgumentException(
                    "Las noches deben ser mayores a 0.");
        }

        this.numeroNoches = numeroNoches;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        if (precioPorNoche <= 0) {
            throw new IllegalArgumentException(
                    "El precio debe ser mayor a 0.");
        }

        this.precioPorNoche = precioPorNoche;
    }

// Métodos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("---Información propia---");
        System.out.println("Número de noches: " + numeroNoches);

        System.out.printf("Precio por noche: $%.2f%n", precioPorNoche);
    }

    @Override
    public double calcularCostoFinal() {
        return getPrecioBase() + (numeroNoches * precioPorNoche);
    }

    @Override
    public String tipoReserva() {
        return "Reserva de hotel";
    }
}