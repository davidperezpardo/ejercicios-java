package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ordena una lista (arraylist) de nºs introducidos por teclado
 * 
 * @author David Pérez Pardo
 *
 */

public class ordenaArrayList {

  public static void main(String[] args) {

    ArrayList<Integer> lista = new ArrayList<Integer>();

    int numIntro;

    System.out.println("Introduzca 10 números");
    Scanner n = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {

      System.out.print("Introduza nº: ");
      numIntro = n.nextInt();
      lista.add(numIntro);
    }

    System.out.println("lista sin ordenar: " + lista);
    // método sort para ordenar de menor a mayor
    Collections.sort(lista);
    System.out.println("lista ordenada: " + lista);
  }

}
