import matematicas.varias;
public class ejercicio15Tema8 {

  public static void main(String[] args) {
    /**
     * Muestra los nºs primos que hay entre 1 y 1000 (usando funcion)
     * @author David pérez pardo
     */
    System.out.println("Muestra los nºs primos entre 1 y 1000:");
    System.out.println();
    for (int i = 0; i <= 1000; i++) {
      if(varias.esPrimo(i)) {
        System.out.print(i+",");
      }
    }
    
  }

}
