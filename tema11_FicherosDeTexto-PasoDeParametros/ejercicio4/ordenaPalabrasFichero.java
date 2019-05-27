
package ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *  Lee un fichero de texto pasado como argumento desde la línea de comandos,
 * lo ordena alfabéticamente y lo escribe en otro fichero ya ordenado con el nombre
 * del fichero original + la extension _sort  (fichero_sort.txt).
 * (El fichero tendrá una palabra por cada línea)
 * 
 * @author David Pérez Pardo
 */

public class ordenaPalabrasFichero {

    public static void main(String[] args) {
        
      String fichero = args[0]; //Fichero a leer
      int longitud = args[0].length(); //Obtengo la longitud del argumento (nombre del fichero)    
      String nomFicheroSin = args[0].substring(0, longitud - 4 ); //Quito la extension al nombre del fichero (.txt)
      String extension = args[0].substring(longitud - 4, longitud); //Obtengo solo la extensión (.txt)
      
      
      try {
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Documents and Settings\\Asus\\Desktop\\" + fichero));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Documents and Settings\\Asus\\Desktop\\" + nomFicheroSin + "_sort" + extension));
        ArrayList<String> palabras= new ArrayList<>();
        
        String linea = "";
        
        //Leemos y almacenamos en arraylist las palabras del fichero.
        while(linea != null){
          
          linea = br.readLine();
          
          //Evitamos imprimir la últoma línea (null)
          if( linea != null){
            
            palabras.add(linea);
          }                   
        }
        //Ordenamos arraylist de palabras por orden alfabético
        Collections.sort(palabras);
        //Escribimos en fichero el contenido del arraylist (palabras ordenadas)
        for (String p : palabras) {
          
          bw.write(p + "\n");
        }
        //Cierre buffer - cerrar siempre o no escribirá en el fichero...
        bw.close();
               
      } catch (IOException ioe) {
        
        System.out.println("Error al leer el fichero");
      }
      
      
    }
}
