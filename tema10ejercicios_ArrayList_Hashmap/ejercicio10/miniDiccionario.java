package ejercicio10;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Mini-Traductor español-inglés (20 palabras)
 * 
 * Traduce una palabra del español al inglés, si ésta se encuentra en el
 * diccionario.
 * 
 * @author David Pérez Pardo
 *
 */
public class miniDiccionario {

  public static void main(String[] args) {

    String palabraIntro;
    Scanner s = new Scanner(System.in);
    HashMap<String, String> diccionario = new HashMap<String, String>();
    System.out.println("Traductor español-inglés\n");
    diccionario.put("tiburon", "Shark");
    diccionario.put("leon", "Lyon");
    diccionario.put("coche", "Car");
    diccionario.put("jugar", "Play");
    diccionario.put("limon", "Lemon");
    diccionario.put("cerveza", "Beer");
    diccionario.put("pollo", "Chicken");
    diccionario.put("piscina", "Swimming pool");
    diccionario.put("avion", "Airplane");
    diccionario.put("corazon", "Heart");
    diccionario.put("ciudad", "City");
    diccionario.put("vino", "Wine");
    diccionario.put("agua", "Water");
    diccionario.put("pais", "Country");
    diccionario.put("mano", "Hand");
    diccionario.put("correr", "Run");
    diccionario.put("saltar", "Jump");
    diccionario.put("hablar", "Speak");
    diccionario.put("estudiar", "Study");

    System.out.println("Introduzca \"salir\" para finalizar\n");

    do {

      System.out.println("Introduzca palabra:");
      palabraIntro = s.next();
      if (diccionario.containsKey(palabraIntro)) {

        System.out.println(palabraIntro + " en inglés es:" + diccionario.get(palabraIntro));

      } else if (!palabraIntro.equals("salir")) {
        System.out.println("La palabra introducida no se encuentra en el diccionario,pruebe con otra");
      }

    } while (!palabraIntro.equals("salir"));

  }

}
