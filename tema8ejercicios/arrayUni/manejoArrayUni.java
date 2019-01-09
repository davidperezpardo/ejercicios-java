package arrayUni;

/**
 * Funciones variadas para el manejo de arrays unidimensionales (vectores).
 * Corresponde a los ejercicios 20-28 del tema 8 de funciones.
 * 
 * @author David pérez pardo
 * 
 * 
 */

public class manejoArrayUni {

  /**
   * Genera array unidimensional con nºs aleatorios,con el tamaño y los intervalos
   * min y max elegidos.
   * 
   * @param x   Longitud del array undimensional
   * @param min Limite mínimo del intervalo del nº aleatorio.
   * @param max Limite máximo del intervalo del nº aleatorio.
   * @return Array unidimensional generado aleatoriamente.
   */
  public static int[] generaArrayInt(int x, int min, int max) {

    int vector[] = new int[x];
    for (int i = 0; i < vector.length; i++) {

      vector[i] = (int) (Math.random() * (max - min + 1) + min);

    }
    return vector;
  }

  /**
   * Obtiene el valor mínimo del array unidimensional pasado como parámetro.
   * 
   * @param x Array unidimensional (solo nombre).
   * @return Devuelve el valor mínimo contenido en el array (int).
   */
  public static int minimoArrayInt(int x[]) {

    int min = Integer.MAX_VALUE;

    for (int i = 0; i < x.length; i++) {
      if (x[i] < min) {
        min = x[i];
      }

    }
    return min;

  }

  /**
   * Obtiene el valor máximo del array unidimensional pasado como parámetro.
   * 
   * @param x array unidimensional (nombre solo).
   * @return Devuelve el valor máximo contenido en el array (int).
   */
  public static int maximoArrayInt(int x[]) {

    int max = Integer.MIN_VALUE;
    for (int i : x) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }

  /**
   * Obtiene la media aritmética de los valores contenidos en el array
   * unidimensional pasado como parámetro.
   * 
   * @param x array unidimensional de enteros (solo nombre).
   * @return Devuelve la media de los nºs contenidos en el array (double).
   */
  public static double mediaArrayInt(int x[]) {

    double media = 0;
    for (int i : x) {
      media += i;
    }
    media /= x.length;
    return media;
  }

  /**
   * Dice si un valor (entero) se encuentra dentro del array o no.
   * 
   * @param x Array unidimensional donde queremos buscar si está el nº.
   * @param n El número que queremos saber si está o no dentro del array.
   * @return Si está,devuelve true,sino false.
   */
  public static boolean estaEnArrayInt(int x[], int n) {

    for (int i : x) {
      if (i == n) {
        return true;
      }

    }
    return false;
  }

  /**
   * Devuelve la posicion de un valor (entero) dentro del array (si está)
   * unidimensional pasado como parámetro.
   * 
   * @param x Array unidimensional donde se va a buscar la posición.
   * @param n El nº del que queremos saber su posición.
   * @return Devuelve la posición donde está,si no está devuelve (-1).
   * 
   */
  public static int posicionEnArray(int x[], int n) {

    for (int i = 0; i < x.length; i++) {
      if (n == x[i]) {
        return i;
      }

    }
    return -1;
  }

  /**
   * Da la vuelta a un array,invierte el orden de los valores (enteros).
   * 
   * @param x Array unidimensional al que queremos dar la vuelta.
   * @return Devuelve Array unidimensional ya volteado.
   */
  public static int[] volteaArrayInt(int x[]) {
    // declaramos otro array con el mismo tamaño del array pasado por parámetro.
    int vector[] = new int[x.length];

    for (int i = 0; i < x.length; i++) {
      // se va almacenando desde la ultima posicion hasta la 0, -i y -1 en cada
      // pasada.
      vector[x.length - i - 1] = x[i];

    }
    return vector;
  }

  /**
   * Rota un array unidimensional n posiciones a la derecha.
   * 
   * @param x Array unidimensional a rotar.
   * @param n número de rotaciones hacia la derecha.
   * @return Devuelve array unidimensional rotado.
   */
  public static int[] rotaDerechaArrayInt(int x[], int n) {

    int z;
    // repite while tantas veces como rotaciones se pasen como parámetro.
    while (n-- > 0) {
      // se guarda el último valor.
      z = x[x.length - 1];
      for (int i = x.length - 1; i > 0; i--) {
        // Se rota un lugar hacia la derecha.
        x[i] = x[i - 1];
      }
      // se añade último valor a la posición cero.
      x[0] = z;
    }

    return x;

  }

  /**
   * Rota array unidimensional n posiciones hacia la izquierda.
   * 
   * @param x Array unidimensional a rotar.
   * @param n Número de rotaciones a la izquierda.
   * @return Devuelve array unidimensional rotado.
   */
  public static int[] rotaIzquierdaArrayInt(int x[], int n) {

    int a;
    while (n-- > 0) {
      a = x[0];

      for (int i = 0; i < x.length - 1; i++) {

        x[i] = x[i + 1];

      }
      x[x.length - 1] = a;
    }
    return x;

  }

}
