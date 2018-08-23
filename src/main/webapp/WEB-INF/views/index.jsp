<%@ page language="java" contentType="text/html; charset =UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset =UTF-8">
<title>Spring Demo</title>
</head>
<body>
	<div id="image">

		<h1>Welcome to Hectic Eclectic!</h1>
	</div>
	<a href="/register">---Register---</a>
	<br>

	<h1>Search For People</h1>

	<form action="search">

		Name Of Item: <input type="text" name="personid"> <br> <input
			type="submit" value="Search">
	</form>

	<table border="1">
		<c:forEach var="item" items="${items}">
			<tr>
				<!-- left out title on purpose -->
				<td>${item.itemName}</td>
				<td>${item.itemType}</td>
				<td>$${item.itemPrice}</td>
				<td>${item.itemQuant}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>