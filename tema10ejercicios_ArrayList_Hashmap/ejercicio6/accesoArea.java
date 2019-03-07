package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class accesoArea {

  public static void main(String[] args) {
    
   /**
    * Implementa el control de acceso al área restringida de un
    * programa. Se debe pedir un nombre de usuario y una contraseña. Si
    * el usuario introduce los datos correctamente, el programa dirá
    * "Ha accedido al área restringida". El usuario tendrá un máximo de
    * 3 oportunidades. Si se agotan las oportunidades el programa dirá
    * "Lo siento, no tiene acceso al área restringida". Los nombres de
    * usuario con sus correspondientes contraseñas deben estar
    * almacenados en una estructura de la clase HashMap.
    * 
    * @author David Pérez Pardo
    */

    HashMap<String, String> acceso = new HashMap<String, String>();
    //el nombre de usuario será la Key del HasMap,buscaremos la pass a partir del nombre.
    //la key en un HashMap (nombre usuario) no se puede repetir.
    acceso.put("admin","a234n");
    acceso.put("david", "z69hl");
    acceso.put("marta", "m2p4t6");
    acceso.put("paquito", "elchocolatero");
    String nomIntro;
    String passIntro;
    int intentos = 3;
    boolean validaPass = false;
    Scanner s = new Scanner(System.in);
    System.out.println("    Acceso área restringida");
    
    do {
      
      //se solicita nombre y pass al usuario.
      System.out.print("Introduzca su nombre de usuario:");
      nomIntro = s.nextLine();
      System.out.print("\nIntroduzca su contraseña:");
      passIntro = s.nextLine();
      
      //se comprueba que exista el nombre de cuenta.
      if(acceso.containsKey(nomIntro)) {
        //si existe el nombre de cuenta,se compara la pass con la introducida por el usuario.
        //acceso.get no dará valor nulo,porque previamente se comprobó que existía la Key (usuario).
        if(acceso.get(nomIntro).equals(passIntro)) {
          
          validaPass = true;
          System.out.println("\nHa accedido al área restringida");
        }
        else {         
          intentos--;
          System.out.println("Contraseña incorrecta");
        }       
      }
      else {
        intentos--;
        System.out.println("\nUsuario introducido inexistente");
      }
 
      //para mostrar los intentos disponibles.
      if(intentos > 0 && !validaPass) {      
        
        System.out.println("\nle quedan "+intentos+" intentos");
      }
            
    }while(!validaPass && intentos > 0);
    
    if(!validaPass) {
      System.out.println("Lo siento,no puede acceder al área restringida");

    }
      
  }

}
