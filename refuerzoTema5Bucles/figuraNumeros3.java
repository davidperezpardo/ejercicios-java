import java.util.Scanner;
public class figuraNumeros3 {

	public static void main(String[] args) {
		/*dibuja 3 figuras de nºs a partir de 
		 *una altura dada por teclado
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Se dibujarán tres figuras a base de números");
		System.out.println("Introduzca la altura de las figuras");
		int altura = s.nextInt();
		for (int i = 1; i <= altura; i++) { //bucle exterior para la altura
			for (int j = 0; j < altura-i; j++) { //para dibujar los espacios
				System.out.print(" ");				
			}
			for (int j = 0; j < i; j++) { //para dibujar los nºs
				System.out.print(i);
			}
			System.out.println(); //salto en cada línea
		}
		System.out.println(); //separacion de figuras
	
		for (int i = altura; i > 0; i--) { //bucle exterior para la altura
			for (int j = 1; j < i; j++) { //para dibujar los espacios
				System.out.print(" ");				
			}
			for (int j = 0; j <= altura-i; j++) { //para dibujar los nºs
				System.out.print(i);
			}
			System.out.println(); //salto en cada línea
		}
		System.out.println();
		
		for (int i = 1; i <= altura; i++) { //bucle exterior para la altura
			for (int j = 0; j < altura-i; j++) { //para dibujar los espacios
				System.out.print(" ");				
			}
			for (int j = 1; j <= i; j++) { //para dibujar los nºs
				System.out.print(j);
			}
			System.out.println(); //salto en cada línea
		}
	}

}
