package ejercicio17;

public class TarjetaCredito implements Pago {

//    Atributos 
    private String titular;
    private String numeroTarjeta;
    private double monto;

//    Constructor
    public TarjetaCredito(String titular, String numeroTarjeta, double monto) {
        setTitular(titular);
        setNumeroTarjeta(numeroTarjeta);
        setMonto(monto);
    }

//    Getters
    public String getTitular() {
        return titular;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public double getMonto() {
        return monto;
    }

//    Setters
    public void setTitular(String titular) {
        if (titular == null || titular.strip().isEmpty()) {
            throw new IllegalArgumentException("No puedes estar vacío el titular.");
        }
        this.titular = titular;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        if (numeroTarjeta.length() != 16) {
            throw new IllegalArgumentException("La tarjeta debe tener 16 dígitos.");
        }
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setMonto(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a 0.");
        }
        this.monto = monto;
    }

//    Método sobrescrito
    @Override

    public void procesarPago() {
        System.out.printf("Procesando pago de $%.2f%n",monto);
    }

    }
