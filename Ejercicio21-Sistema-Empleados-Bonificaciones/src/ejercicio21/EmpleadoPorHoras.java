package ejercicio21;

public class EmpleadoPorHoras extends Empleado {

//    Atributos
    private int horasTrabajadas;
    private double pagoPorHora;

//    Constructor
    public EmpleadoPorHoras(String nombre,String idEmpleado,double salarioBase, int horasTrabajadas, double pagoPorHora){
        super(nombre, idEmpleado,salarioBase);
        setHorasTrabajadas(horasTrabajadas);
        setPagoPorHora(pagoPorHora);
    }
    
//    Getters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public double getPagoPorHora() {
        return pagoPorHora;
    }

//    Setters
    public void setHorasTrabajadas(int horasTrabajadas) {
        if (horasTrabajadas <= 0) {
            throw new IllegalArgumentException("La horas deben ser mayores a 0.");
        }
        this.horasTrabajadas = horasTrabajadas;
    }
    public void setPagoPorHora(double pagoPorHora) {
        if (pagoPorHora <= 0) {
            throw new IllegalArgumentException("El pago por hora debe ser mayor a 0.");
        }
        this.pagoPorHora = pagoPorHora;
    }

//    Métodos
    @Override
    public double calcularSalarioFinal() {
        return getHorasTrabajadas() * pagoPorHora;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información específica---");
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.printf("Pago por hora: %.2f\n",pagoPorHora);
    }

    @Override
    public String tipoEmpleado() {
        return "Empleado por hora";
    }

}
