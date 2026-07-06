package ejercicio21;

public class Main {

    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoFijo("Carlos", "001", 15000, 1000),
            new EmpleadoFijo("María", "002", 20000, 2000),
            new EmpleadoFijo("José", "003", 12000, 1000),
            
            new EmpleadoPorHoras("Ana","004",13000, 5, 200),
            new EmpleadoPorHoras("Pedro", "005", 12000, 3, 300 ),
            new EmpleadoPorHoras("Laura", "006", 15000, 5, 250),
            
            new EmpleadoComision("Sofía","007", 30000, 20, 10),
            new EmpleadoComision("Miguel", "008", 35000, 5, 10),
            new EmpleadoComision("Fernanda", "009", 8000, 5,10)
        };
        
        
        for (Empleado empleado : empleados){
            System.out.println("----------------------------");
            System.out.println("Tipo de empleado: " + empleado.tipoEmpleado());
            empleado.mostrarInformacion();
            System.out.printf("Salario final: %.2f\n",empleado.calcularSalarioFinal());
        }
    }
}
