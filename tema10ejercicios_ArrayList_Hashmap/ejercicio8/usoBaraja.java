package ejercicio8;

import java.util.ArrayList;

/**
 * Programa que escoge al azar 10 cartas de la baraja española (10 objetos de la
 * clase Carta). Uando ArrayList para almacenarlas sin que se repita ninguna.
 *
 * @author David Pérez Pardo
 *
 */
public class usoBaraja {

  public static void main(String[] args) {

    Carta carta1 = new Carta();
    ArrayList<Carta> baraja = new ArrayList<Carta>();

    carta1 = new Carta();
    baraja.add(carta1);
    for (int i = 0; i < 10; i++) {

      do {

        carta1 = new Carta();
        
      } while (baraja.contains(carta1));

      baraja.add(carta1);

    }

    // para imprimir baraja de cartas
    for (Carta b : baraja) {

      System.out.println(b);
    }

  }

}
