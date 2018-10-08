import java.util.Scanner;

public class ejercicio2 {
	
	public static void main (String args[]) {
	
	//conversor euros a pesetas
  
  double euros;
  double pesetas;
  double resultado;
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("introduzca euros a convertir:");
  euros =s.nextDouble();
  pesetas = 166.386;
  resultado = (euros * pesetas);
  
  System.out.printf("%.2f pesetas",resultado);
 
  
 
  
  	
	}
}

