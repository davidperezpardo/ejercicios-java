package ejercicio2;

import java.util.HashMap;
import java.util.Map;


/** 
 * 
 * @author David Perez Pardo
 * Clase Agenda
 *
 */
public class Agenda {

  private String nombre; 
  private HashMap<String, Long> contactos = new HashMap<String, Long>();
  
  
  public Agenda (String nombre) {
    
    this.nombre = nombre;
    
  }
  
  
  //comprueba si ya existe el contacto antes de nuevo alta
  public boolean existeContacto(String nom, Long num) {
    
    if(contactos.containsKey(nom)) {
      
      return true;
    }
    return false;
  } 
    
  
  
  //alta de nuevo contacto
  public boolean altaContacto(String nombre,Long numero) {
    
    contactos.put(nombre, numero);
    return true;
  }
  
  
  //eliminar a un contacto de la agenda(comprueba si existe)
  public boolean darBaja (String nombre) {
    
    if(contactos.containsKey(nombre)) {
      
      contactos.remove(nombre);
      return true;
      
    }else {
      
      return false;
    } 
  }
  
  
  //consulta telefono a partir del nombre (si no existe, devuelve -1)
  public String consultaTelefono(String nombre) {
    
    String resul;
    if(contactos.get(nombre) != null) {
      
      return resul = String.valueOf(contactos.get(nombre));
    }else {
      
      return resul = "-1";
    }
  }
  
  
  
  //método toString para mostrar contactos y teléfonos de la agenda
  @Override
  public String toString () {
    
    String lista = "";
    for (Map.Entry listado : contactos.entrySet()) {
      
      lista +="===================\nNombre:" + listado.getKey() + 
               "\nTeléfono:" + listado.getValue() + "\n===================\n";
    }
    return lista;
  }
  
  
}
