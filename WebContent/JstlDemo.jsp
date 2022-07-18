<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>

	<%
		int i = 10;
	%>
	<%=i%>

	<c:set var="j" value="100"></c:set>
	<c:out value="${j}"></c:out>
	<c:remove var="j" />

	<c:set var="num" value="501" />
	<br>
	<c:if test="${num % 2 == 0 }">
	${num} Even 
</c:if>

	<c:if test="${num % 2 != 0 }">
	${num} Odd  
</c:if>


	<c:catch var="e">
		<%
			int a = 10, b = 0, c;
				c = a / b;
		%>

	</c:catch>

	${e}


	<c:set var="choice" value="3">

	</c:set>

	<c:choose>
		<c:when test="${choice == 3}">
			choice 3 
		</c:when>

		<c:when test="${choice == 4}">
			choice 4 
		</c:when>

		<c:otherwise>
			Default....
		</c:otherwise>

	</c:choose>

<br><Br>
	<c:forTokens items="1,2,3,4,5" delims="," var="x">
		${x}<br>
	</c:forTokens>
<br><br> 
	<c:forEach var="q" begin="1" end="7" step="1">
		${q }<br>
	</c:forEach>
<br><br>



	<%-- 	<c:forEach var="user" items="${users}">
	
			${user.firstName}

	</c:forEach> --%>





</body>
</html>