
public class ejercicio22Tema5 {
	
	public static void main (String args[]) {
		//muestra todos los números primos entre 2 y 100
    
    boolean esPrimo;
    int contadorPrimos =0;
    
    for (int i = 2; i<=100; i++){
      esPrimo = true;
      for(int j=2; (j<i) && esPrimo; j++ ) {
          if ((i%j)==0) {
          esPrimo = false;
          
          }
      }
      if (esPrimo)  {
        System.out.println (i);
        contadorPrimos++;
      }
    }
    System.out.println ("HAY "+contadorPrimos+" NÚMEROS PRIMOS ENTRE 2 Y 100 ");
  }
}

