package ejercicio11;

public class Persona {

//    Atributos
    private String nombre;
    private int edad;
    private String sexo;

//    Constructor
    public Persona(String nombre, int edad, String sexo) {
        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
    }

//    Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

//    Setters
    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("No puedes estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad no puede ser menor o igual a 0.");
        }
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        if (sexo == null || sexo.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el sexo.");
        }
        this.sexo = sexo;
    }

//    Métodos
    public void mostrarInformacion() {
        System.out.println("---Datos personales---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    public void saludar() {
        System.out.println("Hola mi nombre es " + nombre);
    }

}
