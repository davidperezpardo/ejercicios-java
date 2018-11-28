public class ejercicio4Tema7_2{
	
	public static void main (String args[]) 
    throws InterruptedException { //para usar el retardo
    
    /*matriz de 4x5,se rellena con valores aleatorios(100-999),
     * luego imprime la matriz con la suma de cada fila a su lado,
     * la suma de cada columna debajo, y el total (filas+columnas)
     * "CON RETARDO"*/
     
    int[][] hoja = new int[4][5];
    int sumaFila =0;
    int sumaColumna =0;
    int totalColumnas =0;
    int totalFilas =0;
      for(int i=0; i<4; i++){     //para rellenar la matriz
        for(int j=0; j<5; j++){
          hoja[i][j] = (int)(Math.random()*(999-100+1)+100);  //nºs aleatorios entre 100 y 999
        }
      }
      for(int i=0; i<4; i++){
          sumaFila=0;     //se vuelven a inicializar en 0 al principio de cada fila,para que no sume
                          
        for(int j=0; j<5; j++){
          Thread.sleep(100);  //retardo
          sumaFila +=hoja[i][j];     //suma valores de cada fila
          System.out.printf("%6s",hoja[i][j]);
          
        }
        Thread.sleep(500); //retardo
        totalFilas +=sumaFila;      //suma de todas las filas juntas
        System.out.print(" = ");
        System.out.printf("%6s",sumaFila);      //muestra el total de cada fila justo al lado
        System.out.println();     //para imprimir la matriz correctamente
        
      }
      //se invierten filas por columnas para sumar las columnas
      for(int fila=0; fila<5; fila++){  
        sumaColumna =0;     //se vuelve a inicializar a 0,para que sume solo cada columna
        for(int columna=0; columna<4; columna++){
          sumaColumna +=hoja[columna][fila];    //se invierte para poder sumar las columnas
        }
        Thread.sleep(600); //retardo
        totalColumnas +=sumaColumna;    //suma de todas las columnas
        System.out.printf("%6s",sumaColumna);   //imprime suma de cada columna justo abajo
        
      }
    Thread.sleep(1000); //retardo
   //se imprime la suma de filas y columnas fuera de los bucles para mostrar el total
    System.out.printf(" TOTAL %6s",(totalFilas+totalColumnas)); 
  }
}

