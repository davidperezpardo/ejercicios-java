import java.util.Scanner;

public class ejercicio10Tema4 {
	
	//horóscopo a partir del dia y mes de nacimiento
	
	public static void main (String args[]) {
	
	System.out.println("HORÓSCOPO");
	
	System.out.println("introduzca su dia de nacimiento");
	
		Scanner s = new Scanner(System.in);
	
		int dia = s.nextInt();
	
	System.out.println("introduzca su mes de nacimiento (letras)");
	
		Scanner m = new Scanner(System.in);
	
		String mes =m.nextLine();
	
		
			switch(mes)	{
			
				case "enero" :
			
					if (dia <= 20  ) {System.out.println("es usted capricornio");
					
					}else if (dia <32 || dia >20) {System.out.println("es usted acuario");
							
							}
					
				break;
				
				case "febrero" :
				
					if (dia <20 ) {System.out.println("es usted capricornio");
					
					}else if (dia <19 || dia <28)  {System.out.println("es usted piscis");
							}
						
				
				case "marzo" :
				
					if (dia <21)	{System.out.println("es usted piscis");
						
					}else if (dia <20 || dia <31) {System.out.println("es usted piscis");
						
							}
				
				break;
				
						
				case "abril" :
				
					if (dia <21 ) { System.out.println("es usted aries");
						
					}else if (dia <20 || dia <31) { System.out.println("es usted tauro");
					
						 }
				
				break;
				
						
				case "mayo" :
				
					if (dia <22) { System.out.println("es usted tauro");
						
					}else if (dia <21 || dia <32) {System.out.println("es usted géminis");
						
							}
				
				break;
				
							
				case "junio" :
				
				  if (dia <23) { System.out.println("es usted géminis");
						
					}else if (dia <22 || dia <31) {System.out.println("es usted cáncer");
						
							}
				
				break;
				
						
				case "julio" :
				
					if (dia <24) { System.out.println("es usted cáncer");
						
					}else if (dia <23 || dia <32) {System.out.println("es usted leo");
						
							}
				
				break;
				
			
				case 	"agosto" :
				
					if (dia <24) { System.out.println("es usted leo");
						
					}else if (dia <23 || dia <31) {System.out.println("es usted virgo");
						
							}
				
				break;
				
					
				case "septiembre" :
				
					if (dia <24) { System.out.println("es usted virgo");
						
					}else if (dia <23 || dia <32) {System.out.println("es usted libra");
						
							}
				
				break;
				
					
				case "octubre" :
				
					if (dia <24) { System.out.println("es usted libra");
						
					}else if (dia >23 || dia <31) {System.out.println("es usted escorpio");
						
							}
				
				break;
				
				
				case "noviembre" :
				
					if (dia <23) { System.out.println("es usted escorpio");
						
					}else if (dia >22 || dia <32) {System.out.println("es usted sagitario");
						
							}
				
				break;
				
				
				case "diciembre" :
				
					if (dia <22) { System.out.println("es usted sagitario");
						
					}else if (dia >21 || dia <31) {System.out.println("es usted capricornio");
						
							}
				
				break;
				
				
				default:
				
				
				
				
		
					
						
	
	
		  
	
			}
		
	}
}

