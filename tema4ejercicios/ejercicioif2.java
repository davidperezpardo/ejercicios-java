import java.util.Scanner;

public class ejercicioif2 {
  
  public static void main (String [] args ){
		
		//saludos segun la hora del dia
    
    Scanner s = new Scanner (System.in);
    
    System.out.println("INTRODUZCA LA HORA (sin minutos)");
    
    int hora =s.nextInt();
    
    if ((hora >=6) && ( hora <=12))  {System.out.println("BUENOS DIAS!");
       
    }
    
    if ((hora >=13) && (hora <=20)) { System.out.println("BUENAS TARDES CABALLERO!");
      
    }
    
    if (((hora >=21) && (hora <=23)) || ((hora <=5) && (hora >=0))) { System.out.print("BUENAS NOCHES");
        
    }
    
    if ((hora >=24) || (hora <0)) { System.out.println("el formato de hora introducido no es válido");
      
    }
      
      
 
 }

}

