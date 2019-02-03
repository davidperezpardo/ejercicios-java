package ejercicio6;

public class Tiempo {

  private int totalSeg;

  /**
   * @param segundos Los segundos de la hora
   * @param min      Los Minutos
   * @param hora     Las Horas
   */

  // constructor que lo usamos sólo para recoger los datos(horas,minutos,segundos).
  public Tiempo(int hora, int min, int segundos) {

    // lo pasamos todo a segundos,y lo guardamos como atributo.
    this.totalSeg = segundos + (min * 60) + (hora * 3600);

  }

  /**
   * constructor que lo usamos internamente para hacer la suma y resta.
   * 
   * @param segundos
   */
  public Tiempo(int segundos) {

    this.totalSeg = segundos;
  }

  // getter segundos totales.
  private int getSegundos() {

    return this.totalSeg;

  }

  /**
   * Método para sumar dos intervalos de tiempo (Devuelve objeto).
   * 
   * @param s Objeto Tiempo a sumar.
   * @return Un nuevo objeto de la clase Tiempo,con la suma de A y B.
   */
  public Tiempo suma (Tiempo s) {

    /*
     * Suma los segundos totales del objeto X,con los segundos totales del objeto
     * pasado como parámetro. Devuelve un nuevo objeto con la suma de los segundos
     * totales. Despues el método toString se encarga de la salida formateada del
     * objeto nuevo creado con la hora,minutos,segundos.
     * 
     */
    return new Tiempo(this.totalSeg + s.getSegundos());
  }
  
  public Tiempo resta (Tiempo s) {

    /*
     * Resta los segundos totales del objeto X,con los segundos totales del objeto
     * pasado como parámetro. Devuelve un nuevo objeto con la resta de los segundos
     * totales. Despues el método toString se encarga de la salida formateada del
     * objeto nuevo creado con la hora,minutos,segundos.
     * 
     * 
     */
    return new Tiempo(this.totalSeg - s.getSegundos());
  }

  // método toString se encarga de convertir todos los segundos en
  // hora,minuto,segundos.
  public String toString() {
    // con el total se los segundos,obtenemos hora,minuto y segundos.
    int seg = totalSeg % 60;
    int min = (totalSeg / 60) % 60;
    int hora = (totalSeg / 60) / 60;

    return hora + "h " + min + "m " + seg + "s";

  }

}
