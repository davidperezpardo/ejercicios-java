/**
 * 
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ordena alfabeticamente un arrayList de palabras
 *  introducidas por teclado
 * 
 * @author David Pérez Pardo
 *
 */
public class OrdenaArrayList2 {

  public static void main(String[] args) {

    String palabraIntro;
    ArrayList<String> palabras = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca 10 palabras :");

    for (int i = 0; i < 10; i++) {

      palabraIntro = s.next();
      palabras.add(palabraIntro);
    }
    System.out.println("Lista de palabras:" + palabras);
    Collections.sort(palabras);
    System.out.println("Lista de palabras ordenadas: " + palabras);
  }

}
