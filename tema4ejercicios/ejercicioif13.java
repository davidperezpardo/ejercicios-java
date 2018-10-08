import java.util.Scanner;

public class ejercicioif13 {
	
	public static void main (String args[]) {
  
		//tres numeros ordenados en orden ascendentes.
    
    System.out.println("se ordenaran tres números enteros de mayor a menor que introduzca por pantalla");
	
    Scanner s = new Scanner(System.in);
    System.out.println("introduzca primer número");
    int n1 = s.nextInt();
  
    System.out.println("introduzca segundo número");
    int n2 = s.nextInt();
  
    System.out.println("introduzca tercer");
    int n3 = s.nextInt();
    
    int mayor,mediano,menor;
    
      if ((n1 >= n2) && (n1 >= n3)) { mayor = n1;
        
      }	else if ((n2 >= n1) && (n2 >= n3))  { mayor = n2;
        
      } else { mayor = n3;    
              
      }       
              
      
      if ((n1 <= n2) && (n1 <= n3))  { menor = n1;
                
      } else if ((n2 <= n1) && (n2 <= n3)) { menor = n2;
                  
      } else  { menor = n3;
                    
      } 
                   
				/* A la suma de los 3 numeros introducidos  le restamos 
         * la suma del mayor con el menor para obtener el mediano*/
                        
      mediano = (n1 + n2 + n3) - (mayor + menor);
      System.out.println(mayor + " " + mediano + " " + menor);
                        
                        
              
                
              
              
              
                
              
            
          
            
          
          
          
          
          
          
          
                
              
    
  }             
}

