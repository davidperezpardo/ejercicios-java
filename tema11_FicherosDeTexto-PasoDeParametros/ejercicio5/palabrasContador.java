
package ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Lee dos ficheros de texto,uno con palabras y otro con números (por línea).
 * 
 * Escribe en un nuevo fichero de texto (palabritas) las palabras obtenidas
 * tantas veces como el nº que aparece en el fichero "contador",en la misma
 * línea que la palabra del fichero "palabras".
 * 
 * @author David Pérez Pardo
 */

public class palabrasContador {

  public static void main(String[] args) {

    if (args.length != 3) {

      System.out.println("Numeros de argumentos no admitidos (uso de 3 argumentos)");
      System.out.println("Param1 = fichero con texto\nParam2 = fichero de nº enteros");
      System.out.println("Param3 = Nombre fichero a crear");
      System.exit(-1); // sale del programa

    }

    String fichero1 = args[0];
    String fichero2 = args[1];
    String nuevoFichero = args[2];

    try {

      BufferedReader br = new BufferedReader(new FileReader(fichero1));
      BufferedReader br2 = new BufferedReader(new FileReader(fichero2));
      BufferedWriter wr = new BufferedWriter(new FileWriter(nuevoFichero));

      HashMap<String, Integer> palabras = new HashMap<>();

      String linea = "";
      String contador = "";

      while (linea != null && contador != null) {

        linea = br.readLine();
        contador = br2.readLine();

        if (linea != null && contador != null) {

          // Introduzco en el diccionario la clave(palabra) y su valor (veces a
          // repetir),desde ficheros de texto
          palabras.put(linea, Integer.parseInt(contador));
        }

      }
      // cierro buffer lectura
      br.close();
      br2.close();

      int repes = 0; // Para contar repeticiones de cada palabras
      String palabritas = "";

      // Recorro diccionario
      for (Map.Entry p : palabras.entrySet()) {

        // valor de cada palabra del diccionario (value)
        repes = (Integer) (p.getValue());

        // bucle para escribir la palabra(clave) tantas veces como valor contenga(value)
        for (int i = 0; i < repes; i++) {

          palabritas = p.getKey().toString(); // Convierto a String
          if (i < repes - 1) {
            // Coma para separar cada palabra.
            wr.write(palabritas + ",");

            // Punto al final de las ocurrencias
          } else {

            wr.write(palabritas + ".");
          }

        }

        // Salto de linea en el fichero de escritura
        wr.write("\n");

      }
      // cierre buffer escritura
      wr.close();

    } catch (IOException e) {

      System.out.println("Error al leer el fichero");
    }

  }

}
