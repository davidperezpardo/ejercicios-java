import java.util.Scanner;

public class numerosPerfectos {

  public static void main(String[] args) {
    /**
     * (nº perfecto) Un número perfecto es un número natural que es igual a la 
     * suma de sus divisores propios positivos
     * (divisor propio)es aquel que "no" es el propio nº al que divide
     * 
     * Muestra los nºs perfectos que hay entre el nº2 y un nº entero 
     * introducido por teclado 
     * @author david perez pardo
     * 
     **/
    Scanner s = new Scanner(System.in);
    System.out.println("--Visualizacion de los nº perfectos--\n");
    System.out.println("Introduzca un numero entero para ver todos los numeros perfectos"
        + " entre el 2 y el elegido:");
    int numero = s.nextInt();
    long suma;
    System.out.print("Nºs perfectos: ");
    //bucle exterior para recorrer todos los nºs hasta el nº introducido
    for (long i = 2; i <= numero; i++) {
      suma = 0;
      //bucle interior para recorrer los nº anteriores al que lleva el bucle exterior
      for (long j = 1; j < i; j++) {
        if (i % j == 0) { //si el resto es igual a 0, y menor que i,es divisor propio
          suma += j;    //entonces se van sumando los divisores

        }
      } 
      //si la suma de divisores propios es = al nº que se esta comprobando,es perfecto.
      if (i == suma) {
        System.out.print(i+","); // lo imprimimos
      }

    }

  }

}
