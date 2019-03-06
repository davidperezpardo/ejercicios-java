package conversorDePalotes;

public class Palotes {

  /**
   * Convierte Nº entero al sistema de palitos. Ej. 2034 ===> ||--|||-||||
   * 
   * @param p Numero entero
   * @return Devuelve String con los palotes
   */
  public static String parsePalotes(int p) {

    String palo = "";
    int resto = 0;
    int num = p;
    int contaDig = 0;

    // contamos el nº de dígitos para no añadir la última raya
    while (num > 0) {

      resto = num % 10;
      num /= 10;
      contaDig++;
    }

    num = p;
    int cerosDerecha = contaDig;// por si hay ceros a la derecha

    while (num > 0) {

      resto = num % 10;
      // para convertir los ceros a la derecha
      if (resto == 0 && contaDig == cerosDerecha) {

        palo = "-" + palo;
      }
      for (int i = 0; i < resto; i++) {

        palo = "|" + palo;

      }
      // nº de dígitos del num introducido
      contaDig--;
      // raya para separar cada grupo de palotes(obvia la primera)
      if (contaDig > 0) {

        palo = "-" + palo;
      }

      num /= 10;

    }
    return palo;

  }

  /**
   * Convierte a dígitos según la cantidad de palitos que haya. Ej. ||-|||--||||
   * ===> 2304
   * 
   * @param p String con los palotes introducidos
   * @return Devuelve un nº entero
   */
  public static int parseInt(String p) {

    char palo = '|';
    String palitos = "";
    int contaPalitos = 0;
    int contaCeros = 0;
    // recorre String de palitos
    for (int i = 0; i < p.length(); i++) {

      // cuenta los palitos que hay
      if (palo == (p.charAt(i))) {
        contaPalitos++;
        contaCeros = 0;

      }
      // cuando acaba un grupo de palitos,guarda el nº de palitos y va concatenando
      // nºs
      if ((p.charAt(i) == '-') || (i == p.length() - 1)) {

        palitos += contaPalitos;
        contaPalitos = 0;// contador de palitos a 0,
        contaCeros++;// contador de ceros
      }
      // si hay dos '-' seguidos,quiere decir que contiene un 0.
      if (contaCeros > 1) {
        // concatenamos un 0
        palitos = 0 + palitos;
      }
    }

    return Integer.parseInt(palitos);

  }

}
