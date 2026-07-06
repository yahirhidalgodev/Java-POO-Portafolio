package ejercicio20;

public class Main {

    public static void main(String[] args) {

        Reserva[] reservados = {
            new ReservaHotel("RH001", "Juan Pérez", 500, 3, 1200),
            new ReservaHotel("RH002", "María López", 800, 2, 950),
            new ReservaHotel("RH003", "Carlos Ramírez", 600, 5, 1100),

            new ReservaVuelo("RV001", "Ana Torres", 2500, "Cancún", 450),
            new ReservaVuelo("RV002", "Luis Hernández", 3200, "Monterrey", 520),
            new ReservaVuelo("RV003", "Sofía Martínez", 2800, "Guadalajara", 390),

            new ReservaEvento("RE001", "Pedro Sánchez", 1000, 50, 250),
            new ReservaEvento("RE002", "Laura Gómez", 1500, 120, 180),
            new ReservaEvento("RE003", "Miguel Castillo", 800, 30, 350)
        };

        for (Reserva reserva : reservados) {
            System.out.println("---------------------------");
            System.out.println("Tipo: " + reserva.tipoReserva());
            reserva.mostrarInformacion();
            System.out.printf("Costo final: $%.2f%n", reserva.calcularCostoFinal());
        }
    }
}