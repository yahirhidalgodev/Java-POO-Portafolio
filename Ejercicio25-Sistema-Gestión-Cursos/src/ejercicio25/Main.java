package ejercicio25;

public class Main {

    public static void main(String[] args) {

        // Crear 10 estudiantes
        Estudiante e1 = new Estudiante("A001", "Juan", 85);
        Estudiante e2 = new Estudiante("A002", "María", 92);
        Estudiante e3 = new Estudiante("A003", "Carlos", 68);
        Estudiante e4 = new Estudiante("A004", "Ana", 74);
        Estudiante e5 = new Estudiante("A005", "Luis", 59);
        Estudiante e6 = new Estudiante("A006", "Sofía", 97);
        Estudiante e7 = new Estudiante("A007", "Pedro", 81);
        Estudiante e8 = new Estudiante("A008", "Valeria", 66);
        Estudiante e9 = new Estudiante("A009", "Diego", 71);
        Estudiante e10 = new Estudiante("A010", "Fernanda", 88);

        // Crear curso
        Curso curso = new Curso("POO101", "Programación Orientada a Objetos", 10);

        // Agregar estudiantes
        curso.agregarEstudiante(e1);
        curso.agregarEstudiante(e2);
        curso.agregarEstudiante(e3);
        curso.agregarEstudiante(e4);
        curso.agregarEstudiante(e5);
        curso.agregarEstudiante(e6);
        curso.agregarEstudiante(e7);
        curso.agregarEstudiante(e8);
        curso.agregarEstudiante(e9);
        curso.agregarEstudiante(e10);

        // Intentar agregar una matrícula duplicada
        curso.agregarEstudiante(e1);

        // Mostrar estudiantes
               
         curso.mostrarEstudiantes();

        // Buscar un estudiante existente
        curso.buscarEstudiante("A004");

        // Buscar un estudiante inexistente
        curso.buscarEstudiante("A015");

        // Eliminar un estudiante
        curso.eliminarEstudiante("A003");

        // Mostrar nuevamente
        curso.mostrarEstudiantes();

        // Estadísticas
        System.out.println("Promedio: " + curso.calcularPromedio());
        System.out.println("Mejor calificación: " + curso.obtenerMejorCalificacion());
        System.out.println("Aprobados: " + curso.contarAprobados());
        System.out.println("Reprobados: " + curso.contarReprobados());

        // Verificar si está lleno
        System.out.println("¿Curso lleno?: " + curso.estaLleno());
    }
}
