import java.util.Scanner;

public class ejercicio4 {
  public static void main (String args [] ) {
  
  /*suma,resta,multiplicacion y division de dos números 
   * introducidos por teclado.*/
   
	Scanner num1 =new Scanner(System.in);
	 
		System.out.println("introduzca el primer número");
		
		 double x = num1.nextDouble();
		
	
	Scanner num2 =new Scanner(System.in);
		
		System.out.println("introduzca segundo número");
		 
		 double y = num2.nextDouble();
		 
		 
		
		
	 
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));

 
 }
 

}
  
