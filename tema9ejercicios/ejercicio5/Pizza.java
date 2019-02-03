package ejercicio5;

public class Pizza {

  // Atributos de clase
  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  // Atributos de instancia
  private String tamanio;
  private String sabor;
  private String estado;

  // constructor
  public Pizza(String sabor, String tama) {

    this.sabor = sabor;
    tamanio = tama;
    estado = "Pedida";
    totalPedidas++; // cada vez que se instancia una pizza,suma un pedido al total.
  }

  // getter de clase
  public static int getTotalServidas() {

    return totalServidas;
  }

  // getter de clase
  public static int getTotalPedidas() {

    return totalPedidas;
  }

  // método de instancia
  public void sirve() {

    // si ya se ha servido la pizza antes,muestra el mensaje
    if (estado.equalsIgnoreCase("Servida")) {

      System.out.println("Esa pizza ya se ha servido!");
    } else {
      // estado pasa a "servida" y el contador de las pizzas servidas suma 1.
      estado = "Servida";
      totalServidas++;
    }

  }

  // método toString
  public String toString() {

    return "Pizza " + sabor + " " + tamanio + ", " + estado;
  }

}
