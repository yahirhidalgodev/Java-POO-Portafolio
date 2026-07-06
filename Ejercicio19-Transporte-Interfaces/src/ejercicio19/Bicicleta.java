package ejercicio19;

public class Bicicleta implements Transporte {

//    Atributos
    private String tipo;
    private double rentaPorHora;
    private double velocidadPromedio;

//    Constrctor
    public Bicicleta(String tipo, double rentaPorHora, double velocidadPromedio) {
        setTipo(tipo);
        setRentaPorHora(rentaPorHora);
        setVelocidadPromedio(velocidadPromedio);
    }

//    Getters
    public String getTipo() {
        return tipo;
    }
    public double getRentaPorHora() {
        return rentaPorHora;
    }
    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

//    Setters
    public void setTipo(String tipo) {
        if (tipo == null || tipo.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el tipo.");
        }
        this.tipo = tipo;
    }
    public void setRentaPorHora(double rentaPorHora) {
        if (rentaPorHora <= 0) {
            throw new IllegalArgumentException("La renta por hora debe ser mayor a 0.");
        }
        this.rentaPorHora = rentaPorHora;
    }
    public void setVelocidadPromedio(double velocidadPromedio) {
        if (velocidadPromedio <= 0) {
            throw new IllegalArgumentException("La velocidad promedio debe ser mayor a 0.");
        }
        this.velocidadPromedio = velocidadPromedio;
    }

//    Métodos
    @Override
    public double calcularCostoViaje(double distancia) {
        return (distancia / velocidadPromedio) * rentaPorHora ;
    }

    public void mostrarInformacion(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Renta por hora: " + rentaPorHora);
        System.out.println("Velocidad promedio: " + velocidadPromedio);
    }
}
