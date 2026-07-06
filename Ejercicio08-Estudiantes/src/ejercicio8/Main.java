package ejercicio8;

public class Main {

    public static void main(String[] args) {
        //Crear un objeto ControlEscolar .
        ControlEscolar control1 = new ControlEscolar();

        //Crear al menos 8 estudiantes con datos diferentes.
        Estudiante e1 = new Estudiante("A001", "Juan Perez", "Sistemas");
        Estudiante e2 = new Estudiante("A002", "Maria Lopez", "Industrial");
        Estudiante e3 = new Estudiante("A002", "Carlos Ruiz", "Civil");
        Estudiante e4 = new Estudiante("A004", "Ana Torres", "Mecatronica");
        Estudiante e5 = new Estudiante("A005", "Luis Diaz", "Administracion");
        Estudiante e6 = new Estudiante("A006", "Fernanda Cruz", "Contabilidad");
        Estudiante e7 = new Estudiante("A007", "Pedro Gomez", "Derecho");
        Estudiante e8 = new Estudiante("A008", "Sofia Martinez", "Arquitectura");

        //Agregar todos los estudiantes al sistema.
        control1.agregarEstudiante(e1);
        control1.agregarEstudiante(e2);
        //Intentar agregar un estudiante con una matrícula repetida para comprobar la validación.
        control1.agregarEstudiante(e3);
        control1.agregarEstudiante(e4);
        control1.agregarEstudiante(e5);
        control1.agregarEstudiante(e6);
        control1.agregarEstudiante(e7);
        control1.agregarEstudiante(e8);

        //Agregar distintas calificaciones a los estudiantes:
        e1.agregarCalificacion(9);
        e1.agregarCalificacion(8);
        e1.agregarCalificacion(4);
        e1.agregarCalificacion(8);
        e1.agregarCalificacion(5);

        //Algunos con promedio reprobatorio.
        e2.agregarCalificacion(5);
        e2.agregarCalificacion(4);
        e2.agregarCalificacion(7);
        e2.agregarCalificacion(8);
        e2.agregarCalificacion(5);

        e3.agregarCalificacion(9);
        e3.agregarCalificacion(9);
        e3.agregarCalificacion(9);
        e3.agregarCalificacion(9);
        e3.agregarCalificacion(9);

        //Algunos con promedio aprobatorio.
        e4.agregarCalificacion(9);
        e4.agregarCalificacion(9);
        e4.agregarCalificacion(9);
        e4.agregarCalificacion(9);
        e4.agregarCalificacion(9);

        e5.agregarCalificacion(7);
        e5.agregarCalificacion(7);
        e5.agregarCalificacion(7);
        e5.agregarCalificacion(8);
        e5.agregarCalificacion(8);

        e6.agregarCalificacion(6);
        e6.agregarCalificacion(7);
        e6.agregarCalificacion(6);
        e6.agregarCalificacion(7);
        e6.agregarCalificacion(6);

        e7.agregarCalificacion(11); // inválida
        e7.agregarCalificacion(11); // inválida
        e7.agregarCalificacion(11); // inválida
        e7.agregarCalificacion(11); // inválida
        e7.agregarCalificacion(8);

        //Algunos con una calificación inválida (por ejemplo -2 o 11 ) para verificar las validaciones.
        e8.agregarCalificacion(-2); // inválida
        e8.agregarCalificacion(-2); // inválida
        e8.agregarCalificacion(-2); // inválida
        e8.agregarCalificacion(-2); // inválida
        e8.agregarCalificacion(11);

        //Mostrar todos los estudiantes.
        control1.mostrarTodos();

        //Buscar un estudiante existente por matrícula.
        control1.buscarPorMatricula("A006");
        control1.buscarPorMatricula("A007");

        //Buscar una matrícula inexistente.
        control1.buscarPorMatricula("A009");

        //Eliminar un estudiante existente.
        control1.eliminarPorMatricula("A001");

        //Intentar eliminar un estudiante inexistente.
        control1.eliminarPorMatricula("A0010");

        //Mostrar nuevamente la lista de estudiantes para comprobar los cambios.
        control1.mostrarTodos();

        System.out.println(e1.obtenerCalificacionMasAlta());

    }
}
