import java.util.Scanner;
public class numConsecutivos2 {

	public static void main(String[] args) {
			/*muestra por pantalla numeros enteros consecutivos
			 * el usuario elige la cantidad de nºs y el inicio*/
			 			 	
			Scanner s = new Scanner(System.in);
			System.out.println("se visualizarán numeros enteros consecutivos por pantalla");
			System.out.println("Introduzca la cantidad de numeros a mostrar");
			long cantidad = s.nextLong();
			System.out.println("Introduzca desde que nº quiere comenzar");
			long comienzo = s.nextLong();			
			for(long i=comienzo; i<cantidad+comienzo; i++) {
				System.out.print(i+",");
			}

	}

}
