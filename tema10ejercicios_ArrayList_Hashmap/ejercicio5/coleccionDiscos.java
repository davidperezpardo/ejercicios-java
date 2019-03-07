package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * CRUD Colección de Discos (uso de ArrayList).
 * 
 * modificación del Ejercicio 4 tema 9 POO,pero utilizando ArrayList.
 * @author David Pérez Pardo
 *
 */

public class coleccionDiscos {

  public static void main(String[] args) {

    ArrayList<Disco> coleccion = new ArrayList<Disco>();
    int subMenu;
    int menu;
    String codIntro;
    String autorIntro;
    String tituloIntro;
    String generoIntro;
    int duracionIntro;
    int indice;
    int duraMin;
    int duraMax;
    String duracionIntroString;
    Scanner s = new Scanner(System.in);

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
      menu = Integer.parseInt(s.nextLine());
      
      switch (menu) {
      case 1:

        do {

          System.out.println("----------------------------");
          System.out.println("1. Listado Completo");
          System.out.println("2. Por autor");
          System.out.println("3. Por género");
          System.out.println("4. Por rango de duración");
          System.out.println("5. Menú principal");
          System.out.print("Introduzca una opción:");
          subMenu = Integer.parseInt(s.nextLine());

          switch (subMenu) {
          case 1:

            System.out.println("Listado completo");
            System.out.println("================");
            
            for (Disco d : coleccion) {
              System.out.println(d);
            }
            break;
            
          case 2:
            
            System.out.print("Introduzca autor:");
            autorIntro = s.nextLine();
            System.out.println("Listado por autor");
            System.out.println("=================");
            
            for (Disco d : coleccion) {
              
              if(autorIntro.equals(d.getAutor())) {
                System.out.println(d);
              }
              
            }
            break;
          
          case 3:
            
            System.out.print("Introduzca Genero:");
            generoIntro = s.nextLine();
            System.out.println("Listado por género");
            System.out.println("==================");
            
            for (Disco d : coleccion) {
              
              if(generoIntro.equals(d.getGenero())) {
                System.out.println(d);
              }
              
            }
            break;
            
          case 4:
            
            System.out.print("Introduzca duración mínima:");
            duraMin = Integer.parseInt(s.nextLine());
            System.out.print("Introduzca duración máxima:");
            duraMax = Integer.parseInt(s.nextLine());
            System.out.println("Listado por rango de duración");
            System.out.println("=============================");
            
            for (Disco d : coleccion) {
              
              if((d.getDuracion() >= duraMin) && (d.getDuracion() <= duraMax)){
                
                System.out.println(d);
              }
              
            }
            break;         

          default:
            
          }

          // SUBMENU LISTADOS
        } while (subMenu != 5);

        break;

      case 2:
        
        System.out.println("Introduzca los datos del CD\n\n");
        System.out.print("Código:");
        codIntro = s.nextLine();   
        while(coleccion.contains(new Disco(codIntro,"","","",0))) {
          System.out.println("El código introducido ya existe,pruebe de nuevo");
          System.out.print("Código:");
          codIntro = s.nextLine();
        }
        
        System.out.print("Autor:");
        autorIntro = s.nextLine();
        System.out.print("Titulo:");
        tituloIntro = s.nextLine();
        System.out.print("Genero:");
        generoIntro = s.nextLine();
        System.out.print("Duración:");
        duracionIntro = Integer.parseInt(s.nextLine());
        
        coleccion.add(new Disco(codIntro,autorIntro,tituloIntro,generoIntro,duracionIntro));
        
        break;
        
      case 3:
        
        System.out.print("Introduzca el código del CD que desea modificar:");
        codIntro = s.nextLine();
        
        //si no se encuentra el codigo introducido,no se puede modificar
        while(!coleccion.contains(new Disco(codIntro,"","","",0))) {
          System.out.println("El código intrducido no se encuentra en la base de "
              + "datos\nIntroduzca otro código:");
          codIntro = s.nextLine();
        }
        
        //para sacar la posicion del Disco en el ArrayList, con el codigo introducido a modificar.
        indice = coleccion.indexOf(new Disco(codIntro,"","","",0));
        
        //vamos modificando valores del objeto disco
        System.out.println("Pulse enter si no desea modificar el campo");
        System.out.println("Codigo:" + coleccion.get(indice).getCodigo());
        System.out.print("Código nuevo:");
        codIntro = s.nextLine();
        //si el codigo introducido es distinto de ""(enter),entonces se modifica,sino mantiene el valor.
        if(!codIntro.equals("")) {
          coleccion.get(indice).setCodigo(codIntro);
        }
        
        System.out.println("Autor:" + coleccion.get(indice).getAutor());
        System.out.print("Autor nuevo:");
        autorIntro = s.nextLine();         
        if(!autorIntro.equals("")) {
          coleccion.get(indice).setAutor(autorIntro);
        }
        
        System.out.println("Titulo:" + coleccion.get(indice).getTitulo());
        System.out.print("Título nuevo:");
        tituloIntro = s.nextLine();
        if(!tituloIntro.equals("")) {
          
          coleccion.get(indice).setTitulo(tituloIntro);
        }
        
        System.out.println("Género:" + coleccion.get(indice).getGenero());
        System.out.print("Género nuevo:");
        generoIntro = s.nextLine();
        if(!generoIntro.equals("")) {
          
          coleccion.get(indice).setGenero(generoIntro);
        }
        
        System.out.println("Duración:" + coleccion.get(indice).getDuracion());
        System.out.print("duración nueva:");
        duracionIntroString = s.nextLine();
        if(!duracionIntroString.equals("")) {
          
          coleccion.get(indice).setDuracion(Integer.parseInt(duracionIntroString));
        }
       
        System.out.println("\n¡Disco modificado!");
      
        break;
        
      case 4:
        
        System.out.print("Introduzca el código del CD que desea borrar:");
        codIntro = s.nextLine();
        //se comprueba si el cd existe (codigo introducido).
        if(!coleccion.contains(new Disco(codIntro,"","","",0))) {
          
          System.out.print("El CD que desea eliminar no existe\nPruebe de nuevo\n");
        }
        else {
          //elimina el Disco que está en la posición con el código especificado.
          coleccion.remove(coleccion.indexOf(new Disco(codIntro,"","","",0)));
          System.out.println("\nCD BORRADO CON ÉXITO");
        }
      default:

      }

      // MENU PRINCIPAL
    } while (menu != 5);

  }

}
