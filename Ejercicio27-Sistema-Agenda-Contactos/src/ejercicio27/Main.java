package ejercicio27;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda("Agenda personal");

        Contacto contacto1 = new Contacto("Juan Pérez", "5551111111", "juan@gmail.com");
        Contacto contacto2 = new Contacto("María López", "5552222222", "maria@gmail.com");
        Contacto contacto3 = new Contacto("Carlos Ramírez", "5553333333", "carlos@gmail.com");
        Contacto contacto4 = new Contacto("Ana Torres", "5554444444", "ana@gmail.com");
        Contacto contacto5 = new Contacto("Luis Hernández", "5555555555", "luis@gmail.com");
        Contacto contacto6 = new Contacto("Sofía Martínez", "5556666666", "sofia@gmail.com");
        Contacto contacto7 = new Contacto("Pedro Sánchez", "5557777777", "pedro@gmail.com");
        Contacto contacto8 = new Contacto("Laura Gómez", "5558888888", "laura@gmail.com");
        Contacto contacto9 = new Contacto("Miguel Castillo", "5559999999", "miguel@gmail.com");
        Contacto contacto10 = new Contacto("Fernanda Ruiz", "5550000000", "fernanda@gmail.com");

        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);
        agenda.agregarContacto(contacto3);
        agenda.agregarContacto(contacto4);
        agenda.agregarContacto(contacto5);
        agenda.agregarContacto(contacto6);
        agenda.agregarContacto(contacto7);
        agenda.agregarContacto(contacto8);
        agenda.agregarContacto(contacto9);
        agenda.agregarContacto(contacto10);

        agenda.mostrarContactos();

        agenda.buscarContacto("5554444444");
        agenda.buscarContacto("5551234567");

        agenda.eliminarContacto("5553333333");

        agenda.mostrarContactos();

        System.out.println("\nCantidad de contactos: " + agenda.contarContactos());

        System.out.println("¿Existe el contacto? "
                + agenda.existeContacto("5555555555"));

        System.out.println("¿Existe el contacto? "
                + agenda.existeContacto("5551010101"));

    }

}
