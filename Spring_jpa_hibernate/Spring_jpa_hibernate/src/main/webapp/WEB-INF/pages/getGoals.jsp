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
				<th>ID</th><th>Minutes</th>
			</tr>
			<c:forEach items="${goals}" var="goal">
				<tr> 
					<td>${goal.id}</td><td>${goal.minutes}</td>
					<td>
						<table>
							<tr>
								<th>Exercise ID</th><th>Exercise Minutes</th><th>Exercise Activity</th>
							</tr>
							<c:forEach items="${goal.exercises}" var="exercise">
								<tr>
									<td>${exercise.id}</td><td>${exercise.minutes}</td><td>${exercise.activity}</td>
								</tr>
							</c:forEach>
						</table>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>