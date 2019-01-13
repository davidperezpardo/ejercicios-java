
import java.util.Scanner;

public class ejercicio8Tema7_2 {

  public static void main(String[] args) {

    /**
     * Dada una posicion en un tablero de ajedrez,obtiene las casillas a las que
     * podría saltar un alfil desde tal posición. El alfil se mueve siempre en
     * diagonal. tablero con 64 casillas (8x8). Las columnas están indicadas con las
     * letras desde "A" hasta "H"
     * 
     * @author David pérez pardo
     */
    int tablero[][] = new int[8][8];
    System.out.println("tablero de ajedrez 8x8: el alfil\n");
    System.out.println("Se mostrarán las casillas a las que puede saltar un alfil." + 
                        " \ncolumnas desde a-h | 1-8 filas.\n");
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la posicion de partida del alfil: ");
    System.out.println("Ejemplo: d5");
    // si se introduce en mayúscula la letra,la convertimos en minúscula.
    String posIntro = s.nextLine().toLowerCase();
    // guardamos el char (ASCII) en un entero,le restamos 97 (97 = a) para obtener
    // la equivalencia en decimal.
    int columnaAlfil = posIntro.charAt(0) - 97;
    // el número,al ser un char,está en ASCII,lo convertimos a decimal restándole 48
    // (48 = 0).
    int filaAlfil = posIntro.charAt(1) - 48;
    // para indicar las filas 1-8.
    int filas = 8;
    System.out.print("     a    b    c    d    e    f    g    h");
    System.out.println();
    
    for (int fila = 8; fila > 0; fila--) {
      // empezamos desde la última fila hasta > 0 para imprimir correctamente las diagonales.
      System.out.print("f" + filas + " ");
      filas--;
      for (int col = 0; col < 8; col++) {
        // comprobamos si se cumple que fila + columna es igual a la posicion del alfil(fila + columna)
        // o si se cumple que fila - columna es igual a la posicion de alfil(fila - columna).
        
        if (((fila + col) == (filaAlfil + columnaAlfil)) || ((fila - col) == (filaAlfil - columnaAlfil))) {
         
          // imprimimos fila haciendo un casting a char y sumándole 97 para obtener
          // carácter ASCII.
          System.out.print("[ " + (char) (col + 97) + fila + "]");
        } else {
          System.out.print("[   ]");
        }

      }

      System.out.println();
    }
    System.out.print("     a    b    c    d    e    f    g    h\n");
    System.out.println("\nLas posiciones marcadas en el tablero son los posibles"
        + " saltos que el alfil podría dar desde la posición dada: " + posIntro);
  }

}
