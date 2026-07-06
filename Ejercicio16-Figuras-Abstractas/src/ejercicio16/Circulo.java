package ejercicio16;

public class Circulo extends Figura {
//    Atributos 

    private double radio;

//    Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        setRadio(radio);
    }

//    Getter
    public double getRadio() {
        return radio;
    }

//    Setter
    public void setRadio(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser meyor a 0");
        }
        this.radio = radio;
    }

//    Métodos
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Radio: " + radio);
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    @Override
    public String tipoFigura() {
        return "Círculo";
    }

}
