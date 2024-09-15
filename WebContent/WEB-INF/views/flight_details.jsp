<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/normalize.css" />
<link rel="stylesheet" href="resources/css/flightdetails.css" />

<title>Flight Details</title>
</head>
<body>
	<table>
		<caption>Flight Details</caption>
		<thead>
			<tr>
				<th>Flight Id</th>
				<th>Flight Origin</th>
				<th>Flight Destination</th>
				<th>Price</th>
				<th>No. of Seats</th>
				<th>AirPlane Model</th>
			</tr>
		<tbody>
			<tr>
				<td><%=request.getAttribute("id")%></td>
				<td><%=request.getAttribute("from")%></td>
				<td><%=request.getAttribute("to")%></td>
				<td><%=request.getAttribute("price")%></td>
				<td><%=request.getAttribute("numOfSeats")%></td>
				<td><%=request.getAttribute("airplaneModel")%></td>


			</tr>
	</table>
</body>
</html>