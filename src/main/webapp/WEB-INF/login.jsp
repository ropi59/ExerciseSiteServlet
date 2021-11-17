<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentificattion page</title>
</head>
<body>
	<h2>Identifiez-vous</h2>
<form method="post" action="login">
    Username: <input type = "text" name = "username" value = "${username}"/> <br/>
    Password: <input type = "password" name = "password" value = "${password}"/> <br/>
    <input type="submit" value="identify" />
</form>
</body>
</html>