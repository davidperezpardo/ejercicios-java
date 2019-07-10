package ejercicio3Opcion1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Haciendo uso de ArrayList, cree una lista de Personas, para lo cual tendrá 
 * que definir la clase oportuna. Su programa debe implementar, mediante opciones 
 * guiadas a través de un menú, la “cola” de una caja de supermercado. 
 * Sólo nos interesan los datos de la persona: DNI y nombre. Por tanto, tendrá que
 * desempeñar las siguientes funciones:
 * a) Llegada de una persona a la cola (se pondrá al final de dicha cola)
 * b) Atención de la persona a la que le toca de la cola
 * (saldrá de la cola la primera que esté en cola), si es que hay gente en cola.
 * c) Presentar por pantalla una lista con los nombres de las personas que están en cola
 * 
 * @author David Pérez Pardo
 *
 */

public class colaCaja {

  public static void main(String[] args) {

    ArrayList<Persona> cola = new ArrayList<Persona>();
   
    int opcion;
    
    Scanner s = new Scanner(System.in);

    do {
      //MENU
      System.out.println("\n  ===Cola de la caja===\n");
      System.out.println("1. Llegada de persona a cola");
      System.out.println("2. Atender persona");
      System.out.println("3. Listado de la cola");
      System.out.println("4. Salir\n");
      System.out.println("Seleccione una opción\n");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
      case 1:
        //llegada a cola de una persona      
        enCola(cola);
        System.out.println("En cola...\n");
        break;
      case 2:
        //se atiende a una persona por orden de llegada
        atiendePersona(cola);
        
        break;
      case 3:

        //ver las personas de la cola
        verCola(cola);
        
        break;

      default:

      }

    } while (opcion != 4);
  }
  
  //crea añade persona a la cola
  public static void enCola (ArrayList<Persona> list ){
    
    String nom;
    String dni;
    Scanner d = new Scanner(System.in);
    
    System.out.println("Indique nombre de la persona:");
    nom = d.nextLine();
    System.out.println("Indique su DNI:");
    dni = d.nextLine();
    Persona p = new Persona(nom,dni);
    list.add(p);
    
  }
  
  //función que atiende a una persona de la cola por orden de llegada
  public static void atiendePersona (ArrayList<Persona> list) {
    
   if(!list.isEmpty()) {
     
     System.out.print("Le toca a: " + list.get(0).getNombre());   
     list.remove(0);
     
   }else {
     
     System.out.println("No hay personas en cola en estos momentos\n");
   }
    
  }
  
  //función para mostrar las personas en cola
  public static void verCola (ArrayList<Persona> p){
    
    int i = 1;
    for (Persona per : p) {
      
      System.out.println(i+"--" + per.getNombre());
      i++;
    }
    
  }
  
}
