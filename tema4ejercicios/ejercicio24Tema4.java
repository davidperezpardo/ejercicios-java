import java.util.Scanner;

public class ejercicio24Tema4 {
		
		//nomina de empleado según condiciones.
	
	public static void main (String args[]) {
	System.out.println("seleccione el cargo del empleado (1-3)");	
	System.out.println("1- Programador junior");
	System.out.println("2- Programador senior");
	System.out.println("3- Programador jefe de proyecto");

	
		Scanner s = new Scanner(System.in);
		int seleccion = s.nextInt();
	
	System.out.println("¿cuantos días ha estado visitando clientes?");
		
		Scanner t = new Scanner(System.in);
			int dias = t.nextInt();
		
	System.out.println("¿es usted  1 - (soltero)  2 - (casado)?");
		
		Scanner u = new Scanner(System.in);
		int estado = u.nextInt();
		
		int visitas = dias*30;
		
		
			switch(seleccion)	{
				
				case 1 :
						
						if (estado ==1) {

							System.out.println("sueldo base = 950" );
							System.out.println("dietas ("+ dias+") viajes = " + visitas);
							System.out.println("sueldo bruto = "+(950 + visitas));
							System.out.println("retención IRPF (25%) = " + (950+visitas)*25/100);
							System.out.println("sueldo neto = " +((950+visitas) - (25*(950+visitas)/100)));
						
						}else {

							System.out.println("sueldo base  = 950" );
							System.out.println("dietas ("+ dias+") viajes = " + visitas);
							System.out.println("sueldo bruto ="+(950 + visitas));
							System.out.println("retención IRPF (20%) = " + (950+visitas)*20/100);
							System.out.println("sueldo neto = " +((950+visitas) - (20*(950+visitas)/100)));
							
							}
							
							
				break;
				
				case 2 :
				
						if (estado == 1) {

							System.out.println("sueldo base = 1200" );
							System.out.println("dietas ("+ dias+") viajes  = " + visitas);
							System.out.println("sueldo bruto ="+(1200 + visitas));
							System.out.println("retención IRPF (25%) = " + (1200+visitas)*25/100);
							System.out.println("sueldo neto = " +((1200+visitas) - (25*(1200+visitas)/100)));
							
						}else {

							System.out.println("sueldo base = 1200" );
							System.out.println("dietas ("+ dias+") viajes  = " + visitas);
							System.out.println("sueldo bruto ="+(1200 + visitas));
							System.out.println("retención IRPF (20%) = " + (1200+visitas)*20/100);
							System.out.println("sueldo neto = " +((1200+visitas) - (20*(1200+visitas)/100)));
							
							}
							
							
				

				break;
					
				case 3 :

						if (estado ==1) {

							System.out.println("sueldo base = 1600" );
							System.out.println("dietas ("+ dias+") viajes  = " + visitas);
							System.out.println("sueldo bruto ="+(1600 + visitas));
							System.out.println("retención IRPF (25%) = " + (1600+visitas)*25/100);
							System.out.println("sueldo neto = " +((1600+visitas) - (25*(1600+visitas)/100)));
						
						}else {
							
							System.out.println("sueldo base = 1600" );
							System.out.println("dietas ("+ dias+") viajes = " + visitas);
							System.out.println("sueldo bruto = "+(1600 + visitas));
							System.out.println("retención IRPF (20%) = " + (1600+visitas)*20/100);
							System.out.println("sueldo neto = " +((1600+visitas) - (20*(1600+visitas)/100)));
							
							
							}
							
							
				default:
							
							System.out.println("no existe cargo con la opcion seleccionada");
	
			}
	
	}
}

