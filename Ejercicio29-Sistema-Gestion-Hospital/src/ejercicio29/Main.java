package ejercicio29;

public class Main {

    public static void main(String[] args) {
        // Hospital
        Hospital hospital1 = new Hospital("Hospital 1");

        // pacientes
        Paciente paciente1 = new Paciente("P001", "Juan", 15);
        Paciente paciente2 = new Paciente("P002", "María", 16);
        Paciente paciente3 = new Paciente("P003", "Pedro", 14);
        Paciente paciente4 = new Paciente("P004", "Ana", 13);
        Paciente paciente5 = new Paciente("P005", "Luis", 10);
        Paciente paciente6 = new Paciente("P006", "Sofía", 8);
        Paciente paciente7 = new Paciente("P007", "Carlos", 4);
        Paciente paciente8 = new Paciente("P008", "Fernanda", 45);
        Paciente paciente9 = new Paciente("P009", "Miguel", 16);
        Paciente paciente10 = new Paciente("P010", "Laura", 8);

        // Agegar Pacienetes
        hospital1.agregarPaciente(paciente1);
        hospital1.agregarPaciente(paciente2);
        hospital1.agregarPaciente(paciente3);
        hospital1.agregarPaciente(paciente4);
        hospital1.agregarPaciente(paciente5);
        hospital1.agregarPaciente(paciente6);
        hospital1.agregarPaciente(paciente7);
        hospital1.agregarPaciente(paciente8);
        hospital1.agregarPaciente(paciente9);
        hospital1.agregarPaciente(paciente10);

        // Doctores
        Doctor doctor1 = new Doctor("D001", "Juan Pérez", "Medicina General");
        Doctor doctor2 = new Doctor("D002", "María López", "Pediatría");
        Doctor doctor3 = new Doctor("D003", "Carlos Hernández", "Cardiología");
        Doctor doctor4 = new Doctor("D004", "Pedro Hidalgo", "Neurología");
        Doctor doctor5 = new Doctor("D005", "Ana García", "Traumatología");
        Doctor doctor6 = new Doctor("D006", "Luis Ramírez", "Dermatología");

        // Agregar doctores
        hospital1.agregarDoctor(doctor1);
        hospital1.agregarDoctor(doctor2);
        hospital1.agregarDoctor(doctor3);
        hospital1.agregarDoctor(doctor4);
        hospital1.agregarDoctor(doctor5);
        hospital1.agregarDoctor(doctor6);

        //      Registrar consultas
        hospital1.registrarConsulta("P001", "D001");
        hospital1.registrarConsulta("P002", "D003");
        hospital1.registrarConsulta("P005", "D002");
        hospital1.registrarConsulta("P008", "D006");

        //Consulta con paciente inexistente
        hospital1.registrarConsulta("P0015", "D006");
        //Consulta con doctore inexistente
        hospital1.registrarConsulta("P008", "D0020");

        //Mostrar pacientes        
        hospital1.mostarPacientes();
        //Mostrar doctores 
        hospital1.mostrarDoctores();
        //Mostrar consultas        
        hospital1.mostrarConsultas();

        //Atender consultas
        hospital1.atenderConsulta("C001");
        hospital1.atenderConsulta("C003");

        //Mostrar consultas
        hospital1.mostrarConsultas();

        //Consultas atendidas        
        System.out.println("Consultas atendidas: " + hospital1.contarConsultasAtendidas());

        //Consultas pendientes       
        System.out.println("Consultas pedientes: " + hospital1.contarConsultasPendientes());
    }
}
