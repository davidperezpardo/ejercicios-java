import java.util.Scanner;
public class juegoDelAhorcado {

	public static void main(String[] args) {
		/**juego del ahorcado
		 * @author david perez pardo
		 * 
		 * */
		
		String palabras [] = {"JAVA","WEB","APLICACION","MEMORIA","CODIGO","ALGORITMO",
				"MAQUINA","ORDENADOR","ASCII","PROYECTO","DESARROLLO","PROGRAMAR","OBJETO","TESTING"};
		char letraIntro;
		int azar = (int)(Math.random()*palabras.length); //para nºs aleatorios de 0 hasta nº de palabras en array
		int numLetras = palabras[azar].length();
		int intentos = 5;
		//inicializamos el array con posiciones=a longitud del string seleccionado
		char letra [] = new char [palabras[azar].length()];

		for(int i=0; i<numLetras; i++) {//recorremos array hasta el tamaño del string seleccionado 				
					letra[i]=palabras[azar].charAt(i);//se va guardando cada carácter en array letra[]				
		}
		
		System.out.println("\nJUEGO DEL AHORCADO (pulse '0' para salir del  juego)");
		System.out.println();
		char descubriendo [] = new char[numLetras];//array para ocultar con tamaño= al string seleccionado
		for (int i=0; i<numLetras; i++) {
			descubriendo[i] = '_';  //guardamos el carácter especial para ocultar letras
			System.out.printf("%3s",descubriendo[i]);//mostramos array con carácter especial para ocultar letras
		}
		boolean repetida;
		boolean acertada;
		boolean fallo;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println();
			System.out.print("\nintroduzca una letra (-"+intentos+"- intentos)");
			System.out.println();
			letraIntro = s.next().toUpperCase().charAt(0);//toUpperCase(convierte a mayuscula el caracter introducido)
			fallo=true;
			acertada=true;
			repetida=false;
			
			for (int i=0; i<numLetras; i++) {			
				//cuando se repita letraIntro con una letra descubierta
				if(letraIntro == descubriendo[i]) {
						repetida=true; //se repite
				}
				if(letraIntro == letra[i]) { //si se cumple
						descubriendo[i] = letra[i]; //sobreescribimos caracter especial por letra introducida
						fallo=false;	//si se acierta una letra,no hay fallo											
				}
					//si no hay ningun '_' entonces se habrá acertado la palabra
				if(descubriendo[i] == '_') {
						acertada = false;//mientras contenga '_' no será acertada(false)
				}
				//se imprime array de char con '_',para simular palabra oculta
				System.out.printf("%3s",descubriendo[i]);
					
			}
					//si letraIntro no coincide con un carácter de la palabra, se resta un intento
			if(fallo==true) {
						intentos--;
			}//si se repite la letraIntro,se imprime...
			if(repetida==true) {
					System.out.println("	letra repetida,pruebe con otra");
			}
													
		//se repite el bucle mientras queden intentos(5) y quede algun '_' 
		}while((intentos >0) && (acertada==false) && (letraIntro!='0'));	
		System.out.println();
		if(acertada==true) { //si se aciertan todas las letras,se imprime
			System.out.println();
			System.out.println("ENHORABUENA,HA HACERTADO LA PALABRA!");
		}
		if(intentos == 0){	
			System.out.println();
			System.out.println("		GAME-OVER");
			System.out.println();
			System.out.println("lo siento,ha agotado los intentos");
		}
		if(letraIntro == '0') {
			System.out.println();
			System.out.print("¡VUELVA CUANDO QUIERA!");
    }
  }
}
