<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Práctica Tema 3</title>
</head>
<body>
	<div class="content">
		<b>Bienvenido a mi Práctica del Tema 3</b>
		<p>
			Hoy es
			<%=Calendar.getInstance().getTime()%></p>
		<%
		String saludo;
		int horaDelDia = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (horaDelDia < 12) {
			saludo = "Buenos días!";
		} else if (horaDelDia >= 12 && horaDelDia < 21) {
			saludo = "Buenas tardes!";
		} else {
			saludo = "Buenas noches!";
		}
		%>
		<p><%=saludo%></p>
		<a href="index.html">Volver</a>
	</div>
</body>
</html>