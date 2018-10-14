import java.util.Scanner;

public class ejercicio15Tema4 {
	
	public static void main (String args[]) {
		Scanner s =new Scanner(System.in);
    Scanner caracter =new Scanner(System.in);
    
    /*dibuja una piramide con el vértice mirando hacia arriba,izquierda,derecha
     * o abajo,con el carácter,letra o número deseado*/
    
    System.out.println("PIRÁMIDE");
    System.out.println("1- Vértice mirando hacia el cielo");
    System.out.println("2- Vértice mirando hacia la izquiera");
    System.out.println("3- Vértice mirando hacia la derecha");
    System.out.println("4- Vértice mirando hacia el suelo");
     
    int numero = s.nextInt();
    System.out.println("eliga un carácter especial,letra o número para dibujar la pirámide");
    String o = caracter.nextLine();
    
    switch(numero) {
      case 1 :
        System.out.println("   "+o+"   ");
        System.out.println("  "+o+o+o+"  ");
        System.out.println(" "+o+o+o+o+o+" ");
        System.out.println(o+o+o+o+o+o+o);
      
      break;
      
      case 2 :
        System.out.println("   "+o);
        System.out.println("  "+o+o);
        System.out.println(" "+o+o+o);
        System.out.println(o+o+o+o);
        System.out.println(" "+o+o+o);
        System.out.println("  "+o+o);
        System.out.println("   "+o);
      
      break;
      
      case 3 :
        System.out.println("");
        System.out.println(o+"   ");
        System.out.println(o+o+"  ");
        System.out.println(o+o+o+" ");
        System.out.println(o+o+o+o);
        System.out.println(o+o+o+" ");
        System.out.println(o+o+"  ");
        System.out.println(o+"   ");
        
      break;
      
      case 4 :
        System.out.println(" ");
        System.out.println(o+o+o+o+o+o+o);
        System.out.println(" "+o+o+o+o+o+" ");
        System.out.println("  "+o+o+o+"  ");
        System.out.println("   "+o+"   ");
      
      break;
      default:
    }
    
	}
}

