package ejercicio3;

public class Pinguino extends Ave{
  
  private String raza;
  
  //constructor para pinguino,subclase de Ave
  public Pinguino (Sexo s, String n, String raza) {
    super(s,n);
    this.raza = raza;
    
  }
  
  //getter sólo para pinguino
  public String getRaza () {
    
    return raza;
  }
  
  //métodos de instancia
  public void vuela () {
    
    System.out.println("los pinguinos no podemos volar");
  }
  
  public void migrar () {
    System.out.println("Voy de camino hacia la antártida");
    
  }
  
  public void raza () {
    System.out.println("Soy un pinguino de la raza " + getRaza());
  }
  
  
}
