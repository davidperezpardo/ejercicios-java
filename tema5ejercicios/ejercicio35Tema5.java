public class ejercicio35Tema5 {

  public static void main (String[] args) {
    //pintar una x con introduciendo la altura(nº impar y mayor o igual que 3)
    
    int altura;
    System.out.print("Dime la altura de la \"X\" (impar y mayor o igual que 3):");
    altura = Integer.parseInt(System.console().readLine());
    
    if (((altura%2)==1) && (altura >= 3)) {
        
        // pintamos la X
        
        int espaciosIntermedios = altura - 2;
        for (int i=1; i<= (altura/2+1); i++) {
          for (int j=1; j<i; j++) {
            System.out.print(" ");
          }
          if (i < (altura/2+1)) {
            System.out.print("*");
          }
          for (int j=1; j<=espaciosIntermedios; j++) {
            System.out.print(" ");
          }
          System.out.print("*\n");
          
          espaciosIntermedios -= 2;
        }  
        
        espaciosIntermedios = 1;
        
        for (int i=altura/2; i>=1; i--) {
          for (int j=1; j<i; j++) {
            System.out.print(" ");
          }
          System.out.print("*");
          
          for (int j=1; j<=espaciosIntermedios; j++) {
            System.out.print(" ");
          }
          System.out.print("*\n");
          
          espaciosIntermedios += 2;
        }
      
      
    } else {
        System.out.println("No se puede pintar la \"X\"");
    }
      
    
    
  }
}
