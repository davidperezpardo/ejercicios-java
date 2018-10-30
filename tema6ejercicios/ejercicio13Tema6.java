public class ejercicio13Tema6 {
	
	public static void main (String args[]) {
  //tirada de dados,finaliza cuando los dos dados sacan la misma tirada
  int dado1 =0;
  int dado2 =0;
    do{
      dado1 = (int)(Math.random()*6)+1;
      dado2 = (int)(Math.random()*6)+1;
      System.out.println(dado1+"  dados  "+dado2);
    }while(dado1 != dado2);
  }
}

