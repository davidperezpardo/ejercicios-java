package ejercicio2_2;

public class Gato {

  private String nombre;
  private String color;
  private int peso;

  public Gato(String nombre, String color, int peso) {
    super();
    this.nombre = nombre;
    this.color = color;
    this.peso = peso;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

}
