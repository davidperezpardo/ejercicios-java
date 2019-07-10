package ejercicio4;

import java.util.Scanner; 

/**
 * Ejercicio nº 4
 * 
 * @author David Pérez Pardoperez
 * 
 */
public class Ejer4 {

  public static void main(String[] args) {
    
    int tama = 0;
    int opcion = 0;
    Scanner s = new Scanner(System.in);
    
    System.out.println("    ===RELLENADO DE VECTOR===\n");
    System.out.println("Introduzca el tamaño deseado:");
    tama = s.nextInt();
    System.out.println("1. Aleatoriamente con valores entre 201 y 301");
    System.out.println("2. Desde teclado uno a uno\n");
    System.out.println("Elija una opción");
    opcion = s.nextInt();
    
    switch (opcion) {
    case 1:
      
      generaVector(tama);
      
      break;
      
    case 2:
      
      rellenaVector(tama);
      
      break;

    default:
      
    }
  }
  
  
  
  /**
   * Función que genera e imprime por consola vector
   * con valores aleatorios entre 201-301.
   * 
   * @param tama Longitud del vector
   */
  public static void generaVector(int tama) {
    
    int vector[] = new int [tama];
    
    System.out.println("     VECTOR ORIGINAL GENERADO\n");
    for (int i = 0; i < vector.length; i++) {
      
      vector[i] = (int)(Math.random()* (301 - 201) + 1)+ 201;
      System.out.print("[" + vector[i] + "] ");
      
    }
    
    System.out.println();
    ordenaVector(vector);
  }
  
  
  
  /**
   * Función que rellena array con números enteros
   * introducidos desde el teclado uno a uno.
   * 
   * @param tama Longitud del vector
   */
  public static void rellenaVector(int tama) {
    
    int num = 0;
    int v[] = new int [tama];
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < v.length; i++) {
      
      System.out.print("Introduzca número:");   
      v[i] = num = s.nextInt();
    }
    
    System.out.println("     VECTOR ORIGINAL RELLENADO\n");
    for (int i = 0; i < v.length; i++) {
      
      System.out.print("[" + v[i] + "] ");
    }
    
    System.out.println();
    //Funcion para ordenar array.
    ordenaVector(v);
    
  } 
  
    
  
  /**
   * Función que ordena el array de menor a mayor (valores).
   * 
   * @param v array de enteros
   */
  public static void ordenaVector(int v[]) {

    
    int aux = 0;
    for (int i = 0; i < v.length; i++) {

      for (int j = 0; j < v.length - 1; j++) {

        if (v[j] > v[j + 1]) {

          aux = v[j];
          v[j] = v[j + 1];
          v[j + 1] = aux;
        }
      }
      
    }
    
    //Funcion para reubicar los numeros en el array,una vez ordenados de menor a mayor
    reubicaVector(v);
  }
  
  
  
  /**
   * Función que reubica los valores del array.
   * 
   * El menor de los valores irá a la primera posición,
   * y el siguiente valor menor (de los que queden)
   * irá a la última posición; el siguiente valor menor 
   * (de los que queden) irá a la segunda posición, y el 
   * siguiente valor menor (de los quequeden) irá a la 
   * penúltima posición y así sucesivamente...
   * 
   * @param v array de enteros
   */
  public static void reubicaVector(int v[]) {

    int contaUno = 0;
    int contaDos = v.length - 1;
    int contaTres = 1;
    int reubicado[] = new int[v.length];

    for (int j = 0; j < reubicado.length; j += 2) {

      reubicado[contaUno] = v[j];
      reubicado[contaDos] = v[contaTres];//Inserto valor empezando por el final
      contaUno++;
      contaDos--;
      contaTres +=2;
    }

    /*for (int i = 1; i < reubicado.length; i += 2) {

      
      
    }
  */
    //Imprime por consola el array
    System.out.println();
    System.out.println("\n     VECTOR CON VALORES REUBICADOS\n");
    for (int i = 0; i < reubicado.length; i++) {

      System.out.print("[" + reubicado[i] + "] ");
    }
  }

}
