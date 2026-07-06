package ejercicio14;

public class Revista extends Material {

//    Atributos 
    private String editorial;
    private int numeroEdicion;

//    Constructor
    public Revista(String codigo, String titulo, int anioPublicacion, String editorial, int numeroEdicion) {
        super(codigo, titulo, anioPublicacion);
        setEditorial(editorial);
        setNumeroEdicion(numeroEdicion);
    }

//    Getters
    public String getEditorial() {
        return editorial;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

//    Setters
    public void setEditorial(String editorial) {
        if (editorial == null || editorial.strip().isEmpty()) {
            throw new IllegalArgumentException("No puede estar vacío el apartado editorial.");
        }
        this.editorial = editorial;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        if (numeroEdicion <= 0) {
            throw new IllegalArgumentException("No puede ser menor o igual a 0 el número editorial.");

        }
        this.numeroEdicion = numeroEdicion;
    }

//    Métodos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---Información especifica---");
        System.out.println("Editorial: " + editorial);
        System.out.println("Número de edicion: " + numeroEdicion);
        System.out.println("Es edición especial: " + esEdicionEspecial());
    }

    @Override
    public String tipoMaterial() {
        return "Revista";
    }

    public boolean esEdicionEspecial() {
        return numeroEdicion >= 100;
    }

}
