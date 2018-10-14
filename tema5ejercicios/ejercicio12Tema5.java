import java.util.Scanner;

public class ejercicio12Tema5 {
	
	public static void main (String args[]) {
    
    //muestra la serie de fibonacci con el nº de términos introducidos 
    
    System.out.println("SERIE DE FIBONACCI:introduzca el -número- de términos que quiere ver");
    Scanner s = new Scanner(System.in);
    int numeros = s.nextInt();
    long num1 = 0;
    long num2 = 1;
    long aux;
    
    if (numeros == 1) {System.out.println("serie de fibonacci :0");
    } else if (numeros == 2) {System.out.println("serie de fibonacci :0 1");
      } else { System.out.println("serie de fibonacci con "+numeros+" términos :");
             System.out.println("0");
             System.out.println("1");
      
            for (int i = 1; i <=numeros; i++) { 
                aux = num1;
                num1 = num2;
                num2 = aux + num2; 
            
                System.out.println(num2);
            }
        }  
  }
}

