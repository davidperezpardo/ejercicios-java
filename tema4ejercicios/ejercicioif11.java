import java.util.Scanner;

public class ejercicioif11 {
	
	public static void main (String args[]) {
		
		//segundos que faltan para llegar a medianoche
  
  System.out.println("introduzca la hora (formato 24h):");	
	Scanner s =new Scanner(System.in);
  int hora = s.nextInt();
  int h = hora*3600;
  
  
  System.out.println("introduzca los minutos:");
  Scanner t = new Scanner(System.in);
  int minutos = t.nextInt();
  int min = minutos*60;
  
  int segundos = 86400 - (h + min);
  
  System.out.printf("desde las %d:%02d quedan %d  segundos para medianoche",hora,minutos,segundos);
  
  
  
  }
}

