package ejercicio1;

/**
 * Clase Caballo.
 * 
 * @author David pérez pardo
 */

public class Caballo {

  // atributos
  private String nombre;
  private String raza;
  private String color;
  private int edad;
  private int carrerasGanadas;

  // constructor
  Caballo(String n, String r, String c, int e, int cg) {

    this.nombre = n;
    this.raza = r;
    this.color = c;
    this.edad = e;
    this.carrerasGanadas = cg;
  }

  // métodos
  public void relincha() {
    System.out.println("Yhiiiii pfrrruuuuu\n" + this.nombre + " relincha!");
  }

  public void cabalga() {
    System.out.println("Tacotoc tocotoc tacatac\n" + this.nombre + " está cabalgando...");
  }

  public void rumia() {
    System.out.println("ñaum ñam ñaum \n" + this.nombre + " se pone a comer...");
  }

  // método toString
  public String toString() {

    String ficha ="nombre: " + this.nombre + "\nraza: " + this.raza + "\n" + "color: " + this.color + "\nedad: "
        + this.edad + "\ncarreras ganadas: " + this.carrerasGanadas;
    return ficha;

  }

}
