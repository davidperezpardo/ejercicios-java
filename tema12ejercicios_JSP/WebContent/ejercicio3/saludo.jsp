<%--
Programa que pide tu nombre. A continuación mostrará "Hola"
seguido del nombre introducido. El nombre se recoge mediante un
formulario.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 3 - JSP</title>
</head>
<body>

  <%  
    out.print("hola " + request.getParameter("nombre"));

  %>

</body>
</html>