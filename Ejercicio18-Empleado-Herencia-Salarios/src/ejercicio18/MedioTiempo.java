package ejercicio18;

public class MedioTiempo extends Empleado {

//    Atributos
    private double horasTrabajadas;
    private double pagoPorHora;

//    Costructor
    public MedioTiempo(String nombre, String idEmpleado, double salarioBase, double horasTrabajadas, double pagoPorHora) {
        super(nombre, idEmpleado, salarioBase);

        setHorasTrabajadas(horasTrabajadas);
        setPagoPorHora(pagoPorHora);
    }

//    Getters
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

//    Setter
    public void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("No pueden ser horas negativas.");
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
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Pago por hora: " + pagoPorHora);
    }

    @Override
    public String tipoEmpleado() {
        return "Medio tiempo";
    }

}
