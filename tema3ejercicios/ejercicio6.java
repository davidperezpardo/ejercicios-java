import java.util.Scanner;

public class ejercicio6 {
	
	public static void main (String args[]) {
	
	//aŕea de un triángulo leyendo datos del teclado
	
	
	System.out.println("ÁREA DE UN TRIÁNGULO");
	System.out.println("introduzca la longitud de la base en cms");
	
		Scanner b = new Scanner(System.in);
		double base = b.nextDouble();
		
		System.out.println("introduzca la altura en cms");
		double altura =b.nextDouble();
		
		System.out.println("el área del triángulo es = " + (base*altura)/2 + " cms2");
		
	
	}
}
