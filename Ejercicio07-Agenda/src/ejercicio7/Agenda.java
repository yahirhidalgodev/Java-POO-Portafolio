package ejercicio7;

import java.util.ArrayList;

public class Agenda {

//    Atributos
    private ArrayList<Contacto> contactos;

//    Constructor
    public Agenda() {
        contactos = new ArrayList<>();
    }

//    Métodos
    public void agregarContacto(Contacto contacto) {

        for (Contacto c : contactos) {
            if (c.getTelefono().equals(contacto.getTelefono())) {
                System.out.println("El teléfono "
                        + contacto.getTelefono()
                        + " ya existe.");
                return;
            }
        }
        contactos.add(contacto);
        System.out.println("Contacto "
                + contacto.getNombre()
                + " agregado.");
    }

    public void buscarContactoPorNombre(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("\nSi existe el contacto");
                c.mostrarInformacion();
                return;
            }
        }

        System.out.println("No existe el contacto.");
    }

    public void eliminarContactoPorNombre(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {

            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {

                System.out.println("Contacto "
                        + contactos.get(i).getNombre()
                        + " eliminado.");

                contactos.remove(i);
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public void mostrarTodosLosContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos");
            return;
        }

        System.out.println("\n---Contactos---");
        for (Contacto c : contactos) {
            c.mostrarInformacion();
        }

    }
}
