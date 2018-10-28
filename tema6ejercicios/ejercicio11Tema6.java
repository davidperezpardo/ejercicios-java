
public class ejercicio11Tema6 {
	
	public static void main (String args[]) {
    //muestra 20 notas al azar:suspenso,bien,notable...y el nº de veces que aparece cada uno.
    
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    for(int i = 1; i<=20; i++) {
      int notas = (int)(Math.random()*5);
      switch(notas){
        case 0:
          System.out.println("suspenso");
          suspenso++;
        break;
        
        case 1:
          System.out.println("suficiente");
          suficiente++;
        break;
        
        case 2:
          System.out.println("bien");
          bien++;
        break;
        
        case 3:
          System.out.println("notable");
          notable++;
        break;
        
        case 4:
          System.out.println("sobresaliente");
          sobresaliente++;
        break;
        
        default:
       
      }
    }
    System.out.println("hay "+suspenso+" suspensos");
    System.out.println("hay "+suficiente+" suficientes");
    System.out.println("hay "+bien+" bien");
    System.out.println("hay "+notable+" notables");
    System.out.println("hay "+sobresaliente+" sobresalientes");
  }
}

