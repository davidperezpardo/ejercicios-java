package ejercicio5_2;

public class Articulo {

  private String codigo = "VACIO";
  private String descripcion;
  private float precioCompra;
  private float precioVenta;
  private int stock;
  

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(float precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(float precioVenta) {
    this.precioVenta = precioVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  /**
   * Aumenta el stock de los artículos que entran al almacén.
   * 
   * @param entra Cantidad del mismo artículo.
   */
  public void entrante(int entra) {

    stock += entra;
    System.out.println("--Artículos añadidos al Stock--");
  }

  /**
   * Disminuye el Stock de los artículos que salen del almacén.
   * 
   * @param sale Cantidad del mismo artículo.
   */
  public void saliente(int sale) {

    if (stock < sale) {

      System.out.println("!Stock insuficiente del artículo:\nCódigo: " + codigo + " |" + 
      descripcion + "\nStock:" + stock);
      
    } else {

      stock -= sale;
    }

  }

  public String toString() {
    return "----------------------------" + "\nCódigo:" + codigo + "\nDescripcion:" + descripcion
        + "\nPrecio de Compra:" + precioCompra + "\nPrecio de Venta:" + precioVenta + "\nStock:" + stock;
  }

}
