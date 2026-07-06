package ejercicio14;

public class Material {

//    Atributos 
    private String codigo;
    private String titulo;
    private int anioPublicacion;

//    Constructor
    public Material(String codigo, String titulo, int anioPublicacion) {
        setCodigo(codigo);
        setTitulo(titulo);
        setAnioPublicacion(anioPublicacion);
    }

//    Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

//    Setters
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el código.");
        }
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío.");
        }
        this.titulo = titulo;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion <= 0) {
            throw new IllegalArgumentException("No puede ser menor o igual a 0 el año.");
        }
        this.anioPublicacion = anioPublicacion;
    }

//    Métodos
    public void mostrarInformacion() {

        System.out.println("---Informacion general---");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + anioPublicacion);
        
        
    }

    public String tipoMaterial() {
        return "Material";
    }

    public boolean esReciente() {
        return anioPublicacion >= 2020;
    }
}
