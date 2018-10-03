import java.util.Scanner;

public class ejercicio10 {
	
	public static void main (String args[]) {
		
		//conversor de Mb a Kb
	
	System.out.println("introduzca Mb para convertir a Kb");
		Scanner m =new Scanner(System.in);
		double mb = m.nextDouble();
		
		System.out.println(mb +" Mb son "+ mb*1024+" Kb");
	
	
	}
}

