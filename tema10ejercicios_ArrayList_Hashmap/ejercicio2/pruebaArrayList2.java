package ejercicio2;

import java.util.ArrayList;


/**Realiza un programa que introduce valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcula la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también es aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author David Pérez Pardo
 */

public class pruebaArrayList2 {

  public static void main(String[] args) {

    ArrayList<Integer> numeros = new ArrayList<Integer>();
    // aleatorio entre 10-20 para el tamaño del arraylist
    int tamaList = (int) (Math.random() * (20 - 10 + 1) + 10);
    int numAleatorios;
    int suma = 0;
    int maximo = 0;
    int minimo = 100;
    // introduce nºs aleatorios en el arrayList
    for (int i = 0; i < tamaList; i++) {

      numAleatorios = (int) (Math.random() * 100) + 1;
      numeros.add(numAleatorios);
      suma += numeros.get(i); // sumamos todos los numeros de la lista
      // obtenemos el máximo
      if (maximo < numeros.get(i)) {

        maximo = numeros.get(i);
      }
      // obtenemos el mínimo
      if (minimo > numeros.get(i)) {

        minimo = numeros.get(i);
      }

    }

    System.out.println("Lista de nºs: "+ numeros + "\nSuma: " + suma + "\nMedia: " + suma / tamaList + 
        "\n" + "Máximo: " + maximo + "\nMínimo: " + minimo);

    
  }

}
