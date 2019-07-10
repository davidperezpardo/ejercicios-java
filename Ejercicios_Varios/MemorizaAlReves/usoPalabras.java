package ejercicio3;
import java.util.Scanner;

/**
 * Ejercicio 3 control05 - Main - palabras en orden inverso
 * 
 * Memoriza palabras introducidas por teclado hasta que el usuario introduzca un 0.
 * Finalmente muestra las palabras introducidas separadas por coma,con un punto final y
 * en orden invertido en el que han sido introducidas.
 * 
 * @author David Pérez Pardo
 */

public class usoPalabras {

  public static void main(String[] args) {
    
    
    String palabras = "";
    Scanner s = new Scanner(System.in);
    MemoriaPalabras p1 = new MemoriaPalabras("Mis palabras en orden inverso");
    
    
    while(!palabras.equals("0")) {
      
      System.out.println("Introduzca palabra (Pulse 0 para salir):");
      palabras = s.nextLine();
      
      //Método que memoriza las palabras introducidas
      p1.memorizar(palabras);
      System.out.println(p1);
      
    }
    
    p1.invertir();
    System.out.println(p1);
  }
  

}
