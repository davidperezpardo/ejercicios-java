package filtraSiete;

public class filtraArray {
  
  
  /**
   * Filtra los números de un array-vector que contienen el 7.
   * 
   * Devuelve un array-vector con los números que NO contienen el 7. El tamaño del
   * array devuelto será igual a la cantidad de nºs que hay, que NO contienen el
   * 7.
   * 
   * @param x Array vector a filtrar
   * @return Array vector con números sin "7".
   */

  public static int[] filtraSin7(int[] x) {

    boolean esta;
    int tamaArray = 0; //para definir el tamaño del array filtrado.
    int resto = 0;
    int aux;
    for (int i = 0; i < x.length; i++) {

      esta = false;
      aux = x[i];

      while (aux != 0) {

        resto = aux % 10;
        if (resto == 7) {

          esta = true;
        }
        aux /= 10;

      }
      //si no hay un 7,se sobre-escribe el propio array empezando por la posicion 0.
      if (esta == false) {
        x[tamaArray] = x[i];
        tamaArray++;
      //a la vez que sobre-escribimos,vamos capturando el tamaño que tendrá el array filtrado.
      }
    }
    // si el tamanio es = 0,será porque todos los numeros del array contienen 7.
    if (tamaArray == 0) {
      // si todos tienen 7,devuelve -1.
      int[] filtrado = { -1 };
      return filtrado;
    } 
    else {
      //el tamaño del array será igual a la cantidad de números que no contienen 7.
      int[] filtrado = new int[tamaArray];

      for (int j = 0; j < filtrado.length; j++) {

        filtrado[j] = x[j];

      }
      return filtrado;
    }

  }
   

}