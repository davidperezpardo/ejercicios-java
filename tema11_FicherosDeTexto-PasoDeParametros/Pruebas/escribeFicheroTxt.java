package pruebas;

//Clases de java necesarias para escritura en archivos de texto
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
/**
 * Pruebas con escritura de ficheros de texto en java.
 * 
 * @author David Pérez Pardo
 *
 */

public class escribeFicheroTxt {

  public static void main(String[] args) {
    
    // Para escribir en ficheros de texto

    try {
      
      //Manejador de fichero con la ruta "en windows" del archivo de texto a escribir
      BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Documents and Settings\\Asus\\Desktop\\prueba.txt"));
      br.write("Como está usted,caballero de la triste armadura?");
      br.close();
          
    } catch (IOException ioException) {
      System.out.println("Hubo un error");
    }
  }

}
