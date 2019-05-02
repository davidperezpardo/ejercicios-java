package pruebas;

import java.io.File;

/**
 * Comprobación de existencia de un archivo y
 * Borrado con java
 * 
 * @author David Pérez Pardo
 *
 */

class testArchivosCarpetas {
  
  public static void main(String[] args) {
        
    //Ruta y nombre del archivo a borrar
    String nombreFichero = "C:\\Documents and Settings\\Asus\\Desktop\\prueba.jpg";
    File fichero = new File(nombreFichero);
    
    //Comprueba primero si el fichero existe
    if (fichero.exists()) {
      fichero.delete();
      System.out.println("El fichero se ha borrado correctamente.");
      
    } else {
      
      System.out.println("El fichero " + nombreFichero + " no existe.");
      
    }
    
  }
}