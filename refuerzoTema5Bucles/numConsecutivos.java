import java.util.Scanner;
public class numConsecutivos {

	public static void main(String[] args) {
		/*muestra por pantalla los numeros enteros consecutivos desde el 1 hasta
		 * el indicado por el usuario*/
		 	
		Scanner s = new Scanner(System.in);
		System.out.println("se visualizarán numeros enteros consecutivos por pantalla desde 1 en adelante");
		System.out.println("Introduzca la cantidad de numeros a mostrar");
		long numIntro = s.nextLong();		
		for(long i=1; i<=numIntro; i++) {
			System.out.print(i+",");
		}
	}

}
