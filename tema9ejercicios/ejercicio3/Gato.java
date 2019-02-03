package ejercicio3;

public class Gato extends Mamifero {
  
  //constructor 
  public Gato (Sexo s,String nombre) {
  
    super(s,nombre);
    
  }
  
  //métodos de instancia
  public void maulla() {
   System.out.println("miau mmiauuuuu"+ getNombre() + " está maullando");
  }
  
  public void juega() {
    System.out.println(getNombre() + " Juega con un ovillo de lana...");
  }
  
  public void limpia () {
    System.out.println(getNombre() + " Se lame las patitas");
  }
  
  
}
