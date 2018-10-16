import java.util.Scanner;

public class adivinaNumero {
	
	public static void main (String args[]) {
		//ADIVINA EL NÚMERO
	
    Scanner s = new Scanner(System.in);
    int numIntroducido = 0;
    int adivina = 12;   
      do {System.out.println("ADIVINE EL NÚMERO: introduzca un número entero");
          numIntroducido = s.nextInt(); 
        
          if(numIntroducido != adivina) {
            System.out.println("Nº INTRODUCIDO INCORRECTO");
          
          } if(numIntroducido < adivina ){
              System.out.println("Nº INTRODUCIDO ES MENOR,VUELVA A INTENTARLO!");
            } else if (numIntroducido > adivina) {System.out.println("Nº INTRODUCIDO ES MAYOR,VUELVA A INTENTARLO!");}
          
        
      }while (adivina != numIntroducido);
        
        System.out.println("CORRECTO,HAS ACERTADO!");
       
  
  }
}

