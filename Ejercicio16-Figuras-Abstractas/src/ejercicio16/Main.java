package ejercicio16;

public class Main {

    public static void main(String[] args) {

        Figura[] figuras = {
            new Circulo("Circulo1", 15),
            new Circulo("Circulo2", 15),
            new Circulo("Circulo3", 15),
            new Rectangulo("Rectangulo1", 15, 10),
            new Rectangulo("Rectangulo2", 200, 150),
            new Rectangulo("Rectangulo3", 30, 14),
            new Triangulo("Triangulo1", 10, 15),
            new Triangulo("Triangulo2", 5, 7.6),
            new Triangulo("Triangulo3", 20, 40)

        };

        for (Figura figura : figuras) {
            System.out.println("----------------");
            System.out.println(figura.tipoFigura());
            figura.mostrarInformacion();
            System.out.printf("Área: %.2f%n" , figura.calcularArea());
        }
    }
}
