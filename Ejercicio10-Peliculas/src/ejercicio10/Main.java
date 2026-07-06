package ejercicio10;

public class Main {

    public static void main(String[] args) {

        CatalogoPeliculas catalogo1 = new CatalogoPeliculas();

        Pelicula p1 = new Pelicula("P001", "Inception", "Christopher Nolan", 148, "Ciencia Ficción", true);
        Pelicula p2 = new Pelicula("P002", "Titanic", "James Cameron", 195, "Drama/Romance", true);
        Pelicula p3 = new Pelicula("P003", "Avatar", "James Cameron", 162, "Ciencia Ficción", true);
        Pelicula p4 = new Pelicula("P004", "Jurassic Park", "Steven Spielberg", 127, "Aventura/Ciencia Ficción", false);
        Pelicula p5 = new Pelicula("P005", "The Dark Knight", "Christopher Nolan", 152, "Acción", true);
        Pelicula p6 = new Pelicula("P006", "Coco", "Lee Unkrich", 105, "Animación/Familiar", true);
        Pelicula p7 = new Pelicula("P007", "Interstellar", "Christopher Nolan", 169, "Ciencia Ficción", true);
        Pelicula p8 = new Pelicula("P008", "Gladiator", "Ridley Scott", 155, "Acción/Drama", true);

        System.out.println("--- Agregar películas ---");
        catalogo1.agregarPelicula(p1);
        catalogo1.agregarPelicula(p2);
        catalogo1.agregarPelicula(p3);
        catalogo1.agregarPelicula(p4);
        catalogo1.agregarPelicula(p5);
        catalogo1.agregarPelicula(p6);
        catalogo1.agregarPelicula(p7);
        catalogo1.agregarPelicula(p8);

        System.out.println("\n--- Película duplicada ---");
        Pelicula p9 = new Pelicula("P001", "Inception", "Christopher Nolan", 148, "Ciencia Ficción", false);
        catalogo1.agregarPelicula(p9);

        System.out.println("\n--- Mostrar catálogo ---");
        catalogo1.mostrarTodas();

        System.out.println("\n--- Búsqueda de película existente ---");
        Pelicula encontrada = catalogo1.buscarPorCodigo("P002");

        if (encontrada != null) {
            encontrada.mostrarFichaTecnica();
        }

        System.out.println("\n--- Búsqueda de película inexistente ---");
        Pelicula inexistente = catalogo1.buscarPorCodigo("P010");

        if (inexistente == null) {
            System.out.println("La película no existe.");
        }

        System.out.println("\n--- Cambiar disponibilidad ---");
        System.out.println("Antes: " + p1.estaDisponible());

        p1.cambiarDisponibilidad();

        System.out.println("Después: " + p1.estaDisponible());

        System.out.println("\n--- Películas largas ---");
        catalogo1.mostrarPeliculasLargas();

        System.out.println("\n--- Eliminar película existente ---");
        catalogo1.eliminarPorCodigo("P001");

        System.out.println("\n--- Eliminar película inexistente ---");
        catalogo1.eliminarPorCodigo("P010");

        System.out.println("\n--- Mostrar catálogo actualizado ---");
        catalogo1.mostrarTodas();

        System.out.println("\n--- Verificar disponibilidad ---");
        System.out.println("¿Está disponible "
                + p8.getTitulo()
                + "? "
                + p8.estaDisponible());

        System.out.println("\n--- Descripción corta ---");
        p8.descripcionCorta();
    }
}
