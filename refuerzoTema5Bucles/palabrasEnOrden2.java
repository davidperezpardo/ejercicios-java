
import java.util.Scanner;
public class palabrasEnOrden2 {

	public static void main(String[] args) {
		/*pide palabras por teclado y las 
		 * imprime despues en orden inverso en el 
		 * que han sido introducidas
		 */
		System.out.println("Introduzca palabras por teclado,escriba "
				+ "-salir- cuando quiera finalizar");
		System.out.println("Se mostrarán las palabras en orden inverso en que las introdujo");
		Scanner s = new Scanner(System.in);
		String palabra = "";
		String sumaPalabras = ""; //tiene que estar declarada e inicializada para poder concatenar
		
		do {
		  System.out.print("Introduzca una palabra :");    
      palabra = s.next();
		  if(!palabra.equals("salir")) {
			  
		    /*de ésta forma vamos concatenando cada palabra nueva introducida
			   *de derecha a izquierda,formando un string con las palabras en orden inverso.			
			   */
			  sumaPalabras = palabra+" "+sumaPalabras;
			}                               
			
		}while(!palabra.equals("salir"));
		System.out.println(sumaPalabras);
	}
}
