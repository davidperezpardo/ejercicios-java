package ejercicio3;

public class Ave extends Animal {

  // constructor
  public Ave(Sexo s, String n) {
    super(s, n);

  }

  // constructor alternativo
  public Ave(String nombre) {

    super(nombre);
  }

  // métodos de instancia
  public void ponHuevo() {

    if (getSexoAnimal() == Sexo.HEMBRA) {

      System.out.println("Ploff, ahí tienes el huevo");
    } else {

      System.out.println("no puedo poner huevos,soy " + getSexoAnimal());
    }
  }

  public void abreAlas() {

    System.out.println("fffiuuu, estoy abriendo las alas!");
  }

  public void cierraElPico() {

    System.out.println("De acuerdo,cerraré el pico...");
  }

}
