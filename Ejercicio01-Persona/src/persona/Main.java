package persona;

public class Main{

public static void main(String[] args){
        
        Persona persona1 = new Persona("Yahir", 41, "hombre");
        Persona persona2 = new Persona("Pedro",15, "hombre");
        Persona persona3 = new Persona("Juan",18, "hombre");
        
        persona1.mostrarDatos();
        
        if(persona1.esMayorDeEdad()){
            System.out.print("Es mayor de edad\n");
        }else{
            System.out.println("Es menor de edad\n");
        }
        
        persona1.saludar();
        System.out.println("----------------");
 
        persona2.mostrarDatos();
        if(persona2.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
        persona2.saludar();
        System.out.println("----------------");
        
        persona3.mostrarDatos();
        if(persona3.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        persona3.saludar();
        System.out.println("----------------");
}
}
   