package ejercicio5_2;

import java.util.Scanner;

/**
 * Crea el programa GESTISIMAL (GESTIón SIMplifcada de Almacén) para llevar el
 * control de los artículos de un almacén. De cada artículo se debe saber el
 * código, la descripción, el precio de compra, el precio de venta y el stock
 * (número de unidades). La entrada y salida de mercancía supone respectivamente
 * el incremento y decremento de stock de un determinado artículo. Hay que
 * controlar que no se pueda sacar más mercancía de la que hay en el almacén.
 *
 * @author David Pérez Pardo
 *
 */
public class Gestisimal {

  public static void main(String[] args) {

    int menu = 0;
    String datosIntro;
    float numIntro = 0;
    int contaArticulos = 0;
    boolean lleno;
    boolean repetido;
    String mercaIntro;
    String mercaSalida;
    int aumentaStock = 0;
    int minusStock = 0;
    Scanner datos = new Scanner(System.in); // captura de datos introducidos
    Scanner opcion = new Scanner(System.in);// captura opción del menú y numeros pedidos al usuario

    // array de articulos
    Articulo[] almacen = new Articulo[1];

    // crea todos los artículos de cada posición del array
    for (int i = 0; i < almacen.length; i++) {

      almacen[i] = new Articulo();
    }

    do {
      
      System.out.println("-----------------------");
      System.out.println("1. Listado\n2. Alta\n3. Baja\n4. Modificación\n5. Entrada de mercancía\n"
          + "6. Salida de mercancía\n7. Salir");

      // Menú principal
      menu = opcion.nextInt();
      switch (menu) {
      case 1:

        for (int i = 0; i < almacen.length; i++) {
          // obviamos 
          if (!almacen[i].getCodigo().equals("VACIO")) {
            System.out.println(almacen[i].toString());
            System.out.println();

          }

        }

        break;
        
      // ALTAS DE ARTÍCULOS
      case 2:

        lleno = true;
        // comprobamos si el almacén (array) está completo
        for (int i = 0; i < almacen.length && lleno == true; i++) {
          // si no hay ningún código "VACIO" entonces está completo
          if (almacen[i].getCodigo().equals("VACIO")) {

            lleno = false;
            contaArticulos = i; // guardamos la posición del primer hueco del almacén
          }

        }

        if (lleno == false) {

          System.out.println("Introduzca los Datos del Artículo:");
          System.out.println("==================================");
          System.out.print("Código:");

          do {
            datosIntro = datos.nextLine();
            repetido = false;

            for (int i = 0; i < almacen.length && repetido == false; i++) {

              if (almacen[i].getCodigo().equals(datosIntro)) {

                repetido = true;
                System.out.println("El Código introducido ya se encuentra en el almacén,inténtelo de nuevo");

              }

            }
          } while (repetido == true);

          almacen[contaArticulos].setCodigo(datosIntro);

          System.out.print("Descripción:");
          datosIntro = datos.nextLine();
          almacen[contaArticulos].setDescripcion(datosIntro);

          System.out.print("Precio de Compra:");
          numIntro = opcion.nextFloat();
          almacen[contaArticulos].setPrecioCompra(numIntro);

          System.out.print("Precio de Venta:");
          numIntro = opcion.nextFloat();
          almacen[contaArticulos].setPrecioVenta(numIntro);

        } else {
          System.out.println("¡El almacén se encuentra completo!");
        }

        break;
        
      // BAJA DE ARTÍCULOS
      case 3:

        boolean encontrado = false;
        System.out.print("Introduzca el Código del articulo que desea dar de baja:");
        datosIntro = datos.nextLine();
        for (int i = 0; i < almacen.length; i++) {

          if ((!almacen[i].getCodigo().equals("VACIO")) && (almacen[i].getCodigo().equals(datosIntro))) {

            encontrado = true;
            almacen[i].setCodigo("VACIO");
            System.out.println("Artículo dado de baja\n");

          }

        }
        if (!encontrado) {

          System.out.println("El código-artículo introducido no existe,pruebe de nuevo!");
        }

        break;
        
      // MODIFICACIÓN DE ARTÍCULOS
      case 4:

        boolean esta = false;
        System.out.print("Introduzca el código del articulo que desea modificar:");
        do {
          datosIntro = datos.nextLine();

          for (int i = 0; i < almacen.length && esta == false; i++) {

            if (almacen[i].getCodigo().equals(datosIntro)) {

              esta = true;
              contaArticulos = i;

            }
          }
          if (esta == false) {
            System.out.println("El código-artículo introducido no existe,pruebe de nuevo");
          }

        } while (esta == false);

        if (esta == true) {

          System.out.println("Si no desea modificar un dato,pulse Enter");
          System.out.print("\nCódigo:" + almacen[contaArticulos].getCodigo());
          System.out.print("\nCódigo nuevo: ");
          datosIntro = datos.nextLine();
          if (!datosIntro.equals("")) {
            almacen[contaArticulos].setCodigo(datosIntro);
          }

          System.out.print("\nDescripción:" + almacen[contaArticulos].getDescripcion());
          System.out.print("\nDescripción nueva: ");
          datosIntro = datos.nextLine();
          if (!datosIntro.equals("")) {
            almacen[contaArticulos].setDescripcion(datosIntro);
          }

          System.out.print("\nPrecio de Compra:" + almacen[contaArticulos].getPrecioCompra());
          System.out.print("\nPrecio de Compra nuevo: ");
          datosIntro = datos.nextLine();
          if (!datosIntro.equals("")) {
            almacen[contaArticulos].setPrecioCompra(Float.parseFloat(datosIntro));
          }

          System.out.print("\nPrecio de Venta:" + almacen[contaArticulos].getPrecioVenta());
          System.out.print("\nPrecio de Venta: ");
          datosIntro = datos.nextLine();
          if (!datosIntro.equals("")) { // si el usuario pulsa enter vacío,se queda como estaba.
            almacen[contaArticulos].setPrecioVenta(Float.parseFloat(datosIntro));
          }

          System.out.print("\nStock:" + almacen[contaArticulos].getStock());
          System.out.print("\nStock nuevo: ");
          datosIntro = datos.nextLine();
          if (!datosIntro.equals("")) {
            almacen[contaArticulos].setStock(Integer.parseInt(datosIntro));
          }

        }

        break;
        
      // ENTRADA MERCANCÍA
      case 5:

        System.out.println("ENTRADA DE MERCANCÍA");
        System.out.println("=====================");
        int posicionEntrada = 0;
        esta = false;

        System.out.print("Introduzca el código del artículo:");
        do {
          mercaIntro = datos.nextLine();

          for (int i = 0; i < almacen.length && esta == false; i++) {
            // comprobamos si existe el código del artículo
            if (almacen[i].getCodigo().equals(mercaIntro)) {

              esta = true;
              posicionEntrada = i;// si existe,guardamos la posicion y salimos del bucle

            }
          }

          if (esta == false) {
            System.out.println("El código-artículo introducido no existe,pruebe con otro");
          }

        } while (esta == false);
        System.out.print("Introduzca el nº de unidades:");
        aumentaStock = opcion.nextInt();
        // aumenta el stock de la mercancia entrante
        almacen[posicionEntrada].entrante(aumentaStock);

        break;
        
      // SALIDA MERCANCÍA
      case 6:

        System.out.println("SALIDA DE MERCANCÍA");
        System.out.println("===================");
        int posicionSalida = 0;
        esta = false;
        do {
          System.out.println("Introduzca el código-artículo de salida:");
          mercaSalida = datos.nextLine();
          for (int i = 0; i < almacen.length && esta == false; i++) {

            if (almacen[i].getCodigo().equals(mercaSalida)) {

              esta = true;
              posicionSalida = i;
            }

          }
          if (esta == false) {

            System.out.println("El código-artículo introducido no existe,pruebe de nuevo");
          }

        } while (esta == false);
        System.out.println("Introduzca el nº de Unidades:");
        minusStock = opcion.nextInt();
        //si hay suficiente mercancia,restamos al stock del almacén,la mercancía que salga.
        //si no queda suficiente stock,la mercancia no sale del almacén.
        almacen[posicionSalida].saliente(minusStock);
        
        break;

      default:

      }

    } while (menu != 7);

  }

}
