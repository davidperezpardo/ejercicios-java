import java.util.Scanner;

public class ejercicio12 {
	
	public static void main (String args[]) {
		
		/*programa que calcula la nota que hace falta para sacar en el segundo
		 *examen de la asignatura **Programación** para obtener la media deseadadel 
		 * trimestre.la nota del primer examen cuenta el 40% y la del segundo 
		 * examen un 60%.*/
		  
		  
	
		System.out.println("introduce la nota del primer exámen");
		
		Scanner n1 = new Scanner(System.in);
		double nota1= n1.nextDouble();
	
		System.out.println("escriba la nota desea para el trimestre");
			
			Scanner t = new Scanner(System.in);
			double notaTrimestre = t.nextDouble();
			
			double nota2 = ((notaTrimestre*100) - (nota1*40))/60;
			
		
		System.out.println("necesitas sacar " + nota2 + " en el segundo examen para tener un " + notaTrimestre + " en el trimestre");
		
	
	}
}
