package ejercicio3;

public class Canario extends Ave{
 
  private String color;
  
  //constructor
  public Canario (String nombre,String color) {
    
    super(nombre);
    this.color = color;
  }
  
  //métodos de instancia
  public void habla() {
    
    System.out.println("no puedo hablar,soy un canario de color " + color +
        " ,no un loro!");   
  }
  
  public void canta() {
    
    System.out.println("pio pio pio piooo");
  }
  
  public void come (String comida) {
    
    if(comida.equalsIgnoreCase("alpiste")) {
      
      System.out.println("mmmm  ñam ñamm, me encanta el alpiste");
    }else {
      
      System.out.println("no me gusta " + comida +", yo solo como alpiste");
    }
   
  }
  

}
