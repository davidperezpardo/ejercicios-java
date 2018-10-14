import java.util.Scanner;

public class ejercicio17Tema5 {
	
	public static void main (String[] args) {
    
    //muestra la suma de los 100 números siguientes al que se  ha introducido (positivos y enteros)
    
    int numIntroducido = 0;
    Scanner entrada = new Scanner(System.in);
    
    do {  System.out.println("INTRODUZCA UN NÚMERO ENTERO Y POSITIVO");
      numIntroducido = entrada.nextInt();
      
      if (numIntroducido <0)  { System.out.println("NUMEROS NEGATIVOS NO PERMITIDOS");
      }
    } while (numIntroducido<0); /*al introducir un numero negativo el bucle se inicializa.
                                   para salir del bucle y continuar hacia abajo,
                                   basta con introducir un número positivo.*/
      
      int suma = 0;
      for (int i = numIntroducido; i < numIntroducido+100;  i++)  {
        suma+=i;
      }
        
      System.out.println("LA SUMA DE LOS 100 NÚMEROS SIGUIENTES A "+numIntroducido+" es: "+suma);
    
  }
}

    
    
    
    
    
	

