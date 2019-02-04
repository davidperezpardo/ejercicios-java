package ejercicio1_2;

import java.util.Scanner;

/**
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los
 * datos de cada uno de ellos mediante un bucle. Muestra a continuación los
 * datos de todos los gatos utilizando también un bucle.
 *
 * @author David Pérez Pardo
 */
public class usoGato {

  public static void main(String[] args) {

    Gato[] gatitos = new Gato[4];
    
    Scanner intro = new Scanner(System.in);
    String texto;
    int peso;
    
    //recogida de datos por teclado
    System.out.println("Introduzca los datos para gatos:");
    for (int i = 0; i < gatitos.length; i++) {

      gatitos[i] = new Gato();
      System.out.println("Gato nº" + (i + 1));
      System.out.println("Nombre: ");
      texto = intro.next();
      gatitos[i].setNombre(texto);

      System.out.println("Color: ");
      texto = intro.next();
      gatitos[i].setColor(texto);

      System.out.println("Peso: ");
      peso = intro.nextInt();
      gatitos[i].setPeso(peso);
    }
    //muestra de datos por pantalla
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
