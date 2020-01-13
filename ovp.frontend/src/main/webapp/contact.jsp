<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
/* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
#map {
	height: 80%;
	width: 40%;
	margin-left: 10%;
	margin-right: auto;
	float: left;
}
/* Optional: Makes the sample page fill the window. */
html, body {
	height: 100%;
	margin: 0;
	padding: 0;
}

.informations {
	display: block;
	width: auto;
	height: auto;
	padding-top: 5110px;
	border: 3px solid brown; 
	float: right;
	align: center;
}

.block {
	display: inline-block;
	padding: 5px;
}
</style>
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
<title>Contact</title>
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

	<h1>You can find our contact informations on this page</h1>

	<div id="map" class="block"></div>
	<script>
		var map;
		function initMap() {
			var myLatLng = {lat: 45.784755844569425, lng: 24.154240310797867};
			map = new google.maps.Map(document.getElementById('map'), {
				center : myLatLng,
				zoom : 15
			});
			var marker = new google.maps.Marker({
			    position: myLatLng,
			    map: map,
			    title: 'Here!'
			  });
		}
	</script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDSzCrLe3ljLY5r-IND76zW57lsHi19DYg&callback=initMap"
		async defer></script>

	<div class="informations block">
		<h3>Phone: +40 740 122 123</h3>
		<h4>Address: Str. Calugareni nr. 40</h4>
	</div>

	<script type="text/javascript" src="js/bootsrap.js"></script>
	<script type="text/javascript" src="js/bootsrap.bundle.js"></script>
	<script type="text/javascript" src="js/bootsrap.bundle.js.map"></script>
</body>
</html>