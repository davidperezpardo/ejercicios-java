package pruebas;

//Clases de java necesarias para lectura de archivos de texto y demás.
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Pruebas con lectura de ficheros de texto en java.
 * 
 * @author David Pérez Pardo
 *
 */

public class leeFicheroTexto {

  public static void main(String[] args) {
    

    ArrayList<String> palabras = new ArrayList<String>();

    try {

      BufferedReader br = new BufferedReader(new FileReader("C:\\Documents and Settings\\Asus\\Desktop\\prueba.txt"));
      String linea = "";

      
      // Para ir leyendo cada línea del fichero mientras haya texto, con bucle while
      while (linea != null) {

        linea = br.readLine();
        
        // para evitar imprimir la última línea que sería null     
        if (linea != null) {
          
          // guardamos cada linea del fichero en arraylist.
          palabras.add(linea);

        }
        
        //con palabras.remove(0),para ahorrarse el if...

      }
      // cierre
      br.close();
      
      //ordenado alfabeticamente
      Collections.sort(palabras);
      
      //Imprimimos por consola el archivo de texto (ArrayList)
      for (String p : palabras) {

        System.out.println(p);
      }

    } catch (Exception e) {
      System.out.println("Hubo un error");
    }

  }

}
