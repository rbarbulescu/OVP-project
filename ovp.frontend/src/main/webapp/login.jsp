<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
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

<title>Log in</title>
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

	<div class="container-fluid">
		<div class="row justify-content-center">
			<div class="col-xl-4 col-lg-5 col-md-6 col-sm-8 col-xs-12">
				<div class="wrapper-card">
					<img src="images/img_avatar2.png" class="center-image">
					<form class="form-container" method="POST" action="LoginServlet">
						<h4 class="text-center font-weight-bold">Login Form</h4>
						<div class="form-group wrapper">
							<input type="text" class="form-control" id="inputUsername"
								placeholder="Enter username" name="userName">
						</div>
						<div class="form-group">
							<input type="password" class="form-control" id="inputPassword"
								placeholder="Password" name="password">
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