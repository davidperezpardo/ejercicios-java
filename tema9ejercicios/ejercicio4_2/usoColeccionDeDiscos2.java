package ejercicio4_2;

import java.util.Scanner;


/**
 * CRUD - Colección de discos (ejercicio 3 mejorado)
 * 
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se
 * permitirá introducir los datos de ningún disco hasta que no se borre alguno
 * de la lista. b) Mejora la opción “Borrar” de tal forma que se verifique que
 * el código introducido por el usuario existe. c) Modifica el programa de tal
 * forma que el código del disco sea único, es decir que no se pueda repetir. d)
 * Crea un submenú dentro dentro de “Listado” de tal forma que exista un listado
 * completo, un listado por autor (todos los discos que ha publicado un
 * determinado autor), un listado por género (todos los discos de un género
 * determinado) y un listado de discos cuya duración esté en un rango
 * determinado por el usuario.
 * 
 * @author David Pérez Pardo
 *
 */
public class usoColeccionDeDiscos2 {

  public static void main(String[] args) {

    // creacion de array de discos
    Disco2[] coleccion = new Disco2[100];

    for (int i = 0; i < coleccion.length; i++) {
      // creamos cada disco del array (codigo por defecto "LIBRE")
      coleccion[i] = new Disco2();
    }

    int menu = 0; // para seleccion de menú.
    int submenu = 0;// para submenú.
    String texto;
    Scanner numIntro = new Scanner(System.in); // para números introducidos
    Scanner datosIntro = new Scanner(System.in); // para cadenas introducidas

    // menú principal
    do {
      System.out.println("\nCOLECCIÓN DE CD´S");
      System.out.println("=================");
      System.out.println("Eliga una opcion:");
      System.out.println();
      System.out.println("1. Listados de CD´S");
      System.out.println("2. Crear nuevo CD");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");

      menu = numIntro.nextInt();
      // menú prncipal
      switch (menu) {
      case 1:
        System.out.println("----------------------------");
        System.out.println(
            "Elija el tipo de listado:\n\n1. Completo\n2. por autor" + "\n3. Por Género\n4. Rango de duración");

        submenu = numIntro.nextInt();

        // submenú de Listados de cd´s
        switch (submenu) {
        // listado completo
        case 1:
          for (int i = 0; i < coleccion.length; i++) {
            // ignoramos los discos con el código "LIBRE",porque están vacíos.
            if (!coleccion[i].getCodigo().equals("LIBRE")) {
              System.out.println(coleccion[i]);
            }

          }

          break;

        case 2:
          // buscamos por autor
          System.out.print("Introduzca el autor:");
          texto = datosIntro.nextLine();
          for (int i = 0; i < coleccion.length; i++) {

            if ((!coleccion[i].getCodigo().equals("LIBRE")) && (coleccion[i].getAutor().equals(texto))) {

              System.out.println(coleccion[i].toString());

            }

          }

          break;

        case 3:
          // buscamos por género
          System.out.print("Introduzca el Género:");
          texto = datosIntro.nextLine();
          for (int i = 0; i < coleccion.length; i++) {

            if ((!coleccion[i].getCodigo().equals("LIBRE")) && (coleccion[i].getGenero().equals(texto))) {

              System.out.println(coleccion[i].toString());

            }

          }

          break;

        case 4:

          int interIni = 0;
          int interFinal = 0;
          System.out.print("Introduzca inicio del intervalo (minuto):");
          interIni = numIntro.nextInt();
          System.out.print("Introduzca el final del intervalo (minuto))");
          interFinal = numIntro.nextInt();

          for (int i = 0; i < coleccion.length; i++) {
            // descartamos los Discos vacíos (LIBRES)
            if (!coleccion[i].getCodigo().equals("LIBRE")) {
              // buscamos los discos cuya duración estén dentro del intervalo introducido.
              if ((coleccion[i].getDuracion() >= interIni) && (coleccion[i].getDuracion() <= interFinal)) {

                System.out.println(coleccion[i].toString());

              }
            }
          }

          break;

        default:

        }// acaba submenú listados cd´s

        break;

      case 2:

        int primeraLibre = 0; // Para guardar la posicion del primer disco "LIBRE".
        boolean discosLlenos = true;
        // comprobamos si está la colección completa
        // si se encuentra un hueco "LIBRE" en la colección,el bucle finaliza.
        // sino,el bucle recorrerá toda la colección y devolverá true (colección
        // completa).

        for (int i = 0; i < coleccion.length && discosLlenos == true; i++) {

          if (coleccion[i].getCodigo().equals("LIBRE")) {
            // si encuntra un código que está "LIBRE",entonces no está completa,queda hueco
            discosLlenos = false;
            primeraLibre = i;
          }
        }

        if (discosLlenos == false) { // si la colección NO está llena,continuamos pidiendo los datos.

          boolean codRepetido;
          System.out.println("Introduzca los datos del CD:");
          do {

            codRepetido = false; // para comprobar si el código introducido ya se encuentra.
            System.out.print("Código:");
            texto = datosIntro.nextLine(); // código introducido
            for (int i = 0; i < coleccion.length && codRepetido == false; i++) {

              if (coleccion[i].getCodigo().equals(texto)) { // comprueba si está repetido el código.
                codRepetido = true;
                System.out.println("El código introducido ya existe en la colección,pruebe con otro");
              }

            }
          } while (codRepetido == true);// se repite mientras el código introducido ya exista.

          coleccion[primeraLibre] = new Disco2();
          coleccion[primeraLibre].setCodigo(texto);

          System.out.print("Autor:");
          texto = datosIntro.nextLine();
          coleccion[primeraLibre].setAutor(texto);

          System.out.print("Título:");
          texto = datosIntro.nextLine();
          coleccion[primeraLibre].setTitulo(texto);

          System.out.print("Genero:");
          texto = datosIntro.nextLine();
          coleccion[primeraLibre].setGenero(texto);

          System.out.print("Duración:");
          menu = numIntro.nextInt();
          coleccion[primeraLibre].setDuracion(menu);

        } else {// si la colección se encuentra ya llena,imprimimos mensaje y obviamos la
                // petición de datos.
          System.out.println("La colección se encuentra Llena!,borre algún Disco para" + "poder crear otro nuevo");
        }

        break;

      case 3:

        System.out.print("Inserte el código del CD que desea modificar:");
        texto = datosIntro.nextLine();
        int i = 0;
        while (!(texto).equals(coleccion[i].getCodigo())) {

          i++;
        }

        System.out.println("¡Pulse enter si no desea modificar el campo!");
        System.out.println();

        System.out.print("\nCódigo: " + coleccion[i].getCodigo());
        System.out.print("\nCódigo nuevo: ");
        texto = datosIntro.nextLine(); // nextLine para capturar cadena vacía (INTRO).
        if (!texto.equals("")) {
          coleccion[i].setCodigo(texto);
        }

        System.out.print("\nAutor:" + coleccion[i].getAutor());
        System.out.print("\nAutor nuevo:");
        texto = datosIntro.nextLine();
        if (!texto.equals("")) {
          coleccion[i].setAutor(texto);
        }

        System.out.print("\nTítulo:" + coleccion[i].getTitulo());
        System.out.print("\nTítulo nuevo:");
        texto = datosIntro.nextLine();
        if (!texto.equals("")) {
          coleccion[i].setTitulo(texto);
        }

        System.out.print("\nGénero:" + coleccion[i].getGenero());
        System.out.print("\nGénero nuevo:");
        texto = datosIntro.nextLine();
        if (!texto.equals("")) {
          coleccion[i].setGenero(texto);
        }

        System.out.print("\nDuración:" + coleccion[i].getDuracion());
        System.out.print("\nDuración nuevo:");
        texto = datosIntro.nextLine();// capturamos la duración como String.
        if (!texto.equals("")) { // si el usuario pulsa enter sin nada,duración no se modifica.
          coleccion[i].setDuracion(Integer.parseInt(texto));
        } // si el usuario modifica la duración,se convierte a Int y se modifica.

        break;

      case 4:

        int posCodigo = 0; // para saber la posición del disco que se quiere borrar
        boolean existe = false;
        System.out.println("Inserte el código del CD que desea eliminar:");

        String borrar = datosIntro.nextLine();
        for (int j = 0; j < coleccion.length && existe == false; j++) {
          // si el código del disco se encuentra en la colección,el bucle finaliza,se
          // captura la posicion del código y se borra.

          if (coleccion[j].getCodigo().equals(borrar)) {

            existe = true;
            posCodigo = j;
          }

        }
        if (existe == true) {
          // Al código le asignamos "LIBRE".
          coleccion[posCodigo].setCodigo("LIBRE");
          System.out.println("Disco borrado");

        } else {
          System.out.println("El código introducido no existe,pruebe de nuevo");
        }

        break;

      default:

      }

    } while (menu != 5);

  }

}