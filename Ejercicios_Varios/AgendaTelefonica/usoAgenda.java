package ejercicio2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio 2 Exámen recuperacion control-05
 * Agenda de contactos telefónicos
 * 
 * @author David Pérez Pardo
 *
 */
public class usoAgenda {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Agenda a1 = new Agenda("trabajo");
    int opcion;
    String nombre;
    Long numero;
    Scanner s = new Scanner(System.in);

    do {
      // MENU
      System.out.println("\n\n  ====AGENDA DE CONTACTOS====\n");
      System.out.println("1. Dar de alta nuevo contacto");
      System.out.println("2. Dar de baja contacto");
      System.out.println("3. Consultar teléfono de contacto");
      System.out.println("4. Mostrar agenda completa");
      System.out.println("5. Salir");
      System.out.println("seleccione una opción");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
      // Alta nuevo contacto y comprobacion de existente
      case 1:

        System.out.println("Introduzca nombre:");
        nombre = s.nextLine();
        System.out.println("Introduzca Nº tfno:");
        numero = Long.parseLong(s.nextLine());
        if (a1.existeContacto(nombre, numero)) {

          System.out.println("El contacto ya existe,¿desea actualizar su tfno?");
          System.out.println("1. SI   2. NO");
          opcion = Integer.parseInt(s.nextLine());

          if (opcion == 1) {

            a1.altaContacto(nombre, numero);
          }
        } else {

          a1.altaContacto(nombre, numero);
        }

        break;
      // Dar de baja a un contacto
      case 2:

        System.out.println("Introduzca su nombre:");
        nombre = s.nextLine();
        if (a1.darBaja(nombre)) {

          System.out.println("Contacto eliminado");
        } else {

          System.out.println("El contacto especificado no existe");
        }

        break;
      // Consulta teléfono a partir del nombre(comprueba si existe)
      case 3:

        System.out.println("Introduzca nombre:");
        nombre = s.nextLine();
        System.out.println(a1.consultaTelefono(nombre));

        break;
      // muestra por pantalla agenda completa
      case 4:

        System.out.println(a1);

        break;

      default:

      }

    } while (opcion != 5);
  }

}
