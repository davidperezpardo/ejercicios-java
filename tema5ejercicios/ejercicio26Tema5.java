import java.util.Scanner;

public class ejercicio26Tema5 {
	
	public static void main (String args[]) {
		//muestra la posicion de un dígito que elijamos de un número introducido previamente
    
    System.out.println("PARA SABER LA POSICION QUE OCUPA UN DÍGITO EN UN NÚMERO...");
    Scanner s = new Scanner(System.in);
    System.out.println("INTRODUZCA UN NÚMERO");
    int numIntro = s.nextInt();
    System.out.println("INTRODUZCA UN DÍGITO PARA SABER LA POSICIÓN");
    int digito = s.nextInt();
    
    int posicion = 0;
    int numero = numIntro;
    int lugar = 1;
    
    while (numero > 0) {                       //igual que el ej.25---bucle para poner al reves un num.
      posicion = (posicion*10)+(numero%10);    //lo usamos para contar la longitud del número.
      numero /=10;
    }
    while (posicion > 0) {
      if((posicion%10)== digito){
          System.out.println("LA POSICION DEL DÍGITO INTRODUCIDO ES: "+lugar);
      }
      posicion /=10;
      lugar++;
    }
    
  }
}

