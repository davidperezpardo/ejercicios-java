import java.util.Scanner;

public class ejercicioif7 {
	
	public static void main (String args[]) {
			
		//la media de tres notas
  
  System.out.println("introduzca la primera nota");
  Scanner s = new Scanner(System.in);
  double nota1 = s.nextDouble();
  
  System.out.println("introduzca la segunda nota");
  double nota2 = s.nextDouble();
  
  System.out.println("introduzca la tercera nota:");
  double nota3 =s .nextDouble();
	
  System.out.printf("la nota media que tienes usted es de: %.2f",(nota1 + nota2 + nota3)/3);
  
  }
}

