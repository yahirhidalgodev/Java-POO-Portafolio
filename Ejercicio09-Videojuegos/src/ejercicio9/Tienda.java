package ejercicio9;
import java.util.ArrayList;

public class Tienda{
//    Atributos
    private ArrayList<Videojuego> videojuegos;

//    Constructor
    public Tienda(){
        videojuegos = new ArrayList<>();
    }
    
//    Métodos
    public void agregarVideojuego(Videojuego videojuego){
        if(buscarPorCodigo(videojuego.getCodigo()) == null){
            System.out.println("Video juego " + videojuego.getTitulo() + " agregado");
            videojuegos.add(videojuego);
            return;
        }
        System.out.println("Ya existe el video juego " + videojuego.getCodigo());
        
    }
    
    public Videojuego buscarPorCodigo(String codigo){
        for(Videojuego v: videojuegos){
            if(v.getCodigo().equals(codigo)){
                return v;
            }
        }
        return null;
    }
    
    public void eliminarPorCodigo(String codigo){
        for(int i = 0; i<videojuegos.size(); i++){
            if(codigo.equals(videojuegos.get(i).getCodigo())){
                System.out.println("Se elimino " + videojuegos.get(i).getTitulo());
                videojuegos.remove(i);
                return;
            }
        }
        System.out.println("No se encontro el codigo " + codigo);
    }
    
    
    public void mostrarTodos(){
        if(videojuegos.isEmpty()){
            System.out.println("La tienda esta vacía");
            return;
        }
        
        for(Videojuego v: videojuegos){
            System.out.println("---------");
            v.mostrarInformacion();
        }

    }
}