package ejercicio9;

public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        // 8 videojuegos
        Videojuego v1 = new Videojuego("V001", "Minecraft", "PC", 599, 4);
        Videojuego v2 = new Videojuego("V002", "FIFA 25", "PS5", 1399, 8);
        Videojuego v3 = new Videojuego("V003", "Zelda TOTK", "Switch", 1499, 4);
        Videojuego v4 = new Videojuego("V004", "God of War", "PS5", 1299, 6);
        Videojuego v5 = new Videojuego("V005", "Halo Infinite", "Xbox", 899, 3);
        Videojuego v6 = new Videojuego("V006", "GTA V", "PC", 699, 12);
        Videojuego v7 = new Videojuego("V007", "Elden Ring", "PS5", 1499, 7);
        Videojuego v8 = new Videojuego("V008", "Fortnite", "PC", 0, 20);

        tienda.agregarVideojuego(v1);
        tienda.agregarVideojuego(v2);
        tienda.agregarVideojuego(v3);
        tienda.agregarVideojuego(v4);
        tienda.agregarVideojuego(v5);
        tienda.agregarVideojuego(v6);
        tienda.agregarVideojuego(v7);
        tienda.agregarVideojuego(v8);

        // Código duplicado
        Videojuego duplicado =
                new Videojuego("V001", "Call of Duty", "PS5", 1500, 5);

        tienda.agregarVideojuego(duplicado);

        System.out.println("\n--- DESCUENTOS ---");
        v1.aplicarDescuento(10); // válido
        v2.aplicarDescuento(150); // inválido

        System.out.println("\n--- VENTAS ---");
        v3.vender(2); // válida
        v3.vender(20); // inválida
        v4.vender(-3); // inválida

        System.out.println("\n--- REABASTECIMIENTO ---");
        v5.reabastecer(10);
        v6.reabastecer(-5);

        System.out.println("\n--- CATÁLOGO COMPLETO ---");
        tienda.mostrarTodos();

        System.out.println("\n--- BÚSQUEDAS ---");

        Videojuego encontrado = tienda.buscarPorCodigo("V003");

        if (encontrado != null) {
            System.out.println("Encontrado:");
            encontrado.mostrarInformacion();
        }

        Videojuego noExiste = tienda.buscarPorCodigo("V100");

        if (noExiste == null) {
            System.out.println("Código V100 no encontrado.");
        }

        System.out.println("\n--- ELIMINACIONES ---");
        tienda.eliminarPorCodigo("V004");
        tienda.eliminarPorCodigo("V999");

        System.out.println("\n--- CATÁLOGO FINAL ---");
        tienda.mostrarTodos();
        
        
        System.out.println("\n--- Necesita reabastecimiento ---");
        System.out.println( v1.necesitaReabastecimiento());
    }
}