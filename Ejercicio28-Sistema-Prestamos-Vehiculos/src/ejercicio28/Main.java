package ejercicio28;

public class Main {

    public static void main(String[] args) {

        Agencia agencia = new Agencia("Agencia Hidalgo");

        // ==========================
        // Vehículos
        // ==========================
        agencia.agregarVehiculo(new Vehiculo("ABC-123", "Toyota", "Corolla", true));
        agencia.agregarVehiculo(new Vehiculo("DEF-456", "Nissan", "Versa", true));
        agencia.agregarVehiculo(new Vehiculo("GHI-789", "Mazda", "3", true));
        agencia.agregarVehiculo(new Vehiculo("JKL-111", "Honda", "Civic", true));
        agencia.agregarVehiculo(new Vehiculo("MNO-222", "Kia", "Rio", true));
        agencia.agregarVehiculo(new Vehiculo("PQR-333", "Ford", "Focus", true));
        agencia.agregarVehiculo(new Vehiculo("STU-444", "Volkswagen", "Jetta", true));
        agencia.agregarVehiculo(new Vehiculo("VWX-555", "Hyundai", "Elantra", true));
        agencia.agregarVehiculo(new Vehiculo("YZA-666", "Chevrolet", "Aveo", true));
        agencia.agregarVehiculo(new Vehiculo("BCD-777", "Renault", "Kwid", true));

        // Vehículo duplicado
        agencia.agregarVehiculo(new Vehiculo("ABC-123", "Toyota", "Corolla", true));

        // ==========================
        // Clientes
        // ==========================
        agencia.agregarCliente(new Cliente("C001", "Juan Pérez", "5511111111"));
        agencia.agregarCliente(new Cliente("C002", "Carlos López", "5522222222"));
        agencia.agregarCliente(new Cliente("C003", "Pedro Ramírez", "5533333333"));
        agencia.agregarCliente(new Cliente("C004", "María García", "5544444444"));
        agencia.agregarCliente(new Cliente("C005", "Ana Torres", "5555555555"));
        agencia.agregarCliente(new Cliente("C006", "Luis Hernández", "5566666666"));
        agencia.agregarCliente(new Cliente("C007", "Sofía Martínez", "5577777777"));
        agencia.agregarCliente(new Cliente("C008", "Diego Sánchez", "5588888888"));

        // Cliente duplicado
        agencia.agregarCliente(new Cliente("C001", "Juan Pérez", "5511111111"));

        // ==========================
        // Préstamos
        // ==========================
        agencia.realizarPrestamo("ABC-123", "C001");
        agencia.realizarPrestamo("DEF-456", "C002");
        agencia.realizarPrestamo("GHI-789", "C003");

        // Intentar prestar un vehículo ya prestado
        agencia.realizarPrestamo("ABC-123", "C004");

        // ==========================
        // Mostrar información
        // ==========================
        System.out.println("\n===== VEHÍCULOS =====");
        agencia.mostrarVehiculos();

        System.out.println("\n===== CLIENTES =====");
        agencia.mostrarClientes();

        System.out.println("\n===== PRÉSTAMOS =====");
        agencia.mostrarPrestamos();

        // ==========================
        // Devolver vehículo
        // ==========================
        System.out.println("\n===== DEVOLUCIÓN =====");
        agencia.devolverVehiculo("ABC-123");

        // Volver a prestarlo
        System.out.println("\n===== NUEVO PRÉSTAMO =====");
        agencia.realizarPrestamo("ABC-123", "C004");

        System.out.println("\n===== VEHÍCULOS ACTUALIZADOS =====");
        agencia.mostrarVehiculos();
    }
}