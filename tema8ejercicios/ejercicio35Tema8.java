import java.util.Scanner;

public class ejercicio35Tema8 {

  public static void main(String[] args) {
    /**
     * Convierte un número entero al sistema "palotes". Ej. 246 = ||-||||-||||||
     * 
     * @author David pérez pardo.
     */
    int numIntro;
    Scanner s = new Scanner(System.in);
    System.out.println("Conversor de enteros a ||Sistema de palotes||\n");
    System.out.print("Introduzca un número entero: ");
    numIntro = s.nextInt();
    System.out.println();
    System.out.print(convierteEnPalotes(numIntro));

  }

  /**
   * Convierte un número al "sistema de palotes". cada dígito del nº será
   * transformado en palotes. Ej. 246 = ||-||||-||||||
   * 
   * @param n Número entero.
   * @return Convierte el nº al sistema de palotes (String).
   * 
   */
  public static String convierteEnPalotes(int n) {

    
    String palotes = "";
    int resto = 0;
    while (n > 0) {
      resto = n % 10;
      n /= 10;
      /*
       * vamos haciendo divisiones sucesivas del nº entre 10 para eliminar en 
       * cada pasada del while la última cifra del nº.
       * antes de dividir hacemos el módulo de n entre 10 y se lo pasamos
       * al bucle for y se concatena tantos palitos como "resto de n/10".
       * el resto, nos iría dando cada dígito empezando por el final.
       * concatenamos de derecha a izquierda para ordenar los palitos
       * con los dígitos.

       */
      for (int i = 0; i < resto; i++) {
        palotes = "|" + palotes;

      }
      //para eliminar el guíon último de más.
      if (n != 0) {
        palotes = "-" + palotes;
      }

    }//while

    return palotes;
  }

}
