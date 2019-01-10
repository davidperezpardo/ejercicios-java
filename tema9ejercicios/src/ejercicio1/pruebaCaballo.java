package ejercicio1;

/**
 * Para probar la clase Caballo.
 * @author David pérez pardo
 *
 */
public class pruebaCaballo {

  public static void main(String[] args) {
    
    Caballo roci = new Caballo("rocinante","española","marrón",7,34);
    Caballo salta = new Caballo("saltador","árabe","negro",12,21);
    System.out.println("Ficha de los caballos:\n");
    System.out.println("caballo 1\n");
    System.out.println(roci);
    System.out.println("\ncaballo 2\n"
        + "");
    System.out.println(salta);
    System.out.println();
    
    roci.cabalga();
    salta.relincha();
    System.out.println();
    salta.rumia();
  }

}
