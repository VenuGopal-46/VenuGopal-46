<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration page</title>
</head>
<body>
<form action="http://localhost:8081/Bankingapplication/registration" method="post">

<label for="userfullname"> Userfullname: </label>
<input type="text" id="userfullname" name=userfullname required><br>

<label for="username">Username: </label>
<input type="text" id="username" name="username" required><br>

<label for="Password">Password: </label>
<input type="Password" id="Password" name="Password" required><br>

<label for="Email">Email: </label>
<input type="email" id="email" name="email" required><br>

<label for="ContactNo">ContactNo: </label>
<input type="text" id="contactNo" name="contactNo" required><br>

<label for="Useraddress">Useraddress: </label>
<input type="text" id="useraddress" name="useraddress" required><br>

<button type="submit"> register your details </button>

</form>

</body>
</html>