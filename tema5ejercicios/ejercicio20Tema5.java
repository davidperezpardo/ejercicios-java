import java.util.Scanner;

public class ejercicio20Tema5 {
	
	public static void main (String[] args) {
		
    //PIRÁMIDE HUECA
    
    System.out.println("PIRÁMIDE HUECA");
    Scanner s = new Scanner(System.in);
    System.out.println("INTRODUZCA LA ALTURA");
    int altura = s.nextInt();
    Scanner c = new Scanner(System.in);
    System.out.println("INTRODUZCA UN CÁRACTER PARA EL CONTORNO DE LA PIRÁMIDE");
    String caracter = c.next();
    
    int contaSimbolos = 1;
    int contaEspacios = altura-1;
    int espaciosInternos = 0;
    
    for (int i = 1; i <= altura-1; i++) {
      for (int j = 1; j <= contaEspacios; j++) {    //pinta espacios delante
        System.out.print(" ");
      }
        System.out.print(caracter);                  //pinta caracter de la izquierda
        
      for(int j = 1; j < espaciosInternos; j++) {
        System.out.print(" ");                      //pinta espacios internos
      }
      if (espaciosInternos > 0)  {
      System.out.print(caracter);         //el carácter final  a partir de la segunda línea
      }
      contaEspacios--;                      //resta un espacio por cada línea
      espaciosInternos +=2;                 //suma dos espacios por cada línea
      System.out.println();                 //saltos de línea
    }
    for (int i = 1; i <= espaciosInternos+1; i++) {   //bucle para pintar la base
      System.out.print(caracter);
    }
	}
}

