package ejercicio8;

public class Terminal {

  private int tempConversacion;
  private String numero;

  public Terminal(String num) {

    numero = num;
    this.tempConversacion = 0;
  }
  
  public int getTiempoDeConversacion () {
    
    return tempConversacion;
  }

  public void llama(Terminal tfno, int temp) {

    tfno.tempConversacion += temp;
    this.tempConversacion += temp;
  }

  public String toString() {

    return "nº " + numero + " - " + this.tempConversacion + "s de conversación";
  }

}
