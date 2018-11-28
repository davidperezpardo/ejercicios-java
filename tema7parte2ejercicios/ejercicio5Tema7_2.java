public class ejercicio5Tema7_2 {
	
	public static void main (String args[]) {
		/*imprime matriz con nºs aleatorios entre el 0-100 y 
     * el nº mayor,el nº menor y sus coordenadas (fila-columna) */
    
    int min = 1001;      //para establecer el min(le asignamos el valor max)
    int max = 0;         //para establecer el max
    int columnaMin = 0; 
    int columnaMax = 0;
    int filaMax = 0;
    int filaMin = 0;
    int num [][]= new int [6][10]; 
    for(int i=0; i<6; i++){
       System.out.print("F-"+(i+1));
      for(int j=0; j<10; j++){
        num[i][j] = (int)(Math.random()*1001);
        
        if(  max < num[i][j]){
          max = num[i][j];       //comparamos y guardamos maximo
          columnaMax = j;     //posicion valor columna mayor
          filaMax = i;        //posicion valor fila mayor
        }
        if(min > num[i][j]){  //comparamos y guardamos minimo...
          min = num[i][j];
          columnaMin = j;
          filaMin = i;
        }
        System.out.printf("%5s",num[i][j]); //pintamos matriz
      }
      System.out.println(); //para poder formar la matriz 
    }
    System.out.println();
    /*imprimimos el valor max y min del array,y sus coordenadas(sumamos uno a columnamax y columnamin)
     * para contar las filas y columnas desde el nº 1 */
    System.out.println("El máximo es "+max+" y está en la fila: "+(filaMax+1)+" columna: "+(columnaMax+1));  
    System.out.println("El mínimo es "+min+" y está en la fila: "+(filaMin+1)+" columna: "+(columnaMin+1));
  }
}

