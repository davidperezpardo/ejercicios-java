package ejercicio2Opcion2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ejercicio 2-B exámen febrero-2019 - HashMap.
 *  
 * Dicccionario de palabras + frase relacionada.
 * 
 * Programa que memoriza para una palabra clave determinada, una frase que esté
 * relacionada con dicha palabra. Para ello se hace uso de un diccionario HashMap.
 * 
 * 1.Muestra frase relacionada con la palabra,si no existe,permite añadir una.
 * 2.Permite borrar palabra + frase relacionada
 * 3.Muestra el diccionario completo por pantalla.
 * @author David perez pardo
 *
 */
public class diccionarioFrases {

  public static void main(String[] args) {

    HashMap<String, String> diccionario = new HashMap<String, String>();
    // algunas palabras + frase relacionada
    diccionario.put("frio", "uff,que frio que hace");
    diccionario.put("calor", "que calor que hace!");
    diccionario.put("programar", "estoy programando ahora mismo");
    diccionario.put("ocioso", "me encuentro ocioso en estos momentos!");

    Scanner f = new Scanner(System.in);
    int menu;
    //MENU
    System.out.println("==DICCIONARIO DE PALABRAS RELACIONADAS==\n\n");
    do {

      System.out.println("\n\n    ====MENÚ====\nSeleccione una opcion:");
      System.out.println();
      System.out.println("1. Mostrar frase relacionada\n2. Borrar palabra y "
          + "frase correspondiente\n3. Mostrar diccionario completo\n4. Salir del programa");
      menu = f.nextInt();

      switch (menu) {
      case 1:
	//funcion para mostrar 
        muestraFrase(diccionario);

        break;

      case 2:
	//funcion para borrar
        borra(diccionario);

        break;

      case 3:
        // funcion para mostrar diccionario
        muestraDiccionario(diccionario);

        break;

      default:

      }

    } while (menu != 4);
  }

  /**
   * muestra diccionario por pantalla
   * 
   * @param d diccionario de palabras-frases
   */
  public static void muestraDiccionario(HashMap<String, String> d) {

    for (Map.Entry dic : d.entrySet()) {
      
      System.out.println(dic.getKey() + " ---> " + dic.getValue());
    }

  }

  /**
   * Muestra frase relacionada con la palabra, y si no existe,la añade junto a su
   * frase al momento.
   * 
   * @param d HashMap diccionario
   */
  public static void muestraFrase(HashMap<String, String> d) {

    Scanner f = new Scanner(System.in);
    System.out.println("Introduzca una palabra:");
    String palabra = f.nextLine();
    if (d.containsKey(palabra)) {

      System.out.println(palabra + " ---> " + d.get(palabra));
    } else {

      System.out.println("lo siento,la palabra introducida no se encuentra" + " en el diccionario");
      System.out.print("Introduzca una frase relacionada a su palabra " + "y la añadiremos al diccionario:");

      String fraseIntro = f.nextLine();
      d.put(palabra, fraseIntro);
    }

  }

  /**
   * Borra palabra y frase relacionada
   * 
   * @param d HashMap diccionario
   */
  public static void borra(HashMap<String, String> d) {

    Scanner f = new Scanner(System.in);
    System.out.print("Introduzca la palabra asociada a la frase que desea borrar:");
    String palabraIntro = f.nextLine();
    if (d.containsKey(palabraIntro)) {

      d.remove(palabraIntro);
      System.out.println("¡Palabra borrada!");
    }
  }

}
