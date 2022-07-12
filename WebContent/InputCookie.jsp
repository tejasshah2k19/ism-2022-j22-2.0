<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Cookie</title>
</head>
<body>
<form action="SaveCookieController" method="post">
	Input Cookie : <input type="text" name="cName"/><br><br>
	Input Value : <input type="text" name="cValue"/><br><br>
	<input type="submit" value="Save Cookie"/>
</form>
</body>
</html>