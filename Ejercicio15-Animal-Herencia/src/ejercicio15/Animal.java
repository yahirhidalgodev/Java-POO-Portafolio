package ejercicio15;

public class  Animal {

//Atributos
    private String nombre;
    private int edad;
    private double peso;

//Constructor
    public Animal(String nombre, int edad, double peso) {
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
    }

//Getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getPeso() {
        return peso;
    }

//Setters
    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("No puedes estar vacío el nombre.");
        }
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException( "La edad no puede ser menor a 0.");
        }
        this.edad = edad;
    }
    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0.");
        }
        this.peso = peso;
    }

//Métodos
    public void mostrarInformacion(){
        System.out.println("---Datos generales---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " meses");
        System.out.println("Peso: " + peso + " kg");
        
    }
    public String hacerSonido(){
        return "El animal hace un sonido.";
    }
    public String tipoAnimal(){
        return "Animal";
    }
}
