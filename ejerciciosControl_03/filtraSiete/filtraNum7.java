package filtraSiete;

/**
 * Filtra los números de un array-vector
 * que no contienen sietes,y los guarda en otro array
 * con el mismo tamaño que la cantidad de nºs sin sietes.
 * 
 * @author David Pérez Pardo
 *
 */
public class filtraNum7 {

  public static void main(String[] args) {

    int[] array = new int[20];

    for (int i = 0; i < array.length; i++) {

      array[i] = (int) (Math.random() * 1001); // array inicial con nºs aleatorios
      System.out.print(array[i] + " ");

    }
    // función que filtra los nºs que contienen 7 dentro de un array.
    int[] filtro7 = filtraArray.filtraSin7(array);
    System.out.println();
    for (int i = 0; i < filtro7.length; i++) {

      System.out.print("[ " + filtro7[i] + " ]");
    }

  }
}