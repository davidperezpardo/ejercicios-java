import java.util.Scanner;

public class ejercicio19Tema5 {
	
	public static void main (String args[]) {
		
    //dibuja pirámide seleccionando los espacios y el carácter deseado para dibujarla
    
    System.out.println("INTRODUZCA LA ALTURA DE LA PIRAMIDE");
    Scanner s = new Scanner(System.in);
    Scanner c = new Scanner(System.in);
    int altura = s.nextInt();
    
    
    System.out.println("INTRODUZCA UN CARACTER PARA DIBUJAR LA PIRAMIDE");
    String simbolo = c.next();
    
    //bucle para dibujar cada linea
    
    int contadorEspacios = altura - 1;
    int contadorSimbolos = 1;
    for (int i = 1; i<=altura; i++) {
     
     //bucle para pintar espacios en blanco
     
     for (int j=1; j<= contadorEspacios; j++)  {
       System.out.print(" ");
     } 
      //bucle para los caracteres de la piramide
      
      for (int j=1; j<=contadorSimbolos; j++) {
        System.out.print(simbolo);
      
      }
      
      System.out.println(" ");
      contadorEspacios--;
      contadorSimbolos+=2;
    }
  }
}

