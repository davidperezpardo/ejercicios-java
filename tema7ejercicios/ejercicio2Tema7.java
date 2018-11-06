public class ejercicio2Tema7 {
	
	public static void main (String args[]) {
    //muestra el contenido del array
    char[] simbolo =  new char[10];
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'q';
    
    for(int i = 0; i<10; i++){
      System.out.println(simbolo[i]);
    }
  }
}

