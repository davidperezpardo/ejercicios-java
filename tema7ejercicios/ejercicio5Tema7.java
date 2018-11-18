import java.util.Scanner;
public class ejercicio5Tema7 {
	
	public static void main (String args[]) {
		/*muestra diez números introducidos por teclado
     *e indica cual es el máximo y el mínimo de todos*/
    
    int[] numIntro = new int[10];
    int max = numIntro[0];    //declarados e inicializados al principio para poder usarlos en todos los bucles
    int min = numIntro[0];  
    Scanner s = new Scanner(System.in);
    System.out.println("introduzca 10 números de uno en uno(pulse enter)");
    for(int i=0; i<10; i++) {       //bucle que pide los 10 nºs y compara los max y min
      numIntro[i] = s.nextInt();    //y los va guardando en una variable auxiliar
      if(max < numIntro[i]) {
        max = numIntro[i];
        min=max;  //se guarda en min,el valor de max,para poder ir comparando,sino su valor sería siempre 0
      }
      if(min > numIntro[i]) {
        min = numIntro[i];
      } 
    }
    System.out.println();
    for(int  i=0; i<10; i++) {   //bucle para mostrar los nºs introducidos 
      if(numIntro[i] == max) {   // indica el maximo.
        System.out.print("MÁXIMO:  ");
      } 
      if(numIntro[i] == min) {   //indica el minimo.
        System.out.print("MÍNIMO:  ");
      }
      System.out.println(numIntro[i]);
    }
  }
}

