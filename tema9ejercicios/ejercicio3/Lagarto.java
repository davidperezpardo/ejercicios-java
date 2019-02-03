package ejercicio3;

public class Lagarto extends Animal {

  // constructor
  public Lagarto(String nombre) {

    super(nombre);
  }

  public void tomaElSol() {

    System.out.println("Me subo a una piedra a tomar el Sol");
  }

  public void corre() {

    System.out.println("No puedo correr,solo soy un reptil!");
  }
  

}
