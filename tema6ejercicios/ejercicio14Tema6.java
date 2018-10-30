import java.util.Scanner;
public class ejercicio14Tema6 {
	
	public static void main (String args[]) {
    /*programa que intenta adivinar el nº que piensas(entre 0 y 100)con 5 oportunidades
    *te pregunta si el numero pensado es mayor o menor que el que te acaba de decir*/
    
    Scanner s = new Scanner(System.in);
    Scanner t = new Scanner(System.in);
    Scanner u = new Scanner(System.in);
    int numero;
    String adivina;
    int contador = 0;
    int mayor = 100;
    int menor = 0;
    
    do{
      contador++;
      numero = (int)(Math.random()*(mayor - menor)+menor);
      System.out.println("¿ES ESTE EL NÚMERO QUE ESTÁ PENSANDO?   "+numero);
      System.out.print("¿SI  O  NO?");
      adivina = t.nextLine();
      if(adivina.equals("si")){
        System.out.println("HE ACERTADO!");
      }else{
        if(adivina.equals("no") && contador < 5) {
          System.out.println("¿EL NÚMERO QUE PIENSA ES MENOR O MAYOR?");
          String posicion = u.nextLine();
        
          if(posicion.equals("mayor"))
            menor = numero+1;
          
          if(posicion.equals("menor"))
            mayor = numero-1;    
          
        }
      } 
    }while(adivina.equals("no") && (contador < 5));
    
    if(contador == 5){
      System.out.println("VAYA,NO HE ACERTADO!");
    }
  }
}

