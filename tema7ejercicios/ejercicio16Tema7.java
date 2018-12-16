import java.util.Scanner;
public class ejercicio16Tema7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*muestra array de 20 numeros aleatorios (0-400) y da a elegir al usuario
		 * señalar los que son múltiplos de 5 o de 7*/
		 */
		int eleccion;
		int numeros[] = new int [20];
		for(int i=0; i<20; i++) {
			numeros[i]=(int)(Math.random()*401);
			System.out.print(numeros[i]+" ");
		}
		
		do {	
		
			System.out.println("\n¿que números desea resaltar?\n1- múltiplos de 5	2- múltiplos de 7");
			Scanner s = new Scanner(System.in);
			eleccion = s.nextInt();
			if(eleccion!=1 && eleccion!=2) {			
				System.out.println("opción incorrecta,vuelva a elegir!");		
				
			}
		}while(eleccion!=1 && eleccion!=2);	
		
		switch(eleccion) {
			
			case 1:
				for(int i=0; i<20; i++) {
					if(numeros[i]%5==0) {
						System.out.print("["+numeros[i]+"]"+" ");				
					}
					else {
						System.out.print(numeros[i]+" ");
					}
				}
				break;
			case 2:
				for(int i=0; i<20; i++) {
					if(numeros[i]%7==0) {					
						
						System.out.print("["+numeros[i]+"]"+" ");
					}
					else {
						System.out.print(numeros[i]+" ");
					}
					
				}
				break;
			  default:
		}		
	
	}

}
