public class ejercicio3Tema6 {
  
  public static void main (String[]args) {
  //muestra una carta al azar de la baraja española(48 cartas)
  String carta = "";
  String palo = "";
  
  int numeroPalo = (int)(Math.random()*4)+1;
  
    switch(numeroPalo) {
      case 1 :
        palo = "ORO";
        break;
      case 2 :
        palo = "ESPADAS";
        break;
      case 3 :
        palo = "BASTOS";
        break;
      case 4 :
        palo = "COPAS";
        break;  
  
      default:
    }
    int numeroCarta = (int)(Math.random()*12)+1;
    
    switch(numeroCarta) {
      case 1 :
        carta = "AS";
        break;
      case 10 :
        carta = "SOTA";
        break;
      case 11 :
        carta = "CABALLO";
        break;
      case 12 :
        carta = "REY";
        break;
      
      default:
        carta = String.valueOf(numeroCarta);
    }
    System.out.print(carta+" DE "+palo);
  
  }
}
