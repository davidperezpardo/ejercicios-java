package ejercicio2;

import java.util.Scanner;

/**
 * Crea la clase Vehiculo , así como las clases Bicicleta y Coche
 * como subclases de la primera. Para la clase Vehiculo , crea los
 * atributos de clase vehiculosCreados y kilometrosTotales , así como
 * el atributo de instancia kilometrosRecorridos . Crea también algún
 * método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú.
 * 
 * @author David Pérez Pardo
 *
 */

public class pruebaVehiculos {

  public static void main(String[] args) {

    
    Coche citroenC3 = new Coche();
    Bicicleta conorSpeed = new Bicicleta();
    //nº de vehiculos creados
    System.out.println("== Se crearon "+Vehiculo.getVehiculosCreados()+" Vehiculos ==");
    int opcion = 0;
   
    Scanner s = new Scanner(System.in);
    
    while(opcion !=8) { 
      System.out.println();
      System.out.println("        VEHÍCULOS");
      System.out.println("        =========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7  Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elija una opción (1-8):");
      System.out.println();
      opcion = s.nextInt();
      int km = 0;
    
   
      
    
      switch (opcion) {
        case 1:
          
          System.out.println("¿cuántos kilómetros quiere recorrer?");
          km = s.nextInt();
          conorSpeed.recorre(km);       
          break;
          
        case 2:
          
          conorSpeed.hazCaballito();
          break;
          
        case 3:
          
          System.out.println("¿cuántos kilómetros quiere recorrer?");
          km = s.nextInt();
          citroenC3.recorre(km);      
          break;
        
        case 4:
          
          citroenC3.quemaRueda();
          break;
          
        case 5:
          
          System.out.print("La bicicleta ha recorrido en total: ");
          System.out.println(conorSpeed.getkilometrosRecorridos()+" kms");
          break;
        
        case 6:
          
          System.out.println("El coche ha recorrido en total: ");
          System.out.print(citroenC3.getkilometrosRecorridos()+" kms");
          break;
          
        case 7:
          
          System.out.print("El kilometraje total de los vehículos es: ");
          System.out.println(Vehiculo.getkilometrosTotales()+ " kms");
          break;
  
      default:
        
      }
    }
    
  }
  

}
