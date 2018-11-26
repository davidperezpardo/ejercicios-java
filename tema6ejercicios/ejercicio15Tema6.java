
public class ejercicio15Tema6{
	
	public static void main (String args[]) {
    //generador de melodias con grupo de 4 notas musicales al azar.
    //la ultima nota de la melodia coincide siempre con la primera.
    String primera = " ";
    String nota = " ";
    int melodia = 4*(int)(Math.random()*7+1);
    for(int i=1; i<=melodia; i++){
        switch((int)(Math.random()*7)+1) {
          case 1:
            nota = "do";
            break;
            
          case 2:
            nota = "re";
            break;
          
          case 3:
            nota = "mi";
            break;
          
          case 4:
            nota = "fa";
            break;
          
          case 5:
            nota = "sol";
            break;
       
          case 6:
            nota = "la";
            break;
       
          case 7:
            nota = "si";
            break;
      
        }
    
        if(i == 1){
          primera = nota;
        }
        if(i == melodia){
          nota = primera;
        }
        System.out.print(nota+" ");
        if(i == melodia){
          System.out.print("||"); //marca el final de la melodia
        }
        else if(i%4 == 0){  //para separar en grupos de 4 notas con una barra
          
          System.out.print("|");
        }
    }
  }
}

