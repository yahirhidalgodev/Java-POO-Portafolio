package ejercicio29;

public class Consulta {

    // Atributos
    private String folio;
    private Paciente paciente;
    private Doctor doctor;
    private boolean atendida;

    // Constructor
    public Consulta(String folio, Paciente paciente, Doctor doctor) {
        setFolio(folio);
        setPaciente(paciente);
        setDoctor(doctor);
        this.atendida = false;
    }

    // Getters
    public String getFolio() {
        return folio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public boolean isAtendida() {
        return atendida;
    }

    // Setters
    public void setFolio(String folio) {
        if (folio == null || folio.strip().isEmpty()) {
            throw new IllegalArgumentException("El folio nu puede estar vacío.");
        }
        this.folio = folio;
    }

    public void setPaciente(Paciente paciente) {
        if (paciente == null) {
            throw new IllegalArgumentException("El paciente no puede ser nulo.");
        }
        this.paciente = paciente;
    }

    public void setDoctor(Doctor doctor) {
        if (doctor == null) {
            throw new IllegalArgumentException("El doctor no puede ser nulo.");
        }
        this.doctor = doctor;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.printf("%-10s %-20s %-15s %-10s\n", folio, paciente.getNombre(), doctor.getNombre(), atendida);
    }

    public void atenderConsulta() {
        if (atendida) {
            System.out.println("La consulta no puede ser atendida dos veces.");
            return;
        }
        System.out.println("Consulta atendia.");
        atendida = true;
    }

}
