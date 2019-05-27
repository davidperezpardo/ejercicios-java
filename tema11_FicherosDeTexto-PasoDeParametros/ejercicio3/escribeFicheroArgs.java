
package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author David Pérez Pardo
 */

public class escribeFicheroArgs {

    public static void main(String[] args) {
      
      
      //Almacenamos los parámetros introducidos (argumentos)
      String fichero = args[0];
      String fichero2 = args[1];
      String destino = args[2];
       
      try {
        
        BufferedReader br = new BufferedReader(new FileReader(fichero));
        BufferedReader br2 = new BufferedReader(new FileReader(fichero2));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
        
        String f1 = "";
        String f2 = "";
        
        //Vamos leyendo el fichero mientras alguno de los dos contenga texto (distinta cantidad de líneas de texto)
        while( f1 != null || f2 != null){  
          
          f1 = br.readLine();
          f2 = br2.readLine();
          
          //Vamos escribiendo en el fichero de texto directamente
          if( f1 != null){
            
            bw.write(f1 + "\n");
            
          }
          
          if( f2 != null){
            
            bw.write(f2 + "\n");
          }
                  
        }//while
        //Cerramos buffers de lectura y escritura
        br.close();
        br2.close();
        bw.close();

      } catch (IOException e) {
        
        System.out.println("Error al leer el fichero");
      }     
      
    }

}
