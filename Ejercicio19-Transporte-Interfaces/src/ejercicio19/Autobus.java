package ejercicio19;

public class Autobus implements Transporte {

//    Atributos 
    private String numeroRuta;
    private double costoPorKilometro;
    private int capacidadPasajeros;

//Constructor
    public Autobus(String numeroRuta, double costoPorKilometro, int capacidadPasajeros) {
        
        setNumeroRuta(numeroRuta);
        setCostoPorKilometro(costoPorKilometro);
        setCapacidadPasajeros(capacidadPasajeros);
    }

//    Getters
    public String getNumeroRuta(){
        return numeroRuta;
    }
    public double getCostoPorKilometro(){
        return costoPorKilometro;
    }
    public int getCapacidadPasajeros(){
        return capacidadPasajeros;
    }
    
//    Setters
    public void setNumeroRuta(String numeroRuta){
        if(numeroRuta == null || numeroRuta.strip().isEmpty()){
            throw new IllegalArgumentException("No puede estar vacío el número de ruta.");
        }
        this.numeroRuta = numeroRuta;
    }
    public void setCostoPorKilometro(double costoPorKilometro){
        if(costoPorKilometro <= 0){
            throw new IllegalArgumentException("El costo por kilometro debe ser mayor a 0.");
        }
        this.costoPorKilometro = costoPorKilometro;
    }
    public void setCapacidadPasajeros(int capacidadPasajeros){
        if(capacidadPasajeros <= 0 ){
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0.");
        }
        
        this.capacidadPasajeros =  capacidadPasajeros;
    }
    
//    Métodos
    @Override
    public double calcularCostoViaje(double distancia){
        return distancia * costoPorKilometro;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Número de ruta: " + numeroRuta);
        System.out.println("Costo por kilometro: " + costoPorKilometro);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        
    }
   
    
}
