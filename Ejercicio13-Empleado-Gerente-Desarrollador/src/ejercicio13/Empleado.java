package ejercicio13;

public class Empleado {
//Atributos

    private String nombre;
    private String idEmpleado;
    private double salarioBase;
//Constructor

    public Empleado(String nombre, String idEmpleado, double salarioBase) {
        setNombre(nombre);
        setIdEmpleado(idEmpleado);
        setSalarioBase(salarioBase);
    }

//    Getters
    public String getNombre() {
        return nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

//    Setters
    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el nombre");
        }

        this.nombre = nombre;
    }

    public void setIdEmpleado(String idEmpleado) {
        if (idEmpleado == null || idEmpleado.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el id del empleado");
        }

        this.idEmpleado = idEmpleado;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario no puede ser menor o igual a 0");
        }
        this.salarioBase = salarioBase;
    }

//    Métodos
    public void mostrarInformacion() {
        System.out.println("---Información general---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Id empleado: " + idEmpleado);
        System.out.printf("Salario base: %.2f%n" , salarioBase);
    }

    public double calcularSalarioFinal() {
        return salarioBase;
    }

    public String tipoEmpleado() {
        return "Empleado";
    }

}
