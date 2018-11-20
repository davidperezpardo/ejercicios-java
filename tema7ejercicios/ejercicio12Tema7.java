import java.util.Scanner;
public class ejercicio12Tema7 {
	
	public static void main (String args[]) {
    /*cambia el valor de una posicion del vector elegida por el usuario,por otra elegida
     * despues desplaza una posicion hacia la derecha a los valores,sin alterar
     * los  que hay entre las posiciones seleccionadas por el usuario.*/
    int [] numeros = new int[10];
    Scanner s = new Scanner(System.in);
    for(int i=0; i<10; i++){
      System.out.print("introduzca valor posicion "+i+": ");
      numeros[i] = s.nextInt();
    }
    //muestra indice array inicial
    System.out.print(" \nARRAY INICIAL\n\n");
    System.out.print("índice:");
    for(int i=0; i<10; i++) {
      System.out.printf("%4d|",i);
    }
    //muestra valores array inicial
    System.out.print("\n valor:");
    for(int i=0; i<10; i++) {
      System.out.printf("%4d|",numeros[i]);
    }
    System.out.println();
    int inicio;
    int fin;
    int contador = 0;
    System.out.println("\ncambie el valor de una posición,a otra posición\n");
    do{
      if(contador>0) {
        System.out.println("\nla posición debe estar entre (0-9)"); 
        System.out.println("y la posición inicial debe ser menor que la final,\nvuelva a intentarlo");
      }
      System.out.println("\nintroduzca la posición INICIAL:");
      inicio = s.nextInt();
      System.out.println("\nintroduzca la posición FINAL:");
      fin = s.nextInt();
      contador++;
      //condiciones a cumplir para los valores introducidos
    }while((inicio <0 || inicio>9)  ||  (inicio==fin)  ||  (fin<0 || fin>9)  || (inicio>fin));
    //muestra indice array final
    System.out.print(" \nARRAY FINAL\n\n");
    System.out.print("índice:");
    for(int i=0; i<10; i++) {
      System.out.printf("%4d|",i);
    }
    int auxInicio = numeros[inicio]; //guardamos valor de la posicion (inicio) antes de desplazar el vector.
    for(int i=inicio; i>0; i--) { //desplaza los valores una posicion hacia la derecha(hasta posicion a cambiar).
      numeros[i]=numeros[i-1];
    }
    numeros[0]=numeros[9];        //guarda valor de posicion final en la pos. primera para no perderlo.
    for(int i=9; i>fin; i--) {   
      numeros[i] = numeros[i-1];  //desplaza valores una pos. hacia la derecha,(empezando por la pos.cambiada por usuario).
    }
    numeros[fin] = auxInicio; /*machacamos el valor de la posicion fin,con la de la posicion 
                               *de inicio(guardada antes de de empezar a desplazar)*/
    //muestra valores del array final.
    System.out.print("\n valor:");
    for(int i=0; i<10; i++) {
      System.out.printf("%4d|",numeros[i]);
    }
  }
}

