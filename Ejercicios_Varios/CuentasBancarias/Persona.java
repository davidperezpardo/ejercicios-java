package ejercicioSuelto;

/**
 * 
 * @author David Pérez Pardo
 * Clase Persona
 */
import java.util.ArrayList;

public class Persona {

  private String dni;
  private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
  
  //constructor
  public Persona (String dni) {
    
    this.dni = dni;
  }
  
  
  //metodo para añadir cuentas bancarias
  public void aniadirCuenta (Cuenta c) {
  
      cuentas.add(c);
  
  }
  
  
  //comprueba si hay más de tres cuentas
  public boolean comprueba () {
    
    if(cuentas.size() > 3) {
      
      return true;
    }else {
      
      return false;
    }
    
  }
  
  //comprueba si es moroso (saldo negativo)
  public boolean esMorosa () {
      
    for (int i = 0; i < cuentas.size(); i++) {
      
      if(cuentas.get(i).consultarSaldo() < 0 ) {
        
        return true;
     }
   }
    return false;
    
  }
  
  //obtiene la cuenta de la persona indicando posicion(pos 1 = pos 0)
  public Cuenta obtenerCuenta(int posicion) {
    
    return cuentas.get(posicion-1);
    
  }
  
  
  public String toString () {
    
    
    return "DNI:" + this.dni + "\n";
  }
  
}
