package ejercicio3;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("3672058149726538", "Yahir Hidalgo Alvarez", 100);
        CuentaBancaria cuenta2 = new CuentaBancaria("9146382751064829", "Alma Delia Govea Hernández", 200);
        CuentaBancaria cuenta3 = new CuentaBancaria("5827419638502741", "Pedro Perez Leon", 200);
//       Depositos
        cuenta1.depositar(500);
        cuenta2.depositar(-100);
        cuenta3.depositar(100);
        System.out.println("--------");
//
        ////       Retiros
        cuenta1.retirar(600);
        cuenta2.retirar(100);
        cuenta3.retirar(-100);
        System.out.println("--------");

//       Transferencias
        cuenta1.transferir(cuenta1, 100);
        cuenta2.transferir(cuenta3, -150);
        cuenta3.transferir(cuenta2, 20);
        System.out.println("--------");

//        Consultas de saldo
        cuenta1.consultarSaldo();
        System.out.println("--------");
        cuenta2.consultarSaldo();
        System.out.println("--------");
        cuenta3.consultarSaldo();

    }
}
