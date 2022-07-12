<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	Welcome , ${cookie.firstName.value}
	<br>

	<a href="LogoutController">Logout</a>
	<a href="ExtendSession.jsp">ExtendSession</a>
	<a href="InputCookie.jsp">Input Cookie</a>
	<a href="ViewCookies.jsp">ViewCookie</a>
	<a href="PrintAllRequestHeaderController">PrintAllHeaders</a>
</body>
</html>