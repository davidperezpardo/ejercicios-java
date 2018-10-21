import java.util.Scanner;

public class ejercicio25Tema5 {
	
	public static void main (String args[]) {
    //muestra un número entero introducido por teclado al revés
    
    Scanner s = new Scanner(System.in);
    System.out.println("INTRODUZCA NÚMERO");
    long numIntro = s.nextInt();
    long numero = numIntro;
    long numReves = 0;
    
    while (numero > 0) {
      numReves = (numReves*10)+(numero%10);     //con el modulo %10 obtenemos la unidad del nº introducido
      numero /=10;                             //dividimos entre 10 el nº introducido,dentro de otra variable
    }                                         //para desplazar la coma a la izquierda y obtener el siguiente nº
    System.out.println(numReves);

	}
}

