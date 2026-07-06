package ejercicio15;

public class Main{
    public static void main(String[] args){
        Animal[] animales = {
          new Perro("Rocky", 5, 28.5, "Labrador", true),
          new Perro("Max", 3, 18.2, "Beagle", true),  
          new Perro("Luna", 7, 32.8, "Lobo Siberiano", false),
          
          new Gato("Michi", 2, 4.1, "Blanco", 3),
          new Gato("Garfield", 6, 6.5, "Naranja", 9),
          new Gato("Nala", 4, 3.8, "Gris", 6),
          
          new Ave("Piolín", 1, 0.4, "Canario", true),
          new Ave("Águila Real", 8, 5.7, "Águila", true),
          new Ave("Pingüino", 6, 24.3, "Pingüino", false),
        };
        
        for(Animal animal: animales){
            System.out.println("---------------------------");
            System.out.println("Tipo de animal: " + animal.tipoAnimal());
            animal.mostrarInformacion();
            System.out.println("Sonido que hace: "+ animal.hacerSonido());
        }
    }
}