package ejercicio7;

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
//    Getter

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

//`   Setter   
    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el nombre.");
        }
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el teléfono.");
        }
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el correo.");
        }
        this.correo = correo;
    }

//    Métodos
    public boolean correoValido() {
        int arroba = correo.indexOf('@');

        return arroba > 0
                && correo.indexOf('.', arroba) > arroba + 1
                && correo.indexOf('.', arroba) < correo.length() - 1;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Correo válido: " + correoValido());
        System.out.println("-------" );
    }

}
