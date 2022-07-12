<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
	<form action="AdminLoginController" method="post">
		<br> Email : <input type="text" name="email">${emailError }<br>
		<br> Password : <input type="password" name="password"><br>
		<br> <input type="submit" value="Login" />
	</form><Br>
	${error}
</body>
</html>