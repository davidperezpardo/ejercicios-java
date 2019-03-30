<%--
  Ejercicio 20. Crea una aplicación que dibuje un tablero de ajedrez mediante una tabla
  HTML generada con bucles usando JSP y que sitúe dentro del tablero un
  alfil y un caballo en posiciones aleatorias. Las dos figuras no pueden
  estar colocadas en la misma casilla. Las filas y las columnas del tablero
  deben estar etiquetadas correctamente.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Ejercicio tablero - JSP</title>
    <link rel="Stylesheet" type="text/css" href="miestilo.css">
  </head>
  <body>
    <h1 Style="text-align: center">Tablero ajedrez</h1>


    <table Style="margin: auto">
      <tr>
        <td>A</td>
        <td>B</td>
        <td>C</td>
        <td>D</td>
        <td>E</td>
        <td>F</td>
        <td>G</td>
        <td>H</td>
      </tr>
      <tr>

        <%
          String color;
          int filaAlfil = 0;
          int filaCaballo = 0;
          int columnaAlfil = 0;
          int columnaCaballo = 0;
          String foto;
          //generacion de las posiciones del alfil y caballo.
          do {

            filaAlfil = (int) (Math.random() * 7)+1;
            filaCaballo = (int) (Math.random() * 7)+1;
            columnaAlfil = (int) (Math.random() * 7)+1;
            columnaCaballo = (int) (Math.random() * 7)+1;

          } while ((filaAlfil == filaCaballo) && (columnaAlfil == columnaCaballo));
          //para pintar el tablero
          for (int fila = 8; fila > 0; fila--) {
            out.print("<tr>");
            for (int columna = 8; columna > 0; columna--) {

              out.print("<td");
              //para el color de las columnas (posiciones tablero)
              if ((fila + columna) % 2 != 0) {

                color = "negro";
              } else {

                color = "blanco";
              }
              
              out.print(" class=\"" + color + "\">");
              //alfil
              if ((filaAlfil == fila) && (columnaAlfil == columna)) {

                out.print("<img src=\"alfil.jpg\"></td>");
              }
              //caballo
              if ((filaCaballo == fila) && (columnaCaballo == columna)) {

                out.print("<img src=\"caballo.jpg\"></td>");
              }

            }
            //nº de columna
            out.print("<td>" + fila + "</td></tr>");

          }

        %>

      <tr>
        <td>A</td>
        <td>B</td>
        <td>C</td>
        <td>D</td>
        <td>E</td>
        <td>F</td>
        <td>G</td>
        <td>H</td>
      </tr>

    </table>
  </body>
</html>