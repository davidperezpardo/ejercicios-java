
public class ejercicio10Tema6 {
	
	public static void main (String args[]) {
  /*pinta 10 líneas,con los carácteres (*,-,=,.,|,@)al azar,
   * con una longitud de cada línea al azar (del 1 al 40)*/
    
    int i = 0;
    String caracter = "";
    for(i = 0; i<10; i++) {
      int veces = (int)(Math.random()*40)+1;
      int caracteres = (int)(Math.random()*6)+1;
      switch(caracteres) {
        case 1:
          caracter = "*";
          break;
        case 2:
          caracter = "-";
          break;
        case 3:
          caracter = "=";
          break;
        case 4:
          caracter = ".";
          break;
        case 5:
          caracter = "|";
          break;
        case 6:
          caracter = "@";
          break;
        
        default:
      }
      for(int j = 1; j <= veces; j++){
        System.out.print(caracter);
      }
      System.out.println();
    }

  }
}

