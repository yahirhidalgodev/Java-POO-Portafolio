package ejercicio18;

public abstract class Empleado {

//    Atributos
    private String nombre;
    private String idEmpleado;
    private double salarioBase;

//    Constructor 
    public Empleado(String nombre, String idEmpleado, double salarioBase) {
        setNombre(nombre);
        setIdEmpleado(idEmpleado);
        setSalarioBase(salarioBase);
    }

//    Getter
    public String getNombre() {
        return nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

//    Setter
    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el nombre.");
        }
        this.nombre = nombre;
    }

    public void setIdEmpleado(String idEmpleado) {
        if (idEmpleado == null || idEmpleado.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el id empleado.");
        }
        this.idEmpleado = idEmpleado;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("El salario base no puede ser negrativo.");
        }
        this.salarioBase = salarioBase;
    }

//    Métodos
    public void mostrarInformacion() {
        System.out.println("---Información personal---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Id empleado: " + idEmpleado);
        System.out.printf("Salario base: %.2f\n", salarioBase);
    }

    public abstract double calcularSalario();
    
    public String tipoEmpleado(){
        return "Empleado";
    }
        
    
}
