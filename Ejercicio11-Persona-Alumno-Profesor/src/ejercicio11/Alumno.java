package ejercicio11;

public class Alumno extends Persona {

//    Atributos
    private String matricula;
    private String carrera;
    private double promedio;

//    Constructor
    public Alumno(String nombre, int edad, String sexo, String matricula, String carrera, double promedio) {
        super(nombre, edad, sexo);

        setMatricula(matricula);
        setCarrera(carrera);
        setPromedio(promedio);

    }

//    Getters
    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

//    Setters
    public void setMatricula(String matricula) {
        if (matricula == null || matricula.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacía la matricula.");
        }
        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {
        if (carrera == null || carrera.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacía la carrera.");
        }
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0) {
            throw new IllegalArgumentException("No puede ser menor a 0 el promedio.");
        }
        if (promedio > 10) {
            throw new IllegalArgumentException("No puede ser mayor de 10 el promedio.");
        }

        this.promedio = promedio;
    }
//    Metódos

    public boolean aprobo() {
        return promedio >= 6;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("---Datos Académicos---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobó: " + aprobo());
    }

}
