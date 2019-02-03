package ejercicio3;

public class Perro extends Mamifero {
  
  public Perro (Sexo s,String n) {
    
    super(s, n);   
  }
  
  //método de instancia
  public void ladra() {
    
    System.out.println("grguau guau grrrguau");
  }
  
  //método de instancia 
  public void darPremio(String premio) {
    
    if(premio.equalsIgnoreCase("hueso")){
      ladra();
      System.out.println("A " + getNombre()+ " le encantan los huesos!!");
    }
    else {
      System.out.println("A " + getNombre() + " no le hizo gracia el premio,"
          + " preferiría un hueso...");
    }
  }
  
  //método de instancia
  public void sienta() {
    
    System.out.println(getNombre() + " te hizo caso,y se sentó...");
  }
  

}
