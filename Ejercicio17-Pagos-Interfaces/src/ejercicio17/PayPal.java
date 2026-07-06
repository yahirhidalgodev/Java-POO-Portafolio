package ejercicio17;

public class PayPal implements Pago {

//Atributos 
    private String correo;
    private double monto;

//Constructor
    public PayPal(String correo, double monto) {
        setCorreo(correo);
        setMonto(monto);
    }

//    Getter
    public String getCorreo() {
        return correo;
    }

    public double getMonto() {
        return monto;
    }

//Setters
    public void setCorreo(String correo) {
        if (correo == null || correo.strip().isEmpty()) {
            throw new IllegalArgumentException("El correo no puede estar vacío.");
        }

        if (!correo.contains("@") || !correo.contains(".")) {
            throw new IllegalArgumentException("El correo no es válido.");
        }
        this.correo = correo;
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
