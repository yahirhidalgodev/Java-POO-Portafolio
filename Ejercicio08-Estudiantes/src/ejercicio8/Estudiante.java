package ejercicio8;

import java.util.ArrayList;

public class Estudiante {

//    Atributos 
    private String matricula;
    private String nombre;
    private String carrera;
    private ArrayList<Double> calificaciones;

//    Constructor 
    public Estudiante(String matricula, String nombre, String carrera) {
        setMatricula(matricula);
        setNombre(nombre);
        setCarrera(carrera);
        calificaciones = new ArrayList<>();
    }

// Getter 
    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

// Setter 
    public void setMatricula(String matricula) {
        if (matricula == null || matricula.strip().isEmpty()) {
            throw new IllegalArgumentException("No puedes estar vacía la matrícula.");
        }
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el nombre.");
        }
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        if (carrera == null || carrera.strip().isEmpty()) {
            throw new IllegalArgumentException("No puedes estar vacía la carrera.");
        }
        this.carrera = carrera;
    }

//    Métodos
    public void agregarCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            System.out.println("Calificacion agregada");
            calificaciones.add(calificacion);
            return;
        }
        System.out.println("Calificación inválida");
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0;
        }

        double suma = 0;
        for (double c : calificaciones) {
            suma += c;
        }
        return suma / calificaciones.size();
    }

    public boolean aprobo() {
        return calcularPromedio() >= 6;
    }

    public void mostrarInformacion() {

        System.out.println("Matrícula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Número de calificaciones registradas: " + calificaciones.size());
        System.out.printf("Promedio: %.2f%n", calcularPromedio());
        System.out.println("Aprobado: " + aprobo() + "\n");

    }

    public double obtenerCalificacionMasAlta() {
        if (calificaciones.isEmpty()) {
            return 0;
        }

        double mayor = calificaciones.get(0);

        for (double c : calificaciones) {
            if (c > mayor) {
                mayor = c;
            }
        }
        return mayor;
    }

}
