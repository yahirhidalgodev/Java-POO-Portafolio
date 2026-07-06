package ejercicio8;

import java.util.ArrayList;

public class ControlEscolar {

//    Atributos
    private ArrayList<Estudiante> estudiantes;

//    Constructor
    public ControlEscolar() {
        estudiantes = new ArrayList<>();
    }

//    Métodos
    public void agregarEstudiante(Estudiante estudiante) {
        for (Estudiante e : estudiantes) {
            if (e.getMatricula().equals(estudiante.getMatricula())) {
                System.out.println("No se permiten matriculas duplicadas");
                return;
            }
        }

        System.out.println("Se agregó con éxito a: " + estudiante.getMatricula());
        estudiantes.add(estudiante);

    }

    public void buscarPorMatricula(String matricula) {

        for (Estudiante e : estudiantes) {
            if (e.getMatricula().equals(matricula)) {
                System.out.println("\nEstudiante " + e.getMatricula() + " encontrado");
                e.mostrarInformacion();
                return;
            }
        }
        System.out.println("No se encontro el estudiante con matricula " + matricula);
    }

    public void eliminarPorMatricula(String matricula) {

        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Estudiante con matricula " + estudiantes.get(i).getMatricula() + " eliminado.");
                estudiantes.remove(i);
                return;
            }
        }
        System.out.println("No se elimino al estudiante " + matricula + "no fue encontrado");

    }

    public void mostrarTodos() {
        System.out.println("-----Estudiantes-----");
        for (Estudiante e : estudiantes) {
            e.mostrarInformacion();
        }
    }

}
