package ejercicio3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Clase MemoriaPalabras
 * 
 * @author David Pérez Pardo
 *
 */

public class MemoriaPalabras {

  
  private String nombre;
  private ArrayList<String> memoria;
  
  //Constructor
  public MemoriaPalabras (String nombre) {
    
    this.nombre = nombre;
    this.memoria = new ArrayList<String>();
    
  }
  
  
  //Método para memorizar palabras
  public void memorizar (String palabra) {
    
    if(!palabra.equals("0")) {
      
      this.memoria.add(palabra);
      
    }
    
  }
  
  //Método para invertir el orden de las palabras.
  public void invertir () {
    
    Collections.reverse(this.memoria);
      
    
  }
  
  //Método toString
  public String toString () {
    
    String palabras = "";
    
    for (String m : this.memoria) {
      

      palabras += m + ",";
      
    }
    //Para aniadir el punto final
    palabras = palabras.substring(0, palabras.length()-1) + ".";
    return palabras;
    
  }
}
