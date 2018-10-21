import java.util.Scanner;

public class ejercicio18Tema5 {
	
	public static void main (String[] args) {
   
    //muestra los números entre dos introducidos,empezando por el menor, de 7 en 7
    
    int num1 ;      //se declaran antes antes del ciclo do-while,sino no funcionarian fuera de él
    int num2 ;
    do {
      Scanner s = new Scanner(System.in);
      System.out.println("INTRODUZCA PRIMER NÚMERO");
      num1 = s.nextInt();
      System.out.println("INTRODUZCA SEGUNDO NÚMERO");
      num2 = s.nextInt();
      if (num1 == num2){
        System.out.println("NO SE PERMITEN DOS NÚMEROS IGUALES,VUELVA A INTENTARLO");
      }
    }while (num1 == num2);

    if (num1 > num2) {
      for(int i = num2; i <= num1; i +=7){
        System.out.print(i+" ");
      }
    }
    else {
      for (int i = num1 ; i <=num2 ; i +=7) {
        System.out.print(i+" ");
      }
    }

	}
}

