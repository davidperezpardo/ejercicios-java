import java.util.Scanner;

public class ejercicioif1 {
  public static void main (String[] args) {
		
		//asignatura que toca según dia de la semana.
    
    Scanner s = new Scanner (System.in);
    
    
    System.out.print("introduzca el dia de la semana \ny le diré que asignatura le toca a primera hora: ");
    String dia;
    dia =s.nextLine();
    
    
    switch (dia) { 
      
      case "lunes":
         
         System.out.println("fol");
        
        break;
      
      case "martes":
        System.out.println("programacion");
        break;
      
      case "miercoles":
        System.out.println("entornos de desarrollo");
        break;
      
      case "jueves":
        System.out.println("lenguajes de marca");
        break;
      
      case "viernes":
        System.out.println("sistemas informaticos");
        break;
      
      default:
        
        
        
        
        System.out.println("ese día no hay clase");
      
    }
    
      
  }
      
      
      
      
    
}




