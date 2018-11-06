
public class ejercicio4Tema7 {
	
	public static void main (String args[]) {
		
    /*muestra tres columnas,primera con 20 nºs aleatorios(0-100),
     *segunda columna al cuadrado
    *tercera columna al cubo*/
    
    int [] numero = new int[20];
    int [] cuadrado = new int[20];
    int [] cubo = new int [20];
    int i;
    for( i = 0; i<20; i++){
    numero[i] = (int)(Math.random()*100);
    cuadrado[i] = numero[i] * numero[i];
    cubo[i] = cuadrado[i] * numero[i];
    }
    System.out.println("aleatorios|cuadrados|cubos\n_____________________________");
    for(i = 0; i<20; i++){
      System.out.printf("%3d       %6d     %8d|\n",numero[i],cuadrado[i],cubo[i]);
    }
  }
}

