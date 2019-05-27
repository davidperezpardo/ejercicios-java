package ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Programa que dice cuántas ocurrencias de una palabra hay en un fichero. Tanto
 * el nombre del fichero como la palabra se pasan como argumentos en la línea de
 * comandos.
 *
 * @author David Pérez Pardo
 */
public class ocurrenciasPalabra {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    String fichero = args[0];
    String palabra = args[1];

    try {
      
      BufferedReader br = new BufferedReader(new FileReader("C:\\Documents and Settings\\Asus\\Desktop\\" + fichero));
      
      String linea = "";
      int contador = 0;
      int posicion = 0;
      
      //Mientras el fichero tengo texto...
      while ((linea = br.readLine()) != null){
        
        //Mientras posicion (indice de la palabra) exista (!= -1)
        
        while((posicion = linea.indexOf(palabra)) != -1){
          
          //Para no entrar en bucle infinito,nos saltamos la primera ocurrencia...
          linea = linea.substring(posicion + palabra.length(), linea.length());
          contador++;
          
        }
        
      }
      br.close();
      System.out.println("La palabra " + palabra + " aparece: " + contador + " veces");
      
      

    } catch (IOException e) {

      System.out.println("No se puede leer el fichero");
    }

  }

}
