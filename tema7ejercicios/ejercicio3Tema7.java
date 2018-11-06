import java.util.Scanner;

public class ejercicio3Tema7 {
	
	public static void main (String args[]) {
      //muestra 10 nºs introducidos,en orden inverso
      int [] num = new int[10];
      Scanner s = new Scanner(System.in);
      System.out.println("INTRODUZCA DIEZ NÚMEROS ENTEROS DE UNO EN UNO");
      for(int i =0; i<10; i++){
        num[i] = s.nextInt();
      }
      System.out.println("LOS NºS INTRODUCIDOS AL REVÉS SON :");
      for(int j = 9; j >=0; j--){
        System.out.print(num[j]+" ");
      }
  }
}

