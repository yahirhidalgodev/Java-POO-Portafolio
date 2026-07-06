package ejercicio10;

public class Pelicula {

    // Atributos
    private String codigo;
    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    private boolean disponible;

    // Constructor
    public Pelicula(String codigo, String titulo, String director,
            int duracion, String genero, boolean disponible) {

        setCodigo(codigo);
        setTitulo(titulo);
        setDirector(director);
        setDuracion(duracion);
        setGenero(genero);
        setDisponible(disponible);
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public boolean getDisponible() {
        return disponible;
    }

    // Setters
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.strip().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.strip().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        if (director == null || director.strip().isEmpty()) {
            throw new IllegalArgumentException("El director no puede estar vacío.");
        }
        this.director = director;
    }

    public void setDuracion(int duracion) {
        if (duracion <= 0) {
            throw new IllegalArgumentException("La duración debe ser mayor que 0.");
        }
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        if (genero == null || genero.strip().isEmpty()) {
            throw new IllegalArgumentException("El género no puede estar vacío.");
        }
        this.genero = genero;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Métodos
    public void mostrarFichaTecnica() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Género: " + genero);
        System.out.println("Disponible: " + disponible);
    }

    public boolean esLarga() {
        return duracion >= 120;
    }

    public void cambiarDisponibilidad() {
        disponible = !disponible;
    }

    public void descripcionCorta() {
        System.out.println("La película " + titulo
                + ", dirigida por " + director
                + ", pertenece al género " + genero
                + " y tiene una duración de "
                + duracion + " minutos.");
    }

    public boolean estaDisponible() {
        return disponible;
    }
}
