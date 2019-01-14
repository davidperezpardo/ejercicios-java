
import java.util.Scanner;

import arrayUni.manejoArrayUni;

public class ejercicio36Tema8 {

  public static void main(String[] args) {
    /**
     * Ejercicio 36 Tema 8 de funciones.
     * 
     * Probando la funcion del mismo ejercicio (filtraPrimos).
     * 
     * Pasa de un array unidimensional a otro,todos los números
     * primos que contenga.
     * El array de nºs primos tendrá el mismo tamaño que la cantidad de primos
     * que hayan en él.
     * Si el array original no contiene nºs primos,se genera un array de un solo
     * elemento = -1.
     * 
     * @author David pérez pardo
     */

    Scanner s = new Scanner(System.in);

    System.out.println("FILTRADO DE NÚMEROS PRIMOS DE UN ARRAY A OTRO\n");
    System.out.println("Genere el array deseado (nºs enteros)\n");
    System.out.print("Introduzca el tamaño deseado para el array: \n");
    int tamaArray = s.nextInt();
    System.out.print("Introduzca el valor mínimo del array: \n");
    int minValor = s.nextInt();
    System.out.print("Introduzca el valor máximo del array: \n");
    int maxValor = s.nextInt();

    int array[] = manejoArrayUni.generaArrayInt(tamaArray, minValor, maxValor);
    System.out.println("--Este es su array generado--\n");
    for (int i = 0; i < tamaArray; i++) {
      System.out.print("[ " + array[i] + " ]");
    }
    System.out.println();
    System.out.println();

    int arrayPrim[] = manejoArrayUni.filtraPrimos(array);
    if (arrayPrim[0] == -1) {
      System.out.println("¡Su Array no contiene nºs primos!");
    } else {
      System.out.println("Array con nºs primos " + "filtrados" + " de su array original:\n");
      for (int i = 0; i < arrayPrim.length; i++) {
        System.out.print("[ " + arrayPrim[i] + " ]");
      }
    }

  }

}
