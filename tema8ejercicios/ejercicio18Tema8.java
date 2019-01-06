import java.util.Scanner;

import matematicas.varias;

public class ejercicio18Tema8 {

  public static void main(String[] args) {
    /**
     * Conversor de decimal a binario.
     * 
     * @author David pérez pardo.
     */

    int numDecimal;
    Scanner s = new Scanner(System.in);
    System.out.println("Conversor de nº entero (en base 10) a binario");
    System.out.print("Introduzca número: ");
    numDecimal = s.nextInt();

    System.out.println("En binario: " + decimalAbinario(numDecimal));

  }

  public static long decimalAbinario(int decimal) {

    /**
     * convierte decimal a binario.
     * 
     * @param decimal nº entero (en base 10) a convertir.
     * @return binario nº convertido en binario.
     * @author David pérez pardo
     */

    long binario = 1;
    binario = varias.pegaPorDetras(binario, decimal % 2);
    while (decimal > 1) {
      decimal /= 2;
      binario = varias.pegaPorDetras(binario, decimal % 2);

    }
    binario = varias.voltea(binario);
    binario = varias.quitaPorDetras(binario, 1);
    return binario;
  }

}
