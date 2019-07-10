package ejercicio3Opcion1;


public class Persona {
 
  private String nombre;
  private String dni;
  
  
  public Persona (String n,String dni) {
    
    this.dni = dni;
    this.nombre = n;
  }
  
  
  public String getNombre() {
    
    return this.nombre;
  }
  

  
  public String toString() {
    
    return "Nombre: " + this.nombre + " DNI:\n" + this.dni;
    
  }
}
