package ejercicio23;

public class Main {

    public static void main(String[] args) {


        Libro libro1 = new Libro("L001", "Cien años de soledad", "Gabriel García Márquez", true);
        Libro libro2 = new Libro("L002", "Don Quijote de la Mancha", "Miguel de Cervantes", true);
        Libro libro3 = new Libro("L003", "El Principito", "Antoine de Saint-Exupéry", false);
        Libro libro4 = new Libro("L004", "1984", "George Orwell", true);
        Libro libro5 = new Libro("L005", "Fahrenheit 451", "Ray Bradbury", true);
        Libro libro6 = new Libro("L006", "Crimen y castigo", "Fiódor Dostoyevski", false);
        Libro libro7 = new Libro("L007", "Orgullo y prejuicio", "Jane Austen", true);
        Libro libro8 = new Libro("L008", "La Odisea", "Homero", true);
        Libro libro9 = new Libro("L009", "Drácula", "Bram Stoker", false);
        Libro libro10 = new Libro("L010", "El Hobbit", "J. R. R. Tolkien", true);

        Biblioteca biblioteca1 = new Biblioteca("Biblioteca1", 10);
        
        
        biblioteca1.agregarLibro(libro1);
        biblioteca1.agregarLibro(libro2);
        biblioteca1.agregarLibro(libro3);
        biblioteca1.agregarLibro(libro4);
        biblioteca1.agregarLibro(libro5);
        biblioteca1.agregarLibro(libro6);
        biblioteca1.agregarLibro(libro7);
        biblioteca1.agregarLibro(libro8);
        biblioteca1.agregarLibro(libro9);
        biblioteca1.agregarLibro(libro10);
         
        biblioteca1.agregarLibro(libro1);
        
        biblioteca1.mostrarLibros();
        
        biblioteca1.buscarLibro("L001");
        biblioteca1.buscarLibro("L0015");
        
        biblioteca1.prestarLibro("L001");
        biblioteca1.prestarLibro("L002");
        biblioteca1.prestarLibro("L004");
        biblioteca1.prestarLibro("L005");
        biblioteca1.prestarLibro("L007");
        
        biblioteca1.prestarLibro("L003");
        
        biblioteca1.devolverLibro("L003");
        
        biblioteca1.mostrarLibros();
        System.out.println("Libros disponibles:" + biblioteca1.contarDisponibles());
        
    }
}
