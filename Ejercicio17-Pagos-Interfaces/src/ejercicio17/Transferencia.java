package ejercicio17;

public class Transferencia implements Pago {

//    Atributos 
    private String banco;
    private String cuentaDestino;
    private double monto;

//    Constructor
    public Transferencia(String banco, String cuentaDestino, double monto) {
        setBanco(banco);
        setCuentaDestino(cuentaDestino);
        setMonto(monto);
    }

    public String getBanco() {
        return banco;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public double getMonto() {
        return monto;
    }

    public void setBanco(String banco) {
        if (banco == null || banco.strip().isEmpty()) {
            throw new IllegalArgumentException("No puedes estar vacío el nombre del banco.");
        }
        this.banco = banco;
    }

    public void setCuentaDestino(String cuentaDestino) {
        if (cuentaDestino.length() < 18) {
            throw new IllegalArgumentException("Cuenta inválida.");
        }
        this.cuentaDestino = cuentaDestino;
    }

    public void setMonto(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a 0.");
        }
        this.monto = monto;
    }

    @Override
    public void procesarPago() {
        System.out.printf("Procesando pago de $%.2f%n",monto);
    }

}
