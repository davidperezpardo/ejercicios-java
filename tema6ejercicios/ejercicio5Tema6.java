public class ejercicio5Tema6 {
	
	public static void main (String args[]) {
    /*muestra 50 aleatorios (entre 100 y 199) ambos incluidos,
     * y muestra el mayor,el menor y la media de los nºs mostrados.*/
    int maximo = 199;
    int minimo = 100;
    int numero = 0;
    int suma = 0;
    for(int i = 1; i<=50; i++) {
      numero = (int)(Math.random()*100)+100;
      System.out.print(numero+"  ");
      suma +=numero;
      if(numero < maximo) {
        maximo = numero;
      }
      if(numero > minimo) {
        minimo = numero;
      }
    }
    System.out.print("\nMAXIMO = "+minimo+"\nMINIMO = "+maximo+"\nMEDIA  = "+suma/50);
 
 
 }
}

