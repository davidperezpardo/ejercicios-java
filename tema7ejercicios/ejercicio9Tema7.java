import java.util.Scanner;
public class ejercicio9Tema7 {
	
	public static void main (String args[]) {
		/*pide 8 nºs por teclado y muestra despues los mismos nºs 
     * y te al lado si es par o impar*/
    
    int[] numIntro = new int[8];
    Scanner s = new Scanner(System.in);
    System.out.println("introduzca 8 nºs de uno en uno(pulsando enter)");
    for(int i = 0; i < 8; i++){   //bucle para pedir los 8 nºs por teclado
      numIntro[i] = s.nextInt();
    }
    for(int i = 0; i< 8; i++){
      if(( numIntro[i]%2 == 0) || (numIntro[i] == 0)){
        System.out.print(numIntro[i]+"  es par\n");
      }else {
        System.out.print(numIntro[i]+"  es impar\n");
      }
    }
  }
}

