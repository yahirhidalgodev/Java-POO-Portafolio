package ejercicio29;

public class Paciente {

    // Atributos
    private String numeroExpediente;
    private String nombre;
    private int edad;

    // Constructor
    public Paciente(String numeroExpediente, String nombre, int edad) {
        setNumeroExpediente(numeroExpediente);
        setNombre(nombre);
        setEdad(edad);
    }

    // Getters
    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setNumeroExpediente(String numeroExpediente) {
        if (numeroExpediente == null || numeroExpediente.strip().isEmpty()) {
            throw new IllegalArgumentException("El número expediente no puede estar vacío .");
        }
        this.numeroExpediente = numeroExpediente;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0.");

        }
        this.edad = edad;
    }

    // Método
    public void mostrarInformacion() {
        System.out.printf("%-10s %-10s %-5s\n", numeroExpediente, nombre, edad);
    }

}
