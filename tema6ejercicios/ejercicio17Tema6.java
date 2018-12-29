import java.util.Scanner;

public class ejercicio17Tema6 {

  public static void main(String[] args) {
    /**
     * dibuja una pecera con la altura y anchura introducida por teclado de (4x4 al
     * menos) y muestra un pez (ç) dentro de ella que aparece aleatoriamente.
     * 
     * @author david perez pardo
     */
    System.out.println("pecera con pececito dentro");
    System.out.println("Introduzca el ancho deseado para la pecera (mínimo 4)");
    Scanner s = new Scanner(System.in);
    int ancho = s.nextInt();
    System.out.println("Introduza la altura deseada para la pecera");
    int altura = s.nextInt();
    // nº aleatorio para colocar el pez,en la parte del medio
    int pez = (int) (Math.random() * ((ancho - 2) * (altura - 2)) + 1);
    int contador = 0;
    // bucle que pinta primera linea
    for (int i = 1; i <= ancho; i++) {
      System.out.print("*");
    }
    System.out.println();
    // bucle que pinta el centro
    for (int i = 1; i <= altura - 2; i++) {
      for (int j = 1; j <= ancho; j++) {
        // contador suma solo las posiciones de la parte del centro entre los *
        if (j > 1 && j < ancho) {
          // para contar las posiciones del pez
          contador++;
        }
        // colocamos los * del centro,en el inicio y final de cada linea
        if (j == 1 || j == ancho) {
          System.out.print("*");
        }
        // ahora si el pez(nº aleatorio) coincide con la posicion(contador),lo pintamos
        else if (contador == pez) {
          System.out.print("ç");
        }
        /*
         * "primero pintamos el pez,despues los espacios.si lo hiciésemos al revés la
         * línea donde aparece el pez se descuadraría porque aparecería un espacio en
         * blanco de más". si no coincide el pez con la posición,entonces pintamos
         * espacios en blanco.
         */
        else {
          System.out.print(" ");
        }

      }//bucle j del centro
      System.out.println();
    }//bucle i del centro
    
    // bucle que pinta la ultima linea
    for (int i = 1; i <= ancho; i++) {
      System.out.print("*");
    }

  }

}
