package ejercicio3;

public class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puedes depósitar números negativos.");
            return;
        }

        saldo += cantidad;
        System.out.printf("Depósito exitoso. Saldo actual: %.2f%n", saldo);

    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        if (cantidad <= 0) {
            System.out.println("No puedes retirar cantidades negativas.");
            return;
        }

        saldo -= cantidad;
        System.out.printf("Retiro exitoso \nSaldo actual: %.2f\n", saldo);

    }

    public void consultarSaldo() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Títular: " + titular);
        System.out.printf("Saldo: %.2f%n", saldo);
    }

    public void transferir(CuentaBancaria destino, double cantidad) {
        if (destino == this) {
            System.out.println("No se puede transferir a su misma cuenta.");
            return;
        }
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }

        if (cantidad <= 0) {
            System.out.println("No se pueden transferir cantidades negativas");
            return;
        }

        destino.saldo += cantidad;
        saldo -= cantidad;

        System.out.printf("Transferencia exitosa. Saldo actual: %.2f%n", saldo);
    }

}
