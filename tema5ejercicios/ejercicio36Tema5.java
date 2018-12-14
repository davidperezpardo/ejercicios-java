import java.util.Scanner;
public class ejercicio36Tema5 {
	
	public static void main (String args[]) {
		//saber si un número es capicúa o no
    
    Scanner s = new Scanner(System.in);
    System.out.print("introduzca un numero para saber si es capicúa o no:");
    long numIntro = s.nextInt();
    long numero = numIntro;
    long volteado = 0;
    
    while(numero > 0) {
      volteado = (volteado *10) + (numero%10);
      numero /=10;
    }
    if(volteado == numIntro){
      System.out.print("el nº introducido es capicua");
    }
    else{
      System.out.print("el nº introducido no es capicua");
    }
  }
}
