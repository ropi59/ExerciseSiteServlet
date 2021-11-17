<%@page import="java.util.List"%>
<%@page import="models.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des étudiants</title>
</head>
<body>
<h1>Liste des étudiants</h1>
<ul>
	<% for (User user : (List<User>) request.getAttribute("USER")) { %>
		<li>	
			<a href="/OlivierServletExercise/user?name=<%= user.getName() %>"><%= user.getName() + " " + user.getFirstname() %></a>
		</li>
	<% } %>
</ul>
</body>
</html>