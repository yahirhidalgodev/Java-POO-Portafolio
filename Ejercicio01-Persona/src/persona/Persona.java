package persona;

public class Persona {
//    Atributos

    private String nombre;
    private int edad;
    private String sexo;

//    Constructor
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

//    Métodos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " Years");
        System.out.println("Sexo: " + sexo);
    }

    public boolean esMayorDeEdad() {

        return edad >= 18;
    }

    public void saludar() {
        System.out.println("Hola mi nombre es " + nombre
                + " tengo " + edad + " años de edad"+
                "y soy " + sexo
    

);
        
       
    }

}
