package ejercicio17;

public class Main {

    public static void main(String[] args) {

        Pago[] pagos = {
            //            Pago con tarjeta
            new TarjetaCredito("Yahir Hidalgo", "4532123412345678", 1500.00),
            new TarjetaCredito("María López", "5213456789012345", 2750.50),
            new TarjetaCredito("Carlos Hernández", "4111111111111111", 890.75),
            //            Pago con paypal
            new PayPal("yahir@gmail.com", 320.00),
            new PayPal("maria.lopez@hotmail.com", 1450.90),
            new PayPal("carlos.hdz@yahoo.com", 780.50),
            //            Pago con transferencia
            new Transferencia("BBVA", "012345678901234567", 5000.00),
            new Transferencia("Banamex", "987654321098765432", 1250.75),
            new Transferencia("Santander", "456789123456789012", 8900.00)

        };

        for (Pago pago : pagos) {
            pago.procesarPago();
        }

    }
}
