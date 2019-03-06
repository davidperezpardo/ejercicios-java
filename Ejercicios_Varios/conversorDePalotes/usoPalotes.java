package conversorDePalotes;

import java.util.Scanner;

/**
 * Conversor Sistema de palotes <===> Decimal Ej. Decimal 20340 | Palotes
 * ||--|||-||||--
 * 
 * @author David Pérez Pardo
 *
 */
public class usoPalotes {

  public static void main(String[] args) {

    String palotes = "";
    int n = 0;
    int opcion = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("\nCONVERSOR   Palotes<->Decimal");
    do {

      System.out.print("\n\nELIJA UNA OPCIÓN:");
      System.out.println("\n\n1. Palotes ===> Decimal\n2. Decimal ===> Palotes\n3. Salir del conversor");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
      case 1:
        System.out.print("Introduzca Palotes:");
        palotes = s.nextLine();
        System.out.println(Palotes.parseInt(palotes));

        break;

      case 2:
        System.out.print("Introduzca nº Decimal:");
        n = Integer.parseInt(s.nextLine());
        System.out.println(Palotes.parsePalotes(n));

        break;

      default:

      }
    } while (opcion != 3);
    System.out.println("Hasta luego!");
  }

}
