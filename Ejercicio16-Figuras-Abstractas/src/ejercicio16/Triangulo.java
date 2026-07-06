package ejercicio16;

public class Triangulo extends Figura {

//    Atributos 
    private double base;
    private double altura;

//    Constructor
    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        setBase(base);
        setAltura(altura);
    }

//    Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

//    Setters
    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("La base debe ser mayor a 0");
        }
        this.base = base;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor a 0");
        }
        this.altura = altura;
    }

//    Métodos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String tipoFigura() {
        return "Triángulo";
    }
}
