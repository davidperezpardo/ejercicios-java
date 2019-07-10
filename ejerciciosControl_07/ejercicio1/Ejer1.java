package ejercicio1;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * Ejercicio nº 1 
 * 
 * @author David Pérez Pardo
 *
 */
public class Ejer1 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int opcion = 0;

    int numeroA = (int) (Math.random() * (212 - 110) + 1) + 110;
    int numeroB = (int) (Math.random() * (457 - 301) + 1) + 301;
    int tamaArray = 0;

    System.out.println("      ===VECTOR DE NÚMEROS===\n");
    System.out.println("Introduzca el tamaño deseado para el vector:");

    tamaArray = Integer.parseInt(s.nextLine());
    int array[] = new int[tamaArray];

    System.out.println("Ahora elija una opción para rellenarlo:\n");
    System.out.println("1. Nºs aleatorios entre el nºA (110-212) y nºB (301-457) ambos aleatorios");
    System.out.println("2. Desde el teclado");
    opcion = Integer.parseInt(s.nextLine());

    // MENU
    switch (opcion) {
    case 1:
      //Funciones explicadas en su cabecera
      rellenaAleatorio(array, numeroA, numeroB);
      ordena(array);
      muestraArray(array);

      break;

    case 2:

      rellenaTeclado(array);
      ordena(array);
      muestraArray(array);

      break;

    default:

    }

  }
  
  

  /**
   * Función que rellena el array mediante teclado uno a uno.
   * 
   * @param array array de enteros
   */
  public static void rellenaTeclado(int array[]) {

    int numIntro;
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {

      System.out.println("Introduzca nº:");
      array[i] = numIntro = s.nextInt();

    }
  }
  
  

  /**
   * Función que rellena el array con nºs aleatorios comprendidos entre los
   * parámetros especificados
   * 
   * @param array array de enteros
   * @param numA  nº entero aleatorio (menor)
   * @param numB  nº entero aleatorio (mayor)
   */
  public static void rellenaAleatorio(int array[], int numA, int numB) {

    int aleatorio = 0;

    for (int i = 0; i < array.length; i++) {

      array[i] = (int) (Math.random() * (numB - numA) + 1) + numA;

    }
  }
  
  

  /**
   * Función para ordenar el array de mayor a menor
   * 
   * @param array array de enteros
   */
  public static void ordena(int array[]) {

    int aux = 0;
    for (int i = 0; i < array.length; i++) {

      for (int j = 0; j < array.length - 1; j++) {

        if (array[j] < array[j + 1]) {

          aux = array[j];
          array[j] = array[j + 1];
          array[j + 1] = aux;
        }
      }
    }
  }
  
  

  /**
   * Función que muestra el array y sus dígitos,llamando a su vez a otra función
   * encargada de ordenar la cardinalidad de cada dígito.
   * 
   * @param array array de enteros
   */
  public static void muestraArray(int array[]) {

    int aux = 0;
    for (int j = 0; j < array.length; j++) {

      aux = array[j];
      System.out.print(array[j] + " ");
      
      //llamada a la funcion que obtiene los dígitos con su cardinalidad
      int arrayDigOrd[] = ordenaDigito(aux);

      //Ordenación del array que contiene dígitos y su cardinalidad (menor a mayor)
      for (int i = 0; i < arrayDigOrd.length; i++) {

        for (int k = 0; k < arrayDigOrd.length; k++) {

          if (arrayDigOrd[k] == i + 1) {
           
            
            System.out.print(" El " + k + " aparece " + arrayDigOrd[k]);
            System.out.print(arrayDigOrd[k] <= 1 ? " vez" : " veces");
          }
        }

      }

      System.out.println();
    }
  }

  
  
  /**
   * Función encargada de obtener cada dígito 
   * con su cardinalidad,en un array.
   * 
   * @param valor entero conteniendo el valor de una posición del array.
   * @return Retorna un array de enteros con el dígito y su cardinalidad
   */
  public static int[] ordenaDigito(int valor) {

    int arrayAux[] = new int[10];
    int aux = 0;
    int resto = 0;

    aux = valor;
    while (aux > 0) {

      resto = aux % 10;
      arrayAux[resto] += 1;
      aux /= 10;

    }
    return arrayAux;

  }

}
