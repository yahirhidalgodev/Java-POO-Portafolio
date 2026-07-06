package ejercicio6;

public class Vehiculo {

    // Atributos
    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio, double kilometraje) {

        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }

        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede estar vacío.");
        }

        if (anio < 1886) {
            throw new IllegalArgumentException("El año es inválido.");
        }

        if (kilometraje < 0) {
            throw new IllegalArgumentException("El kilometraje no puede ser negativo.");
        }

        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    // Setters
    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede estar vacío.");
        }
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        if (anio < 1886) {
            throw new IllegalArgumentException("El año es inválido.");
        }
        this.anio = anio;
    }

    public void setKilometraje(double kilometraje) {
        if (kilometraje < this.kilometraje) {
            throw new IllegalArgumentException(
                    "El kilometraje no puede disminuir.");
        }

        this.kilometraje = kilometraje;
    }

    // Métodos
    public void recorrerKilometros(double kilometros) {

        if (kilometros <= 0) {
            throw new IllegalArgumentException(
                    "Los kilómetros deben ser mayores que cero.");
        }

        kilometraje += kilometros;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.printf("Kilometraje: %.2f km%n", kilometraje);
    }
}
