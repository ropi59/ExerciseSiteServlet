<%@ page import= "models.Formation" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formation</title>
</head>
<body>
<h1>Formation</h1>

	<% Formation formation = (Formation) request.getAttribute("FORMATION"); %>
	<ul>
		<li>
			Intitul� de la formation : <b><%= formation.getTitle()%></b>
		</li>
		<li>
			Programme : <b><%= formation.getProgram()%></b>
		</li>
		<li>
			Nombre d'�l�ves : <b><%= formation.getNbStudent()%></b>
		</li>
	</ul>
</body>
</html>