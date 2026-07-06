package ejercicio12;

public class Vehiculo {

//    Atributos
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadMaxima;

//    Constructor
    public Vehiculo(String marca, String modelo, int anio, double velocidadMaxima){
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
        setVelocidadMaxima(velocidadMaxima);
    }
    
    //    Getter
  public String getMarca(){
     return marca;   
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnio(){
        return anio;
    }
    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
//    Setter
    public void setMarca(String marca){
        if(marca == null || marca.strip().isEmpty()){
            throw new IllegalArgumentException("No puede estar vacía la marca.");
        }
        this.marca = marca;
    }
    public void setModelo(String modelo){
       if(modelo == null || modelo.strip().isEmpty()){
            throw new IllegalArgumentException("No puede estar vacío el modelo.");
        }
        this.modelo = modelo;
    }
    public void setAnio(int anioo){
        if(anio < 1990){
            throw new IllegalArgumentException("El año debe ser mayor a 1990");
        }
        this.anio = anio;
    }
    public void setVelocidadMaxima(double velocidadMaxima){
        if(velocidadMaxima <= 0 ){
            throw new IllegalArgumentException("la velocidad máxima No puede ser menor o igal a 0 .");
        }
        this.velocidadMaxima = velocidadMaxima;
    }
    
//    Métodos
    public void mostrarInformacion(){
        System.out.println("---Datos generales---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.printf("Velocidad máxima: %.2f\n" , velocidadMaxima);
    }
    
    public String tipoVehiculo(){
        return "Vehiculo";
    }
    
}
