package ejercicioSuelto;

/**
 * 
 * @author David Pérez Pardo
 * 
 * Programa principal:
 * 
 *  Comprobación del funcionamiento del programa directamente en el "Main".
 *  Creación de una Persona poseedora de dos Cuentas bancarias para comprobar funcionamiento.
 *
 */
public class pruebaCuentas {

  public static void main(String[] args) {
    
    Persona p1 = new Persona("77777777k");
    Cuenta c1 = new Cuenta(1);
    Cuenta c2 = new Cuenta(2,700);
    
    //añadimos cuentas de p1(comprobamos si hay más de 3)
    if(p1.comprueba()) {
      
      System.out.println("No puede tener más de 3 cuentas bancarias");
    }else {
      //añade cuentas
      p1.aniadirCuenta(c1);
      p1.aniadirCuenta(c2);
    }
    
    //ingresa nomina a la cuenta de p1
    c1.recibirAbono(1100.0);
    //paga alquiler segunda cuenta
    c2.pagaRecibo(750);
    
    
    //comprobación de morosidad  
    if(p1.esMorosa()) {
      
      System.out.print("Es Morosa!\n");
    }
    
    //transferencia a la cuenta con "numeros rojos"
    c2.seTransfiere(c1, 50);
    //comprobación de morosidad
    if(p1.esMorosa()) {
      
      System.out.print("Es Morosa!\n");
    }

    
  }

}
