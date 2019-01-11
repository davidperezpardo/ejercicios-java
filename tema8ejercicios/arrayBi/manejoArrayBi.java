package arrayBi;

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
   * tamaño de filas y columnas e intervalos min y max de aleatorios.
   * 
   * @param fila    nº de filas del array bidimensional.
   * @param columna nº de columnas del array bidimensional.
   * @param min     Mínimo del intervalo de nºs aleatorios.
   * @param max     Máximo del intervalo de nºs aleatorios.
   * @return Devuelve array bidimensional con enteros aleatorios.
   */
  public static int[][] generaArrayBiInt(int fila, int columna, int min, int max) {

    int x[][] = new int[fila][columna];
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
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
     * reserva a vector f el tamaño igual al nº de columnas que tiene una fila
     * del array bidimensional pasado como parámetro.
     */
    int f[] = new int[x[0].length];
    for (int i = 0; i < x.length; i++) {
      f[i] = x[fila][i];
    }
    return f;
  }

  
  /**
   * Almacena y devuelve en un array unidimensional la columna especificada
   * del array bidimensional pasado como parámetro.
   * @param x array bidimensional del que vamos a obtener la columna.
   * @param col nº de la columna a obtener.
   * @return  Devuelve array unidimensional con la columna especificada.
   */
  public static int[] columnaDeArrayBiInt(int x[][], int col) {

    int c [] = new int [x.length];
    for (int i = 0; i < c.length; i++) {
      c[i] = x[i][col];
    }
    return c;
  }
}
