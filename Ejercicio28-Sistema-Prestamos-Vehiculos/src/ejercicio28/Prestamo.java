package ejercicio28;

public class Prestamo {
    // Atributos

    private String folio;
    private Cliente cliente;
    private Vehiculo vehiculo;
    // Constructor

    public Prestamo(String folio, Cliente cliente, Vehiculo vehiculo) {

        setFolio(folio);

        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inválido.");
        }

        if (vehiculo == null) {
            throw new IllegalArgumentException("Vehículo inválido.");
        }

        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }
    // Getter

    public String getFolio() {
        return folio;
    }
    // Setter

    public void setFolio(String folio) {
        if (folio == null || folio.strip().isEmpty()) {
            throw new IllegalArgumentException("El folio no puede estar vacío.");
        }
        this.folio = folio;
    }
    // Método

    public void mostrarInformacion() {
        System.out.printf(
                "%-8s %-8s %-20s %-15s %-12s %-10s %-12s%n",
                folio,
                cliente.getIdCliente(),
                cliente.getNombre(),
                vehiculo.getMarca(),
                vehiculo.getModelo(),
                vehiculo.getPlaca(),
                vehiculo.isDisponible() ? "Disponible" : "Prestado");
    }
}
