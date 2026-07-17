package ejercicio30;

import java.util.ArrayList;

public class Biblioteca {

    // Atributos
    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> prestamos;

    // Constructor
    public Biblioteca(String nombre) {
        setNombre(nombre);
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    // Setters
    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }

        this.nombre = nombre;
    }

    // Métodos privados
    private Libro buscarLibroEnBiblioteca(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    private Usuario buscarUsuarioEnBiblioteca(String idUsuario) {
        for (Usuario u : usuarios) {
            if (u.getIdUsuario().equals(idUsuario)) {
                return u;
            }
        }
        return null;
    }

    private Prestamo buscarPrestamoEnBiblioteca(String folio) {
        for (Prestamo p : prestamos) {
            if (p.getFolio().equals(folio)) {
                return p;
            }
        }
        return null;
    }

    // Métodos públicos
    public void agregarLibro(Libro libro) {
        if (libro == null) {
            System.out.println("El libro no puede ser de tipo nulo.");
            return;
        }
        Libro buscarLibro = buscarLibroEnBiblioteca(libro.getIsbn());

        if (buscarLibro != null) {
            System.out.println("El libro ya existe");
            return;
        }

        System.out.println("Libro agregado: " + libro.getTitulo());
        libros.add(libro);

    }

    public void buscarLibro(String isbn) {
        if (isbn == null) {
            System.out.println("El isbn no puede ser nulo.");
            return;
        }

        Libro buscarLibroLista = buscarLibroEnBiblioteca(isbn);

        if (buscarLibroLista == null) {
            System.out.println("Libro no encontrado.");
            return;
        }
        System.out.println("Libro encontrado: ");

        buscarLibroLista.mostrarInformacion();
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en existencia.");
            return;
        }
        System.out.println("---------------Libros---------------");
        System.out.printf("%-10s %-25s %-20s %-2s\n", "Isbn", "Título", "Autor", "Disponible");
        for (Libro l : libros) {
            l.mostrarInformacion();
        }
    }

    public void agregarUsuario(Usuario usuario) {
        if (usuario == null) {
            System.out.println("El usuario no puede ser nulo.");
            return;
        }

        Usuario buscarUsuarioEnBiblioteca = buscarUsuarioEnBiblioteca(usuario.getIdUsuario());

        if (buscarUsuarioEnBiblioteca != null) {
            System.out.println("El usuario ya existe.");
            return;
        }

        System.out.println("Usuario agregado: " + usuario.getNombre());
        usuarios.add(usuario);

    }

    public void buscarUsuario(String idUsuario) {
        if (idUsuario == null) {
            System.out.println("El id usuario no puede ser nulo.");
            return;
        }

        Usuario buscarUsuarioEnBiblioteca = buscarUsuarioEnBiblioteca(idUsuario);

        if (buscarUsuarioEnBiblioteca == null) {
            System.out.println("El usuario no esta registrado.");
            return;
        }

        buscarUsuarioEnBiblioteca.mostrarInformacion();
    }

    public void mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        System.out.println("---------------Usuarios---------------");
        System.out.printf("%-10s %-20s %-10s\n", "Id Usuario", "Nombre", "Correo");
        for (Usuario u : usuarios) {
            u.mostrarInformacion();
        }
    }

    public void registrarPrestamo(String isbn, String idUsuario) {
        Libro libro = buscarLibroEnBiblioteca(isbn);
        Usuario usuario = buscarUsuarioEnBiblioteca(idUsuario);

        if (libro == null) {
            System.out.println("Libro no encontrado.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        if (!libro.isDisponible()) {
            System.out.println("El libro ya está prestado.");
            return;
        }

        String folio = String.format("PR%03d", prestamos.size() + 1);
        libro.prestar();

        Prestamo prestamo = new Prestamo(folio, libro, usuario);
        System.out.println("Libro prestado: " + libro.getTitulo() + " del autor " + libro.getAutor());
        prestamos.add(prestamo);

    }

    public void devolverLibro(String folio) {
        if (folio == null || folio.isBlank()) {
            System.out.println("El folio no puede ser nulo.");
        }

        Prestamo buscarPrestamoEnBiblioteca = buscarPrestamoEnBiblioteca(folio);

        if (buscarPrestamoEnBiblioteca == null) {
            System.out.println("El libro no fue prestado.");
            return;
        }

        buscarPrestamoEnBiblioteca.getLibro().devolver();
        buscarPrestamoEnBiblioteca.cerrarPrestamo();
         

    }

    public void mostrarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay libros prestados.");
            return;
        }
        System.out.println("---------------Prestamos---------------");
        System.out.printf("%-10s %-15s %-20s %-5s\n", "Folio", "Libro", "Usuarios", "Disponible");
        for (Prestamo p : prestamos) {
            p.mostrarInformacion();
        }
    }

    public int contarLibrosDisponibles() {

        int contadorDisponibles = 0;

        for (Libro l : libros) {
            if (l.isDisponible() == true) {
                contadorDisponibles += 1;
            }
        }
        return contadorDisponibles;
    }

    public int contarLibrosPrestados() {
        return libros.size() - contarLibrosDisponibles();
    }

}
