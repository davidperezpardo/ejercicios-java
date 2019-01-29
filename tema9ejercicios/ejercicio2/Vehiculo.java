package ejercicio2;

public abstract class Vehiculo {
  
  //atributos de clase"static"
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  
  
  //atributo de instancia "sin static"
  private int kilometrosRecorridos;
  
  //constructor sin parámetros "para inicializar atributo"
  public Vehiculo() {
    
    this.kilometrosRecorridos = 0;
    vehiculosCreados++;//Para contar los vehiculos creados
  }
  
  //devuelve el nº de vehiculos creados
  public static int getVehiculosCreados() {
    
    return vehiculosCreados;
    
  }
  
  //getter de clase "Vehiculo"
  public static int getkilometrosTotales() {
    
    return Vehiculo.kilometrosTotales;
  }
  //getter de instancia
  public int getkilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  /**
  * Hace que un vehículo recorra una distancia determinada.
  * <p>
  * Cuando un vehículo recorre una distancia <code>k</code>, se
  * incrementan su propio cuentakilómetros, es decir, su atributo
  * <code>kilometrosRecorridos</code> y también se incrementa la cuenta
  * global de kilómetros que recorren todos los vehículos, es decir, el
  * atributo de clase <code>kilometrosTotales</code>.
  *
  * @param k kilómetros a recorrer
  */
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
  
  

}
