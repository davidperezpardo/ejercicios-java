package ejercicioSuelto;
/**
 * 
 * @author David Pérez Pardo
 * Clase Cuenta
 */

public class Cuenta {

  private double saldo;
  private int numCuenta;
  
  //constructor
  public Cuenta (int numero,double saldo) {
    
    this.saldo = saldo;
    this.numCuenta = numero;
  }
  
  //constructor 2
  public Cuenta (int numero) {
    this.saldo = 0;
    this.numCuenta = numero;
  }
  
  //método para consultar el saldo disponible
  public double consultarSaldo() {
    
    return this.saldo;
  }
  
  //metodo para recibir abonos en la cuenta
  public void recibirAbono(Double saldo) {
    
    this.saldo += saldo;
  }
  
  
  //método para pagar recibos
  public void pagaRecibo (double recibo) {
    
    this.saldo -= recibo;
  }
  
  
  
  //método para las transferencias
  public void seTransfiere (Cuenta c,double dinero) {
    
    if(c.consultarSaldo() >= dinero) {
      
      this.saldo += dinero;
      c.pagaRecibo(dinero);
    }
  }
  
  
  public String toString() {
    
    
    return "Nº cuenta:" + this.numCuenta + "\nSaldo:" + this.saldo;
  }
}
