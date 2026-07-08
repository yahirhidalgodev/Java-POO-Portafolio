package ejercicio22;

public class Producto {

//    Atributos 
    private String codigo;
    private String nombre;
    private double precio;

//    Constructor
    public Producto(String codigo, String nombre, double precio) {
        setCodigo(codigo);
        setNombre(nombre);
        setPrecio(precio);
    }

//    Getters
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    
//    Setters
    public void setCodigo(String codigo){
        if(codigo == null || codigo.strip().isEmpty()){
            throw new IllegalArgumentException("No puede estar vacío el código.");
        }
        this.codigo = codigo;
    }
    public void setNombre(String nombre){
        if(nombre == null || nombre.strip().isEmpty()){
            throw new IllegalArgumentException("No puede estar vacío el nombre.");
        }
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        if(precio <= 0 ){
            throw new IllegalArgumentException("El precio debe ser mayor a 0.");
        }
        this.precio = precio;
    }
    
//    Métodos
    public void mostrarInformacion(){
        System.out.printf("%-8s %-15s %.2f\n", codigo,nombre,precio);
     
    }
}
