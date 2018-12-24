import java.util.Scanner;
public class cuadradoDeNumero {

	public static void main(String[] args) {
		/*imprime por pantalla el cuadrado del nº
		 * introducido por teclado 
		 * al pulsar 0 el programa finaliza
		 */
		System.out.println("Cálculo del cuadrado (pulse 0 para salir)");
		System.out.println();
		long numIntro;
		do {		
			Scanner s = new Scanner(System.in);	  
			System.out.println("Introduzca nº para calcular su cuadrado: ");
			numIntro = s.nextLong();
			if(numIntro != 0) {
				System.out.println("El cuadrado de "+numIntro+" es: "+numIntro*numIntro);
			}
		}while(numIntro != 0);

	
	}

}
