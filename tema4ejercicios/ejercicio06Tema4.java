import java.util.Scanner;

public class ejercicio06Tema4 {
		
		//tiempo en caer una pelota desde una altura.
	
	public static void main (String args[]) {
		
	System.out.println("¿cuanto tiempo tardará en caer una pelota desde x metros de altura?");
	System.out.println("introduzca la distancia para saber el tiempo de caida");
	
	Scanner s = new Scanner(System.in);
	
	double altura =s.nextDouble();
	
	double g = 9.81;
	double seg = Math.sqrt((2*altura)/g);
	
	System.out.printf("tardará la pelota en caer %.2f segundos", seg ) ;
	
	  
	
	
	
	
	}
}

