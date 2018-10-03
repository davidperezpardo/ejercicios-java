import java.util.Scanner;

public class ejercicio9 {
	
	public static void main (String args[]) {
		
		//calcular el vólumen de un cono
		
	System.out.println("VOLUMEN DE UN CONO");
	
	System.out.println("introduzca la altura del cono en cms");
	
		Scanner a = new Scanner(System.in);
		double altura = a.nextDouble();
	
	System.out.println("introduzca el radio en cms");
	
		Scanner r = new Scanner(System.in);
		double radio = r.nextDouble();
	
		double PI = 3.141592654;
	
	System.out.println("el volúmen del cono es de "+(PI*radio*radio*altura)/3+" cms3");
	
	
	}
}

