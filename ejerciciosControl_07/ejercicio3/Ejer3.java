package ejercicio3;

import java.util.Scanner;

/**
 * Ejercicio nº 3
 * 
 * @author David Pérez Pardo
 */

public class Ejer3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner s = new Scanner(System.in);
    System.out.println("  === Compruebe si un número es divisible por 23 o no ===");
    System.out.println();
    System.out.print("Introduzca el número a comprobar:");
    int numero = s.nextInt();

    System.out.println();

    // Función que comprueba si es divisible por 23 o no.
    compruebaDiv23(numero);

  }

  /**
   * Función encargada de comprobar si el número introducido es divisible entre 23
   * o no.
   * 
   * @param numero Número entero a comprobar
   */
  public static void compruebaDiv23(int numero) {

    int resto = 0;
    int aux = numero;
    int resultado = 0;
    int array[] = { 0, 23, 46, 69, 92 };
    boolean esDivisible = false;
    boolean descartado = false;

    do {

      resto = aux % 10;
      aux /= 10;
      resultado = (7 * resto) + aux;
      aux = resultado;

      if (resultado > 0 && resultado < 23) {

        System.out.println("El valor absoluto es:" + resultado);
        System.out.println("El numero " + numero + " NO es divisible por 23");
        descartado = true;
        
      } else if (resultado <= 92) {

        for (int i = 0; i < array.length; i++) {

          if (resultado == array[i]) {

            System.out.println("El valor absoluto es:" + resultado);
            System.out.println("El numero introducido " + numero + " es divisible entre 23");

            esDivisible = true;
          }
        }

      }

    } while (!esDivisible && !descartado);

  }

}
