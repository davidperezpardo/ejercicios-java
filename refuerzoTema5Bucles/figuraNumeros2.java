import java.util.Scanner;
public class figuraNumeros2 {

	public static void main(String[] args) {
		/*dibuja 3 figuras a base de nºs
		 * la altura de la figura es introducida por teclado
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Se dibujarán 3 figuras a base de nºs");
		System.out.println("Introduzca la altura de la figura");
		int altura = s.nextInt();
		for (int i = 1; i <= altura; i++) { //bucle exterior para la altura
			for (int j = 1; j <= i; j++) { 	//bucle para dibujar los nºs
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println(); //separacion entre figuras
		
		for (int i = altura; i > 0 ; i--) { //bucle exterior para la altura
			for (int j = 0; j <= altura-i; j++) { //bucle para dibujar los nºs
				System.out.print(i);
			}
			System.out.println();		
		}
		System.out.println(); //separacion entre figuras
		
		for (int i = 1; i <= altura; i++) { //bucle exterior para la altura
			for (int j = 1; j <= i; j++) {  //bucle para dibujar los nºs
				System.out.print(j);			
			}
			System.out.println();
		}
		
	}

}
