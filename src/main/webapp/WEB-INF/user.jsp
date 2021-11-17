<%@ page import= "models.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fiche élève</title>
</head>
<body>
	<h1>Fiche élève</h1>
	
	<% User user = (User) request.getAttribute("USER"); %>
	<ul>
		<li>
			Nom : <b><%= user.getName()%></b>
		</li>
		<li>
			Prénom : <b><%= user.getFirstname()%></b>
		</li>
		<li>
			Age : <b><%= user.getAge()%></b>
		</li>
		<li>
			Note : <b><%= user.getNote()%></b>
		</li>
		<li>
			Formation : <b><%= user.getFormation()%></b>
		</li>
	</ul>
</body>
</html>