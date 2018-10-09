import java.util.Scanner;

public class sumaBucles {

  public static void main (String args[]) {
    //elige el nº de sumas a realizar,y luego introduce los números a sumar.
    
    int acumulador = 0;

    System.out.println("introduzca el nº de números que quiere sumar");
    Scanner s = new Scanner(System.in);
    int numSumandos = s.nextInt();

    for (int i=1; i<=numSumandos; i++)	{
      System.out.println("introduzca el sumando nº " +i + ": ");
      int sumando =s.nextInt();
      acumulador += sumando;
    }
    System.out.println("la suma de los " + numSumandos + " números introducidos es : "+ acumulador);

  }
}

