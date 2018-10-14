import java.util.Scanner;

public class ejercicio21Tema5 {
	
	public static void main (String args[]) {
		/*se van introduciendo números positivos enteros("para detener el programa y
     * mostrar los resultados introduce un negativo") y nos dice cuantos números 
     * hemos introducido,la media de los números impares y el número par mayor*/
    
    int numIntroducido =0;
    int sumaIntroducidos =0;
    int sumaImpares =0;
    int totalImpares =0;
    int mayorPar = 0;
    do {
      Scanner s = new Scanner(System.in);
      System.out.println("INTRODUZCA NÚMERO");
      numIntroducido = s.nextInt(); 
      
      if(numIntroducido >=0){
        sumaIntroducidos ++;
        
        if((numIntroducido % 2)==1) {
          sumaImpares +=numIntroducido;
          totalImpares++;
        }else if (numIntroducido > mayorPar){
          
            mayorPar = numIntroducido;
          }
      }
    
    } while(numIntroducido >=0);
    
    System.out.println("HA INTRODUCIDO "+sumaIntroducidos+" NÚMEROS");
    System.out.println("LA MEDIA DE LOS NÚMEROS IMPARES ES "+ sumaImpares/totalImpares);
    System.out.println("EL MAYOR DE LOS NÚMEROS PARES ES : "+mayorPar);
  }
}

