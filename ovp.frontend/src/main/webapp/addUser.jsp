<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="css/loginStyle.css">
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

<title>AddUser</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="index.jsp">Home</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="about.jsp">About</a></li>
				<li class="nav-item"><a class="nav-link" href="contact.jsp">Contact</a></li>
				<li class="nav-item"><c:choose>
						<c:when test="${logged == 1}">
							<a class="nav-link" href="updateUser.jsp">Edit <c:out
									value="${user.userName}" /></a>
						</c:when>
						<c:otherwise>
							<a class="nav-link" href="addUser.jsp">Sign up!</a>
						</c:otherwise>
					</c:choose></li>
				<li class="nav-item"><c:choose>
						<c:when test="${logged == 1}">
							<a class="nav-link" href="LogoutServlet">Log out</a>
						</c:when>
						<c:otherwise>
							<a class="nav-link" href="login.jsp">Log in</a>
						</c:otherwise>
					</c:choose></li>

			</ul>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row justify-content-center">
			<div class="col-xl-4 col-lg-5 col-md-6 col-sm-8 col-xs-12">
				<div class="wrapper-card">
					<img src="images/img_avatar2.png" class="center-image">
					<form class="form-container" method="POST" action="CreateUserServlet">
						<h4 class="text-center font-weight-bold">Sign up Form</h4>
						<div class="form-group wrapper">
							<input type="text" class="form-control" id="inputEmail"
								placeholder="Enter email" required name="email">
						</div>
						<div class="form-group wrapper">
							<input type="text" class="form-control" id="inputUsername"
								placeholder="Enter username" required name="userName">
						</div>
						<div class="form-group">
							<input type="password" class="form-control" id="inputPassword"
								placeholder="Password" required name="password">
						</div>
						<div class="form-group">
							<select class="custom-select" required id="inputUserTypeId"
								name="userTypeId">
								<option value="">Select id type</option>
								<option value="1">Admin</option>
								<option value="2">Student</option>
								<option value="3">Checker</option>
								<option value="4">Visitor</option>
								<option value="5">Relative</option>
							</select>
						</div>
						<div class="form-group form-check">
							<input type="checkbox" class="form-check-input"
								id="exampleCheck1"> <label class="form-check-label"
								for="exampleCheck1">Remember me</label>
						</div>
						<button type="submit" class="btn btn-primary btn-block">Submit</button>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="js/bootsrap.js"></script>
	<script type="text/javascript" src="js/bootsrap.bundle.js"></script>
	<script type="text/javascript" src="js/bootsrap.bundle.js.map"></script>
</body>
</html>

<!-- <form class="form-container" method="POST" action="addedUser.jsp">
		<h4 class="text-center font-weight-bold">Login Form</h4>
		<div class="form-group wrapper">
			<input type="text" class="form-control" id="inputEmail"
				placeholder="Enter email" required name="email">
		</div>
		<div class="form-group">
			<input type="text" class="form-control" id="inputUsername"
				placeholder="Enter username" required name="userName">
		</div>

		<div class="form-group">
			<input type="password" class="form-control" id="inputPassword"
				placeholder="Password" required name="password">
		</div>

		<div class="form-group">
			<select class="custom-select" required id="inputUserTypeId"
				name="userTypeId">
				<option value="">Select id type</option>
				<option value="1">Admin</option>
				<option value="2">Student</option>
				<option value="3">Checker</option>
				<option value="4">Visitor</option>
				<option value="5">Relative</option>
			</select>
		</div>

		<div class="form-group form-check">
			<input type="checkbox" class="form-check-input" id="exampleCheck1">
			<label class="form-check-label" for="exampleCheck1">Remember
				me</label>
		</div>
		<button type="submit" class="btn btn-primary btn-block">Submit</button>
	</form> -->