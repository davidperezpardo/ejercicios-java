<%--
  Calcula la media de tres notas recibidas desde formulario.
  
--%>
<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 4 - JSP</title>
</head>
<body>

<%
	double nota1 = Double.parseDouble(request.getParameter("uno"));
	double nota2 = Double.parseDouble(request.getParameter("dos"));
	double nota3 = Double.parseDouble(request.getParameter("tres")); 
	double media = (nota1 + nota2 + nota3)/3;
	//para obtener solo dos decimales
	DecimalFormat dosDecimales = new DecimalFormat("0.00");
	out.print("La media de sus notas es: " + dosDecimales.format(media));
%>


</body>
</html>