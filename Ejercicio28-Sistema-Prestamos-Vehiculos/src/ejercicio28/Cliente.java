package ejercicio28;

public class Cliente {
    // Atributos
    private String idCliente;
    private String nombre;
    private String telefono;

    // Constructor
    public Cliente(String idCliente, String nombre, String telefono) {
        setIdCliente(idCliente);
        setNombre(nombre);
        setTelefono(telefono);
    }

    // Getters
    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setter
    public void setIdCliente(String idCliente) {
        if (idCliente == null || idCliente.strip().isEmpty()) {
            throw new IllegalArgumentException("El id cliente no puede estar vacío.");
        }
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.strip().isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío.");
        }
        this.telefono = telefono;
    }

    // Métodos
    public void mostarInformacion() {
        System.out.printf("%-10s %-20s %-15s%n", idCliente, nombre, telefono);

    }
}