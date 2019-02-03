package ejercicio3;

/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario,
 * Pinguino y Lagarto. Crea, al menos, tres métodos específicos de
 * cada clase y redefine el/los método/s cuando sea necesario.
 * Prueba las clases creadas en un programa en el que se instancien
 * objetos y se les apliquen métodos.
 * 
 * @author David Perez Pardo
 * 
 */
public class PruebaAnimales {

  public static void main(String[] args) {
    
    Gato garfield = new Gato (Sexo.MACHO,"garfield"); 
    garfield.amamanta();
    
    Lagarto rodrigo = new Lagarto("rodrigo");    
    rodrigo.tomaElSol();
    
    Pinguino pingu = new Pinguino(Sexo.MACHO, "pingu", "emperador");
    pingu.raza();
    pingu.migrar();
    
    Canario paquito = new Canario("paquito","amarillo");
    paquito.come("manzana");
    
    Perro mila = new Perro(Sexo.HEMBRA,"mila");
    mila.amamanta();
     
    Perro scooby = new Perro (Sexo.MACHO,"scooby");
    scooby.cuidaCrias();
    scooby.darPremio("hueso");
    
    
    
   
   
   
    
    
  }

}
