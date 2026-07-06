package ejercicio4;

public class Empleado {

//Atributos
    private String nombre;
    private String puesto;
    private double salarioBase;
    private double bono;

//Constructor
    public Empleado(String nombre, String puesto, double salarioBase) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
    }

//    Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.printf("Salario Base: %.2f\n", salarioBase);
    }

    public double calcularBono() {
        if (salarioBase < 0) {
            System.out.println("No puedes tener salario negativos");
            return 0;
        }
        if (salarioBase < 8000) {
            System.out.println("Salario mínimo no recibe bono");
            return 0;
        }

//        el salario es menor a 10,000 → bono del 10%.
        if (salarioBase >= 8000 && salarioBase < 10000) {
            bono = salarioBase * .10;
            System.out.printf("Tu bono es: %.2f\n", bono);
            return bono;
        }

//        Si el salario está entre 10,000 y 20,000 → bono del 15%.
        if (salarioBase >= 10000 && salarioBase < 20000) {
            bono = salarioBase * .15;
            System.out.printf("Tu bono es: %.2f\n", bono);;
            return bono;
        }

//        Si supera 20,000 → bono del 20%.
        if (salarioBase >= 20000) {
            bono = salarioBase * .20;
            System.out.printf("Tu bono es: %.2f\n", bono);
            return bono;
        }

        return 0;

    }

    public double salarioFinal() {
        return salarioBase + bono;
    }

    public boolean esGerente() {
        return puesto.contains("Gerente");
    }

}
