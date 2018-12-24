import java.util.Scanner;

public class cuadradoDeNumeros2 {

	public static void main(String[] args) {
		/*imprime por pantalla el cuadrado del nº
		 * introducido por teclado
		 * finaliza el programa al calcular 4 cuadrados 
		 * o al pulsar 0
		 */
		System.out.println("Cálculo del cuadrado (hasta 4 nºs) (pulse 0 para salir antes)");
		System.out.println();
		long numIntro;
		int contador = 0;
		do {		
			
			Scanner s = new Scanner(System.in);	  
			System.out.println("Introduzca nº para calcular su cuadrado: ");
			numIntro = s.nextLong();
			if(numIntro != 0 && contador < 4) {
				System.out.println("El cuadrado de "+numIntro+" es: "+numIntro*numIntro);
			}
			contador++;
		}while(numIntro != 0 && contador < 4);


	}
}
