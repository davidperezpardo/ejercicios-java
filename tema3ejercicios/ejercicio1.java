import java.util.Scanner;

public class ejercicio1 {
	
	public static void main (String args[]) {
    
    //lectura por pantalla y multiplicación de dos números
    
    int primerNumero;
    int segundoNumero;
    int resultado;
    
    Scanner escanerEntrada = new Scanner(System.in);
    
			System.out.println("introduzca el primer numero:");
			primerNumero = Integer.parseInt (escanerEntrada.nextLine());
    
			System.out.println("introduzca segundo numero:");
			segundoNumero = Integer.parseInt (escanerEntrada.nextLine());
			
			resultado = primerNumero + segundoNumero;
			
			System.out.println("resultado");
			
			System.out.printf("%d * %d = %d\n",primerNumero,segundoNumero,resultado);
    
    
  }
}
