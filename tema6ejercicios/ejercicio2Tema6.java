public class ejercicio2Tema6 {
  
  public static void main (String[]args) {
  //muestra una carta al azar de la baraja francesa
  String carta = "";
  String palo = "";
  
  int numeroPalo = (int)(Math.random()*4)+1;
  
    switch(numeroPalo) {
      case 1 :
        palo = "PICAS";
        break;
      case 2 :
        palo = "CORAZONES";
        break;
      case 3 :
        palo = "TRÉBOLES";
        break;
      case 4 :
        palo = "DIAMANTES";
        break;  
  
      default:
    }
    int numeroCarta = (int)(Math.random()*13)+1;
    
    switch(numeroCarta) {
      case 1 :
        carta = "AS";
        break;
      case 11 :
        carta = "J";
        break;
      case 12 :
        carta = "Q";
        break;
      case 13 :
        carta = "K";
        break;
      
      default:
        carta = String.valueOf(numeroCarta);
    }
    System.out.print(carta+" DE "+palo);
  
  }
}
