package ejercicio3_2;

import java.util.Scanner;

/**
 * CRUD - Colección de discos
 * 
 * Ejercicio 3 tema9 array de objetos. consulta,crea,modifica y borra una
 * colección de discos utilizando arrays de objetos.
 * 
 * @author David Pérez Pardo
 *
 */
public class usoColeccionDeDiscos {

  public static void main(String[] args) {

    // creacion de array de discos
    Disco[] coleccion = new Disco[100];

    for (int i = 0; i < coleccion.length; i++) {
      // creamos cada disco del array (codigo por defecto "LIBRE")
      coleccion[i] = new Disco();
    }

    int menu = 0; // para seleccion de menú
    String texto;
    Scanner numIntro = new Scanner(System.in); //para números introducidos
    Scanner datosIntro = new Scanner(System.in); //para cadenas

    // menú principal
    do {
      System.out.println("\nCOLECCIÓN DE CD´S");
      System.out.println("=================");
      System.out.println();
      System.out.println("1. Listado de CD´S");
      System.out.println("2. Crear nuevo CD");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.println("Eliga una opcion:");
      menu = numIntro.nextInt();

      switch (menu) {
      case 1:

        for (int i = 0; i < coleccion.length; i++) {
          // ignoramos los discos con el código "LIBRE",porque están vacíos.
          if (!coleccion[i].getCodigo().equals("LIBRE")) {
            System.out.println(coleccion[i]);
          }

        }

        break;

      case 2:

        int primeraLibre = 0; // Para buscar el primer disco "LIBRE"
        
          while (!((coleccion[primeraLibre].getCodigo()).equals("LIBRE"))) {

            primeraLibre++;
          }

          System.out.println("Introduzca los datos del CD:");
          coleccion[primeraLibre] = new Disco();
          System.out.print("Código:");
          texto = datosIntro.nextLine();
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

        System.out.println("Inserte el código del CD que desea eliminar:");

        String borrado = datosIntro.next();
        i = 0;
        while (!(borrado).equals(coleccion[i].getCodigo())) {
          i++;
        }

        // Al código le asignamos "lIBRE".
        coleccion[i].setCodigo("LIBRE");
        System.out.println("Disco borrado");

        break;

      default:

        
      }

    } while (menu != 5);

  }

}
