package ejercicio9;

public class Carta implements Comparable<Carta> {
  
  private static String palo[] = { "OROS", "COPAS", "ESPADAS", "BASTOS" };
  private static String numero[] = { "as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "sota",
      "caballo", "rey" };

  private String palito;
  private String numCarta;
  private int posicion;
  
  
  public Carta() {

    this.palito = palo[(int) (Math.random() * 4)];
    this.posicion = (int) (Math.random() * 10);
    this.numCarta = numero[posicion];
    
  }

  public String getPalito() {

    return palito;

  }

  public int getPosicion() {
    return posicion;
  }

  public void setPosicion(int posicion) {
    this.posicion = posicion;
  }

  public String getNumCarta() {
    return numCarta;
  }

  public void setNumCarta(String num) {
    this.numCarta = num;
  }

  public void setPalito(String palito) {
    this.palito = palito;
  }
  
  
  // método equals para comparar dos objetos tipo Carta
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Carta other = (Carta) obj;
    if (numCarta == null) {
      if (other.numCarta != null)
        return false;
    } else if (!numCarta.equals(other.numCarta))
      return false;
    if (palito == null) {
      if (other.palito != null)
        return false;
    } else if (!palito.equals(other.palito))
      return false;
    return true;
  }

  //método compareTo
  @Override
  public int compareTo(Carta o) {
    // comparamos y ordenamos  por palos primero
    int palos= (this.palito).compareTo(o.getPalito());
    //si devuelve 0,significan que dos palos son iguales.
    if(palos == 0) {
      //si dos palos son iguales,comparamos por numero de cartas (numCarta)
      if(this.posicion < o.getPosicion()) {
        // -1 es de menor a mayor
        return -1;
      }
      else if(this.posicion > o.getPosicion()) {
        // 1 es de mayor a menor
        return 1;
      }
    }
    
    return palos;
  }
  
  @Override
  public String toString() {

    return this.numCarta + " de " + this.palito;

  }

}
