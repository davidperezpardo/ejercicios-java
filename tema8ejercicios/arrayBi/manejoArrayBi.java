package arrayBi;

import arrayUni.manejoArrayUni;

/**
 * Funciones variadas para el manejo de array bidimensionales (matrices).
 * Corresponde a los ejercicios 29-34 tema 8 funciones.
 * 
 * @author ADavid pérez pardo
 *
 */
public class manejoArrayBi {

  /**
   * Genera un array bidimensional con enteros aleatorios, hay que especificar el
   * tamaño de filas y columnas e intervalos min y max de los nºs aleatorios.
   * 
   * @param fila    nº de filas del array bidimensional.
   * @param columna nº de columnas del array bidimensional.
   * @param min     Mínimo del intervalo de nºs aleatorios.
   * @param max     Máximo del intervalo de nºs aleatorios.
   * @return Devuelve array bidimensional con enteros aleatorios.
   */
  public static int[][] generaArrayBiInt(int fila, int columna, int min, int max) {

    int x[][] = new int[fila][columna];
    for (int i = 0; i < fila; i++) {
      for (int j = 0; j < columna; j++) {
        x[i][j] = (int) (Math.random() * (max - min + 1) + min);
      }
    }
    return x;
  }

  /**
   * Almacena y devuelve en un array unidimensional una fila especificada de un
   * array bidimensional.
   * 
   * @param x    Array bidimensional del que vamos a obtener la fila.
   * @param fila nº de fila que queremos obtener.
   * @return Devuelve array unidimensional con la fila especificada.
   */
  public static int[] filaDeArrayBiInt(int x[][], int fila) {

    /*
     * reserva a vector f el tamaño igual al nº de columnas que tiene una fila del
     * array bidimensional pasado como parámetro.
     */
    int f[] = new int[x[0].length];
    for (int i = 0; i < x.length; i++) {
      f[i] = x[fila][i];
    }
    return f;
  }

  /**
   * Almacena y devuelve en un array unidimensional la columna especificada del
   * array bidimensional pasado como parámetro.
   * 
   * @param x   array bidimensional del que vamos a obtener la columna.
   * @param col nº de la columna a obtener.
   * @return Devuelve array unidimensional con la columna especificada.
   */
  public static int[] columnaDeArrayBiInt(int x[][], int col) {

    int c[] = new int[x.length];
    for (int i = 0; i < c.length; i++) {
      c[i] = x[i][col];
    }
    return c;
  }

  /**
   * Devuelve las coordenadas (fila y columna) de la primera ocurrencia de un
   * número contenido en un array bidimensional,dentro de un array "vector" con dos
   * elementos {fila,columna},si no se encuentra el nº,devuelve {-1,-1}.
   * 
   * @param x Array bidimensional donde queremos buscar el nº.
   * @param n Nº que se buscará dentro del array (matriz).
   * @return Devueve un array(vector) con las coordenadas(fila,columna), y si no
   *         se encuentra (-1,-1).
   */
  public static int[] coordenadasEnArrayBiInt(int x[][], int n) {

    int y[] = new int[2];
    for (int f = 0; f < x.length; f++) {
      for (int c = 0; c < x[0].length; c++) {

        if (x[f][c] == n) {
          y[0] = f;
          y[1] = c;
          return y;
        }
      }
    }
    y[0] = -1;
    y[1] = -1;
    return y;

  }

  
  
  /**
   * Dice si un número que se encuentra en una posición determinada de
   * una matriz (array bidimensional) que se pasa como parámetro,
   * (sus coordenadas) es o no punto de silla.
   *
   * Punto de silla (nº que es el menor de su fila y a la vez el mayor de su columna).
   * 
   * @param x Array bidimensional donde está nuestro nº.
   * @param f Fila del nº (en matriz).
   * @param c Columna del nº (en matriz).
   * @return  Devuelve true si el nº es "punto de silla",o false si no.
   */
  public static boolean esPuntoDeSilla(int x[][], int f , int c) {
    
    boolean esPunto = false;
    int fila [] = filaDeArrayBiInt(x, f);
    int col [] = columnaDeArrayBiInt(x, c);
    
   if(manejoArrayUni.minimoArrayInt(fila) == x[f][c] && 
       manejoArrayUni.maximoArrayInt(col) == x[f][c]) {
     esPunto = true;
   }
   return esPunto;

  }
 
}
