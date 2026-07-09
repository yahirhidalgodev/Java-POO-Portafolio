package ejercicio23;

public class Biblioteca {

    private String nombre;
    private Libro[] libros;
    private int cantidadLibros;

    public Biblioteca(String nombre, int capacidadMaxima) {
        setNombre(nombre);

        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a 0.");
        }

        cantidadLibros = 0;
        libros = new Libro[capacidadMaxima];
    }

//    Getter
    public String getNombre() {
        return nombre;
    }
//    Setter

    public void setNombre(String nombre) {
        if (nombre == null || nombre.strip().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

//    Métodos
    public void agregarLibro(Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException("El libro no puedes ponerlo nulo.");
        }

        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getCodigo().equals(libro.getCodigo())) {
                System.out.println("Ya existe el libro " + libro.getTitulo());
                return;
            }
        }

        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = libro;
            System.out.println("Libro agregado: " + libro.getTitulo());
            cantidadLibros++;
        } else {
            System.out.println("La biblioteca está llena.");
        }

    }

    public void mostrarLibros() {
        System.out.println("---------------------------------------");
        System.out.printf("%-5s %-30s %-25s %-12s%n", "Codigo", "Titulo", "Autor", "Disponible");

        for (int i = 0; i < cantidadLibros; i++) {
            libros[i].mostrarInformacion();
        }
        System.out.println("---------------------------------------");
    }

    public void buscarLibro(String codigo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getCodigo().equals(codigo)) {
                System.out.println("Libro encontrado: " + libros[i].getTitulo());
                return;
            }

        }
        System.out.println("Libro no encontrado: " + codigo);
    }

    public void prestarLibro(String codigo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getCodigo().equals(codigo)) {
                libros[i].prestarLibro();
                return;
            }
        }

        System.out.println("Libro no encontrado.");
    }

    public void devolverLibro(String codigo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getCodigo().equals(codigo)) {
                libros[i].devolverLibro();
                return;
            }
        }

        System.out.println("Libro no encontrado.");
    }

    public int contarDisponibles() {
        int count = 0;

        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].isDisponible()) {
                count++;
            }
        }
        return count;
    }
}
