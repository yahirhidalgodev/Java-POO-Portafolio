package ejercicio2;

public class Main {

    public static void main(String[] args) {

        Libro[] libros = {
            new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863),
            new Libro("Cien años de soledad", "Gabriel García Márquez", 496),
            new Libro("El Principito", "Antoine de Saint-Exupéry", 96),
            new Libro("Clean Code", "Robert C. Martin", 464),
            new Libro("Harry Potter y la piedra filosofal", "J. K. Rowling", 223)
        };

        for (int i = 0; i < libros.length; i++) {

            libros[i].mostrarInformacion();

            if (libros[i].esLibroLargo()) {
                System.out.println("Es un libro largo");
            } else {
                System.out.println("Es libro corto");
            }

            libros[i].descripcion();

            System.out.println("----------");
        }

    }
}
