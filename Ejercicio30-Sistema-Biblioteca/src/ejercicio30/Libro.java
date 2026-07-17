package ejercicio30;

public class Libro {
    // Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor
    public Libro(String isbn, String titulo, String autor) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        this.disponible = true;
    }

    // Getters
    public String getIsbn(){
        return isbn;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public boolean isDisponible(){
        return disponible;
    }

    // Setters
    public void setIsbn(String isbn){
        if(isbn == null || isbn.strip().isEmpty()){
            throw new IllegalArgumentException("El isbn no puede ser nulo.");
        }
        this.isbn = isbn;
    }
    public void setTitulo(String titulo){
        if(titulo == null || titulo.strip().isEmpty()){
            throw new IllegalArgumentException("El título no puede ser nulo.");
        }
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        if(autor == null || autor.strip().isEmpty()){
            throw new IllegalArgumentException("El autor no puede ser nulo.");
        }
        this.autor = autor;
    }
     
    
    // Métodos
    public void mostrarInformacion(){
        System.out.printf("%-10s %-25s %-20s %-2s\n", isbn, titulo, autor, disponible);
    }
    public void prestar(){
        if(!disponible){
            System.out.println("El libro no esta disponible.");
            return;
        }
        
        disponible = false;
    }
    public void devolver(){
        if(disponible){
            System.out.println("El producto no fue prestado.");
            return;
        }
        System.out.println("Libro devuelto correctamente.");
        disponible = true;
    }



}
