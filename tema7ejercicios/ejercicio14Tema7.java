import java.util.Scanner;
public class ejercicio14Tema7 {
	
	public static void main (String args[]) {
    /*se le piden 8 palabras al usuario,se almacenan en array,
     * si coinciden con colores  del array de colores,
     * se separaran de izquierda a derecha,y seguidos la palabras
     * que no sean colores.*/
     
    String[] colores = {"verde","rojo","azul","amarillo","naranja","rosa",
      "negro","blanco","morado"};
    String [] palabras = new String [8];
    String [] auxiliar = new String [8];
    int j = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("introduzca 8 palabras con algún color si lo desea,\n");
    System.out.print("si introduce algun color conocido por el sistema,\nse separaran del resto de palabras\n");
    for(int i= 0; i<8; i++) {
      System.out.println("introduzca palabra " + (i+1) + ":"); 
      palabras[i] = s.next();   //para almacenar palabras introducidas
      for(String p:colores){   //bucle foreach,recorre array colores entero  por cada pasada de (i).
        if(palabras[i].equals(p)){  //si alguna palabra coincide con color,se almacena en array auxiliar
          auxiliar[j++] = p;
        }
      }
    }
    for(int i=0; i<8; i++){
      boolean esColor = false;  
      for(String c : colores){      
        if(palabras[i].equals(c)){    //se comprueban si coinciden colores
          esColor = true;       
        }
      }
      if(!esColor){   //si es falso,no coincide algun color
        auxiliar[j++] = palabras[i];  /*se almacena la palabra que no es color,despues de los colores.*/
      }
    }
    System.out.println("    ARRAY ORIGINAL: con las palabras introducidas por usted\n");
    for(int i=0; i<8; i++){
      System.out.printf("%9d|",i);
    }
    System.out.println();
    for(int i=0; i<8; i++){
      System.out.printf("%9s|",palabras[i]);
    }
    System.out.println();
    System.out.println("\n    colores del sistema:\n");
    for(int i=0; i<8; i++){
      System.out.printf("%9s|",colores[i]);
    }
    System.out.println();
    System.out.print("\n    ARRAY FINAL: colores de izquierda a derecha\n");
    System.out.println();
    for(int i=0; i<8; i++){
      System.out.printf("|%9d",i);
    }
    System.out.println();
    for(String a : auxiliar){
      System.out.printf("|%9s",a);
    }
  }
}

