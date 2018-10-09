import java.util.Scanner;


public class  buclefor {

  public static void main (String args[]) {
    //muestra todos los números introducidos por teclado

    Scanner s = new Scanner(System.in);

    System.out.println("¿cuantos números quieres que te muestre?");
    int laVoluntad =s.nextInt();

    for (int i=1; i <= laVoluntad; i++)	{
      System.out.println(i);
    }

  }
}

