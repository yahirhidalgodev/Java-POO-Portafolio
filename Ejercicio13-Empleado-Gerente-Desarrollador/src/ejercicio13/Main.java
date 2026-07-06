package ejercicio13;

public class Main {

    public static void main(String[] args) {
        Empleado[] empleados = {
            new Gerente("Carlos Mendoza", "G001", 35000, "Recursos Humanos", 20),
            new Gerente("Laura Hernández", "G002", 42000, "Finanzas", 3000),
            new Gerente("Miguel Torres", "G003", 38000, "Tecnologías de la Información", 0),
            new Gerente("Ana Rodríguez", "G004", 45000, "Ventas", 1500),
            new Desarrollador("Luis García", "D001", 22000, "Java", 0),
            new Desarrollador("Sofía Martínez", "D002", 25000, "Python", 4),
            new Desarrollador("Jorge Ramírez", "D003", 24000, "C#", 20),
            new Desarrollador("Valeria López", "D004", 27000, "JavaScript", 6)

        };

        for (Empleado empleado : empleados) {
            System.out.println("----------------------------");
            System.out.println("Tipo de empleado: " + empleado.tipoEmpleado());
            empleado.mostrarInformacion();
            System.out.printf("Salario final: %.2f%n", empleado.calcularSalarioFinal());
        }
    }
}
