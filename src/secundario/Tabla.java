package secundario;



import java.util.*;
/**
 *
 * @author munchi
 */
public class Tabla {
    static Random Azar = new Random();
    static ArrayList<Integer> filas = new ArrayList<Integer>();
    static ArrayList<Integer> columna = new ArrayList<Integer>();
    
    
    public static void crearTabla(int numero){
        int[][] lista= new int [numero][numero];
        for (int $i=0; $i<numero;$i++){for(int $j=0; $j<numero;$j++){
            lista[$i][$j]=Azar.nextInt(2);}}
        mostrarTabla(lista);
        contarFilas(lista);
        contarColumnas(lista);
    }
  
    
    
    
    
    public static void contarFilas(int [][] lista){
        int auxiliar=0;
        
        for (int $i=0; $i<lista.length;$i++){
            for(int $j=0; $j<lista.length;$j++){
                if(lista[$i][$j]==1){
                    auxiliar++;
                }
                
                
            }//final del segundo for
            
            filas.add($i,auxiliar);
            auxiliar=0;
        }//final del segundo for
        //---------------------
        
        auxiliar =0;
        String imprimir="";
        for(int $i=0; $i<filas.size();$i++){
            if(filas.get($i)>auxiliar){
                auxiliar=filas.get($i);
                imprimir=Integer.toString($i);
            }else if(filas.get($i)==auxiliar){
                imprimir += " "+Integer.toString($i);
                
            }
        }//Final del for
        
        System.out.println("La mayor fila de unos teiene de indicie: "+imprimir);
        
    
    }//FIN metodo contarFilas
    
    public static void contarColumnas(int [][] lista){
        int auxiliar=0;
        
        for (int $i=0; $i<lista.length;$i++){
            for(int $j=0; $j<lista.length;$j++){
                if(lista[$j][$i]==1){
                    auxiliar++;
                }
                
                
            }//final del segundo for
            
            columna.add($i,auxiliar);
            auxiliar=0;
        }//final del segundo for
        //---------------------
        
        auxiliar =0;
        String imprimir="";
        for(int $i=0; $i<columna.size();$i++){
            if(columna.get($i)>auxiliar){
                auxiliar=columna.get($i);
                imprimir=Integer.toString($i);
            }else if(columna.get($i)==auxiliar){
                imprimir += " "+Integer.toString($i);
                
            }
        }//Final del for
        
        System.out.println("La mayor columna de unos teiene de indicie: "+imprimir);
        
    
    }//FIN metodo contarColumnas
    
    
    
    
    
    
    
    
    
    
    public static void mostrarTabla(int [][] lista){
        
        for (int $i=0; $i<lista.length;$i++){
            for(int $j=0; $j<lista.length;$j++){
                System.out.print(lista[$i][$j]+" ");       
            }//final del segundo for
            System.out.println();
        }//final del segundo for
        
        
    }
    
    
}
