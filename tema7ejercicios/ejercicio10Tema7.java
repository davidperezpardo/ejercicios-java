
public class ejercicio10Tema7{
	
	public static void main (String args[]) {
    /*genera 20 numeros aleatorios,los imprime por consola
     * y despues los ordena empezando por la izquierda con los pares
     * y seguidamente los impares*/
    
    int numeros[] = new int[20];
    for(int i = 0; i<20; i++) {         //bucle para generar 20 nºs aleatorios
      numeros[i] = (int)(Math.random()*100);
      System.out.print(numeros[i]+"  ");
    }
    int par = 0;
    int impar = 0;
    System.out.println("\n");
    System.out.println("          izquierda pares----derecha impares\n");
    for(int i = 0; i<20; i++) {     //recorremos array desde la primera posición
      if(numeros[i]%2 == 0) {
        par = numeros[i];           //variable auxiliar para capturar nº par
        numeros[i] = par;           //mete los pares en array empezando por el [0]
        System.out.print(numeros[i]+"  ");
      }
    }
    for(int i = 19; i>=0; i--){ //recorremos array desde la ultima posición
      if(numeros[i]%2 !=0) {    
        impar = numeros[i];     //variable auxiliar para capturar impares
        numeros[i] = impar;     //mete impares en array empezando desde la ultima posición[19]
        System.out.print(numeros[i]+"  ");
      }
    }
  }
}

