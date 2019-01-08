
public class ejercicio6Tema7_2 {

  public static void main(String[] args) {
    /**
     * Genera un array-matriz de 6 filas x 10 columnas con nºs enteros positivos que
     * no se repiten. de entre 0 y 1000 (ambos incluidos). Da la posición de valor
     * máximo y del valor mínimo contenido en el array.
     * 
     * @author David pérez pardo.
     */
    int numeros[][] = new int[6][10];
    int max = 0; // al maximo le asignamos 0
    int min = 1001; // al minimo,el numero máximo
    int columnaMax = 0;
    int columnaMin = 0;
    int filaMax = 0;
    int filaMin = 0;
    boolean repetido;

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        // bucle do-while para comprobar si hay algún nº repetido en el array.
        do {
          repetido = false;
          numeros[i][j] = (int) (Math.random() * 1001);

          // rellena en un solo array el array-bidimensional con k = 0 hasta el tamaño
          // total del array que sería = filas * columnas (6x10 = 60)y -1 porque empieza
          // en 0.
          for (int k = 0; k < 10 * i + j; k++) {
            /*
             * va comprobando con divisiones de k entre 10(para comprobar de fila en fila. y
             * luego módulo de k entre 10,que comprueba todas las columnas de la "misma"
             * fila. Ej. 45 / 10 = fila 4, 46/10 = fila 4, y 45%10 = columna 5, 46%10 =
             * columna 6...sucesivamente se va comprobando fila 0 con todas las
             * columnas,fila 1 con todas las columnas...
             */
            if (numeros[i][j] == numeros[k / 10][k % 10]) {
              repetido = true;
            }
          }

        } while (repetido == true);
      }

    }
    for (int i = 0; i < 6; i++) {
      System.out.print("F" + (i + 1));
      for (int j = 0; j < 10; j++) {

        if (numeros[i][j] >= max) { // comprobamos y vamos guardando el valor máximo en cada pasada
          max = numeros[i][j]; // guardamos el valor mas alto en cada pasada
          columnaMax = j; // la columna del maximo
          filaMax = i; // la fila del maximo,para luego especificar sus coordenadas
        }
        if (numeros[i][j] <= min) { // comprobamos y vamos guardando el valor menor
          min = numeros[i][j]; // vamos guardando el valor menor en cada pasada
          columnaMin = j; // las coordenadas del valor menor para luego especificarlas,igual que arriba
          filaMin = i;
        }
        System.out.printf("%4d|", numeros[i][j]);// imprimimos matriz
      }

      System.out.println(); // salto de linea
    }
    // imprimimos los valores mayor y menor de todos,y especificamos sus coordenadas
    System.out.print(
        "El máximo es:" + numeros[filaMax][columnaMax] + " fila:" + (filaMax + 1) + " columna: " + (columnaMax + 1));
    System.out.print(
        "\nEl mínimo es:" + numeros[filaMin][columnaMin] + " fila:" + (filaMin + 1) + " columna: " + (columnaMin + 1));

  }

}
