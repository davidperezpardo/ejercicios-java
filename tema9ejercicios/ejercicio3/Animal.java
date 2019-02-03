package ejercicio3;

public abstract class Animal {

  private Sexo sexoAnimal;
  private String nombre;

  //constructor
  public Animal (String nombre) {
    
    //sexo por defecto
    sexoAnimal = Sexo.MACHO;
    this.nombre = nombre;
  }
  
  //constructor 
  public Animal(Sexo s, String nombre) {
    
    sexoAnimal = s;
    this.nombre = nombre;
    
  }
  //getter 
  public Sexo getSexoAnimal() {
    
    return this.sexoAnimal;
  }
  //getter 
  public String getNombre() {
    
    return this.nombre;
  }
  
  //método de instancia
  public void come() {
    
    System.out.println("ñamm ñamm ñammm...."+nombre+" está comiendo");
  }
  
  //método de instancia
  public void duerme () {
    
    System.out.println("zzzzziii zzzzzz...."+nombre+" duerme");
  }
  
  

}
