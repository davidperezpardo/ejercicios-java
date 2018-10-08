import java.util.Scanner;

public class ejercicioif3 {
  public static void main (String [] args) {
		
		//dia de la semana
  
  System.out.println("introduce el dia de la semana (nº)");
  Scanner s = new Scanner(System.in);
  
  int dia = s.nextInt();
  

    switch(dia) {
    
    case 1 :
    System.out.println("LUNES");

    break;
    
    case 2 :
    System.out.println("MARTES");
    break;
    
    case 3 :
    System.out.println("MIÉRCOLES");
    break;
    
    case 4 :
    System.out.println("JUEVES");
    break;
    
    case 5 :
    System.out.println("VIERNES");
    break;
    
    case 6 :
    System.out.println("SÁBADO");
    break;
    
    case 7 :
    System.out.println("DOMINGO");
    break;
    
    default :
    System.out.print("LA SEMANA TIENE 7 DIAS,introduzca número del 1 al 7");
  
    }
    
    
    



  }
  
}
