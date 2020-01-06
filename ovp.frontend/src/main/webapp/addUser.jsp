<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddUser</title>
</head>
<body>
	<form class="form-container" method="POST" action="addedUser.jsp">
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
			<select class="custom-select" required id="inputUserTypeId" name="userTypeId">
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
			<label class="form-check-label" for="exampleCheck1">Remember me</label>
		</div>
		<button type="submit" class="btn btn-primary btn-block">Submit</button>
	</form>
</body>
</html>