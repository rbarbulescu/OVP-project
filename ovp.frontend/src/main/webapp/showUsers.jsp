<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="users">Click</a>

	<table style="border:2px">
		<thead>
			<tr>
				<th>email</th>
				<th>User Name</th>
				<th>User Type</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="user" items="${users}">
				<tr>
					<td><c:out value="${user.email}" /></td>
					<td><c:out value="${user.userName}" /></td>
					<td><c:out value="${user.userTypeId}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>