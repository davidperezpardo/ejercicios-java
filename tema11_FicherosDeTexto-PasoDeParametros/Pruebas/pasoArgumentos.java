package pruebas;

/**
 * Ejemplo de paso de argumentos mediante línea de comandos.
 * Imprime por consola la suma de todos los numeros pasados
 * como argumentos.
 * 
 * @author David Pérez Pardo
 *
 */
public class pasoArgumentos {

  public static void main(String[] args) {
    
    int suma = 0;
    
    for (int i = 0; i < args.length; i++) {
      
      //Se convierten a enteros,ya que los argumentos son siempre guardados
      //en un array de Strings.
      suma += Integer.parseInt(args[i]);   
    }
    System.out.println("La suma de los argumentos introducidos es:" + suma);
  }

}
