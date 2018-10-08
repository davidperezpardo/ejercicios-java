import java.util.Scanner;

public class ejercicio5 {
	
	public static void main (String args[]) {
	
	//aŕea de un rectángulo leyendo datos del teclado
	
	
	System.out.println("ÁREA DE UN RECTÁNGULO");
	System.out.println("introduzca la longitud de la base en cms");
	
		Scanner b = new Scanner(System.in);
		double base = b.nextDouble();
		
		System.out.println("introduzca la altura en cms");
		double altura =b.nextDouble();
		
		System.out.println("el área del rectángulo es = " + (base*altura) + " cms2");
		
	
	}
}

