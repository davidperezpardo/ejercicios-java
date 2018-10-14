import java.util.Scanner;

public class ejercicio11Tema5 {
	
  //muestra el cuadrado y el cubo de los 5 primeros números a partir del introducido
	
  public static void main (String args[]) {
	System.out.println("INTRODUZCA UN NÚMERO ENTERO");
  Scanner s = new Scanner(System.in);
  int numIntroducido = s.nextInt();
  int i = 0;
  
  for ( i = numIntroducido; i < numIntroducido+5; i++)  {
    System.out.printf("%4d  cuadrado =%8d  y al cubo =%8d \n",i,i*i,i*i*i);
  }
  
  
	}
}

