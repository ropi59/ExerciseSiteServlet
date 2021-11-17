<%@page import="java.util.List"%>
<%@page import="models.Formation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des formations</title>
</head>
<body>
<h1>Liste des formations</h1>
<ul>
	<% for (Formation formation : (List<Formation>) request.getAttribute("FORMATION")) { %>
		<li>	
			<a href="/OlivierServletExercise/formation?title=<%= formation.getTitle() %>"><%= formation.getTitle() %></a>
		</li>
	<% } %>
</ul>
</body>
</html>