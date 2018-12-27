import java.util.Scanner;

public class manejoDeArray {

  public static void main(String[] args) {
    /**
     * Imprime array en orden inverso:
     * 
     * el usuario selecciona el tamaño del array y lo rellena de nºs enteros,
     * despues se imprime por pantalla en orden inverso.
     * 
     * @author David pérez pardo
     */
    int numIntro;
    int tamaArray;

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el tamaño que desea para el array (nº entero):");
    tamaArray = s.nextInt();
    int array[] = new int[tamaArray]; //tamaño del array elegido por el usuario

    System.out.println("Rellene el array con nºs enteros");
    //bucle para ir pidiendo nºs al usuario y rellenando el array
    for (int i = 0; i < array.length; i++) {
      System.out.println("Introduzca nº");
      numIntro = s.nextInt();
      array[i] = numIntro;
    }
    System.out.println("-array rellenado-");
    System.out.println("ARRAY ANTERIOR EN ORDEN INVERSO");
    System.out.println();
    //se imprime array en orden inverso
    for (int i = tamaArray - 1; i >= 0; i--) {
      System.out.printf("%3d|", array[i]);
    }

  }

}
