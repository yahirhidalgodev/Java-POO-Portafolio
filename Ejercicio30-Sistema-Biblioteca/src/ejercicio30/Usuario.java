package ejercicio30;

public class Usuario {

    // Atributos
    private String idUsuario;
    private String nombre;
    private String correo;

    // Constructor
    public Usuario(String idUsuario, String nombre, String correo) {
        setIdUsuario(idUsuario);
        setNombre(nombre);
        setCorreo(correo);
    }

    // Getters
    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    // Setters
    public void setIdUsuario(String idUsuario) {
        if (idUsuario == null || idUsuario.strip().isEmpty()) {
            throw new IllegalArgumentException("El id usuario no puede ser nulo.");
        }
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo.");
        }
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.isBlank() || !correo.matches("^[\\w.-]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("Correo electrónico no válido.");
        }
        this.correo = correo;
    }

    // Método
    public void mostrarInformacion() {
        System.out.printf("%-10s %-20s %-10s\n", idUsuario, nombre, correo);
    }

}
