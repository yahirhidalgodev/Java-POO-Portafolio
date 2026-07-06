package ejercicio21;

public class EmpleadoFijo extends Empleado{
//    Atributos 
    private double bonoMensual;
    
//    Constructor
    public EmpleadoFijo(String nombre, String idEmpleado, double salarioBase,double bonoMensual){
        super(nombre,idEmpleado,salarioBase);
        setBonoMensual(bonoMensual);
    }
    
//    Getter
    public double getBonoMensual() {
        return bonoMensual;
    }
    
//    Setter
    public void setBonoMensual(double bonoMensual) {
        if(bonoMensual < 0){
            throw new IllegalArgumentException("El bono mensual no puede ser negativo.");
        }
        this.bonoMensual = bonoMensual;
    }
    
//    Métodos
    @Override  
    public double calcularSalarioFinal(){
        return getSalarioBase() + bonoMensual;
    }
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("---Información específica---");
        System.out.printf("Bono mensual: %.2f\n",bonoMensual);
    }

    @Override 
    public String tipoEmpleado(){
        return "Turno fijo";
    }
    

    
}
