package ejercicio30;

public class Prestamo {

    // Atributos
    private String folio;
    private Libro libro;
    private Usuario usuario;
    private boolean activo;

    // Constructor
    public Prestamo(String folio, Libro libro, Usuario usuario) {
        setFolio(folio);
        setLibros(libro);
        setUsuarios(usuario);
        this.activo = true;
    }

    // Getters
    public String getFolio() {
        return folio;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean isActivo() {
        return activo;
    }

    // Setters
    public void setFolio(String folio) {
        if (folio == null || folio.strip().isEmpty()) {
            throw new IllegalArgumentException("El folio no puede ser nulo.");
        }
        this.folio = folio;
    }

    public void setLibros(Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException("El libro no puede ser nulo.");
        }
        this.libro = libro;
    }

    public void setUsuarios(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("El usuario no puede ser nulo.");
        }
        this.usuario = usuario;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Métodos
    public void mostrarInformacion() {

        System.out.printf("%-10s %-15s %-20s %-5s\n", folio, libro.getTitulo(), usuario.getNombre(), isActivo());
    }

    public void cerrarPrestamo() {
        if (!activo) {
            System.out.println("El préstamo ya fue cerrado.");
            return;
        }

        System.out.println("Préstamo cerrado correctamente.");
        activo = false;

    }

}
