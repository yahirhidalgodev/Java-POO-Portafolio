package ejercicio10;

import java.util.ArrayList;

public class CatalogoPeliculas {

    // Atributos
    private ArrayList<Pelicula> peliculas;

    // Constructor
    public CatalogoPeliculas() {
        peliculas = new ArrayList<>();
    }

    // Métodos
    public void agregarPelicula(Pelicula pelicula) {
        if (buscarPorCodigo(pelicula.getCodigo()) != null) {
            System.out.println("La película " + pelicula.getTitulo() + " ya existe.");
            return;
        }

        peliculas.add(pelicula);
        System.out.println("Película " + pelicula.getTitulo() + " agregada.");
    }

    public Pelicula buscarPorCodigo(String codigo) {
        for (Pelicula p : peliculas) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public void eliminarPorCodigo(String codigo) {
        for (int i = 0; i < peliculas.size(); i++) {
            if (codigo.equalsIgnoreCase(peliculas.get(i).getCodigo())) {
                String titulo = peliculas.get(i).getTitulo();
                peliculas.remove(i);
                System.out.println("Se eliminó la película " + titulo);
                return;
            }
        }

        System.out.println("No se encontró el código: " + codigo);
    }

    public void mostrarTodas() {
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas registradas.");
            return;
        }

        for (Pelicula p : peliculas) {
            System.out.println("------------------------");
            p.mostrarFichaTecnica();
        }
    }

    public void mostrarPeliculasLargas() {
        System.out.println("Películas largas (120 minutos o más):");

        boolean encontrada = false;

        for (Pelicula p : peliculas) {
            if (p.esLarga()) {
                System.out.println("- " + p.getTitulo()
                        + " (" + p.getDuracion() + " min)");
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No hay películas largas.");
        }
    }
}
