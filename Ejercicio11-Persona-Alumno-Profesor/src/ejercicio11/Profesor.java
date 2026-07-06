package ejercicio11;

public class Profesor extends Persona {

//    Atributos
    private String numeroEmpleado;
    private String especialidad;
    private double salario;

//    Constructor
    public Profesor(String nombre, int edad, String sexo, String numeroEmpleado, String especialidad, double salario) {
        super(nombre, edad, sexo);

        if (numeroEmpleado == null || numeroEmpleado.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el número empleado.");
        }
        if (especialidad == null || especialidad.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacía la especialidad.");
        }
        if (salario <= 0) {
            throw new IllegalArgumentException("No puede ser menor o igual a 0 el salario");
        }

        this.numeroEmpleado = numeroEmpleado;
        this.especialidad = especialidad;
        this.salario = salario;
    }

//    Métodos
    public double calcularBono() {
        if (salario < 15000) {
            return salario * .10;
        }
        if (salario >= 15000 && salario <= 25000) {
            return salario * .15;
        } else {
            return salario * .20;
        }
    }

    public double salarioFinal() {
        return salario + calcularBono();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("---Datos laborales---");
        System.out.println("Número empleado: " + numeroEmpleado);
        System.out.println("Especialidad: " + especialidad);
        System.out.printf("Salario: $%.2f%n", salario);
        System.out.printf("Bono: $%.2f%n", calcularBono());
        System.out.printf("Salario final: $%.2f%n", salarioFinal());
    }

}
