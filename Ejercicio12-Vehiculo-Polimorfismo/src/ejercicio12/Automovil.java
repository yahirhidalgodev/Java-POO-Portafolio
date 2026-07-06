package ejercicio12;

public class Automovil extends Vehiculo {

//    Atributos
    private int numeroPuertas;
    private String tipoCombustible;

//    Constructor
    public Automovil(String marca, String modelo, int anio, double velocidadMaxima, int numeroPuertas, String tipoCombustible) {
        super(marca, modelo, anio, velocidadMaxima);
        setNumeroPuertas(numeroPuertas);
        setTipoCombustible(tipoCombustible);
    }

//    Getters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

//    Setters
    public void setNumeroPuertas(int numeroPuertas) {
        if (numeroPuertas <= 0) {
            throw new IllegalArgumentException("El número de puertas debe ser mayor que 0.");
        }
        this.numeroPuertas = numeroPuertas;
    }

    public void setTipoCombustible(String tipoCombustible) {
        if (tipoCombustible == null || tipoCombustible.strip().isEmpty()) {
            throw new IllegalArgumentException("El tipo de combustible no puede estar vacío.");
        }
        this.tipoCombustible = tipoCombustible;
    }

//    Métodos
    public boolean tieneMasDeCuatroPuertas() {
        return numeroPuertas > 4;
    }

    @Override
    public String tipoVehiculo() {
        return "Automovil";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Datos del automóvil---");
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Tipo combustible: " + tipoCombustible);
        System.out.println("Más de cuatro puertas: " + tieneMasDeCuatroPuertas());
    }

}
