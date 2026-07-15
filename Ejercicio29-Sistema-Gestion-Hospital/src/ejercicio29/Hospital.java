package ejercicio29;

import java.util.ArrayList;

public class Hospital {

    // Atributos
    private String nombre;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Doctor> doctores;
    private ArrayList<Consulta> consultas;

    // Constructor
    public Hospital(String nombre) {
        setNombre(nombre);
        pacientes = new ArrayList<>();
        doctores = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    // Getter 
    public String getNombre() {
        return nombre;
    }

    // Setter 
    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    // Métodos para pacientes
    private Paciente buscarPacientePorExpediente(String numeroExpediente) {
        for (Paciente p : pacientes) {
            if (p.getNumeroExpediente().equals(numeroExpediente)) {
                return p;
            }
        }
        return null;
    }

    public void agregarPaciente(Paciente paciente) {
        if (paciente == null) {
            System.out.println("No se puede agregar un paciente nulo.");
            return;
        }

        Paciente buscarPacientePorExpediente = buscarPacientePorExpediente(paciente.getNumeroExpediente());

        if (buscarPacientePorExpediente != null) {
            System.out.println("El paciente ya existe.");
            return;
        }

        System.out.println("Paciente agregado: " + paciente.getNumeroExpediente() + " " + paciente.getNombre());
        pacientes.add(paciente);
    }

    public void buscarPaciente(String numeroExpediente) {
        Paciente buscarPacientePorExpediente = buscarPacientePorExpediente(numeroExpediente);

        if (buscarPacientePorExpediente == null) {
            System.out.println("No existe el paciente en la lista.");
            return;
        }
        System.out.println("Paciente encontrado: ");
        buscarPacientePorExpediente.mostrarInformacion();
    }

    public void mostarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes existentes.");
            return;
        }
        System.out.println("-------------Pacientes-------------");
        System.out.printf("%-10s %-10s %-5s", "N. Exp.", "Nombre", "Edad\n");
        for (Paciente p : pacientes) {
            p.mostrarInformacion();
        }
    }

    // Métodos para doctores
    private Doctor buscarDoctorPorCodigo(String codigo) {
        for (Doctor d : doctores) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }

    public void agregarDoctor(Doctor doctor) {
        if (doctor == null) {
            System.out.println("El doctor no puede ser nulo.");
            return;
        }

        Doctor buscarDoctorPorCodigo = buscarDoctorPorCodigo(doctor.getCodigo());

        if (buscarDoctorPorCodigo != null) {
            System.out.println("El doctor ya existe.");
            return;
        }

        System.out.println("Doctor agregado: " + doctor.getCodigo() + " " + doctor.getNombre());
        doctores.add(doctor);

    }

    public void buscarDoctor(String codigo) {
        if (codigo == null) {
            System.out.println("No puede ser el código nulo.");
            return;
        }

        Doctor buscarDoctorPorCodigo = buscarDoctorPorCodigo(codigo);
        if (buscarDoctorPorCodigo == null) {
            System.out.println("El doctor no fue encontrado.");
            return;
        }
        System.out.println("Doctor encotrado: ");
        buscarDoctorPorCodigo.mostrarInformacion();

    }

    public void mostrarDoctores() {
        if (doctores.isEmpty()) {
            System.out.println("No hay doctores registrados.");
            return;
        }

        System.out.println("-------------Doctores-------------");
        System.out.printf("%-10s %-20s %-10s\n", "Código", "Nombre", "Especialidad");
        for (Doctor d : doctores) {
            d.mostrarInformacion();

        }
    }

    // Métodos para consulta
    public void registrarConsulta(String expedientePaciente, String codigoDoctor) {
        if (expedientePaciente == null) {
            System.out.println("El expedientes paciente es nulo.");
            return;
        }
        if (codigoDoctor == null) {
            System.out.println("El código del doctor es nulo.");
            return;
        }

        Paciente buscarPacientePorExpediente = buscarPacientePorExpediente(expedientePaciente);
        Doctor buscarDoctorPorCodigo = buscarDoctorPorCodigo(codigoDoctor);

        if (buscarPacientePorExpediente == null) {
            System.out.println("El pacientes no esta registrado en la lista.");
            return;
        }
        if (buscarDoctorPorCodigo == null) {
            System.out.println("El doctor no esta registrado en la lista.");
            return;
        }

        String folio = "C" + String.format("%03d", consultas.size() + 1);

        System.out.println("Se agrego la consulta.");
        Consulta consulta = new Consulta(folio, buscarPacientePorExpediente, buscarDoctorPorCodigo);

        consultas.add(consulta);
    }

    private Consulta busquedaConsultasExistentes(String folio) {
        for (Consulta c : consultas) {
            if (c.getFolio().equals(folio)) {
                return c;
            }
        }
        return null;
    }

    public void atenderConsulta(String folio) {
        if (folio == null) {
            System.out.println("El folio es nulo.");
            return;
        }

        Consulta busquedaConsultasExistentes = busquedaConsultasExistentes(folio);
        if (busquedaConsultasExistentes == null) {
            System.out.println("No existe la consulta.");
            return;
        }

        busquedaConsultasExistentes.atenderConsulta();
    }

    public void mostrarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("No hay consultas registradas.");
            return;
        }
        System.out.println("-------------Consultas-------------");
        System.out.printf("%-10s %-20s %-15s %-10s\n", "Folio", "Paciente", "Doctor", "Atendido");
        for (Consulta c : consultas) {
            c.mostrarInformacion();
        }
    }

    private int contarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("No existe consultas");
            return 0;
        }

        int contadorConsultasPendientes = 0;

        for (Consulta c : consultas) {
            if (!c.isAtendida()) {
                contadorConsultasPendientes++;
            }
        }
        return contadorConsultasPendientes;
    }

    public int contarConsultasPendientes() {
        int contarConsultasPendientes = contarConsultas();
        return contarConsultasPendientes;
    }

    public int contarConsultasAtendidas() {
        int contarConsultasAtendidas = consultas.size() - contarConsultas();
        return contarConsultasAtendidas;
    }

}
