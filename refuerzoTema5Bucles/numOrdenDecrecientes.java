import java.util.Scanner;
public class numOrdenDecrecientes {

	public static void main(String[] args) {
		/*muestra numeros enteros en orden decreciente
		 * el usuario elige el valor más alto,el más bajo
		 * y el salto entre nºs
		 */
		System.out.println("muestra los nºs enteros en orden decreciente");
		System.out.println("eliga el valor más alto :");
		Scanner s = new Scanner(System.in);
		long masAlto = s.nextLong();
		System.out.println("eliga el valor más bajo :");
		long masBajo = s.nextLong();
		System.out.println("eliga el salto entre nºs");
		long saltos = s.nextLong();
		for (long i = masAlto; i >=masBajo; i=i-saltos) {
			System.out.print(i+",");
		}
		

	}

}
