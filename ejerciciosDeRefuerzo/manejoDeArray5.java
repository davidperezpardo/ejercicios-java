import java.util.Scanner;

public class manejoDeArray5 {

  public static void main(String[] args) {
    /**
     * programa que convierte un array unidimensional de nºs enteros
     * en un array bidimensional (matriz cuadrada).
     * el usuario introduce el tamaño para el array unidimensional,que debe
     * ser raiz cuadrada exacta para poder formar un array-matriz (cuadrada de N x N nºs).
     * y tambien introduce los valores para rellenar el array unidimensional.
     * el programa tambien comprueba si el tamaño introducido es raiz cuadrada exacta o no.
     * 
     * @author David perez pardo
     */
    int tamañoIntro;
    int valorIntro;
    boolean esExacta;
    int raizExacta = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Volcar Array-unidimensional en array-bidimensional (matriz)");
    System.out.println();
    int vector[];

    do {
      esExacta = false;
      System.out.println("Introduzca el tamaño para el array (tamaño igual a raiz cuadrada exacta)");
      tamañoIntro = s.nextInt();
      vector = new int[tamañoIntro];
      // bucle for para comprobar si tiene raiz cuadrada exacta o no.
      for (int i = 0; i < vector.length; i++) {
        // si tamañoIntro es raiz cuadrada exacta,será true
        if (i * i == tamañoIntro) {
          esExacta = true;
          //guardamos la raiz cuadrada exacta en una variable
          raizExacta = i;
        }
      }
      if (esExacta == false) {
        System.out.println("el tamaño introducido no es raiz cuadrada exacta");
      }
    } while (esExacta == false);
    System.out.println("Rellene el array-vector de nºs enteros");
    for (int i = 0; i < vector.length; i++) {
      System.out.println("Introduzca un valor: ");
      valorIntro = s.nextInt();   
      vector[i] = valorIntro;
    }
    int fila = 0;
    int columna = 0;
    //el tamaño de filas y columnas del array bidimensional será igual a la raiz cuadrada exacta
    int matriz[][] = new int[raizExacta][raizExacta];
    for (int k = 0; k < vector.length; k++) {
      //pasamos los valores del vector a la matriz
      matriz[fila][columna] = vector[k];
      //vamos pasando de columna en cada pasada del bucle mientras le introducimos los valores
      columna++;
      //cuando columna sea igual a la raiz exacta,la volvemos a poner a 0
      if (columna == raizExacta) {
        columna = 0;
        //y avanzamos la fila una posición para seguir traspasando los valores del vector
        fila++;
      }
    }
    System.out.println("array-vector convertido en array-matriz:");
    System.out.println();
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        System.out.printf("[%3d]",matriz[i][j]);
      }
      System.out.println();
    }

  }

}
