<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<form method="post" action="ExtendSessionController">
		TimeOut Minutes: <select name="time">
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>4</option>
			<option>5</option>
			<option>10</option>
		</select><br><br>
		<input type="submit" value="Modify My Time">
	</form>
</body>
</html>