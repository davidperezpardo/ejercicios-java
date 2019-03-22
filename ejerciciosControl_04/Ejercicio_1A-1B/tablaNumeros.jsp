<%-- 
    Document   : tablaNumeros
    Created on : 15-feb-2019
    Author     : David Pérez pardo
    
    Ejercicio 1-B de exámen Febrero-2019 - JSP
    
    Tabla de números desde el 1 hasta el número que indique el usuario, de manera 
    que los números que contengan un determinado dígito (0-9) aparezcan de
    color rojo, y los que no contengan dicho dígito, aparezcan de color negro. 
    El usuario indicará desde un formulario el dígito que quiere señalar, la 
    cantidad de números que se representarán por cada fila de la tabla, y
    el número hasta el que se quiere llegar. 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>tabla de numeros</title>
  </head>
  <body>
    <h1>Tabla de números</h1>
    <table border="1">

      <%
          //Recogida datos del formulario
          int tope = Integer.parseInt(request.getParameter("tope"));
          int fila = Integer.parseInt(request.getParameter("fila"));
          int senial = Integer.parseInt(request.getParameter("senial"));
          //variables utilizadas
          int contador = 0;
          int resto = 0;
          int aux = 0;
          boolean contiene;
          out.print("<tr>");

          for (int i = 1; i <= tope; i++) {

            contador++;
            aux = i;
            contiene = false;
            //comprobamos si se encuentra el dígito introducido
            while (!contiene && aux > 0) {
              //obteniendo cada dígito del número mediante el operador módulo %.
              resto = aux % 10;
              if (resto == senial) {
                
                //En la primera ocurrencia del dígito,damos color rojo al numero y salimos del while.
                contiene = true;
                out.print("<td Style=color:red>" + i + "</td>");
              }
              else {
                //si aún no se encontró,dividimos entre 10 para comprobar el siguiente dígito.
                aux /= 10;
              }             
            }
            if(aux == 0) {
                //sin color rojo
                out.print("<td>" + i + "</td>");                               
              }            
            //para dividir las filas según cantidad de numeros elegidos.
            if (contador == fila) {
              contador = 0;
              out.print("</tr><tr>");
            }
          }//for
      %> 

    </table>
  </body>
</html>
