import java.util.Scanner;

public class ejercicio3 {
	
	//conversor pesetas a euros
	
	public static void main (String args[]) {
	
  double euros;
  double pesetas;
  double resultado;
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("introduzca pesetas a convertir:");
   pesetas = Integer.parseInt (s.nextLine());
   euros = 166.386;
  resultado = (pesetas/euros);
  
  System.out.printf("%.2f euros",resultado);
 
  
 
  
  	
	}
}

