import java.util.Scanner;


public class ejercicio8 {
	
	public static void main (String args[]) {
		
	System.out.println("introduzca las horas trabajadas durante la semana");
		
		Scanner horas = new Scanner(System.in);
		int horaSemana = horas.nextInt();
		
		System.out.println("su salario semanal es de :" +(horaSemana * 12)+" euros");
	
	}
}

