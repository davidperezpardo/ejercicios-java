package ejercicio3;

public  class Mamifero extends Animal {

  //constructor
  public Mamifero (Sexo s,String nombre) {
    //pasa parámetros del constructor,al constructor de la superclase(animal)
    super(s,nombre);
  }
  
  //método de instancia
  public void amamanta () {
    
    if(getSexoAnimal().equals(Sexo.HEMBRA)) {
      System.out.println("Daré de mamar a mis 7 crías...");
      
    }else {
      System.out.println("Soy un macho,no puedo dar de mamar!");
    }  
  }
  
  //método de instancia
  public void cuidaCrias() {
    
    if(getSexoAnimal() == Sexo.HEMBRA) {
      System.out.println("Estoy cuidando de mis crías!!");
    }
    else {
      System.out.println("De eso se encarga su mamá!");
    }
  }
  


}
