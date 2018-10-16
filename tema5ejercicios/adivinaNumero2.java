import java.util.Scanner;

public class adivinaNumero2 {
  
  public static void main (String[] args) {
    //adivina un número entre 0 y 200 y muestra si te vas acercando
    
    int numeroSecreto = 52;
    int valorInferior=0;
    int valorSuperior=200;
    int intento;
    
    do {
      System.out.print("ADIVINA EL NÚMERO\nINTRODUCE UN NÚMERO SUPERIOR A: "+valorInferior+" e inferior a "+valorSuperior+":");
      Scanner s = new Scanner(System.in);
      intento = s.nextInt();
      
      if (numeroSecreto < intento) {
        if (valorSuperior > intento) {
            valorSuperior = intento;
        }
        System.out.println ("El número secreto es menor.");
      } else if (numeroSecreto > intento) {
        if (valorInferior < intento) {
            valorInferior = intento;
        }
        System.out.println ("El número secreto es mayor.");
      }     
    } while (intento != numeroSecreto);
    
    System.out.println ("Número adivinado.");
    
    
    
  }
}
