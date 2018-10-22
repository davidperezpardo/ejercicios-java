import java.util.Scanner;
public class ejercicio27Tema5 {
	
	public static void main (String args[]) {
  //multiplos de 3,y la suma de ellos,entre el 1 y un nº introducido
  
  System.out.println("MÚLTIPLOS DE 3 Y LA SUMA DE ELLOS");
  System.out.println("INTRODUZCA UN NÚMERO");
  Scanner s = new Scanner(System.in);
  int numIntro = s.nextInt();
  int multiplos = 0;
  int suma = 0;
  for (int i = 1; i <= numIntro; i ++){
    if ((i % 3) == 0) {
      multiplos++;
      suma += i;
    }
  }
  
  System.out.println("HAY "+multiplos+" MÚLTIPLOS Y LA SUMA DE ELLOS ES "+suma);
  
  }
}

