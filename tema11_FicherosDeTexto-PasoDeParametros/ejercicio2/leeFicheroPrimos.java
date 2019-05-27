
package ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Lee el fichero creado en el ejercicio nº 1 y lo muestra por consola.
 * Procesa como enteros,ya que en el fichero de texto (primos.dat) cada N se encuentra
 * en una línea distinta.
 * 
 * @author David Pérez Pardo
 */

public class leeFicheroPrimos {

    public static void main(String[] args) {
        
      try {
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Documents and Settings\\Asus\\Desktop\\primos.dat"));
        
        ArrayList<Integer> primos = new ArrayList<>();
        String numeros = "";
        int n = 0;
        
        //Lee y almacena en "numeros" el contenido del archivo de texto,mientras haya texto...
        while(numeros != null){
          
          numeros = br.readLine();
          
          //Para no imprimir-almacenar la última línea que daría null
          if( numeros !=null ){
          
            //Convertimos a int los números obtenidos del fichero de texto
            n = Integer.parseInt(numeros);
            
            //Guardamos en ArrayList el contenido del fichero de texto
            //Para procesar números,deben de estar cada N en una línea distinta del fichero
            primos.add(n);
            
          }

        }
        //Cierre del acceso al fichero
        br.close();
        
        //Para mostrar por consola el fichero de texto leído,que se encuentra almacenado en el ArrayList
        for (int p : primos){
          
          System.out.print(p + " ");
        }
        
        //Excepcion en caso de no encontrar el archivo a leer
      } catch (IOException e) {
        
        System.out.println("Se encontró un error al leer el archivo");
      }
      
      
    }

}
