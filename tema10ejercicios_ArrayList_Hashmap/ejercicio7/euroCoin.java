package ejercicio7;

import java.util.ArrayList;

/**
 * Ejercicio n º 7 - ArrayList
 * 
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un
 * botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara
 * o cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
 * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
 * la clase Moneda y la secuencia se debe ir almacenando en una lista. 
 * Ejemplo:
 * 2 céntimos – cara 
 * 2 céntimos – cruz 
 * 50 céntimos – cruz 
 * 1 euro – cruz 
 * 1 euro – cara
 *  10 céntimos – cara
 * 
 * @author David Pérez Pardo
 * 
 */
public class euroCoin {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    ArrayList<Moneda> secuencia = new ArrayList<Moneda>();
    int cantidad = 6;
    Moneda m = new Moneda();
    secuencia.add(m);
    String ultimoValor = m.getValor();
    String ultimoLado = m.getLado();

    for (int i = 0; i < 6; i++) {

      do {
        // se instancia una Moneda con los atributos por defecto que son aleatorios (valor y lado)
        m = new Moneda();
        // se repite bucle si el valor "y" cara de la ultima moneda no coincide con la anterior.
        // si alguno de los dos no se cumple,el bucle acaba y comienza la secuencia de las Monedas.
      } while ((!m.getValor().equals(ultimoValor)) && (!m.getLado().equals(ultimoLado)));
      //Guardamos la Moneda en el ArrayList.
      secuencia.add(m);
      // guardamos el valor y lado de la ultima Moneda
      ultimoValor = m.getValor();
      ultimoLado = m.getLado();

    }
    // muestra por pantalla la secuencia de monedas (ArrayList)
    for (Moneda s : secuencia) {
      System.out.println(s);
    }

  }

}
