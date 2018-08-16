<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet">
<link href="js/script.css" rel="stylesheet">
</head>
<body>
	<h1>Register Page</h1>
	<br>


	<form action="username">
		<div id="box">
			First Name: <input type="text" name="firstName"> <br>
			Last Name: <input type="text" name="lastName"> <br>
			Email: <input type="text" name="email"> <br> Phone
			Number: <input type="text" name="phone"> <br>
			<div id="hidden">
				<!-- Password: <input type="text" name="password"> <br> -->
				Password: <input type="password" value="" id="myInput" name=password>

				<!-- An element to toggle between password visibility -->
				<input type="checkbox" onclick="myFunction()">Show Password
			</div>
		</div>
		<input type="submit" name="Submit"> <br>
	</form>

	<script src="js/script.js"></script>

</body>
</html>