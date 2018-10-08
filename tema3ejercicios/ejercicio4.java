import java.util.Scanner;

public class ejercicio4 {
  public static void main (String args [] ) {
  
  /*suma,resta,multiplicacion y division de dos números 
   * introducidos por teclado.*/
   
	Scanner num =new Scanner(System.in);
	 
		System.out.println("introduzca el primer número");
		
		 double x = num.nextDouble();
		
		System.out.println("introduzca segundo número");
		 
		 double y = num.nextDouble();
		 
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));

 
 }
 

}
  
