package ejercicio10;

public class Ameba {

  private int peso;

  public Ameba() {

    this.peso = 3;

  }
  //método come para una sola partícula
  public void come(int particula) {

    this.peso -= 1;
    this.peso += particula;
  }
  //método come para comer a otra ameba
  public void come(Ameba a) {

    this.peso -= 1;
    this.peso += a.peso;
    a.peso = 0; //la ameba comida,se queda en un peso = 0
  }

  public String toString() {

    return "Soy una Ameba y peso " + this.peso + " microgramos";
  }

}
