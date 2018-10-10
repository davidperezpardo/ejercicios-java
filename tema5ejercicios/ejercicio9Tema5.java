import java.util.Scanner;

public class ejercicio9Tema5 {
	
	public static void main (String args[]) {
		
    //muestra el número de dígitos al número introducido
    
    System.out.println("INTRODUZCA UN NÚMERO ENTERO PARA SABER CUÁNTOS DÍGITOS TIENE:");
    Scanner s = new Scanner(System.in);
    
    long numeroIntroducido = s.nextInt();
    long contador = numeroIntroducido;
    long digitos = 1;
    
    while (contador >10) { 
      contador/=10;
      digitos++;
    }
      System.out.println("El número introducido "+numeroIntroducido+" tiene "+digitos+" dígitos");
  
  }
}

