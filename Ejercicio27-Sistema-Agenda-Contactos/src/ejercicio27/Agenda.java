package ejercicio27;

import java.util.ArrayList;

public class Agenda {

    // Atributos
    private String nombre;
    private ArrayList<Contacto> contactos;

    // Constructor
    public Agenda(String nombre) {
        setNombre(nombre);
        contactos = new ArrayList<>();
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

    private Contacto buscarPorTelefono(String telefono) {
        for (Contacto c : contactos) {
            if (c.getTelefono().equals(telefono)) {
                return c;
            }
        }
        return null;
    }

    public void agregarContacto(Contacto contacto) {
        if (contacto == null) {
            System.out.println("El contacto no puede ser null.");
            return;
        }
        if (buscarPorTelefono(contacto.getTelefono()) != null) {
            System.out.println("El contacto ya existe.");
            return;
        }
        System.out.println("Contacto agregado: " + contacto.getNombre());
        contactos.add(contacto);
    }

    public void buscarContacto(String telefono) {

        Contacto busquedaContacto = buscarPorTelefono(telefono);

        if (telefono == null) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío.");
        }

        if (busquedaContacto == null) {
            System.out.println("Contacto no encontrado");
            return;
        }

        System.out.print("Contacto encontrado: ");
        busquedaContacto.mostrarInformacion();

    }

    public void eliminarContacto(String telefono) {

        Contacto eliminarContacto = buscarPorTelefono(telefono);

        if (eliminarContacto == null) {
            System.out.println("Contacto no encontrado.");
            return;
        }
        System.out.println("Contacto eliminado: " + telefono);
        contactos.remove(eliminarContacto);

    }

    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en existencia.");
            return;
        }

        System.out.printf("%-20s %-12s %-30s%n",
                "Nombre", "Teléfono", "Correo");

        System.out.println("-----------------------------------------------------------");

        for (Contacto c : contactos) {
            c.mostrarInformacion();
        }
    }

    public int contarContactos() {
        return contactos.size();
    }

    public boolean existeContacto(String telefono) {
        return buscarPorTelefono(telefono) != null;
    }
}
