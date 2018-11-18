import java.util.Scanner;

public class ejercicio11Tema7 {
	
	public static void main (String args[]) {
    /*array de 10 posiciones,el usuario introduce el valor de cada posición
     * el programa imprime por pantalla el array introducido por el usuario
     * despues halla los nº primos y los recoloca empezando por la izquierda,
     * del array,despues los nºs no primos,y por último imprime el array final*/
    
    Scanner s = new Scanner(System.in);
    int [] numeros  = new int[10];
    boolean esprimo;
    System.out.println("debe indicar  diez números enteros\n\n");
    for(int i=0; i<10; i++){  //pide los nºs al usuario
      System.out.println("introduzca número :\n");
      numeros[i] = s.nextInt();
    }
    System.out.print("\nARRAY INICIAL:\n");
    System.out.println();
    System.out.print("indice:");
    
    for(int i=0; i<10; i++){  //indice del array 
      System.out.printf("%4d|",i);
    }
    System.out.print("\n valor:");
    for(int i=0; i<10; i++){    //array introducido por el usuario
      System.out.printf("%4d|",numeros[i]);
    }
    System.out.println("\n\n");
    /*se declaran e inicializan array para los primos,y no primos,
     * y una variable para cada índice de los arrays*/
    int [] primos = new int[10];
    int [] noPrimos = new int[10];
    int numPrimos = 0;
    int numNoPrimos = 0;
    for(int i=0; i<10; i++) {   //bucle para encontrar los nºs primos.
      esprimo = true;           //antes del bucle para que en cada pasada sea true.
      for(int j=2; j<numeros[i] && esprimo; j++) {  
        if(numeros[i]%j == 0) {  //no es primo.
          esprimo = false;
        }
      }
      if(esprimo){    //si es primo...
        primos[numPrimos] = numeros[i]; //se guardan los primos en el otro array.
        numPrimos++;  //contador para el índice del array.
      }
      else {    //si no es primo...
        noPrimos[numNoPrimos] = numeros[i];  //se guardan los no primos en  el otro array.
        numNoPrimos++;    //contador para el índice  del array.
      }
    }
    //pasamos primos al array original
    for(int i=0; i<numPrimos; i++) {
      numeros[i] = primos[i];
    }
    //pasamos los no primos al array original
    for(int i=0; i<numNoPrimos; i++) {
      numeros[numPrimos+i] = noPrimos[i];
    }
    //se imprime el array final con los cambios realizados de los nºs primos y no primos
    System.out.print("ARRAY FINAL:\n(nºs primos recolocados empezando por el principio,seguidamente los no primos)");
    System.out.print("\n\n");
    System.out.print("índice:");
    for(int i=0; i<10; i++) {
      System.out.printf("%4d|",i);
    }
    System.out.print("\n valor:");
    for(int i=0; i<10; i++) {
      System.out.printf("%4d|",numeros[i]);
    }
  }
}

