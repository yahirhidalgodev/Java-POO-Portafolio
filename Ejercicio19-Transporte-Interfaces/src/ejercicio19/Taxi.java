package ejercicio19;

public class Taxi implements Transporte {

//    Atributos 
    private String nombreConductor;
    private double tarifaBase;
    private double costoPorKilometro;

//    Constructor
    public Taxi(String nombreConductor, double tarifaBase, double costoPorKilometro) {
        setNombreConductor(nombreConductor);
        setTarifaBase(tarifaBase);
        setCostoPorKilometro(costoPorKilometro);
    }

//    Getters
    public String getNombreConductor() {
        return nombreConductor;
    }
    public double getTarifaBase() {
        return tarifaBase;
    }
    public double getCostoPorKilometro() {
        return costoPorKilometro;
    }

//    Setters
    public void setNombreConductor(String nombreConductor) {
        if (nombreConductor == null || nombreConductor.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombreConductor = nombreConductor;
    }
    public void setTarifaBase(double tarifaBase) {
        if (tarifaBase <= 0) {
            throw new IllegalArgumentException("La tarifa base debe ser mayor a 0.");
        }
        this.tarifaBase = tarifaBase;
    }
    public void setCostoPorKilometro(double costoPorKilometro) {
        if (costoPorKilometro <= 0) {
            throw new IllegalArgumentException("El costo por kilómetro debe ser mayor a 0");
        }
        this.costoPorKilometro = costoPorKilometro;
    }

//    Métodos
    @Override
    public double calcularCostoViaje(double distancia) {
        return tarifaBase + (distancia * costoPorKilometro);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del conductor: " + nombreConductor);
        System.out.println("Tarifa base: " + tarifaBase);
        System.out.println("Costo por kilometro: " + costoPorKilometro);
    }

}
