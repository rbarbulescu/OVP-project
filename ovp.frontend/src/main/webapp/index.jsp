<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>

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

	<c:choose>
		<c:when test="${user.userTypeId == 1.0}">
			<p>What do you want to do?</p>
			<p>
				<a href="showUsers?userName=">Click</a> me if you want to see all
				the users!
			</p>
			<p>
				<a href="findUser.jsp">Click</a> to check a user
			</p>
			<p>
				<a href="updateUser.jsp">Click</a> to edit a user
			</p>
			<p>
				<a href="deleteUser.jsp">Delete</a> a user
			</p>
		</c:when>

		<c:when test="${user.userTypeId == 2.0}">
			<p>What can you do:</p>
			<br>
			<p>
				<a href="#">Book</a> a trip
			</p>
		</c:when>

		<c:when test="${user.userTypeId == 3.0}">
			<p>
				<a href="showUsers?userName=">Click</a> me if you want to see all
				the users!
			</p>
			<p>
				<a href="findUser.jsp">Click</a> to check a user
			</p>
		</c:when>

		<c:otherwise>
			<h1>
				If you are new to the platform please click <a href="addUser.jsp">here</a>
				to register!
			</h1>
			<p>
				Please <a href="login.jsp">Login</a> to use this application!
			</p>
		</c:otherwise>
	</c:choose>

	<div class="wpb_text_column wpb_content_element">
		<div class="wpb_wrapper">
			<h1 style="text-align: center;">The fastest way to verify
				student's identity.</h1>
			<p class="lead" style="text-align: center;">The identity
				verification platform that users love. Optimized for conversion and
				security.</p>
		</div>
	</div>

	<div class="wpb_column vc_column_container col-sm-5">
		<div class="vc_column-inner">
			<div class="wpb_wrapper">
				<div class="wpb_single_image wpb_content_element vc_align_center">
					<figure class="wpb_wrapper vc_figure">
						<div class="vc_single_image-wrapper   vc_box_border_grey">
							<img width="667" height="700"
								src="https://www.idnow.io/wp-content/uploads/front_side_mockup_6.png"
								class="vc_single_image-img attachment-large"
								alt="Homepage 2019 EN 1"
								srcset="https://www.idnow.io/wp-content/uploads/front_side_mockup_6.png 667w, https://www.idnow.io/wp-content/uploads/front_side_mockup_6-286x300.png 286w"
								sizes="(max-width: 667px) 100vw, 667px">
						</div>
					</figure>
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript" src="js/bootsrap.js"></script>
	<script type="text/javascript" src="js/bootsrap.bundle.js"></script>
	<script type="text/javascript" src="js/bootsrap.bundle.js.map"></script>
</body>
</html>