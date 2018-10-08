import java.util.Scanner;

public class ejercicio14Tema4 {
	
	//imprimir si el número introducido es par/impar y divisible entre 5
	
	public static void main (String args[]) {
		
		System.out.println("INTRODUCE UN NÚMERO ENTERO");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
			if ((num % 2) ==0 ) { System.out.println("el número introducido es par");
			
			}else {	System.out.println("el número introducido es impar");
			
			}
				
			if	((num % 5) ==0) { System.out.println("tambien divisible entre 5");
				
			}else { System.out.println("y no es divisible entre 5");
				
			}
		
	
	
	}
	
}

