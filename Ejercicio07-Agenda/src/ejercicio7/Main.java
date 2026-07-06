package ejercicio7;

public class Main {

    public static void main(String[] args) {

//        Crear una instancia agenda
        Agenda agenda = new Agenda();

//        Crear al menos 8 objetos Contacto con datos diferentes.
        Contacto c1 = new Contacto("Yahir", "2462618354", "yahirhidalgoalvarez123@gmail.com");
        Contacto c2 = new Contacto("Maria", "7712222222", "maria@gmail.com");
        Contacto c3 = new Contacto("Juan", "7713333333", "juan@gmail.com");
        Contacto c4 = new Contacto("Ana", "7714444444", "ana@gmail.com");
        Contacto c5 = new Contacto("Carlos", "7715555555", "carlos@gmail.com");
        Contacto c6 = new Contacto("Sofia", "7716666666", "sofia@gmail.com");
        Contacto c7 = new Contacto("Luis", "7717777777", "luis@gmail.com");
        Contacto c8 = new Contacto("Fernanda", "7718888888", "fernandagmail.com");

//     Agregar esos contactos a la agenda utilizando el método correspondiente.
        agenda.agregarContacto(c1);
        agenda.agregarContacto(c2);
        agenda.agregarContacto(c3);
        agenda.agregarContacto(c4);
        agenda.agregarContacto(c5);
        agenda.agregarContacto(c6);
        agenda.agregarContacto(c7);
        agenda.agregarContacto(c8);

//       Intentar agregar un contacto con un teléfono duplicado para verificar la validación.
        Contacto c9 = new Contacto("Yahir", "2462618354", "yahirhidalgoalvarez123@gmail.com");
        agenda.agregarContacto(c9);

//       Mostrar todos los contactos registrados.
        agenda.mostrarTodosLosContactos();

//        Buscar un contacto existente por nombre.
        agenda.buscarContactoPorNombre("Yahir");

//        Buscar un contacto que no exista.
        agenda.buscarContactoPorNombre("Alma delia");

//       Eliminar un contacto existente.
        agenda.eliminarContactoPorNombre("Yahir");

//        Intentar eliminar un contacto inexistente.
        agenda.eliminarContactoPorNombre("Pedro");

//        Mostrar nuevamente todos los contactos para comprobar que la eliminación funcionó.
        agenda.mostrarTodosLosContactos();

    }
}
