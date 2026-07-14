package ejercicio28;

public class Vehiculo {

    // Atributos
    private String placa;
    private String marca;
    private String modelo;
    private boolean disponible;

    // Constructor
    public Vehiculo(String placa, String marca, String modelo, boolean disponible) {
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setDisponible(disponible);
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters
    public void setPlaca(String placa) {
        if (placa == null || placa.strip().isEmpty()) {
            throw new IllegalArgumentException("La placa no puede estar vacia.");
        }
        this.placa = placa;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.strip().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.strip().isEmpty()) {
            throw new IllegalArgumentException("EL modelo no puede estar vacío");
        }
        this.modelo = modelo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.printf("%-15s %-10s %-10s %-10s\n",marca, modelo, placa, disponible ? "Disponible" : "Prestado");         
    }

    public void prestar() {
        if (!disponible) {
            System.out.println("El vehiculo esta prestado.");
            return;
        }
        System.out.println("Vehículo prestado.");
        disponible = false;
    }

    public void devolver() {
        if (disponible) {
            System.out.println("El vehículo no se presto.");
            return;
        }

        System.out.println("Vehículo devuelto.");
        disponible = true;
    }

}
