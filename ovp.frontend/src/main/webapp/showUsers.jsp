<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show users</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="index.html">Home</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="#">About</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Contact</a></li>
				<li class="nav-item"><a class="nav-link" href="addUser.jsp">Sign
						up!</a>
				<li class="nav-item"><a class="nav-link" href="login.jsp">Log
						in</a></li>
			</ul>
		</div>
	</nav>
	<p>
		<a href="findUser.jsp">Find</a> user
	</p>

	<table>
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
					<td><c:choose>
							<c:when test="${user.userTypeId == 1.0}">
								<p>Admin</p>
							</c:when>

							<c:when test="${user.userTypeId == 2.0}">
								<p>Student</p>
							</c:when>

							<c:when test="${user.userTypeId == 3.0}">
								<p>Checker</p>
							</c:when>

							<c:when test="${user.userTypeId == 4.0}">
								<p>Visitor</p>
							</c:when>

							<c:when test="${user.userTypeId == 5.0}">
								<p>Relative</p>
							</c:when>

							<c:otherwise>
								<p>Unknown</p>
							</c:otherwise>
						</c:choose></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>