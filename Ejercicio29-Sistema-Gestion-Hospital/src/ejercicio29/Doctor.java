package ejercicio29;

public class Doctor {

    // Atributos
    private String codigo;
    private String nombre;
    private String especialidad;

    // Constructor
    public Doctor(String codigo, String nombre, String especialidad) {
        setCodigo(codigo);
        setNombre(nombre);
        setEspecialidad(especialidad);
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    // Setters
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.strip().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.strip().isEmpty()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía");
        }
        this.especialidad = especialidad;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.printf("%-10s %-20s %-10s\n", codigo, nombre, especialidad);
    }

}
