package ejercicio11;

public class Main {

    public static void main(String[] args) {

        Alumno[] alumnos = {
            new Alumno("Juan", 20, "Masculino", "A001", "Sistemas", 8.5),
            new Alumno("Maria", 21, "Femenino", "A002", "Administración", 9.7),
            new Alumno("Pedro", 22, "Masculino", "A003", "Contabilidad", 5.2),
            new Alumno("Sofia", 19, "Femenino", "A004", "Derecho", 6.0)
        };

        Profesor[] profesores = {
            new Profesor("Carlos", 45, "Masculino", "P001", "Matemáticas", 12000),
            new Profesor("Laura", 40, "Femenino", "P002", "Programación", 18000),
            new Profesor("Miguel", 50, "Masculino", "P003", "Física", 28000),
            new Profesor("Ana", 38, "Femenino", "P004", "Redes", 25000)
        };

        System.out.println("---Alumnos---\n");
        for (Alumno alumno : alumnos) {

            alumno.mostrarInformacion();
            alumno.saludar();

            if (alumno.aprobo()) {
                System.out.println("Estado: Aprobó");
            } else {
                System.out.println("Estado: Reprobó");
            }

            System.out.println("--------------------------------------");
        }

        System.out.println("\n===== PROFESORES =====\n");

        for (Profesor profesor : profesores) {

            profesor.mostrarInformacion();
            profesor.saludar();

            System.out.println("Bono Calculado: $" + profesor.calcularBono());
            System.out.println("Salario Final: $" + profesor.salarioFinal());

            System.out.println("--------------------------------------");
        }

    }
}
