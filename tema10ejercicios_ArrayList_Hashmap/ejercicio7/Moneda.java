package ejercicio7;

import java.util.ArrayList;

public class Moneda {

  private static String valores[] = { "1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos","25 céntimos", "50 céntimos", "1 euro",
                             "2 euros" };
  private static String lados[] = { "cara","cruz" };
  private  String valor;
  private String lado;

  public Moneda() {
    //Al instanciar una Moneda,creamos atributos por defecto aleatorios.
    this.valor = valores [(int) (Math.random() * 8)]; //valor de la moneda y tipo.
    this.lado = lados [(int) (Math.random() * 2)];  //lado de la moneda
    
  }
  
  public String getValor() {
    
    return valor;
  }
  
  public String getLado() {
    
    return lado;
  }
 
  public String toString() {
    
    return this.valor + " - " + this.lado;
  }
  
  
    
  
}
