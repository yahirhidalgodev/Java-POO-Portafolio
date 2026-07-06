package ejercicio19;

public class Main {

    public static void main(String[] args) {

        Transporte[] transportes = {
//            Autobus
            new Autobus("Ruta 1", 10.00, 40),
            new Autobus("Ruta 15", 10.00, 50),
            new Autobus("Ruta Express", 4.00, 35),
            
//            Taxi
            new Taxi("Carlos Hernández", 25.00, 8.50),
            new Taxi("María López", 30.00, 7.80),
            new Taxi("José Ramírez", 20.00, 9.20),
            
//            Bicicleta
            new Bicicleta("Montaña", 45.00, 15.0),
            new Bicicleta("Urbana", 35.00, 18.0),
            new Bicicleta("Eléctrica", 80.00, 25.0)
        };
        
        double[] kilometros = {5.0,6,12,15,10,8,9,6,7,9};
        int i = 0;

        for (Transporte transporte : transportes) {

            transporte.mostrarInformacion();

            
           System.out.println("Distancia: "  + kilometros[i]);
           System.out.println("Costo de viaje: " + transporte.calcularCostoViaje(kilometros[i]));
           
           System.out.println("---------------");
            
           i++;
        }
    }
}
