import java.util.Scanner;

public class ejercicio6Tema6 {
	
	public static void main (String args[]) {
		/*hay que acertar un número al azar entre 0 y 100(inclusive ambos)el programa le dirá
     *los intentos que le quedan (de 5)en caso de fallar  y si su número es mayor o menor
     * que el de la máquina*/
    
    int numero = (int)(Math.random()*101);
    int oportunidades = 5;
    
    Scanner s = new Scanner(System.in);
    System.out.println("INTRODUZCA NÚMERO");
    int numIntro = s.nextInt();
    
    if(numIntro == numero) {
      System.out.println("CORRECTO,HAS ACERTADO");
    }else {
      do {
        oportunidades--;
        System.out.println("INCORRECTO, LE QUEDAN "+oportunidades+" INTENTOS, VUELVA A INTENTARLO");
        if(numIntro < numero ) { 
          System.out.println("SU NÚMERO ES MENOR ");
        }
        if(numIntro > numero) {
          System.out.println("SU NÚMERO ES MAYOR ");
        }
        System.out.println("INTRODUZCA NÚMERO ");
        numIntro = s.nextInt();
      }while(numIntro != numero && oportunidades > 1);
      if(numIntro == numero) {
       System.out.println("AHORA SÍ,HAS ACERTADO!");
      }
      else {
        System.out.println("LO SIENTO,AGOTÓ LOS INTENTOS");
      }
    }
  }
}

