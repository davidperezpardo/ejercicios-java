import java.util.Scanner;

public class ejercicio8Tema5 {
	
	public static void main (String args[]) {
    
    //muestra la tabla de multiplicar de un número introducido
    
    System.out.println("INTRODUZCA  NÚMERO PARA MOSTRAR LA TABLA DE MULTIPLICAR");
    Scanner s = new Scanner(System.in);
    int numero = s.nextInt();
    int multiplo = 1;
   
    
    for ( multiplo = 1; multiplo <=10; multiplo++ ) {
      
    System.out.println(numero +"x"+multiplo + "="+multiplo*numero);
    }
  
  
  }
}

