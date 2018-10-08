import java.util.Scanner;

public class ejercicioif8 {
	
	//calificacion boletín de notas
	
	public static void main (String args[]) {
  
  System.out.println("introduzca la primera nota");
  Scanner s = new Scanner(System.in);
  double nota1 = s.nextDouble();
  
  
  System.out.println("introduzca la segunda nota");
  double nota2 = s.nextDouble();
  
  System.out.println("introduzca la tercera nota:");
  double nota3 =s .nextDouble();
	
  double notaF = (nota1 + nota2 + nota3)/3;
  
  System.out.printf("la nota media que tiene usted es : %.2f\n",(nota1 + nota2 + nota3)/3);
  
		if (notaF <5 ) {System.out.println("boletín de notas: insuficiente");
		
		} 
		
		if ((notaF >= 5) && ( notaF <= 5.9)) {System.out.println("boletín de notas:suficiente");
			
		} 
		
		if ((notaF >=6) && (notaF <=6.9)) {System.out.println("boletín de notas: bien");
				
		} 
		
		if ((notaF >=7) && (notaF <8.5)) { System.out.println("boletín de notas: notable");
						
		} 
		
		if (notaF >=8.5) {System.out.println("boletín de notas: sobresaliente");
  
		}
          
    
    
  }

}

  

        
  
  
  
 
  



