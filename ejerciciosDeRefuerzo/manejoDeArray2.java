import java.util.Scanner;

public class manejoDeArray2 {

  public static void main(String[] args) {
    /**
     * Imprime array en orden inverso:
     * 
     * el usuario selecciona el tamaño del array y lo rellena de nºs enteros,
     * (se rellena en orden inverso)
     * despues se imprime por pantalla el array en orden normal y en orden por 
     * el que el usuario introdujo los nºs.
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
    //bucle para ir pidiendo nºs al usuario y rellenando el array(en orden inverso)
    for (int i = tamaArray-1; i >= 0; i--) {
      System.out.println("Introduzca nº");
      numIntro = s.nextInt();
      array[i] = numIntro;
    }
    System.out.println("-array rellenado- (empezando por el final)");
    System.out.println("ARRAY ANTERIOR EN ORDEN ORIGINAL");
    System.out.println();
    //se imprime el array en orden normal
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%3d|", array[i]);
    }
    System.out.println();
    System.out.println("\nARRAY EN EL ORDEN POR EL QUE INTRODUJO LOS NºS");
    System.out.println();
    //se imprime array en el orden inverso (desde el final)
    for(int i = tamaArray-1; i >= 0; i--) {
      System.out.printf("%3d|", array[i]);
    }

  }

}
