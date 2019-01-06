package matematicas;

/**
 * funciones variadas para jugar con los números. corresponde a los ejercicios
 * 1-14 (tema 8 de funciones).
 * 
 * @author david perez pardo
 *
 */
public class varias {

  /**
   * para saber si un nº es primo o no.
   * 
   * @param x Numero que queremos saber si es primo o no.
   * @return devuelve falso si no es primo,true si es primo.
   */
  public static boolean esPrimo(int x) {
    if (x < 2) {
      return false;
    } else {
      for (int i = 2; i <= x / 2; i++) {
        if ((x % i) == 0) {
          return false;

        }
      }
    }
    return true;
  }
  
  

  /**
   * Invierte un numero (al reves).
   * 
   * @param x numero que queremos invertir
   * @return devuelve el numero al revés
   */
  public static int voltea(int x) {
    int resto = 0;
    int volteado = 0;
    while (x != 0) {

      resto = x % 10;
      volteado = (volteado * 10) + resto;
      x /= 10;
    }
    return volteado;
  }
  
  

  /**
   * Invierte un numero (al reves).
   * 
   * @param x numero que queremos invertir
   * @return devuelve el numero al revés
   */
  public static long voltea(long x) {
    long resto ;
    long volteado = 0;
    while (x != 0) {

      resto = x % 10;
      volteado = (volteado * 10) + resto;
      x /= 10;
    }
    return volteado;
  }
  
  

  /**
   * funcion hecha con la funcion"voltea"
   * 
   * para saber si un nº es capicua o no.
   * 
   * @param x el numero que queremos saber si es capicua
   * @return devuelve true si es capicua y false si no lo es
   */
  public static boolean esCapicua(int x) {
    if (voltea(x) == x) {
      return true;
    }
    return false;
  }
  
  

  /**
   * Devuelve el siguiente numero primo, al numero pasado como parámetro
   * 
   * @param x el numero al que queremos averiguar su siguiente primo
   * @return devuelve el numero primo siguiente
   */
  public static long siguientePrimo(int x) {
    while (esPrimo(++x) == false) {

    }
    return x;
  }
  
  

  /**
   * Devuelve el resultado de una potencia.
   * 
   * @param base      int, base de la potencia
   * @param exponente int ,exponente de la potencia
   * @return resultado de elevar la base a la potencia indicada
   */
  public static double potencia(int base, int exponente) {

    if (exponente == 0) {
      return 1;
    } else if (exponente < 0) {
      return potencia(base, exponente + 1) / base;
    } else {
      return base * potencia(base, exponente - 1);
    }
  }
  
  

  /**
   * cuenta el nº de digitos de un nº entero.
   * 
   * @param x long,el numero al que contamos los digitos
   * @return devuelve el nº de digitos
   */
  public static int digitos(long x) {
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    } else {
      int contador = 0;
      while (x > 0) {
        x /= 10;
        contador++;
      }
      return contador;
    }

  }
  
  

  /**
   * Muestra el numero de la posicion elegida, se cuenta de izquierda a derecha
   * empezando el primer dígito en la posicion 0. se voltea el nº primero,para
   * poder contar de izquierda a derecha la posición.
   * 
   * @param x numero entero
   * @param d posicion dentro del numero
   * @return devuelve el dígito de la posición
   */
  public static int digitoN(int x, int d) {

    if (digitos(x) < d) {// si introducimos una posición mas alta del nº de dígitos
      return -1;
    }

    x = voltea(x);
    while (d-- > 0) {
      x /= 10;

    }

    return (int) x % 10;
  }
  
  

  /**
   * Nos devuelve la posición de un dígito dentro de un nº entero. si no se
   * encuentra,devuelve -1. Utilizamos dos funciones del mismo paquete.
   * 
   * @param n   numero en el que vamos a buscar la posicion del número.
   * @param pos int,dígito del que queremos saber su posición.
   * @return devuelve la posicion del dígito,y si no está en el número devolverá
   *         -1.
   */
  public static int posicionDeDigito(int n, int pos) {
    boolean encontrado = false;
    long digitos = digitos(n); // guardamos el nº de dígitos que tiene el nº
    // bucle for para recorrer el número,si lo encuentra,se sale del bucle for
    for (int i = 0; i < digitos && !encontrado; i++) {
      if (digitoN(n, i) == pos) { // si está el dígito,retorna la posición
        encontrado = true;
        return i;
      }
    }
    // si no está el dígito,retorna -1
    return -1;
  }
  
  

  /**
   * Quita n dígitos por detrás a un número entero (derecha a izquiera).
   * 
   * @param n     número al que le queremos quitar dígitos.
   * @param quita el nº de dígitos que queremos quitar.
   * @return el número con los dígitos quitados.
   */
  public static int quitaPorDetras(int n, int quita) {
    for (int i = 0; i < quita; i++) {
      n /= 10;

    }
    return n;

  }
  
  
  
  /**
   * Quita n dígitos por detrás a un número entero (derecha a izquiera).
   * 
   * @param n     número al que le queremos quitar dígitos.
   * @param quita el nº de dígitos que queremos quitar.
   * @return el número con los dígitos quitados.
   */
  public static long quitaPorDetras(long n, int quita) {
    for (int i = 0; i < quita; i++) {
      n /= 10;

    }
    return n;

  }
  
  

  /**
   * Quita n dígitos por delante (de izquierda a derecha) "utilizando dos
   * funciones del mismo paquete".
   * 
   * @param n     El número al que le quitaremos los dígitos.
   * @param quita el nº de dígitos a quitar.
   * @return devuelve el nº con los dígitos quitados.
   */
  public static int quitaPorDelante(int n, int quita) {
    n = pegaPorDetras(n, 1); // pegamos un 1,por si "n" acabase en 0,para no perderlo.
    n = voltea(n);
    n = quitaPorDetras(n, quita);
    n = voltea(n);
    n = quitaPorDetras(n, 1);
    return n;
  }
  
  

  /**
   * Pega a un número entero dígitos por detrás (por la derecha).
   * 
   * @param n     Número entero al que le queremos pegar dígito/s.
   * @param pegar Lo/s dígito/s que le queremos pegar.
   * @return devuelve nº entero con los dígitos "pegados".
   */
  public static int pegaPorDetras(int n, int pega) {

    String cadenaNum = Integer.toString(n) + pega;
    return Integer.parseInt(cadenaNum);
  }
  
  

  /**
   * Pega a un número entero dígitos por detrás (por la derecha).
   * 
   * @param n     Número entero al que le queremos pegar dígito/s.
   * @param pegar Lo/s dígito/s que le queremos pegar.
   * @return devuelve nº entero con los dígitos "pegados".
   */
  public static long pegaPorDetras(long n, int pega) {

    String cadenaNum = Long.toString(n) + pega;
    return Long.parseLong(cadenaNum);
  }
  
  

  /**
   * Pega a un número entero dígitos por delante (por la izquierda).
   * 
   * @param n    Número entero al que le queremos pegars lo/s dígito/s.
   * @param pega lo/s Dígito/s que le queremos pegar.
   * @return Devuelve nº entero con los dígitos pegados.
   */
  public static int pegaPorDelante(int n, int pega) {

    String cadenaNum = pega + Integer.toString(n);
    return Integer.parseInt(cadenaNum);

  }
  
  

  /**
   * Pega a un número entero dígitos por delante (por la izquierda).
   * 
   * @param n    Número entero al que le queremos pegar lo/s dígito/s.
   * @param pega lo/s Dígito/s que le queremos pegar.
   * @return Devuelve nº entero con los dígitos pegados.
   */
  public static long pegaPorDelante(long n, int pega) {

    String cadenaNum = pega + Long.toString(n);
    return Long.parseLong(cadenaNum);

  }
  
  

  /**
   * Devuelve el trozo de un nº entero dada una posición inicial y final.
   * 
   * @param n      El número entero al que le queremos sacar el "trozo".
   * @param inicio posición inicial del "trozo".
   * @param fin    posición final del "trozo".
   * @return Devuelve nº entero con el trozo especificado.
   */
  public static int trozosDeNumero(int n, int inicio, int fin) {
    String num = Integer.toString(n);
    String caracteres = "";
    for (int j = inicio; j <= fin; j++) {
      caracteres += num.charAt(j);
    }
    return Integer.parseInt(caracteres);
  }
  
  

  /**
   * Pega dos nºs enteros para formar uno.
   * 
   * @param num  Primer número.
   * @param num2 Segundo número.
   * @return Devuelve ambos nºs pegados "long".
   */
  public static long juntaNumeros(int num, int num2) {

    String cadenaNum = Integer.toString(num) + Integer.toString(num2);
    return Long.parseLong(cadenaNum);
  }
}
