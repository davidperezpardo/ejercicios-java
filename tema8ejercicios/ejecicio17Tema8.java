import matematicas.varias;
import java.util.Scanner;
public class ejecicio17Tema8 {

  public static void main(String[] args) {
    /**
     * Conversor de binario a decimal.
     * @author David pérez pardo.
     */
    
    Scanner s = new Scanner(System.in);
    System.out.println("Conversor de binario a decimal");
    System.out.print("Introduzca número binario: ");  
    int bin = s.nextInt();
    int decimal = 2;
    int numDecimal = 0;
    int base = 2;
    int longBinario = varias.digitos(bin) -1;//calcula la longitud del nº binario,y le restamos 1.
    int posicion = 0;
    //while se repite hasta que la longitud del nº binario llegue a 0.
    while(longBinario >= 0) {
      //comprobamos en cada pasada si el dígito del nº binario es = 0,y si es,lo obviamos. 
      if( varias.digitoN(bin, posicion) != 0) {
        /*calcula la potencia en base 2 (binario) con exponente = a longitud, y vamos 
         * sumamos cada potencia con la siguiente.*/   
        numDecimal += varias.potencia(base, longBinario);
      }
      posicion ++;//aumentamos 1 en cada pasada,para ir comprobando cada dígito del binario.
      longBinario --;//en cada pasada vamos restando 1 a la longitud del nº binario.
    }
    System.out.println("Número decimal: "+ numDecimal);
  }

}
