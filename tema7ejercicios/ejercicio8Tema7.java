import java.util.Scanner;
public class ejercicio8Tema7 {
	
	public static void main (String args[]) {
    /*pide la temperatura media de cada mes de un determinado año
     * y muestra un diagrama de barras horizontal con los meses*/
    
    String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto",
      "septiembre","octubre","noviembre","diciembre"};
    
    Scanner s = new Scanner(System.in);
    int[] tempMedia= new int[12];
    for(int i = 0; i<12; i++){        //bucle para introducir la temp. de los 12 meses
      System.out.println("introduzca temperatura media de: "+mes[i]);
      tempMedia[i] = s.nextInt();
    }
    System.out.println();
    for(int i=0; i<12; i++){    //bucle para mostrar los meses(array)
      System.out.print(mes[i]);
      for(int j = 0; j<tempMedia[i]; j++){  //bucle para pintar carácter segun la temp. media
        System.out.print("□");
      }
      System.out.println(" "+tempMedia[i]+"ºC de media");
    }
  }
}

