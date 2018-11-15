import java.util.Scanner;
public class ejercicio7Tema7 {
	
	public static void main (String args[]) {
		/*muestra un array aleatorio y permite sustituir un valor 
     * del array por otro deseado introducido por teclado*/
    int[] numeros = new int[100];
    
    for(int i=0; i<100; i++){     //bucle para introducir los valores aleatorios en el array
      numeros[i] = (int)(Math.random()*21);
      System.out.printf("%2d  ",numeros[i]);
    }
    Scanner s = new Scanner(System.in);
    System.out.println("introduzca un valor de la lista de arriba");
    int valorIntro1 = s.nextInt();
    System.out.println("introduzca el valor por el que quiere sustituirlo");
    int valorIntro2 = s.nextInt();
    System.out.println();
    for(int i=0; i<100; i++){     //bucle para mostrar el array con los valores aleatorios anteriores
      if(numeros[i]==valorIntro1){
        numeros[i] = valorIntro2;
        System.out.printf("[%2d]",numeros[i]);
      } else { 
        System.out.printf(" %2d ",numeros[i]);
      } 
    }
  }
}

