
public class ejercicio1Tema6 {
	
	public static void main (String args[]) {
  
  System.out.println("TIRADA DE TRES DADOS");
  int suma = 0;
  int tirada = 0;
  
  for(int i = 0; i<3; i++) {
    tirada = (int)(Math.random()*6)+1;
    System.out.println(tirada+" ");
    
    suma +=tirada;
  }
  System.out.print("SUMA = "+suma);
  
  }
}

