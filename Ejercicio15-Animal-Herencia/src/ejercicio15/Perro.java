package ejercicio15;

public class Perro extends Animal {

//Atributos
    private String raza;
    private boolean esDomestico;

//Constructor
    public Perro(String nombre, int edad, double peso, String raza, boolean esDomestico) {
        super(nombre, edad, peso);
        setRaza(raza);
        setEsDomestico(esDomestico);
    }

//Getters
    public String getRaza() {
        return raza;
    }

    public boolean getEsDomestico() {
        return esDomestico;
    }

//Setters
    public void setRaza(String raza) {
        if (raza == null || raza.strip().isEmpty()) {
            throw new IllegalArgumentException("No puedes estar vacía la raza.");
        }
        this.raza = raza;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

//Métodos sobrescritos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información propia---");
        System.out.println("Raza: " + raza);
        System.out.println("Es domestico: " + esDomestico);
        System.out.println("Puede vivir en casa: " + puedeVivirEnCasa());
    }

    @Override
    public String hacerSonido() {
        return "Guau Guau";
    }

    @Override
    public String tipoAnimal() {
        return "Perro";
    }

//Métodos propio
    public boolean puedeVivirEnCasa() {
        return esDomestico;
    }

}
