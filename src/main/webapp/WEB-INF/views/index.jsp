<%@ page language="java" contentType="text/html; charset =UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset =UTF-8">
<title>Spring Demo</title>
</head>
<body id="body">
	<h1>Welcome to Hectic Eclectic!</h1>

	<a href="/register">---Register---</a>
	<br>
	
	<table border = "1">
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