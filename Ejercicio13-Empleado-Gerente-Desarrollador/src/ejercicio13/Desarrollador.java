package ejercicio13;

public class Desarrollador extends Empleado {

//    Atributos
    private String lenguajePrincipal;
    private int horasExtra;

//    Constructor
    public Desarrollador(String nombre, String idEmpleado, double salarioBase, String lenguajePrincipal, int horasExtra) {
        super(nombre, idEmpleado, salarioBase);
        setLenguajePrincipal(lenguajePrincipal);
        setHorasExtra(horasExtra);
    }

//    Getters
    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

//    Setters
    public void setLenguajePrincipal(String lenguajePrincipal) {
        if (lenguajePrincipal == null || lenguajePrincipal.strip().isEmpty()) {
            throw new IllegalArgumentException("El lenguaje principal no puede estar vacío");
        }
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public void setHorasExtra(int horasExtra) {
        if (horasExtra < 0) {
            throw new IllegalArgumentException("Las horas extra no puede ser negativa.");
        }
        this.horasExtra = horasExtra;
    }

//    Métodos
    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (horasExtra * 200);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información específica---");
        System.out.println("Lenguaje principal: " + lenguajePrincipal);
        System.out.println("Horas extra: " + horasExtra);
    }

    @Override
    public String tipoEmpleado() {
        return "Desarrollador";
    }

}
