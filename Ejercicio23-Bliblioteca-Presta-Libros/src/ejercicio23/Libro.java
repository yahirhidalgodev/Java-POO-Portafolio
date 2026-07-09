package ejercicio23;

public class Libro {

    //Atributos 
    private String codigo;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String codigo, String titulo, String autor, boolean disponible) {
        setCodigo(codigo);
        setTitulo(titulo);
        setAutor(autor);
        setDisponible(disponible);
    }

//    Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }
//    Setters

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.strip().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.strip().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.strip().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
//   Métodos

    public void mostrarInformacion() {

        System.out.printf("%-5s %-30s %-25s %-12s\n", codigo, titulo, autor, disponible);

    }

    public void prestarLibro() {
        if (disponible) {
            System.out.println("Libro prestado.");
            disponible = false;
            return;
        }

        System.out.println("El libro ya está prestado.");
    }

    public void devolverLibro() {
        if (!disponible) {
            disponible = true;
            System.out.println("Se devolvio el libro");
            return;
        }
        System.out.println("El libro no estaba prestado.");
    }

}
