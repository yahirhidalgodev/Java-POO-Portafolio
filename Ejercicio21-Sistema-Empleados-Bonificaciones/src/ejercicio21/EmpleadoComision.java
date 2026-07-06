package ejercicio21;

public class EmpleadoComision extends Empleado {

//    Atributos
    private int ventasRealizadas;
    private double porcentajeComision;

//    Constructor
    public EmpleadoComision(String nombre, String idEmpleado, double salarioBase, int ventasRealizadas, double porcentajeComision) {
        super(nombre, idEmpleado, salarioBase);
        setVentasRealizadas(ventasRealizadas);
        setPorcentajeComision(porcentajeComision);
    }

//    Getters
    public int getVentasRealizadas() {
        return ventasRealizadas;
    }
    public double getPorcentajeComision() {
        return porcentajeComision;
    }

//    Setters
    public void setVentasRealizadas(int ventasRealizadas) {
        if (ventasRealizadas < 0) {
            throw new IllegalArgumentException("Las ventas no pueden ser negativas.");
        }
        this.ventasRealizadas = ventasRealizadas;
    }
    public void setPorcentajeComision(double porcentajeComision) {
        if (porcentajeComision < 0) {
            throw new IllegalArgumentException("El porcentaje de comisión no puede ser negativo.");
        }
        this.porcentajeComision = porcentajeComision;
    }

//    Métodos
    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (ventasRealizadas * porcentajeComision);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información específica---");
        System.out.println("Ventas realizadas: " + ventasRealizadas);
        System.out.printf("Porcentaje de comisión: %.2f\n", porcentajeComision);
    }

    @Override
    public String tipoEmpleado() {
        return "Por comisión";
    }
}
