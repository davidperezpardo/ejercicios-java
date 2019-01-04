import matematicas.varias;

public class ejercicio16Tema8 {

  public static void main(String[] args) {
    /**
     * Muestra los nºs capicúas que hay entre 1 y 99999. (usando funcion)
     * 
     * @author David pérez pardo
     */
    System.out.println("nºs capicúas entre 1 y 99999:");
    for (int i = 1; i < 99999; i++) {
      if (varias.esCapicua(i)) {
        System.out.println(i);
      }
    }

  }

}
