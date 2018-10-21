import java.util.Scanner;

public class ejercicio24Tema5 {
	
	public static void main (String args[]) {
    //realiza una pirámide dibujada a base de números
    
    Scanner s = new Scanner(System.in);
    System.out.println("PIRÁMIDE HECHA A BASE DE NÚMEROS");
    System.out.println("INTRODUZCA UN Nº DEL 1 AL 9 PARA DARLE ALTURA A LA PIRÁMIDE");
    int numIntro = s.nextInt();
    int altura = 1;
    int alturaIntro = numIntro;
    int contadorEspacios = alturaIntro-1;
    for (int i =1; i<= alturaIntro ; i++) {
      for (int j = 1; j <= contadorEspacios; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j < altura; j++) {    //numeros lado izquierdo
        System.out.print(j);                
      }
      for (int j = altura; j >= 1; j--){   //números lado derecho
        System.out.print(j);
      }
      
      altura++;
      contadorEspacios--;
      System.out.println();   //salto de línea en cada iteracion del bucle externo
    
    }
    
	}
}

