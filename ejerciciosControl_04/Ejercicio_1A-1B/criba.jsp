<%-- 
    Document   : tablaNumeros
    Created on : 15-feb-2019
    Author     : David Pérez pardo
    
    Ejercicio 1-A de exámen Febrero-2019 - JSP
    
    En esta tabla, se han de representar coloreados de gris los números no primos
    desde 1 hasta el número que indique el usuario. Los números primos irán 
    coloreados en el color que indique el usuario (a elegir entre varios). 
    Por tanto, desde el formulario inicial, el usuario indicará hasta qué número
    quiere llegar, y el color con el que quiere colorear los números primos.

--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Criba de Eratóstenes</h1>

    <table>
      <%
        boolean esPrimo;
        //recogida del formulario
        int tope = Integer.parseInt(request.getParameter("tope"));
        String color = request.getParameter("color");
        if (color.equals("verde")) {

          color = "green";
        } else if (color.equals("azul")) {

          color = "blue";
        } else {
          color = "yellow";
        }
        out.print("<tr>");
        //comprobacion de numeros primos
        for (int i = 1; i <= tope; i++) {
          esPrimo = true;
          for (int j = 2; j <= (i / 2) && esPrimo; j++) {
            
            if ((i % j) == 0) {

              esPrimo = false;
            }
          }
          //si es primo,le damos color
          if (esPrimo == true && (i > 1)) {

            out.print("<td bgcolor=" + color + ">" + i + "</td>\n");

          } else {

            out.print("<td bgcolor=grey>" + i + "</td>\n");
          }
          //para dividir cada fila en 10 columnas
          if ((i % 10) == 0) {

            out.print("</tr>\n<tr>");
          }
        }
      %>
      
    </table>
  </body>
</html>
