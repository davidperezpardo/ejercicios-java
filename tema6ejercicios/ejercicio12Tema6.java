public class ejercicio12Tema6 {
	
	public static void main (String args[]) {
    //muestra los caracteres ASCII entre 32-126 al azar(estilo matrix)
    
    for(int i = 1; i<=1000000; i++) {
      char matrix = (char)(Math.random()*(126-32+1)+32);  //convierte a char(codigo ascii)
      System.out.print("\033[32m"+matrix);  //codigo color verde
    }
  }
}

