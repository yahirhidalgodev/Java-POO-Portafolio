package ejercicio18;

public class Main {

    public static void main(String[] args) {

        Empleado[] empleados = {
            //                TiempoCompleto (4 empleados)
            new TiempoCompleto("Yahir Hidalgo", "TC001", 18000, 5000),
            new TiempoCompleto("María López", "TC002", 22000, 6500),
            new TiempoCompleto("Carlos Ramírez", "TC003", 25000, 8000),
            new TiempoCompleto("Fernanda Torres", "TC004", 19500, 4500),
            //MedioTiempo (4 empleados)
            new MedioTiempo( "José Hernández", "MT001", 0, 80, 120),
            new MedioTiempo("Ana Martínez", "MT002", 0, 60, 150),
            new MedioTiempo("Luis García", "MT003", 0, 100, 110),
            new MedioTiempo("Sofía Pérez", "MT004", 0, 75, 140)
        };

    for (Empleado empleado : empleados

    
        ) {

            System.out.println("----------------");

        System.out.println("Tipo: " + empleado.tipoEmpleado());
        empleado.mostrarInformacion();
        System.out.printf("Salario final: %.2f%n", empleado.calcularSalario());
    }

}
}
