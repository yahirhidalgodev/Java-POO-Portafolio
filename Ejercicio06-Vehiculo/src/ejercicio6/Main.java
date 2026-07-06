package ejercicio6;

public class Main{
    public static void main(String[] args){
     
      Vehiculo vehiculo1 =
                new Vehiculo("Volkswagen", "Jetta", 2025, 10);

        vehiculo1.recorrerKilometros(50);
        vehiculo1.recorrerKilometros(50);

        vehiculo1.mostrarInformacion();

        System.out.println();
        
        vehiculo1.setKilometraje(200);

        vehiculo1.mostrarInformacion();
        
        
    }
}