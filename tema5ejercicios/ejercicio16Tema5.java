import java.util.Scanner;

public class ejercicio16Tema5 {
	
	public static void main (String args[]) {
    //saber si el número introducido es primo o no
    
    System.out.println ("INTRODUCE UN NÚMERO PARA SABER SI ES PRIMO");
    Scanner s = new Scanner(System.in);
    int numIntroducido = s.nextInt();
    boolean esPrimo = true;
    
    for (int i = 2; i < numIntroducido; i++) {
      if ((numIntroducido % i) == 0) {
        esPrimo=false;
        
      }
    }
    if (esPrimo) {                    
      System.out.print (" ES PRIMO");
    }else {
        System.out.print (" NO ES PRIMO");
    }
  
  
  }
}

