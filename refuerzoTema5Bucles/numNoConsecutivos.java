import java.util.Scanner;
public class numNoConsecutivos {

	public static void main(String[] args) {
		/*muestra lista de numeros enteros en orden creciente dando
		 * saltos,el usuario indica la cantidad de nºs a mostrar,
		 * a partir de que nº comienza y el salto entre los nºs.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("muestra los números enteros en orden creciente");
		System.out.println("Introduzca la cantidad de nºs :");
		long cantidad = s.nextLong();
		System.out.println("Introduzca el nº desde donde quiere comenzar :");
		long comienzo = s.nextLong();
		System.out.println("Introduzca el salto entre nºs :");
		long saltos = s.nextLong();
		for(long i=comienzo; i<(cantidad*saltos)+comienzo; i=i+saltos) {

			System.out.print(i+",");
		}
	}

}
