import java.util.Scanner;
public class ejercicio15Tema7 {
	
	public static void main (String args[]) {
    /*restaurante con 10 mesas (array de 10),las mesas salen primero 
     * con una ocupación aleatoria (max 4 personas) y cada vez que 
     * llegan grupos de entre 1 y 4,se le van sentando en las mesas
     * coforme a la disponibilidad,sin romper los grupos.
     * empezando por las mesas vacías.
     * si el grupo es de 4,se sentaran en una mesa vacia (0).*/
     
    int[] mesa = new int[10];
    int grupo;
    //mesas con grupos aleatorios en un primer momento.
    for( int i=0; i<10; i++){
      mesa[i]= (int)(Math.random()*5);
    }
    //bucle do para imprimir array e indice en cada pasada
    do{
      System.out.print("mesa nº  ");
      for( int i=0; i<10; i++){
        System.out.printf("%3d|",i+1);
      }
      System.out.print("\nocupación");
      for( int i=0; i<10; i++){
        System.out.printf("%3d|",mesa[i]);
      }
      Scanner s = new Scanner(System.in);
      do{
        System.out.println("\n\n¿CUÁNTOS SON?  (introduzca -1 para salir del programa)");
        grupo = s.nextInt();
        if(grupo >4){
          System.out.println("\nlo siento,no admitimos grupos de "+grupo+",\nhaga grupos de máximo 4 personas e intentelo de nuevo");
        }
      }while(grupo >4 ); 
      boolean mesaVacia = false;
      int vacia = 0;          
      for(int i=9; i>=0; i--){  //hacía atrás,para rellenar mesas desde la primera
        if((mesa[i]==0) && (grupo!=-1)){    //si mesa está vacía,
          vacia = i;       //se guarda su indice
          mesaVacia = true;
        }
      }
      if(mesaVacia==true){  //si se cumple que mesa está vacía...
        System.out.println("porfavor,siéntese en la mesa nº "+(vacia+1)+"\n");
        mesa[vacia] += grupo; //a la mesa vacía,se le mete el grupo
      }
      else{
        int compartir = 0;
        boolean muyGrande = true;
        for(int i=9; i>=0; i--){  //hacía atrás,para rellenar mesas desde la primera
          if((mesa[i]) + (grupo) <5){ //si ocupacion de mesa + el grupo caben,se sientan
            compartir = i;    //se guarda posicion de la mesa donde caben
            muyGrande = false;
          }
        }
        if((muyGrande == false) && (grupo!=-1)){ //grupo!=-1  para que no aparezca mensaje al salir del programa
          mesa[compartir] +=grupo;    //grupo se suma a la ocupacion de la mesa
          System.out.println("\ntendrá que compartir mesa,porfavor siéntese en la mesa nº "+(compartir+1)+"\n");
        }
        if(muyGrande){
          System.out.println("\nlo sentimos,no queda hueco\n");
        }
      } 
    }while(grupo !=-1); //para salir del programa
  }
}

