import java.util.Scanner;


public class ejercicio15Tema5 {
	
	public static void main (String args[]) {
    /*muestra la base introducida con todos los exponentes entre el 1 
    y el exponente introducido,y calcula las potencias (base real y exponente enteros positivos)*/
    
    System.out.println("introduzca la base (entero y positivo)");
    Scanner s = new Scanner(System.in);
    double base = s.nextDouble();
    
    System.out.println("introduzca el exponente");
    int exponenteIntro = s.nextInt();
    double potencia;
    int exponente;
    
    for(int i = 1; i <= exponenteIntro; i++) {
      
      potencia = 1;
      exponente =i;
     
     for(int j = 0; j < exponente; j++) {
       potencia *= base;
       
      }
      System.out.println(base +"^"+i+" ="+potencia);
    }
  }   
}
