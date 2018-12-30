import java.util.Scanner;

public class manejoDeArray4_2 {

  public static void main(String[] args) {
    /**
     * variante del ejercicio manejoDeArray4 (las palabras se guardan en array ya
     * ordenadas) 
     * El usuario va introduciendo palabras con un indice dado a cada
     * una, y el programa guarda las palabras en un array, en el orden en el que el
     * usuario especificó en su indice. el usuario introduce el tamaño del
     * array(nº de palabras).
     * el indice debe de estar entre 1 y el tamaño dado al array
     * (nº de palabras) ambos incluidos.
     *
     * @author David perez pardo
     */
    int tamaArray;
    String palabraIntro;
    int indiceIntro;
    boolean indiceValido;
    boolean repetido;
    // para capturar enteros
    Scanner s = new Scanner(System.in);
    // para capturar Strings
    Scanner c = new Scanner(System.in);
    System.out.println("Introduzca el nº de palabras (tamaño del array);");
    tamaArray = s.nextInt();
    // arrays con el tamaño introducido por usuario
    String ordenado[] = new String[tamaArray];
    String palabras[] = new String[tamaArray];
    int indice[] = new int[tamaArray];

    // bucle for para ir rellenando array de palabras y array de enteros(indice)
    for (int i = 0; i < indice.length; i++) {
      System.out.println("Introduzca palabra");
      palabraIntro = c.next();
      palabras[i] = palabraIntro;
      do {
        indiceValido = true;
        repetido = false;
        System.out.println("Introduzca su Indice (entre 1 y " + tamaArray + ",ambos incluidos)");
        indiceIntro = s.nextInt();
        indice[i] = indiceIntro;
        if ((indiceIntro < 1) || (indiceIntro > tamaArray)) {
          indiceValido = false;
          System.out.println("Indice incorrecto,vuelva a intentarlo");
        }
        // bucle for para comprobar si el ultimo indice introducido está repetido
        for (int j = 0; j < i; j++) {
          // si se cumple,el indice introducido está repetido
          if (indice[j] == indiceIntro) {
            repetido = true;
            System.out.println("¡Indice repetido,pruebe con otro!");
          }
        }
      } while (indiceValido == false || repetido == true);
      System.out.println();
    } // bucle for i
    //bucle exterior e interior para ir comparando el array de indices.
    for (int i = 0; i < indice.length; i++) {
    //vamos comparando si coincide i+1 con el valor del array indice
      for (int j = 0; j < indice.length; j++) {
        //comprobamos con i+1 porque el usuario introduce indices a partir del 1.
        //si coinciden,guardamos la palabra en array ordenado,en orden ascendente
        if (indice[j] == i+1) {
          ordenado[i] = palabras[j];
        }
      }
    }
    System.out.print("palabras ordenadas por su indice: ");
    // imprime array de palabras ya ordenadas
    for (int i = 0; i < indice.length; i++) {
      System.out.print(ordenado[i] + ",");
    }

  }

}
