package ejercicio27;

public class Contacto {
//    Atributos

    private String nombre;
    private String telefono;
    private String correo;
//    Constructor

    public Contacto(String nombre, String telefono, String correo) {
        setNombre(nombre);
        setTelefono(telefono);
        setCorreo(correo);
    }

//    Getters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
//    Setters

    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.strip().isEmpty() || !telefono.matches("\\d{10}")) {
            throw new IllegalArgumentException("Debe tener 10 caracteres.");
        }

        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.strip().isEmpty()) {
            throw new IllegalArgumentException("El correo no puede estar vacío.");
        }
        this.correo = correo;
    }
//    Método

    public void mostrarInformacion() {
        System.out.printf(
                "%-20s %-12s %-30s%n",
                nombre,
                telefono,
                correo
        );
    }

}
