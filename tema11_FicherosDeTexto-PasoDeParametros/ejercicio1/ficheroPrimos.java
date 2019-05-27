package ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Programa que guarda en un fichero con nombre primos.dat los números primos
 * que hay entre 1 y 500.
 * 
 * @author David Pérez Pardo
 *
 */
public class ficheroPrimos {

  public static void main(String[] args) {

    
    try {

      BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Documents and Settings\\Asus\\Desktop\\primos.dat"));
      boolean esPrimo;
      
      for (int i = 2; i <= 500; i++) {

        esPrimo = true;
        for (int j = 2; j < i && esPrimo == true; j++) {

          if (i % j == 0) {

            esPrimo = false;

          }
        }

        if(esPrimo == true) {
          
          br.write(String.valueOf(i + "\n"));
          
        }
      }
      
      System.out.println("Archivo creado correctamente!");
      br.close();
      
      
    } catch (IOException ioException) {

      System.out.println("Hubo un error en la escritura del archivo");
    }

  }

}
