package ejercicio16;

public abstract class Figura{
    
//    Atributo
    private String nombre;
    
//    Constructor
    public Figura(String nombre){
        setNombre(nombre);
    }
    
//    Getter
    public String getNombre(){
        return nombre;
    }
    
//    Setter
    public void setNombre(String nombre){
        if(nombre == null || nombre.strip().isEmpty()){
            throw new IllegalArgumentException("No puede estar vacío el nombre.");
        }
        this.nombre = nombre;
    }
    
//    Métodos
    public void mostrarInformacion(){
        System.out.println("---Información---");
        System.out.println("Nombre: " + nombre);
    }
    
    public abstract double calcularArea();

    public String tipoFigura(){
        return "Tipo figura";
    }
    
}