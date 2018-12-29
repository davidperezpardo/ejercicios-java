import java.util.Scanner;

public class manejoDeArray4 {

  public static void main(String[] args) {
    /**
     * programa que permite introducir palabras y asignarle un valor (entero),
     * haciendo uso de dos arrays.El usuario introduce primero el tamaño del array
     * (nº de palabras que quiere almacenar),y despues va introduciendo palabra por 
     * palabra y asignándole un índice.
     * Al acabar,el programa imprime las palabras almacenadas en el orden asignado
     * por el usuario(índice).
     * No se permite la repetición de índices.
     * @author David pérez pardo
     * 
     */
    int tamaArray;
    int indicePalabra;
    boolean seSale;
    boolean repetido;
    Scanner s = new Scanner(System.in); //para nºs enteros
    Scanner p = new Scanner(System.in); //para strings
    System.out.println("PALABRAS EN ORDEN");
    System.out.println("Introduzca el nº de palabras que quiere almacenar (tamaño array): ");
    tamaArray = s.nextInt();
    int contador = 1;
    int ordenPalabras[] = new int[tamaArray];
    String palabras[] = new String[tamaArray];
    for (int i = 0; i < tamaArray; i++) {
      System.out.print("Introduzca palabra:");
      palabras[i] = p.next();
      System.out.print("Introduzca un nº entero para asignarle un Indice (entre 1 y " + tamaArray+")");
      /**
       * bucles para comprobar que no se introduce un nº que ya está en el array y que
       * el nº introducido está entre 0 y el tamaño del array.
       */
      do {
        
        do {
          seSale = false;
          indicePalabra = s.nextInt();
          if ((indicePalabra < 1) || (indicePalabra > tamaArray)) {
            seSale = true;
            System.out.println("Indice incorrecto ,vuelva a intentarlo");
          }

        } while (seSale == true);
        ordenPalabras[i] = indicePalabra;
        repetido = false;
        for (int j = 0; j < i; j++) {
          if (indicePalabra == ordenPalabras[j]) {
            repetido = true;
            System.out.println("Indice repetido,vuelva a intentarlo");
          }

        }
      } while (repetido == true);

    }
    //imprimimos los datos introducidos por usuario(palabras junto a los valores dados)
    for (int i = 0; i < tamaArray; i++) {
      System.out.print(palabras[i] + " " + ordenPalabras[i] + " |");
    }
    /**bucle exterior e interior,con el interior vamos comprobando
      *todos los valores del array tantas veces como tamaño del (array-1),
      *y buscamos primero el valor mas bajo (1) y cuando lo encuentre,imprimimos
      *la palabra, que coincidira con el valor (1) dado en el array de enteros*/
    for (int i = 0; i < tamaArray; i++) {
      for (int j = 0; j < tamaArray; j++) {
        if(ordenPalabras[j] == contador) {
        //a "contador" le asignamos el valor mas bajo dado a una palabra (1).
          System.out.print(palabras[j]+","); //cuando coincida,se imprime palabra
          contador++; //contador suma +1,para buscar el siguiente valor(2),y asi sucesivamente.
        }               
      }     
    }
    
  }

}
