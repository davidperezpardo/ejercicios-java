package pruebas;

import java.io.File;

/**
 * Ejemplo con la clase File.
 * Listado de los archivos y directorios de la ruta especificada.
 * 
 * @author David Pérez Pardo
 *
 */
public class listadoArchivos {

  public static void main(String[] args) {
    
    
    File f = new File("..");//La ruta del directorio.

    String listaArchivos[] = f.list();//devuelve un array de Strings con los nombres.
    
    for (String l : listaArchivos) {
      
      System.out.println(l);
    }
  }

}
