package ejercicio30;

public class Main {

    public static void main(String[] args) {

        // Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Libros
        Libro libro1 = new Libro("ISBN001", "Java Basico", "Herbert Schildt");
        Libro libro2 = new Libro("ISBN002", "Clean Code", "Robert C. Martin");
        Libro libro3 = new Libro("ISBN003", "Spring Boot", "Craig Walls");
        Libro libro4 = new Libro("ISBN004", "Effective Java", "Joshua Bloch");
        Libro libro5 = new Libro("ISBN005", "Java POO", "Deitel");
        Libro libro6 = new Libro("ISBN006", "Algoritmos", "Niklaus Wirth");
        Libro libro7 = new Libro("ISBN007", "Estructuras de Datos", "Mark Allen");
        Libro libro8 = new Libro("ISBN008", "Patrones de Diseño", "GoF");
        Libro libro9 = new Libro("ISBN009", "Java Avanzado", "Cay Horstmann");
        Libro libro10 = new Libro("ISBN010", "Programacion Web", "Martín Fowler");

        // Agregar libros a biblioteca        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
        biblioteca.agregarLibro(libro6);
        biblioteca.agregarLibro(libro7);
        biblioteca.agregarLibro(libro8);
        biblioteca.agregarLibro(libro9);
        biblioteca.agregarLibro(libro10);

        // Intento de libro repetido
        biblioteca.agregarLibro(new Libro("ISBN001", "Libro Repetido", "Autor"));

        // Usuarios
        Usuario usuario1 = new Usuario("U001", "Juan Perez", "juan@gmail.com");
        Usuario usuario2 = new Usuario("U002", "Maria Lopez", "maria@gmail.com");
        Usuario usuario3 = new Usuario("U003", "Carlos Hernandez", "carlos@gmail.com");
        Usuario usuario4 = new Usuario("U004", "Ana Garcia", "ana@gmail.com");
        Usuario usuario5 = new Usuario("U005", "Luis Ramirez", "luis@gmail.com");
        Usuario usuario6 = new Usuario("U006", "Pedro Sanchez", "pedro@gmail.com");
        Usuario usuario7 = new Usuario("U007", "Laura Torres", "laura@gmail.com");
        Usuario usuario8 = new Usuario("U008", "Miguel Ruiz", "miguel@gmail.com");

        // Agregar usuarios a biblioteca        
        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);
        biblioteca.agregarUsuario(usuario3);
        biblioteca.agregarUsuario(usuario4);
        biblioteca.agregarUsuario(usuario5);
        biblioteca.agregarUsuario(usuario6);
        biblioteca.agregarUsuario(usuario7);
        biblioteca.agregarUsuario(usuario8);

        // Intento de usuario repetido
        biblioteca.agregarUsuario(new Usuario("U001", "Usuario Repetido", "repetido@gmail.com"));

        // Registrar préstamos
        biblioteca.registrarPrestamo("ISBN001", "U001");
        biblioteca.registrarPrestamo("ISBN002", "U002");
        biblioteca.registrarPrestamo("ISBN003", "U003");
        biblioteca.registrarPrestamo("ISBN004", "U004");
        biblioteca.registrarPrestamo("ISBN005", "U005");

        // Casos de prueba
        biblioteca.registrarPrestamo("ISBN001", "U006"); // Libro ya prestado
        biblioteca.registrarPrestamo("ISBN999", "U001"); // Libro inexistente
        biblioteca.registrarPrestamo("ISBN006", "U999"); // Usuario inexistente

        // Mostrar información de libros
        biblioteca.mostrarLibros();

        // Mostrar información de Usuarios
        biblioteca.mostrarUsuarios();

        // Mostrar información de Prestamos
        biblioteca.mostrarPrestamos();

        // Devolver libros
        biblioteca.devolverLibro("PR001");
        biblioteca.devolverLibro("PR002");
        biblioteca.devolverLibro("PR003");

        // Intento de devolver nuevamente
        biblioteca.devolverLibro("PR001");

        // Mostrar préstamos nuevamente
        biblioteca.mostrarPrestamos();

        biblioteca.mostrarLibros();

        // Número de libros disponibles        
        System.out.println("Libros disponibles: " + biblioteca.contarLibrosDisponibles());
        // Número de libros no disponibles
        System.out.println("Libros prestados: " + biblioteca.contarLibrosPrestados());

    }
}
