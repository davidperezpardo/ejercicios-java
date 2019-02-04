package ejercicio9;

public class usoTarifa {

  /**
   * Implementa la clase Movil como subclase de Terminal (ejercicio nº 8). Cada
   * móvil lleva asociada una tarifa que puede ser “rata”, “mono” o “bisonte”. El
   * coste por minuto es de 6, 12 y 30 céntimos respectivamente. Se tarifican los
   * segundos exactos. Obviamente, cuando un móvil llama a otro, se le cobra al
   * que llama, no al que recibe la llamada.
   * 
   * @author David Pérez Pardo
   */
  public static void main(String[] args) {

    Movil m1 = new Movil("678 11 22 33", "rata");
    Movil m2 = new Movil("644 74 44 69", "mono");
    Movil m3 = new Movil("622 32 89 09", "bisonte");
    System.out.println(m1);
    System.out.println(m2);
    m1.llama(m2, 320);
    m1.llama(m3, 200);
    m2.llama(m3, 550);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);

  }

}
