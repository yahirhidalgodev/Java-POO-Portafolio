package ejercicio14;

public class Main {

    public static void main(String[] args) {

        Material[] materiales = {
            //            Libros
            new Libro("L003", "El Principito", 1943, "Antoine de Saint-Exupéry", 120),
            new Libro("L002", "Don Quijote de la Mancha", 1605, "Miguel de Cervantes", 863),
            new Libro("L004", "Java: Cómo Programar", 2022, "Paul Deitel", 1456),
            new Libro("L001", "Cien Años de Soledad", 1967, "Gabriel García Márquez", 471),
            //            Revistas 
            new Revista("R002", "Muy Interesante", 2023, "Zinet Media", 98),
            new Revista("R001", "National Geographic", 2024, "National Geographic", 250),
            new Revista("R003", "Forbes", 2025, "Forbes Media", 150),
            new Revista("R004", "Scientific American", 2021, "Springer Nature", 75)
        };

        for (Material material : materiales) {
            System.out.println("----------------------------");
            System.out.println("Tipo de material: " + material.tipoMaterial());
            material.mostrarInformacion();
            System.out.println("Es reciente: " + material.esReciente());
            
        }

    }
}
