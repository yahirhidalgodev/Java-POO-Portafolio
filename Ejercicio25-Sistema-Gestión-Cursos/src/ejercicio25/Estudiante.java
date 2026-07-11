package ejercicio25;

public class Estudiante {
//    Atributos 
    private String matricula;
    private String nombre;
    private double calificacionFinal;

//    Constructor
    public Estudiante(String matricula, String nombre, double calificacionFinal){
        setMatricula(matricula);
        setNombre(nombre);
        setCalificacionFinal(calificacionFinal);
    }
    
//    Getters
    public String getMatricula(){
        return matricula;
    }
    public String getNombre(){
        return nombre;
    }
    public double getCalificacionFinal(){
        return calificacionFinal;
    }
    
//    Setters
    public void setMatricula(String matricula){
        if(matricula == null || matricula.strip().isEmpty()){
            throw new IllegalArgumentException("La matrícula no puede estar vacía");
        }
        this.matricula = matricula;
    }
    public void setNombre(String nombre){
         if(nombre == null || nombre.strip().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }
    public void setCalificacionFinal(double calificacionFinal){
         if(calificacionFinal < 0 || calificacionFinal > 100){
            throw new IllegalArgumentException("La calificación final debe ser entre 0 y 100.");
        }
        this.calificacionFinal = calificacionFinal;
    }
    
//    Métodos
    public void mostrarInformacion(){
        
        System.out.printf("%-10s %-10s %-15s\n", matricula, nombre,  calificacionFinal);
    }
    
}
