<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Multi Controller</h2>
	<p>
		<!-- user, is the name of the controller, remember that in the dispatcher we
		deleted the Controller part.
		add, is the function that we want to call, remember that in the dispatcher we
		deleted the User part. -->
		<a href="user/add">Add</a> User. <br>
		<a href="user/delete">Delete</a> User. <br>
		<a href="user/update">Update</a> User. <br>
		<a href="user/list">List</a> User. <br>
	</p>

</body>
</html>