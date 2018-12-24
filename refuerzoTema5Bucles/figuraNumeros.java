import java.util.Scanner;
public class figuraNumeros {

	public static void main(String[] args) {
		/*3 figuras a partir de un nº introducido por teclado
		 */
		System.out.println("Introduzca un nº entero para formar las 3 figuras de nºs");
		Scanner s = new Scanner(System.in);
		int numIntro = s.nextInt();
		for(int i=1; i<=numIntro; i++) { //muestra los nºs
			for(int j=2; j<=i; j++) { 		//dibuja los espacios
				System.out.print(" ");
			}
			System.out.println(i);
		}
		System.out.println();
		for(int i=1; i<=numIntro; i++) {//bucle exterior
			for (int j = 1; j < i; j++) { //dibuja espacios
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {//dibuja los nºs
				System.out.print(j);
			}
			System.out.println();	
			
		}
		System.out.println();
		
		for (int i = 1; i <= numIntro; i++) {//bucle exterior
			for (int j = 1; j < i; j++) { //pinta los espacios
				System.out.print(" ");
			}
			for (int j = numIntro; j > numIntro-i; j--) {	//pinta los nºs desde numIntro hasta 1
				System.out.print(j);			
			}
			System.out.println();		
		}
	
	}	

}
