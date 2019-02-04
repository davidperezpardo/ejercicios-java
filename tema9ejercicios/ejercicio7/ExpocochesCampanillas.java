package ejercicio7;

import java.util.Scanner;

/**
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas
 * disponibles, la zona de compra-venta con 200 entradas disponibles y la zona
 * vip con 25 entradas disponibles. Hay que controlar que existen entradas antes
 * de venderlas.
 * 
 * Cuando elegimos la opción 2,el programa controla las entradas que quedan,si
 * hay suficientes,se venden,sino el programa avisa de que no quedan
 * suficientes.
 * 
 * Se va llevando un control desde la clase Zona de todas las entradas que se
 * van vendiendo.
 *
 * @author David Pérez Pardo
 * 
 */
public class ExpocochesCampanillas {

  public static void main(String[] args) {

    Zona salaPrincipal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    int opcion = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Bienvenidos a Expocoches Campanillas");

    System.out.println("Seleccione: ");

    do {

      System.out.println("1. Mostrar número de entradas libres\n2. Vender Entradas" + "\n3. Salir");
      opcion = s.nextInt();

      if (opcion < 1 || opcion > 3) {

        if (opcion != 3) {
          System.out.println("opcion incorrecta,inténtelo de nuevo");
        }

      }
      System.out.println();

      switch (opcion) {
      case 1:

        System.out.println("  Entradas libres\n\nSala principal: " + salaPrincipal.getEntradasPorVender()
            + "\nCompra-Ventas: " + compraVenta.getEntradasPorVender() + "\nVip: " + vip.getEntradasPorVender());
        System.out.println();

        break;

      case 2:

        int opcion2 = 0;
        int numEntradas = 0;

        System.out.println("Seleccione la zona:\n1. Sala Principal\n2. Compra-Ventas\n" + "3. Vip");
        opcion2 = s.nextInt();

        System.out.println("Eliga el nº de entradas que desea:");
        numEntradas = s.nextInt();

        if (opcion2 == 1) {

          salaPrincipal.vender(numEntradas);
        } else if (opcion2 == 2) {

          compraVenta.vender(numEntradas);
        } else if (opcion2 == 3) {

          vip.vender(numEntradas);
        } else {
          System.out.println("No existe la zona indicada,inténtelo de nuevo");
        }
        System.out.println();
        break;

      default:

        break;
      }
      System.out.println();
    } while (opcion != 3);

  }

}
