package ejercicio9;

import java.text.DecimalFormat;

import ejercicio8.Terminal;

public class Movil extends Terminal {

  private String tipoTarifa;
  private double precio;
  //para especificar el formato de la tarificación (precio)
  DecimalFormat decimal = new DecimalFormat("0.00");

  public Movil(String num, String tarifa) {
    super(num);
    this.tipoTarifa = tarifa;
    this.precio = 0;
  }

  public void llama(Movil m, int temp) {
    
    super.llama(m, temp);
    double minutos = (double) temp / 60;
    
    if (this.tipoTarifa.equals("rata")) {

      this.precio += (double) minutos * 0.06;
    }
    if (this.tipoTarifa.equals("mono")) {

      this.precio += (double) minutos * 0.12;
    }
    if (this.tipoTarifa.equals("bisonte")) {

      this.precio += (double) minutos * 0.30;
    }

  }

  // llamamos al toString de la superclase (terminal) y le añadimos la
  // tarificación.
  @Override
  public String toString() {

    return super.toString() + " - " + "tarificados " + decimal.format(precio) + "€";
  }

}
