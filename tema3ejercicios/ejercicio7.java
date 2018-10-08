public class ejercicio7 {
  
  public static void main (String [] args ) {

  /* programa que calcula el total de una factura a partir
    de la base imponible (precio sin IVA).*/
  
  double baseImponible = 234.56 ;
  double iva = baseImponible*0.21;
  double total = baseImponible*1.21;
  
  System.out.println("base imponible = " + baseImponible);
	System.out.println("IVA = " + iva);
	System.out.printf("total = %.2f",  total); 
 
 
 }
 
}

