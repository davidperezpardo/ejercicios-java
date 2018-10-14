import java.util.Scanner;

public class ejercicio10Tema5 {
	
	public static void main (String args[]) {
  
  //calcula la  suma de números introducidos por teclado y realiza la media
    
    System.out.println("SE CALCULARÁ LA MEDIA DE LOS NÚMEROS INTRODUCIDOS");
    Scanner s = new Scanner(System.in);
    double numIntroducido =1;
    double suma = 0;
    double media = 0;
    
    while ( numIntroducido >=0)  { 
      System.out.println("INTRODUZCA NÚMERO (para terminar introduzca un nº negativo)");
      numIntroducido = s.nextDouble();
      suma+=numIntroducido;
      media++;
    }
  
    System.out.println("LA MEDIA DE LOS NÚMEROS POSITIVOS INTRODUCIDOS ES : "+suma/media);
    
  }
}

