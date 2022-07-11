<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

Something went Wrong...<br>


	<%=exception.getMessage()%>
	
	<%out.print(exception.getMessage());%>
	
	
	<%=exception.getClass().getName() %>
	
	
</body>
</html>