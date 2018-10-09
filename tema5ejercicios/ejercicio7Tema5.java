import java.util.Scanner;

public class ejercicio7Tema5 {

  public static void main (String args[]) {
    //Introducir combinacion de 4 dígitos para abrir caja fuerta
    
    System.out.println("INTRODUZCA LA COMBINACION DE 4 DÍGITOS PARA ABRIR LA CAJA FUERTE");
    Scanner s = new Scanner(System.in);
    int claveIntroducida = s.nextInt();
    int claveCorrecta = 6666;
    int intentos = 4;
    
    if (claveIntroducida == claveCorrecta)  { System.out.println("CLAVE CORRECTA: ABRIENDO CAJA FUERTE...");
    
    }else  { 
      
      while(intentos > 0){ System.out.println("CLAVE ERRÓNEA--TIENE " + intentos + " INTENTOS:");
       
       int reintento = s.nextInt();
       intentos--;
      
      if (intentos == 0) { System.out.println("AGOTADOS LOS INTENTOS...¡CAJA BLOQUEADA!");
      }
      
      }
      
    }
    
  }
}
