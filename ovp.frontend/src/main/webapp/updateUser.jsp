<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form class="form-container" method="POST" action="updatedUser.jsp">
		<h4 class="text-center font-weight-bold">Update User Form</h4>
		<div class="form-group">
			<input type="text" class="form-control" id="inputUserName"
				placeholder="Enter username" required name="userName">
		</div>

		<div class="form-group">
			<input type="password" class="form-control" id="inputOldPassword"
				placeholder="Old Password" required name="oldPassword">
		</div>

		<div class="form-group">
			<input type="password" class="form-control" id="inputNewPassword"
				placeholder="New Password" required name="newPassword">
		</div>

		<button type="submit" class="btn btn-primary btn-block">Submit</button>
	</form>

</body>
</html>