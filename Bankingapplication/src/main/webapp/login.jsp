<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
<form action="http://localhost:8081/Bankingapplication/login" method="post">
<label for="username">Username: </label>
<input type="text" id="username" name="username" required><br>

<label for="Password">Password: </label>
<input type="Password" id="Password" name="Password" required>

<button type="submit" >login </button></form>
<form action="http://localhost:8081/Bankingapplication/registration.jsp">
<h4>new client?</h4>
<button type="submit">Register</button>
</form>


</body>
</html>