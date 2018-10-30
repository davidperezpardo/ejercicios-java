import java.util.Scanner;

public class ejercicio28Tema5 {
	
	public static void main (String args[]) {
  /*cálculo del factorial de un número entero(multiplicacion de todos los números
   * enteros entre el 1 y el nº introducido)*/
  
  System.out.println("CÁLCULO DEL FACTORIAL DE UN Nº");
  System.out.println("INTRODUZCA UN NÚMERO PARA CALCULAR EL FACTORIAL");
  Scanner s = new Scanner(System.in);
  int  numIntro = s.nextInt();
  long factorial = 1;
  for(int i = 1; i <= numIntro; i++) {
      factorial *= i;
  
  }
    System.out.println(factorial);
  }
}

