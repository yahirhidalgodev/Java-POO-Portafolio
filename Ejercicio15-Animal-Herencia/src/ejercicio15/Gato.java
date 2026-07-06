package ejercicio15;

public class Gato extends Animal{

//Atributos
    private String color;
    private int vidas;

//Constructor
    public Gato(String nombre, int edad, double peso, String color, int vidas) {
        super(nombre,edad,peso);
        
        setColor(color);
        setVidas(vidas);
    }

//Getters
    public String getColor() {
        return color;
    }
    public int getVidas() {
        return vidas;
    }

//Setters
    public void setColor(String color) {
        if (color == null || color.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el color.");
        }
        this.color = color;
    }
    public void setVidas(int vidas) {
        if (vidas < 1 || vidas > 9) {
            throw new IllegalArgumentException("Las vidas deben de estar entre 1 y 9.");
        }
        this.vidas = vidas;
    }

//Métodos sobrescritos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información propia---");
        System.out.println("Vidas: " + vidas);
        System.out.println("Color: " + color);
        System.out.println("Tiene muchas vidas: " + tieneMuchasVidas());
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }
    
    @Override
    public String tipoAnimal() {
        return "Gato";
    }

//Métodos propio
    public boolean tieneMuchasVidas(){
        return vidas > 5; 
    }
}
