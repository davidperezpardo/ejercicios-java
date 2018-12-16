import java.util.Scanner;
public class ejercicio17Tema7 {
	/*al seleccionar un número del array,éste rota hacia la derecha
	 * hasta llegar a la posición[0]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros [] = new int [10];
		System.out.println("rotar un número hasta llegar a la posicion 1");

		System.out.print("Posición:");
		
		for(int i=0; i<10; i++) {
			System.out.printf("%3d|",i+1);
		}
		System.out.println();
		System.out.print("lista   :");
		for(int i=0; i<10; i++) {
			numeros[i] = (int)(Math.random()*101);
			System.out.printf("%3d|",numeros[i]);
		}
		int numIntro;	
		Scanner s = new Scanner(System.in);
		boolean esta=false;
		do {
			System.out.print("\nIntroduzca el numero a rotar");
			numIntro = s.nextInt();
			for(int i=0; i<10; i++) {
				if(numeros[i] == numIntro) {
					esta = true;
				}
			}
			if(esta==false) {
				System.out.print("el numero que introdujo,no se encuentra en el array,inténtelo de nuevo");
			}	
		}while(esta == false);
		int ultimo = 0;
		
		
		do {
			//guardamos el numero de la ultima posicion del array,para no perderlo
				ultimo = numeros[9];
			//desde el final hasta la posicion 1		
			for(int i=9; i>0; i--) {			
				//cada valor lo pasamos una posicion a la derecha	
				numeros[i]=numeros[i-1];				
			}
				System.out.println();
			
		  //guardamos el ultimo valor,en la posicion 0,despues de una pasada completa del bucle
			numeros[0]=ultimo;
		}while(numeros[0]!=numIntro);
			//mostramos el array con la posicion cambiada de los valores(lugares a la derecha hasta que numIntro = [0])
		System.out.print("Posición:");
		for(int i=0; i<10; i++) {
			System.out.printf("%3d|",i+1);
		}
		System.out.println();
		System.out.print("Lista:   ");
		for(int i=0; i<10; i++) {
				
		  	System.out.printf("%3d|",numeros[i]);
				
	  }
	}
}
