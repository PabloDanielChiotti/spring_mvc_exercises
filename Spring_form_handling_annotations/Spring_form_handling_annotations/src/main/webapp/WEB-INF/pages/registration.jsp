<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Hello World with Spring 3 MVC</title>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
	</head>
	<body>
		<h1>Sign Up Form</h1><br />
		<form:form action="/Spring_form_handling_annotations/registration" commandName="USER">
			<table>
				<tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr>
				<tr><td>User Name: </td><td><form:input path="username" /></td></tr>
				<tr><td>Password: </td><td><form:input path="password" /></td></tr>
				<tr><td>Age: </td><td><form:input path="age" /></td></tr>
				<tr>
					<td>Gender: </td>
					<td>
						<form:select path="gender">
							<form:option value="Male" />
							<form:option value="Female" />
						</form:select>
					</td>
				</tr>
				<tr><td colspan="2"><input type="submit" value="Save Changes" /></td></tr>
			</table>
		</form:form>
	</body>
</html>