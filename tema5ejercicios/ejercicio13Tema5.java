import java.util.Scanner;

public class ejercicio13Tema5 {
	
	public static void main (String args[]) {
		//cuenta la cantidad de nºs positivos y negativos de diez nºs introducidos enteros
    
    System.out.println("INTRODUZCA DIEZ NÚMERO ENTEROS");
    Scanner s = new Scanner(System.in);
    int numIntroducido =0;
    int i;
    int positivos = 0;
    int negativos = 0;
    
    for (i = 0; i <10; i++)  { 
       numIntroducido = s.nextInt();
    
      if (numIntroducido < 0) { negativos++;
      } else { positivos++;
        }
    }
    System.out.println("números positivos= "+positivos+" negativos= "+negativos);
	}
}

