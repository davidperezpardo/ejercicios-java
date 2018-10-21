import java.util.Scanner;

public class ejercicio23Tema5 {
	
	public static void main (String args[]) {
    /*muestra la suma de todos los numeros introducidos,cuantos ha introducido
     * y muestra la media de ellos.El programa finaliza cuando la suma total
     * sobrepasa en 10000.*/
    System.out.println("EL PROGRAMA FINALIZARÁ CUANDO LA SUMA SOBREPASE LOS 10000");
    int sumaIntroducidos = 0;
    int numIntroducido;
    int contadorIntroducidos = 0;
    int media = 0;
    do {
      Scanner s = new Scanner(System.in);
      System.out.println("INTRODUZCA NÚMERO");
      numIntroducido = s.nextInt();
      contadorIntroducidos ++;
      sumaIntroducidos += numIntroducido;
    
    }while (sumaIntroducidos <= 10000);
    
    media += (sumaIntroducidos)/contadorIntroducidos;
    System.out.println("LA SUMA TOTAL DE LOS Nºs INTRODUCIDOS ES : "+sumaIntroducidos);
    System.out.println("HA INTRODUCIDO UN TOTAL DE : "+contadorIntroducidos+" NÚMEROS");
    System.out.println("HIZO UNA MEDIA DE : "+media);
  
  }
}

