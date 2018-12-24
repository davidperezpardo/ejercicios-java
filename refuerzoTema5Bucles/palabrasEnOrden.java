import java.util.Scanner;
public class palabrasEnOrden {

	public static void main(String[] args) {
		/*pide palabras por teclado y las 
		 * imprime despues en el orden en el 
		 * que han sido introducidas
		 */
		System.out.println("Introduzca palabras por teclado,escriba "
				+ "-salir- cuando quiera finalizar");
		System.out.println("Se mostrarán las palabras en el orden que las introdujo");
		Scanner s = new Scanner(System.in);
		String palabra;
		String todasPalabras= ""; //tiene que estar declarada e inicializada para poder concatenar
		do {
			System.out.print("Introduzca una palabra :");		
			palabra = s.next();	
			todasPalabras += palabra+" ";		//con el + concatenamos cada palabra introducida por teclado
																		 //+" " le aplica un espacio entre palabra y palabra
		}while(!palabra.equals("salir"));
		System.out.println(todasPalabras);
		
	}

}
