package ejercicio25;

public class Curso {
//    Atributos

    private String codigoCurso;
    private String nombreCurso;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;
//    Constructor'

    public Curso(String codigoCurso, String nombreCurso, int capacidadMaxima) {
        setCodigoCurso(codigoCurso);
        setNombreCurso(nombreCurso);

        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a 0");
        }

        cantidadEstudiantes = 0;
        estudiantes = new Estudiante[capacidadMaxima];

    }
//    Getters

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
//    Setters

    public void setCodigoCurso(String codigoCurso) {
        if (codigoCurso == null || codigoCurso.strip().isEmpty()) {
            throw new IllegalArgumentException("El código curso no puede estar vacío.");
        }
        this.codigoCurso = codigoCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        if (nombreCurso == null || nombreCurso.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre curso no puede estar vacío");
        }
        this.nombreCurso = nombreCurso;
    }
//    Métodos

    public int buscarIndiceEstudiante(String matricula) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getMatricula().equals(matricula)) {
                return i;
            }
        }
        return -1;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            throw new IllegalArgumentException("El estudiante no puede ser null");
        }

        if (buscarIndiceEstudiante(estudiante.getMatricula()) != -1) {
            System.out.println("Ya existe la matrícula: " + estudiante.getMatricula());
            return;
        }

        if (!estaLleno()) {
            System.out.println("Se agregado al alumno: " + estudiante.getNombre());
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
            return;
        }
        System.out.println("No se agrego ya es la capacidad máxima.");

    }

    public void eliminarEstudiante(String matricula) {
        int indice = buscarIndiceEstudiante(matricula);
        if (indice == -1) {
            System.out.println("Estudiante no encontrado");
            return;
        }

        for (int j = indice; j < cantidadEstudiantes - 1; j++) {
            estudiantes[j] = estudiantes[j + 1];
        }
        System.out.println("Estudiante eliminado: " + matricula);
        estudiantes[cantidadEstudiantes - 1] = null;
        cantidadEstudiantes--;

    }

    public void buscarEstudiante(String matricula) {
        int indice = buscarIndiceEstudiante(matricula);
        if (indice == -1) {
            System.out.println("Estudiante no encotrado.");
            return;
        }
        System.out.println("Estudiante encontrado: " + estudiantes[indice].getNombre());

    }

    public void mostrarEstudiantes() {
        if (cantidadEstudiantes <= 0) {
            System.out.println("No se encontraron estudiantes");
            return;
        }
        System.out.println("Código de curso: " + codigoCurso);
        System.out.println("Nombre del curso: " + nombreCurso);
        System.out.println("-------------------------------");
        System.out.printf("%-10s %-7s %-10s\n", "Código", "Nombre", "Cal. final");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            estudiantes[i].mostrarInformacion();
        }
        System.out.println("Cantidad de estudiantes inscritos: " + cantidadEstudiantes);
    }

    public double calcularPromedio() {
        double sum = 0;
        if (cantidadEstudiantes == 0) {
            return 0;
        }

        for (int i = 0; i < cantidadEstudiantes; i++) {
            sum += estudiantes[i].getCalificacionFinal();
        }
        return sum / cantidadEstudiantes;

    }

    public double obtenerMejorCalificacion() {

        double calificacionAlta = estudiantes[0].getCalificacionFinal();

        if (cantidadEstudiantes > 0) {
            for (int i = 0; i < cantidadEstudiantes; i++) {
                if ((estudiantes[i].getCalificacionFinal() > calificacionAlta)) {
                    calificacionAlta = estudiantes[i].getCalificacionFinal();
                }
            }
            return calificacionAlta;
        }
        return 0;
    }

    public int contarAprobados() {
        int contador = 0;
        if (cantidadEstudiantes > 0) {
            for (int i = 0; i < cantidadEstudiantes; i++) {
                if (estudiantes[i].getCalificacionFinal() >= 70) {
                    contador++;
                }
            }
            return contador;
        }
        return 0;
    }

    public int contarReprobados() {
        return cantidadEstudiantes - contarAprobados();
    }

    public boolean estaLleno() {
        return cantidadEstudiantes == estudiantes.length;
    }
}
