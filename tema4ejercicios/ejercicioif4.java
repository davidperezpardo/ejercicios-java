import java.util.Scanner;

public class ejercicioif4 {
  public static void main (String [] args){
    
    //salario semanal de un trabajador
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduzca el número de horas que ha trabajado usted en la semana: ");
  
  int horas = s.nextInt();
  int sueldo;
    
    if (horas < 40) { sueldo = horas * 12;
    
    }else  { sueldo = 40 * 12 + (horas - 40)*16;
     
    }
    
    System.out.print("su sueldo en esta semana es de:"+ sueldo);
    
  
  
    
  }
}
