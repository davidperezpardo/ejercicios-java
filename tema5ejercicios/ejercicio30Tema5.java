import java.util.Scanner;

public class ejercicio30Tema5 {
	
	public static void main (String args[]) {
    //cuenta las horas que hay entre dos horas de dos días de la semana elegidos.
    //solo las horas formato 1,2,3...22,23,00.    
        Scanner s = new Scanner(System.in);
        System.out.println("PARA SABER CUANTAS HORAS HAY ENTRE DOS DÍAS DE LA SEMANA");
        System.out.println("Y DOS HORAS DISTINTAS ");
        System.out.println("SELECCIONE PRIMER DÍA DE LA SEMANA (nº)");
        System.out.println("1(LUNES  2(MARTES  3(MIÉRCOLES  4(JUEVES  5(VIERNES  6(SÁBADO  7(DOMINGO");
        int dia = s.nextInt();
        while((dia <= 0) || (dia >7)){
          System.out.println("DIA INCORRECTO: vuelva a introducir el día de la semana(1-7)");
          dia = s.nextInt();
        }
        String primer = "";
        switch(dia) {
          case 1:
          primer ="lunes";
          break;
          
          case 2:
          primer ="martes";
          break;
          
          case 3:
          primer ="miércoles";
          break;
          
          case 4:
          primer ="jueves";
          break;
          
          case 5:
          primer ="viernes";
          break;
         
          case 6:
          primer ="sábado";
          break;
          
          case 7:
          primer ="domingo";
          break;
          
          default:
        }
        System.out.println("INTRODUZCA LA HORA (solo hora):");
        int primeraHora = s.nextInt();
        while((primeraHora <0) || (primeraHora >23)){
          System.out.println("hora incorrecta,la hora debe ser entre 0 y 23");
          System.out.println("VUELVA A INTRODUZCA LA HORA :");
          primeraHora = s.nextInt();
        }
        System.out.println("SELECCIONE SEGUNDO DÍA DE LA SEMANA (nº)");
        System.out.println("1(LUNES 2(MARTES 3(MIÉRCOLES 4(JUEVES 5(VIERNES 6(SÁBADO 7(DOMINGO");
        int dia2 = s.nextInt();
        while(dia2 < dia){
          System.out.println("el 2 ª día de la semana debe ser posterior al 1º");
          System.out.println("Vuelva a seleccionar el segundo dia de la semana");
          dia2 = s.nextInt();
        }  
        while(dia2 <=0 || dia2 >7){
          System.out.println("2º DÍA INCORRECTO,VUELVA A INTRODUCIR EL DÍA (1-7)");
          System.out.println("1(LUNES  2(MARTES  3(MIÉRCOLES  4(JUEVES  5(VIERNES  6(SÁBADO  7(DOMINGO");
          dia2 = s.nextInt();
        }
        String segundo = "";
        switch(dia2) {
          case 1:
          segundo  ="lunes";
          break;
          
          case 2:
          segundo ="martes";
          break;
          
          case 3:
          segundo ="miércoles";
          break;
          
          case 4:
          segundo ="jueves";
          break;
          
          case 5:
          segundo ="viernes";
          break;
         
          case 6:
          segundo ="sábado";
          break;
          
          case 7:
          segundo ="domingo";
          break;
          
          default:
        }
        System.out.println("INTRODUZCA  HORA DEL 2ª DÍA (solo hora):");
        int segundaHora = s.nextInt();
        while((segundaHora <0) || (segundaHora >23)){
          System.out.println("hora incorrecta,la hora debe ser entre 0 y 23");
          System.out.println("VUELVA A INTRODUZCA LA HORA :");
          segundaHora = s.nextInt();
        }
        dia2 *=24;
        dia *=24;
        System.out.println("desde las "+primeraHora+":00 del  "+primer+" hasta");
        System.out.println("las "+segundaHora+":00 del  "+segundo+" van "+((dia2 + segundaHora) -(dia + primeraHora))+" horas");
  }
}

