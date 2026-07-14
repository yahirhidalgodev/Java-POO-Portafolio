package ejercicio28;

import java.util.ArrayList;

public class Agencia {
    // Atributos

    private String nombre;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Prestamo> prestamos;
    // Constructor

    public Agencia(String nombre) {
        setNombre(nombre);

        vehiculos = new ArrayList<Vehiculo>();
        clientes = new ArrayList<Cliente>();
        prestamos = new ArrayList<Prestamo>();

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

    // Métodos de Vehículo
    private Vehiculo busquedaVehiculo(String placas) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placas)) {
                return v;
            }
        }
        return null;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {

        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser null.");
        }

        Vehiculo buscar = busquedaVehiculo(vehiculo.getPlaca());

        if (buscar != null) {
            System.out.println("El vehículo ya existe.");
            return;
        }

        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado.");
    }

    public void buscarVehiculo(String placas) {
        Vehiculo buscar = busquedaVehiculo(placas);
        if (buscar == null) {
            System.out.println("No existe el vehículo");
            return;
        }
        buscar.mostrarInformacion();
    }

    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos en existencia.");
            return;
        }
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Marca", "Modelo", "Placa", "Estado");
        System.out.println("-------------------------------------------------");
        for (Vehiculo v : vehiculos) {
            v.mostrarInformacion();
        }
    }

    // Métodos de Cliente
    private Cliente busquedaCliente(String idCliente) {
        for (Cliente c : clientes) {
            if (c.getIdCliente().equals(idCliente)) {
                return c;
            }
        }
        return null;
    }

    public void agregarCliente(Cliente cliente) {
        
        if (cliente == null) {
            throw new IllegalArgumentException("El vehículo no puede ser null.");
        }

        Cliente busquedaCliente = busquedaCliente(cliente.getIdCliente());

        if (busquedaCliente != null) {
            System.out.println("El cliente ya existe.");
            return;
        }
        System.out.println("Cliente agregado: " + cliente.getNombre());
        clientes.add(cliente);
    }

    public void buscarCliente(String idCliente) {
        Cliente busquedaCliente = busquedaCliente(idCliente);
        if (busquedaCliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }
        System.out.println("Cliente encontrado " + busquedaCliente.getNombre());
    }

    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes.");
            return;
        }

        System.out.printf("%-10s %-20s %-15s%n",
                "ID", "Nombre", "Teléfono");
        for (Cliente c : clientes) {
            c.mostarInformacion();
        }
    }

    // Métodos de Prestamo
    public void realizarPrestamo(String placa, String idCliente) {

        Vehiculo vehiculo = busquedaVehiculo(placa);
        Cliente cliente = busquedaCliente(idCliente);

        if (vehiculo == null) {
            System.out.println("La placa no existe.");
            return;
        }

        if (cliente == null) {
            System.out.println("El cliente no existe.");
            return;
        }

        if (!vehiculo.isDisponible()) {
            System.out.println("El vehículo ya está prestado.");
            return;
        }

        vehiculo.prestar();

        String folio = "P" + String.format("%03d", prestamos.size() + 1);

        Prestamo prestamo = new Prestamo(folio, cliente, vehiculo);

        prestamos.add(prestamo);

        System.out.println("Préstamo registrado correctamente.");
    }

    public void devolverVehiculo(String placa) {
        Vehiculo busquedaVehiculo = busquedaVehiculo(placa);

        if (busquedaVehiculo == null) {
            System.out.println("El vehículo no existe.");
            return;
        }
        busquedaVehiculo.devolver();

    }

    public void mostrarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay prestamos.");
            return;
        }
        System.out.printf(
                "%-8s %-8s %-20s %-15s %-12s %-10s %-12s%n",
                "Folio",
                "Id",
                "Nombre",
                "Marca",
                "Modelo",
                "Placa",
                "Estado");
        for (Prestamo p : prestamos) {
            p.mostrarInformacion();
        }
    }

}
