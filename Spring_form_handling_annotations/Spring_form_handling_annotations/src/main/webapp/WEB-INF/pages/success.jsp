<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<%@ page isELIgnored="false" %>
		<title>Registration Confirmation Page</title>
	</head>
	<body>
		<h1>Registration has been completed with following details:</h1> <br>
		Name: ${USER.username}. <br>
		Password: ${USER.password}. <br>
		Age: ${USER.age}. <br>
		Gender: ${USER.gender}. <br>
	</body>
</html>