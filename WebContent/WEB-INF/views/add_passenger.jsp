<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>World Adventures Airlines</title>

<link rel="stylesheet" href="resources/css/normalize.css" />
<link rel="stylesheet" href="resources/css/theme.css" />

</head>
<body>

	<div class="container">

		<div class="title">Add a passenger</div>

		<fieldset>

			<legend>Passenger details</legend>

			<form action="AddPassenger" method="post">

				<div class="inputField">
					<label for="first-name" class="inputLabel">First name: </label> <input
						id="first-name" name="first-name" type="text"></input>
				</div>

				<div class="inputField">
					<label for="last-name" class="inputLabel">Last name: </label> <input
						id="last-name" name="last-name" type="text"></input>
				</div>

				<div class="inputField">
					<label for="dob" class="inputLabel">Date of birth: </label> <input
						id="dob" name="dob" type="text"></input>
				</div>

				<div class="inputField">
					<label for="gender" class="inputLabel">Gender: </label> <select
						id="gender" name="gender">
						<option value="Male">Male</option>
						<option value="Female">Female</option>
					</select>
				</div>
				<div class="inputField" id="submitField">
					<input id="submitBtn" type="submit" value="Add new passenger"></input>
				</div>
			</form>
		</fieldset>









	</div>

</body>
</html>