package ejercicio15;

public class Ave extends Animal {

//Atributos
    private String tipoAve;
    private boolean puedeVolar;

//Constructor
    public Ave(String nombre, int edad, double peso, String tipoAve, boolean puedeVolar) {
        super(nombre, edad, peso);
        setTipoAve(tipoAve);
        setPuedeVolar(puedeVolar);
    }

//Getters
    public String getTipoAve() {
        return tipoAve;
    }

    public boolean getPuedeVolar() {
        return puedeVolar;
    }

//Setters
    public void setTipoAve(String tipoAve) {
        if (tipoAve == null || tipoAve.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el apartado ave.");
        }
        this.tipoAve = tipoAve;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

//Métodos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información propia---");
        System.out.println("Tipo de ave: " + tipoAve);
        System.out.println("Puede volar: " + puedeVolar);
        System.out.println("Es ave voladora: " + esAveVoladora());

    }

    @Override
    public String hacerSonido() {
        return "Pío Pío";
    }

    @Override
    public String tipoAnimal() {
        return "Ave";
    }

    public boolean esAveVoladora() {
        return puedeVolar;
    }
}
