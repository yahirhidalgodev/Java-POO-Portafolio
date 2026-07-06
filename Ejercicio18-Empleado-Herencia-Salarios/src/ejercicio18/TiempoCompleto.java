package ejercicio18;

public class TiempoCompleto extends Empleado {

//    Atributos 
    private double bonoAnual;

//    Constructor
    public TiempoCompleto(String nombre, String idEmpleado, double salarioBase, double bonoAnual) {
        super(nombre, idEmpleado, salarioBase);
        setBonoAnual(bonoAnual);
    }

//    Getters
    public double getBonoAnual() {
        return bonoAnual;
    }

//  Setters
    public void setBonoAnual(double bonoAnual) {
        if (bonoAnual < 0) {
            throw new IllegalArgumentException("El bono no pude ser negativo.");
        }
        this.bonoAnual = bonoAnual;
    }

//Metodos
    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonoAnual;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();        
        System.out.printf("El bono anual es: %.2f\n", bonoAnual);
    }

    @Override
    public String tipoEmpleado() {
        return "Tiempo completo";
    }

}
