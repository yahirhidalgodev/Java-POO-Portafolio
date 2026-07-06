package ejercicio21;

public abstract class Empleado{
    
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
            throw new IllegalArgumentException("No puedes poner el nombre vacío.");
        }
        this.nombre = nombre;
    }
    public void setIdEmpleado(String idEmpleado) {
        if (idEmpleado == null || idEmpleado.strip().isEmpty()) {
            throw new IllegalArgumentException("No puedes poner el id empleado vacío.");
        }
        this.idEmpleado = idEmpleado;
    }
    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario base debe ser mayor a 0.");
        }
        this.salarioBase = salarioBase;
    }

//    Métodos
    public void mostrarInformacion(){
        System.out.println("---Información general---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Id empleado: " + idEmpleado);
        System.out.printf("Salario base: %.2f\n", salarioBase);
    }
    
//    Método abstracto
    public abstract double calcularSalarioFinal();
    
//    Método polimorfico 
    public String tipoEmpleado(){
     return "Empleado";
    }
}
