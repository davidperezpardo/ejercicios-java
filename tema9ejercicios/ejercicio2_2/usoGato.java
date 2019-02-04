package ejercicio2_2;

import java.util.Scanner;

/**
 * gatos se introduzcan directamente en el código de la forma
 * <code>gatito[2].setColor(“marrón”)</code> o bien mediante el constructor, de
 * la forma <code>gatito[3] = new Gato("Garfeld",
 * "naranja", "macho")</code>.
 * 
 * Muestra a continuación los datos de todos los gatos utilizando un bucle.
 *
 * @author David Pérez Pardo
 */

public class usoGato {

  public static void main(String[] args) {

    Gato[] gatitos = new Gato[4];

    gatitos[0] = new Gato("Salem", "Negro", 21);
    gatitos[1] = new Gato("Bolt", "atigrado", 17);
    gatitos[2] = new Gato("Tranqui", "blanco", 26);
    gatitos[3] = new Gato("Piti", "gris", 12);

    // muestra de datos por pantalla
    System.out.println("Datos de los gatos: \n");
    for (int i = 0; i < gatitos.length; i++) {

      System.out.println("Gato nº " + (i + 1));
      System.out.println("Nombre: " + gatitos[i].getNombre());
      System.out.println("Color: " + gatitos[i].getColor());
      System.out.println("Peso: " + gatitos[i].getPeso() + "kg");
      System.out.println();
    }

  }

}
