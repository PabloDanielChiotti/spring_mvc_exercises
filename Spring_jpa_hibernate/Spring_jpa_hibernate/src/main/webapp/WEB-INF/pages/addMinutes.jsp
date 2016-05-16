<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Hello World with Spring 3 MVC</title>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
	</head>
	<body>
		<h1>Sign Up Form</h1><br />
		<form:form action="/Spring_jpa_hibernate/addMinutes" commandName="exercise">
			<table>
				<tr><td>Minutes Exercised For The Day Today: </td><td><form:input path="minutes" /></td></tr>
				<tr>
					<td>Activity: </td>
					<td>
						<form:select path="activity">
							<form:option value="Run" />
							<form:option value="Bike" />
							<form:option value="Swim" />
						</form:select>
					</td>
				</tr>
				<tr><td colspan="2"><input type="submit" value="Enter Exercise" /></td></tr>
			</table>
		</form:form>
	</body>
</html>