package principal;



import secundario.Tabla;
import java.util.Scanner;
/**
 *
 * @author munchi
 */
public class Aprincipal {
    public static void main (String[] args){
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del matriz n:");
        Tabla.crearTabla(Teclado.nextInt());    
    }
    
    
}
