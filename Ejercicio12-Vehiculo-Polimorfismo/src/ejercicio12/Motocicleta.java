package ejercicio12;

public class Motocicleta extends Vehiculo {

//    Atributos
    private int cilindrada;
    private String tipoMoto;

//    Constructor
    public Motocicleta(String marca, String modelo, int anio, double velocidadMaxima, int cilindrada, String tipoMoto) {
        super(marca, modelo, anio, velocidadMaxima);

        setCilindrada(cilindrada);
        setTipoMoto(tipoMoto);
    }

//    Getters
    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

//    Setters
    public void setCilindrada(int cilindrada) {
        if (cilindrada <= 0) {
            throw new IllegalArgumentException("La cilindrada debe ser mayor que 0.");
        }
        this.cilindrada = cilindrada;
    }

    public void setTipoMoto(String tipoMoto) {
        if (tipoMoto == null || tipoMoto.strip().isEmpty()) {
            throw new IllegalArgumentException("El tipo de motocicleta no puede estar vacío.");
        }
        this.tipoMoto = tipoMoto;
    }

//    Métodoos
    public boolean esAltaCilindrada() {
        return cilindrada >= 600;
    }

    @Override
    public String tipoVehiculo() {
        return "Motocicleta";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Datos de la Motocicleta---");
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Tipo de moto: " + tipoMoto);
        System.out.println("Alta cilindrada: " + esAltaCilindrada());
    }

}
