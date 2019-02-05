package ejercicio3_2;

import java.util.Scanner;

/**
 * CRUD - Colección de discos 
 * 
 * Ejercicio 3 tema9 aray de objetos.
 * consulta,crea,modifica y borra una colección de discos
 * utilizando arrays de objetos.
 * @author David Pérez Pardo
 *
 */
public class usoColeccionDeDiscos {

  public static void main(String[] args) {

    Disco[] coleccion = new Disco[100];
    int menu = 0;
    int album = 0;
    String texto;
    Scanner introTeclado = new Scanner(System.in);//menú principal
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
      menu = introTeclado.nextInt();

      if(menu < 1 || menu > 5) {
        
        System.out.println("opción no disponible,pruebe con otra!");
      }
      switch (menu) {
      case 1:

        for (int i = 0; i < album; i++) {
          //ignoramos los discos con el código "LIBRE",que serán los borrados.
          if(!coleccion[i].getCodigo().equals("LIBRE")) {
            System.out.println(coleccion[i]);
          }

        }

        break;

      case 2:
          
          System.out.println("Introduzca los datos del CD:");
          coleccion[album] = new Disco();
          System.out.print("Código:");
          texto = introTeclado.next();
          coleccion[album].setCodigo(texto);

          System.out.print("Autor:");
          texto = introTeclado.next();
          coleccion[album].setAutor(texto);

          System.out.print("Título:");
          texto = introTeclado.next();
          coleccion[album].setTitulo(texto);

          System.out.print("Genero:");
          texto = introTeclado.next();
          coleccion[album].setGenero(texto);

          System.out.print("Duración:");
          menu = introTeclado.nextInt();
          coleccion[album].setDuracion(menu);

          album++;

        break;

      case 3:
        
        System.out.print("Inserte el código del CD que desea modificar:");
        texto = introTeclado.next();
        for (int j = 0; j < album; j++) {
          if(texto.equals(coleccion[j].getCodigo())) {
            
            Scanner datosIntro = new Scanner(System.in);
            System.out.println("¡Pulse enter si no desea modificar el campo!");
            System.out.println();
            
            System.out.print("\nCódigo: " + coleccion[j].getCodigo());
            System.out.print("\nCódigo nuevo: ");
            texto = datosIntro.nextLine(); //nextLine para capturar cadena vacía (INTRO).
            if(!texto.equals("")) {
              coleccion[j].setCodigo(texto);
            }
            
            System.out.print("\nAutor:" + coleccion[j].getAutor());
            System.out.print("\nAutor nuevo:");
            texto = datosIntro.nextLine();
            if(!texto.equals("")) {
              coleccion[j].setAutor(texto);
            }
            
            System.out.print("\nTítulo:" + coleccion[j].getTitulo());
            System.out.print("\nTítulo nuevo:");
            texto = datosIntro.nextLine();
            if(!texto.equals("")) {
              coleccion[j].setTitulo(texto);
            }
            
            System.out.print("\nGénero:" + coleccion[j].getGenero());
            System.out.print("\nGénero nuevo:");
            texto = datosIntro.nextLine();
            if(!texto.equals("")) {
              coleccion[j].setGenero(texto);
            }
            
            System.out.print("\nDuración:" + coleccion[j].getDuracion());
            System.out.print("\nDuración nuevo:");
            texto = datosIntro.nextLine();//capturamos la duración como String.
            if(!texto.equals("")) { //si el usuario pulsa enter sin nada,duración no se modifica.
              coleccion[j].setDuracion(Integer.parseInt(texto)); 
            }  //si el usuario modifica la duración,se convierte a Int y se modifica.
            
          }
          else {
            System.out.println("El código introducido no es válido,pruebe de nuevo\n");
          }
          
        }
              
        break;
        
      case 4:
        
        System.out.println("Inserte el código del CD que desea eliminar:");
        
        String borrado = introTeclado.next();
        for (int i = 0; i < album; i++) {
          
          if(borrado.equals(coleccion[i].getCodigo())) {
            //Al código le asignamos "lIBRE" y lo ocultamos en el listado
            coleccion[i].setCodigo("LIBRE");
            System.out.println("Disco borrado");
          }
        }
      
      break;
      default:
        break;
      }

    } while (menu != 5);

  }

}
