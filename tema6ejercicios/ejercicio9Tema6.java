
public class ejercicio9Tema6 {
	
	public static void main (String args[]) {
    //muestra los números aleatorios entre 0-100 pares.Finaliza cuando aparece el nº 24.
    int contador = 0;
    int numero = 0;
    while(numero !=24) {
      numero = (int)(Math.random()*51)*2;  //el 2* hace que se generen de dos en dos
      contador++;
      System.out.printf("%d  ",numero);
    }
      System.out.println("\nSE HAN GENERADO "+contador+" NÚMEROS PARES");
  }
}

