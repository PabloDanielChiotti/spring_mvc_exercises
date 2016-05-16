<%@ page session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Goals report</title>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
	</head>
	<body>
		<table>
			<tr>
				<th>Minutes</th><th>Exercise Minutes</th><th>Activity</th>
			</tr>
			<c:forEach items="${goalReports}" var="goalReport">
				<tr>
					<td>${goalReport.goalMinutes}</td><td>${goalReport.exerciseMinutes}</td><td>${goalReport.exerciseActivity}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>