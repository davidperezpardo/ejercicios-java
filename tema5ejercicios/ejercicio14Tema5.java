import java.util.Scanner;


public class ejercicio14Tema5 {
	
	public static void main (String args[]) {
    //calcula una potencia a partir de una base y exponente introducida (nºs enteros y positivos)
   
    System.out.println("introduzca la base (entero y positivo)");
    Scanner s = new Scanner(System.in);
    int base = s.nextInt();
    
    System.out.println("introduzca el exponente");
    int exponente = s.nextInt();
    long potencia = 1;
    
    if (exponente == 0) { potencia = 1;
      System.out.println("potencia = "+potencia);
    }
    
    if (exponente >0 ) { 
      
      for (int i =0; i < exponente; i++) {
        potencia *= base;
      }
     System.out.println("potencia = "+potencia);
    }
  }
}
