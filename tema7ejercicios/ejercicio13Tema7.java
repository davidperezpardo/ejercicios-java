import java.util.Scanner;

public class ejercicio13Tema7 {
	
	public static void main (String args[]) {
    /*muestra un array con 100 nºs aleatorios(entre 0-500 ambos incluidos),
     * y el usuario puede elegir entre destacar
     * el número mayor o el menor según desee.*/
    
    int[] numeros = new int[100];
    int max = numeros[0];
    int min = numeros[0];
    min = 501;      //en el min. aplicamos el valor maximo que puede contener un valor del array
    for(int i=0; i<100; i++) {
      numeros[i] = (int)(Math.random()*501);
      if(max < numeros[i]) {  //se compara, si es mayor,se guarda en max
        max = numeros[i];
      }
      if(min > numeros[i]) { //se compara,si es menor,se guarda en min.
        min = numeros[i];
      }
    System.out.printf(" %3d ",numeros[i]);
    }
    Scanner s = new Scanner(System.in);
    String respuesta = "";
    System.out.println("\n\n¿quiere destacar el máximo o el mínimo?");
    System.out.println("\n  MAX o MIN  (pulse enter)");
    respuesta = s.next();
    for(int i=0; i<100; i++) {
      if((numeros[i] == max) && (respuesta.equals("max"))){
        System.out.printf("**%3d**",max); //imprime **** en  el maximo.
      }
      else if((numeros[i] == min)  && (respuesta.equals("min"))){
        System.out.printf("**%3d**",min); //imprime *** en  el minimo.
      }
      else {
        System.out.printf(" %3d ",numeros[i]); //imprime el array completo.
      }
    }
  }
}

