package ejercicio12;

public class Main {

    public static void main(String[] args) {

        Vehiculo[] vehiculos = {
            new Automovil("Chevrolet", "Camaro", 2023, 250, 2, "Gasolina"),
            new Automovil("Toyota", "Corolla", 2024, 190, 4, "Gasolina"),
            new Automovil("Honda", "Odyssey", 2022, 210, 5, "Gasolina"),
            new Automovil("Ford", "Lobo", 2025, 220, 4, "Diésel"),
            new Motocicleta("Italika", "FT150", 2023, 110, 150, "Urbana"),
            new Motocicleta("Yamaha", "R6", 2024, 260, 600, "Deportiva"),
            new Motocicleta("BMW", "S1000RR", 2025, 300, 1000, "Deportiva"),
            new Motocicleta("Harley-Davidson", "Street Bob", 2022, 180, 1868, "Chopper")
        };

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("----------------");
            System.out.println(vehiculo.tipoVehiculo());
            vehiculo.mostrarInformacion();

        }
    }

}
