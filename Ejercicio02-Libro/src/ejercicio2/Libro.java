package ejercicio2;

public class Libro {
//    Atributos

    private String titulo;
    private String autor;
    private int numeroPaginas;

//    Constructor
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

//    Métodos
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);

    }

    public boolean esLibroLargo() {
        return numeroPaginas >= 300;
    }

    public void descripcion() {
        System.out.println("El libro " + titulo
                + ", fue escrito por " + autor
                + ", y tiene " + numeroPaginas + " páginas.");
    }
}
