import java.util.Scanner;

public class sumaBucles2 {

  public static void main (String args[]) {
    //suma de números introducidos,parada al introducir 0(do-while loop)
    
    int acumulador = 0;
    int sumando;

    do {
      System.out.print("introduzca el sumando (0 para terminar): ");
      Scanner s =new Scanner(System.in);
      sumando = s.nextInt();
      acumulador += sumando;

    }while (sumando !=0);
    
    System.out.println("la suma de los números introducido es : "+ acumulador );

  }
}

