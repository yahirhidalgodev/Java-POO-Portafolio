package ejercicio14;

public class Libro extends Material {

//    Atributos 
    private String autor;
    private int numeroPaginas;

//    Constructor
    public Libro(String codigo, String titulo, int anioPublicacion, String autor, int numeroPaginas) {
        super(codigo, titulo, anioPublicacion);
        setAutor(autor);
        setNumeroPaginas(numeroPaginas);
    }

//    Getters
    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

//    Setters
    public void setAutor(String autor) {
        if (autor == null || autor.strip().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas <= 0) {
            throw new IllegalArgumentException("No puede ser igual o menor que 0 en páginas.");
        }
        this.numeroPaginas = numeroPaginas;
    }
//    Métodos

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información especifica---");
        System.out.println("Autor: " + autor);
        System.out.println("Número páginas: " + numeroPaginas);
        System.out.println("Es libro largo: " + esLibroLargo());
    }

    @Override
    public String tipoMaterial() {
        return "Libro";
    }

    public boolean esLibroLargo() {
        return numeroPaginas > 300;
    }

}
