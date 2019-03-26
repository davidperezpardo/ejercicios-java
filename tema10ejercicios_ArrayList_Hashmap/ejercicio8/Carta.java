package ejercicio8;

public class Carta {
  private static String palo[] = { "OROS", "COPAS", "ESPADAS", "BASTOS" };
  private static String numero[] = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "SOTA",
      "CABALLO", "REY" };

  private String palito;
  private String num;

  public Carta() {

    this.palito = palo[(int) (Math.random() * 4)];
    this.num = numero[(int) (Math.random() * 10)];

  }

  public String getPalito() {

    return palito;

  }

  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
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
    if (num == null) {
      if (other.num != null)
        return false;
    } else if (!num.equals(other.num))
      return false;
    if (palito == null) {
      if (other.palito != null)
        return false;
    } else if (!palito.equals(other.palito))
      return false;
    return true;
  }

  public String toString() {

    return this.num + " de " + this.palito;

  }

}
