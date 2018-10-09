import java.util.Scanner;

public class sumaBucles3 {
  
  public static void main (String args[]) {
    //suma de números introducidos,la parada se realiza al introducir el cero(while loop)
    
    int acumulador = 0;
    int sumando=1;
    
    while (sumando !=  0) {
      System.out.println("introduzca el sumando (0 para terminar): ");
      Scanner s =new Scanner(System.in);
      sumando = s.nextInt();
      acumulador +=sumando;
    }
    
    System.out.println("la suma de los números introducido es : "+ acumulador );
    
  }
}

