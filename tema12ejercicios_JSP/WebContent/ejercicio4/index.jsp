<%--
Pide 3 notas mediante formulario y calcula su media.

--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 4 - JSP</title>
</head>
<body>

	<h3>Calcula la media de tres notas</h3>

	<form method="get" action="media.jsp">
		Nota 1 <input type="number" name="uno" min="0" max="10" step="0.01" value="0"><br><br>
		Nota 2 <input type="number" name="dos" min="0" max="10" step="0.01" value="0"><br><br>
		Nota 3 <input type="number" name="tres" min="0" max="10" step="0.01" value="0">
		<input type="submit" name="enviar">



	</form>

</body>
</html>