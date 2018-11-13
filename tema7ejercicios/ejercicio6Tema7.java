import java.util.Scanner;

public class ejercicio6Tema7 {
	
	public static void main (String args[]) {
    /*muestra un array con los numeros introducidos por teclado,
     * luego el mismo array se muestra pero con los numeros
     * una posicion mas a la derecha.*/
    
    int[] numeros = new int[15];
    System.out.println("INTRODUZCA 15 NÚMEROS DE UNO EN UNO PULSANDO ENTER");
    Scanner s = new Scanner(System.in);
    //bucle para introducir los números en cada posición del array.
    for(int i = 0; i < 15; i++){
      numeros[i]= s.nextInt();
    }
    System.out.println("array con los números introducidos");
    for(int i = 0 ; i < 15 ; i++){
      System.out.printf("|%3d",numeros[i]);
    }
    System.out.println();      //retorno de carro
    System.out.println();      //retorno de carro
    System.out.println("contenido del array,una posición más a la derecha");
    //array para pasar una posicion a la derecha
    
    int auxiliar = numeros[14];  //variable auxiliar con el contenido de la ultima posicion.
    for(int i = 14; i >0; i--){
      numeros[i] = numeros[i-1];
    }
    numeros[0] = auxiliar;       //metemos en la posicion 0 del array,el contenido de la posicion 14.
    for(int i = 0; i<15; i++){
    System.out.printf("|%3d",numeros[i]);
    }
  }
}

