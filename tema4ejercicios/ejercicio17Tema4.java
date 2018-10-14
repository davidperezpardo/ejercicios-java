import java.util.Scanner;

public class ejercicio17Tema4 {
	
	public static void main (String args[]) {
		
		//La última cifra del número entero introducido
		
		System.out.println("Introduzca un número entero: ");
		
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		System.out.println("La última cifra de su número es: "+(number %10));
		
	}
}

