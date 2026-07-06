package ejercicio4;

public class Main {

    public static void main(String[] args) {

        Empleado[] empleados = {
            new Empleado("Yahir Hidalgo Alvarez", "Desarrollo", 20000),
            new Empleado("María Fernanda López", "Gerente de Sistemas", 18000),
            new Empleado("Carlos Alberto Reyes", "Diseño UX/UI", 22000),
            new Empleado("Ana Sofía Martínez", "Recursos Humanos", 15000),
            new Empleado("José Manuel García", "Base de Datos", 28000),
            new Empleado("Laura Patricia Hernández", "Contabilidad", 17000),
            new Empleado("Miguel Ángel Torres", "Soporte Técnico", 12000),
            new Empleado("Daniela Cruz Sánchez", "Gerente de Proyectos", 30000),
            new Empleado("Roberto Mendoza Ruiz", "Desarrollo Full Stack", 26000),
            new Empleado("Karla Jiménez Flores", "Marketing Digital", 14000)
        };

        for (int i = 0; i < empleados.length; i++) {
            empleados[i].mostrarInformacion();
            empleados[i].calcularBono();
            System.out.printf("Salario final: %.2f%n", empleados[i].salarioFinal());
            System.out.println("Es gerente: " + empleados[i].esGerente());
            System.out.println("-------------");
        }

    }
}
