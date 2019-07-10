package ejercicio2;

import java.util.Scanner;

/**
 * Ejercicio 2
 * 
 * @author David Pérez Pardo
 *
 */
public class Ejer2 {

  public static void main(String[] args) {

    int max = 0;
    int min = 0;

    Scanner s = new Scanner(System.in);

    // Pedida de datos por consola
    System.out.print("Inserte el número de filas:");
    int fila = s.nextInt();
    System.out.print("Inserte el número de columnas:");
    int columna = s.nextInt();
    System.out
        .println("Introduzca dos valores entre los cuales se rellenará" + " aleatoriamente la tabla (ambos incluidos)");
    System.out.print("Valor 1:");
    int val1 = s.nextInt();
    System.out.print("Valor 2:");
    int val2 = s.nextInt();

    // comprobación del numero mayor y menor aleatorio.
    if (val1 > val2) {

      max = val1;
      min = val2;
    } else {

      max = val2;
      min = val1;
    }

    // Función para generar la matriz con valores
    int tabla[][] = generaMatriz(fila, columna, min, max);

    System.out.println("      TABLA BIDIMENSIONAL DE VALORES\n");
    // Función para generar tabla con cálculos
    generaTabla(tabla);

  }
  
  

  
  /**
   * Función para generar una matriz con los valores aleatorios.
   * 
   * @param fila Nº de filas
   * @param col  Nº de columnas
   * @param min  Rango minimo valores
   * @param max  Rango máximo valores
   * @return
   */
  public static int[][] generaMatriz(int fila, int col, int min, int max) {

    int tabla[][] = new int[fila][col];

    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {

        tabla[i][j] = (int) (Math.random() * (max - min) + 1) + min;

      }
    }
    return tabla;
  }
  
  

  /**
   * Función que genera la tabla de enteros (array bidimensional),muestra y
   * calcula la media y el nº mayor de cada fila. Desde aqui tambien se llama a la
   * funcíon maxMediaCol(cálculos de cada columna). Mostrando tambien la media y
   * el nº mayor de cada columna.
   * Cálculo y muestra de la media y del nº máximo total de la matriz.
   * 
   * @param fila    El nº de filas
   * @param columna El número de columnas
   * @param min     El rango mínimo de valores
   * @param max     El rango máximo de valores
   */
  public static void generaTabla(int tabla[][]) {

    float mediaFil = 0;
    int mayorFil = 0;
    float mediaTotal = 0;
    int maxTotal = 0;
    int min = tabla[0][0];
    System.out.print("       ");
    
    for (int i = 0; i < tabla[0].length; i++) {
      
      System.out.print("Col" + (i + 1) + "        ");
      
    }
    System.out.println();

    for (int i = 0; i < tabla.length; i++) {
      System.out.print("F" + (i + 1));
      for (int j = 0; j < tabla[i].length; j++) {

        System.out.printf("  [%-8d]", tabla[i][j]);

        // media por filas
        mediaFil += tabla[i][j];

        // máximo fila
        if (tabla[i][j] >= mayorFil) {

          mayorFil = tabla[i][j];
        }

        // valor mínimo total
        if (tabla[i][j] <= min) {

          min = tabla[i][j];
        }

        // valor máximo total
        mediaTotal += tabla[i][j];
        if (tabla[i][j] >= maxTotal) {

          maxTotal = tabla[i][j];
        }

      }
      // media por filas
      mediaFil /= tabla[i].length;
      System.out.printf(" -->  Media:%-8.2f    Máximo:%-10d  ", mediaFil, mayorFil);
      mediaFil = 0;
      mayorFil = 0;

      System.out.println();
    }

    // Función para calcular media y máximo de cada columna.
    maxMediaCol(tabla);
    System.out.println();

    // Media total (dividida entre filas por columnas).
    mediaTotal /= tabla.length * tabla[0].length;
    System.out.printf("Media matriz:%-8.2f  Máximo matriz:%-10d  Mínimo matriz:%-10d", mediaTotal, maxTotal, min);
    System.out.println();
    System.out.println("\n    MATRIZ CON DIFERENCIA DE VALORES\n");
    
    //Función para generar la Matriz-diferencia.
    diferenciaMatriz(tabla, min);

  }
  
  

  /**
   * Función que calcula la media y el nº mayor de cada columna.
   * 
   * @param tabla array-bidimensional de enteros
   */
  public static void maxMediaCol(int tabla[][]) {

    float mediaCol = 0;
    int mayorCol = 0;

    for (int i = 0; i < tabla[0].length; i++) {

      for (int j = 0; j < tabla.length; j++) {
        // suma de cada valor de columna.
        mediaCol += tabla[j][i];

        // Máximo de cada columna.
        if (tabla[j][i] >= mayorCol) {

          mayorCol = tabla[j][i];
        }

      }

      // La media de la columna.
      mediaCol /= tabla.length;
      System.out.println();
      System.out.printf("Col%-3d  -->  Media:%-8.2f    Máximo:%-10d \n", (i + 1), mediaCol, mayorCol);
      mediaCol = 0;
      mayorCol = 0;
    }

  }

  
  
  /**
   * Función para generar y mostrar una segunda matriz. cada valor será el valor de la
   * anterior matriz-el Mínimo total.
   * 
   * @param tabla array bidimensional
   */
  public static void diferenciaMatriz(int tabla[][], int min) {

    int matriz[][] = new int[tabla.length][tabla[0].length];
    int valor = 0;

    for (int i = 0; i < matriz.length; i++) {

      for (int j = 0; j < matriz[i].length; j++) {

        valor = tabla[i][j] - min;
        matriz[i][j] = valor;
        System.out.printf("[%-10d]", matriz[i][j]);
      }
      System.out.println();

    }
  }
}
