package pruebas;

//Clases de java necesarias para lectura en archivos de texto y demás...
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Pruebas con lectura y escritura combinada de ficheros de texto en java.
 * 
 * @author David Pérez Pardo
 *
 */


public class lecturaEscrituraTxt {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  HashMap<String, String> diccionario = new HashMap<String, String>();
  
    try {
      //Manejador de fichero de texto para leer
      BufferedReader br = new BufferedReader(new FileReader("C:\\Documents and Settings\\Asus\\Desktop\\dic1.txt"));
      BufferedReader br2 = new BufferedReader(new FileReader("C:\\Documents and Settings\\Asus\\Desktop\\dic2.txt"));
      
      String l1 = "";
      String l2 = "";
      
      //Leemos todo el archivo de texto línea a línea
      while( l1 != null  ||  l2 != null ) {
        
        //Almacenamos cada linea del archivo de texto
        l1 = br.readLine();
        l2 = br2.readLine();
        
        //para evitar introducir en el diccionario (texto) la última línea que daría null
        if(l1 !=null  || l2 != null) {
          
          //almacenamos en HashMap 
          diccionario.put(l2, l1);
        }       
        
      }
      //cerramos el acceso a los ficheros
      br.close();
      br2.close();
      
      BufferedWriter br3 = new BufferedWriter(new FileWriter("C:\\Documents and Settings\\Asus\\Desktop\\prueba.txt"));
      
      //Recorremos el diccionario
      for (Map.Entry d: diccionario.entrySet()) {
        
        //convertimos a String la clave y valor para almacenarlo en una variable.
        l1 = String.valueOf(d.getKey());
        l2 = String.valueOf(d.getValue());
        
        //escribimos en el fichero el diccionario,clave y valor(palabra en inglés-su traducción)
        br3.write(l1 + " - " + l2 + "\n");
        
      }
      
      
      br3.close();
     
      
    } catch (IOException ioException) {
      System.out.println("Hubo un error");
    }
  
  }

}
