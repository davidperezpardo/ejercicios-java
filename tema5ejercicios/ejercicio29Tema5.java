import java.util.Scanner;
public class ejercicio29Tema5 {
	
	public static void main (String args[]) {
		/*muestra todos los nºs menores a uno introducido,no divisibles entre el 
     * segundo introducido.*/
    System.out.println("MUESTRA TODOS LOS Nºs ENTEROS MENORES AL INTRODUCIDO");
    System.out.println("QUE NO SEAN DIVISIBLES ENTRE EL SEGUNDO Nº INTRODUCIDO");
    Scanner s = new Scanner(System.in);
    System.out.println("INTRODUZCA UN NÚMERO ENTERO");
    int numIntro1 = s.nextInt();
    System.out.println("INTRODUZCA OTRO NÚMERO (más pequeño)");
    int numIntro2 = s.nextInt();
    System.out.println("ESTOS SON LOS Nºs MENORES A "+numIntro1+ " NO DIVISIBLES ENTRE "+numIntro2);
    for(int i = 1; i<numIntro1; i++) {
      if((i%numIntro2) !=0){
        
        System.out.print(i+" ");
      }
    }
  }
}

