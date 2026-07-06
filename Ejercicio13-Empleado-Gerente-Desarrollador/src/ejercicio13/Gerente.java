package ejercicio13;

public class Gerente extends Empleado {

//    Atributos
    private String departamento;
    private double bonoGerencial;

//    Constructor
    public Gerente(String nombre, String idEmpleado, double salarioBase, String departamento, double bonoGerencial) {
        super(nombre, idEmpleado, salarioBase);

        setDepartamento(departamento);
        setBonoGerencial(bonoGerencial);
    }

//    Getters
    public String getDepartamento() {
        return departamento;
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }

//    Setters
    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.strip().isEmpty()) {
            throw new IllegalArgumentException("El apartado departamento no puede estar vacío.");
        }
        this.departamento = departamento;
    }

    public void setBonoGerencial(double bonoGerencial) {
        if (bonoGerencial < 0) {
            throw new IllegalArgumentException("Debe ser mayor o igual a 0.");
        }
        this.bonoGerencial = bonoGerencial;
    }

//    Métodos
    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + bonoGerencial;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información específica---");
        System.out.println("Departamento: " + departamento);
        System.out.printf("Bono Gerencial: %.2f%n", bonoGerencial);

    }

    @Override
    public String tipoEmpleado() {
        return "Gerente";
    }

}
