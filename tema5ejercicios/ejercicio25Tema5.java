import java.util.Scanner;

public class ejercicio25Tema5 {
	
	public static void main (String args[]) {
    //muestra un número entero introducido por teclado al revés
    
    Scanner s = new Scanner(System.in);
    System.out.println("INTRODUZCA NÚMERO");
    long numIntro = s.nextLong();
    long numero = numIntro;
    long numReves = 0;
    while (numero > 0) {
      numReves = (numReves*10)+(numero%10);     //con el modulo %10 obtenemos la unidad del nº introducido
      numero /=10;                             //dividimos entre 10 el nº introducido,dentro de otra variable
    }                                         //para desplazar la coma a la izquierda y obtener el siguiente nº
                                              /*numReves se multiplica por diez y se suma el  numero%10, 
                                              * eso nos va acumulando los numeros del revés */
    System.out.println("EL NÚMERO INTRODUCIDO "+numIntro+" AL REVÉS ES :"+numReves);  
                                                                          
  }
}

