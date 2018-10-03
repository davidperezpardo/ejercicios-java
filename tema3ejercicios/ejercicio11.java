import java.util.Scanner;

public class ejercicio11 {
	
	public static void main (String args[]) {
		
		//conversor de Kb a Mb
	
	System.out.println("introduzca Kb para convertir a Mb");
		Scanner k =new Scanner(System.in);
		double kb = k.nextDouble();
		
		System.out.println(kb +" Kb son "+ kb/1024+" Mb");
	
	
	}
}
