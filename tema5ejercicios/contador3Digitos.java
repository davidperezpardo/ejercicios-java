
public class contador3Digitos {
	
	public static void main (String args[]) {
		
    /*contador del tipo 0-0-0 hasta  9-9-9 ,cada dígito es individual y los nº 3 son 
      sustituidos por E  */
    
    int digito1 = 0;
    int digito2 = 0;
    int digito3 = 0;
    String resultado = "";
    
    for (digito1 = 0; digito1 <=9; digito1++) {  //tres bucles for para cada dígito
     
      for(digito2 = 0; digito2 <=9; digito2++) { 
       
        for(digito3 = 0; digito3 <=9; digito3++) { 
          if(digito1 == 3) {
            resultado += "E";     
          }
          else{
            resultado +=digito1;
          }
          if(digito2 == 3) {
            resultado +="-E";
          }
          else{
            resultado +="-"+digito2;        //usamos "resultado" para introducir
          }                                 //todos los digitos y la "-E" 
                                          
          if(digito3 == 3) {
            resultado +="-E  ";
          }
          else{
          resultado +="-"+digito3+"  ";
          }
        }
      }System.out.print(resultado);   /*"resultado" ya incluye todos los dígitos
                                      * y la "-E" en caso true */
    }  
	 
  }
}

