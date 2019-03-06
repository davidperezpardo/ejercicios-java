package ejercicio1;

import java.util.ArrayList;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 *
 * @author David Pérez Pardo
 *
 */
public class pruebaArraylist {

  public static void main(String[] args) {

    ArrayList<String> compañeros = new ArrayList<String>();

    compañeros.add("juan");
    compañeros.add("carlos");
    compañeros.add("ana");
    compañeros.add("rosa");
    compañeros.add("fran");
    compañeros.add("paquito");

    System.out.println("Contenido de la lista:");

    for (String compis : compañeros) {

      System.out.println(compis);
    }
  }

}
