import java.util.Scanner;
public class ejercicio2Tema7parte2 {
	
	public static void main (String args[]) {
    
    /*matriz de 4x5,el usuario va introduciendo cada valor,luego imprime
     * la matriz con la suma de cada fila,la suma de cada columna
     * y el total (filas+columnas)*/
    
    int contador = 21;
    int[][] hoja = new int[4][5];
    int sumaFila =0;
    int sumaColumna =0;
    int totalColumnas =0;
    int totalFilas =0;
      Scanner s = new Scanner(System.in);
      for(int i=0; i<4; i++){     //para rellenar la matriz
        for(int j=0; j<5; j++){
          contador--;
          System.out.println("introduzca 20 nºs enteros le quedan "+contador+"nºs (pulse enter)");
          hoja [i][j]= s.nextInt();          
        }
      }
      
      for(int i=0; i<4; i++){
          sumaColumna =0;
          sumaFila=0;     /*se vuelve a inicializar en 0 al principio de cada fila,para que no sume
                          *el resultado de la fila anterior*/
        for(int j=0; j<5; j++){
          sumaFila +=hoja[i][j];     //suma valores de cada fila
          System.out.printf("%4s",hoja[i][j]);
        }
        totalFilas +=sumaFila;      //suma de todas las filas juntas
        System.out.print(" =");
        System.out.printf("%4s",sumaFila);      //muestra el total de cada fila justo al lado
        System.out.println();     //para imprimir la matriz correctamente
      
      }
      //se invierten filas por columnas para sumar las columnas
      for(int fila=0; fila<5; fila++){  
        sumaColumna =0;     //se vuelve a inicializar a 0,para que sume solo cada columna
        for(int columna=0; columna<4; columna++){
          sumaColumna +=hoja[columna][fila];    //se invierte para poder sumar las columnas
        }
        totalColumnas +=sumaColumna;    //suma de todas las columnas
        System.out.printf("%4s",sumaColumna);   //imprime suma de cada columna justo abajo
      }
   
   //se imprime la suma de filas y columnas fuera de los bucles para mostrar el total
    System.out.printf(" TOTAL %2s",(totalFilas+totalColumnas)); 
  }
}

