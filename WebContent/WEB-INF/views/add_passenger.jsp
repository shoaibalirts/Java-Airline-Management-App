<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>World Adventures Airlines</title>
<link rel="stylesheet" href="../css/add_passenger.css" />
</head>
<body>
	<div class="container">
		<div class="title">Add a passenger</div>
		<fieldset>
			<legend>Passenger details</legend>
			<form action="AddPassenger" method="post">
				<div class="inputField">
					<label for="first-name">First Name:</label> <input id="first-name"
						type="text" name="first_name" />
				</div>
				<div class="inputField">
					<label for="last-name">Last Name:</label> <input id="last-name"
						type="text" name="last_name" />
				</div>
				<div class="inputField">
					<label for="dob">Date of birth:</label> <input id="dob" type="text"
						name="dob" />
				</div>
				<div class="inputField">
					<label for="gender">Gender:</label> <select id="gender"
						name="gender">
						<option value="Male">Male</option>
						<option value="Female">FeMale</option>
					</select>
				</div>
		</fieldset>
		<div class="inputField" id="submitField">
			<input id="submitBtn" type="submit" value="Add new passenger" />
		</div>
		</form>
		</fieldset>
	</div>

</body>
</html>