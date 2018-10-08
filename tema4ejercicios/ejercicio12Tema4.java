import java.util.Scanner;

public class ejercicio12Tema4 {
	
	public static void main (String args[]) {
		 //10 preguntas tipo test sobre 1ºDAW
		
		System.out.println("CUESTIONARIO DE 1º DAW\n");
		  
		String respuesta;
		int puntos = 0;
		
		System.out.println("1-¿QUÉ ES UN STRING?");
		System.out.println("A)Cadena de carácteres  B)Un Decimal  C)Una Suma de carácteres");
		Scanner a = new Scanner(System.in);
		respuesta = a.nextLine();
		
			if (respuesta.equals("a"))	{	puntos++;
			}
			
			System.out.println("2-¿QUE ES UN HARDWARE?");
			System.out.println("A)Una Memoria interna  B)Componente Físico del ordenador\nC)Un Registro de memoria");
			respuesta = a.nextLine();
			
			if (respuesta.equals("b"))	{	puntos++;
			}
			
			System.out.println("3-¿QUE ES HTML? ");
			System.out.println("A)lenguaje de signos  B)lenguaje de marcas  C)código web");
			respuesta = a.nextLine();
			
			if (respuesta.equals("b"))	{	puntos++;
			}
			
			System.out.println("4-¿QUE SIGNIFICAN LAS SIGLAS DED?");
			System.out.println("A) diagrama de encriptacion de datos  B)diagrama de estructura de datos  C)diagrama de entidad de datos");
			respuesta = a.nextLine();
			
			if (respuesta.equals("b"))	{	puntos++;
			}
			
			System.out.println("5-UNA CLAVE PRIMARIA SE IDENTIFICA CON:");
			System.out.println("A)CP  B)FK  C)PK");
			respuesta = a.nextLine();
			
			if (respuesta.equals("c"))	{	puntos++;
			}
			
			System.out.println("6-IF Y SWITCH SON");
			System.out.println("A)Una condicion de parada  B)una sentencia de doble flujo  C)Una sentencia condicional");
			respuesta = a.nextLine();
			
			if (respuesta.equals("c"))	{	puntos++;
			}
			
			System.out.println("7-LAS PUERTAS LÓGICAS SE DEFINEN COMO");
			System.out.println("A)circuitos de variación interna  B)Circuitos de tensión OR  C)Circuitos de conmutación integrados");
			respuesta = a.nextLine();
			
			if (respuesta.equals("c"))	{	puntos++;
			}
			
			System.out.println("8-EN JAVA, != SE DEFINDE COMO");
			System.out.println("A.Un operador lógico  B.un operador de comparación  C.Un comparador de seguros");
			respuesta = a.nextLine();
			
			if (respuesta.equals("b"))	{	puntos++;
			}
			
			System.out.println("9-CUÁL NO ES UN COMPONENTE DE UN SISTEMA DE BASES DE DATOS");
			System.out.println("A.La metadate  B.El logical  C.El administrador");
			respuesta = a.nextLine();
			
			if (respuesta.equals("a"))	{	puntos++;
			}
			
			System.out.println("10-LA / EN UNA ETIQUETA SIRVE PARA -");
			System.out.println("A.Abrirla  B.Cerrarla  C.Indentar");
			respuesta = a.nextLine();
			
			if (respuesta.equals("b"))	{	puntos++;
			}
			
			System.out.println("HA OBTENID0 UNA CALIFICACION DE "+puntos);
		  	  
	}
	
}

