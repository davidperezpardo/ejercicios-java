package ejercicio9;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Ejercicio anterior nº 8 Modificado.
 * 
 * Baraja (española) de 10 cartas al azar.
 * 
 * Incluye además ordenación de la baraja por palos,y en caso de repetirse los palos,ordena por numero
 * de carta.
 * @author David Pérez Pardo
 *
 */
public class barajaOrdenada {

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
    
   //para ordenar la baraja
   Collections.sort(baraja);
    // para imprimir baraja de cartas
    for (Carta b : baraja) {
      
      System.out.println(b);
    }

  }

}
