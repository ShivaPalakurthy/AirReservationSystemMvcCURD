<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Flight Details</title>
</head>
<body>
	<div align="center">
		<h1>Enter the Updating Flight Data</h1>
		<form:form action="update" method="post" modelAttribute="UpdateFData">
			<table cellpadding="5">
				<form:hidden path="flightid" />
				<tr>
					<td>Flight Id:</td>
					<td><form:input path="flightid" /></td>
				</tr>
				<tr>
					<td>Flight Detail Id:</td>
					<td><form:input path="flightdetailid" /></td>
				</tr>
				<tr>
					<td>Admin Id:</td>
					<td><form:input path="adminid" /></td>
				</tr>
				<tr>
					<td>Flight Company Name:</td>
					<td><form:input path="flightcompany" /></td>
				</tr>
				<tr>
					<td>Flight Source:</td>
					<td><form:input path="flightsrc" /></td>
				</tr>
				<tr>
					<td>Flight Destination:</td>
					<td><form:input path="flightdesc" /></td>
				</tr>
				<tr>
					<td>Flight Depa rture Date & Time:</td>
					<td><form:input path="traveldatetime" /></td>
				</tr>
				<tr>
					<td>Business Class Total Seats:</td>
					<td><form:input path="btotalseats" /></td>
				</tr>
				<tr>
					<td>Business Class Seats Available:</td>
					<td><form:input path="bseatavailable" /></td>
				</tr>
				<tr>
					<td>Business Class Per Seat Fare</td>
					<td><form:input path="bprice" /></td>
				</tr>
				<tr>
					<td>First Class Total Seats:</td>
					<td><form:input path="ftotalseats" /></td>
				</tr>
				<tr>
					<td>First Class Seats Available:</td>
					<td><form:input path="fseatavailable" /></td>
				</tr>
				<tr>
					<td>First Class Per Seat Fare:</td>
					<td><form:input path="fprice" /></td>
				</tr>
				<tr>
					<td>Economy Class Total Seats:</td>
					<td><form:input path="etotalseats" /></td>
				</tr>
				<tr>
					<td>Economy Class Seats Available:</td>
					<td><form:input path="eseatavailable" /></td>
				</tr>
				<tr>
					<td>Economy Class Per Seat Fare:</td>
					<td><form:input path="eprice" /></td>
				</tr>
				<tr>
					<td>Total Seats:</td>
					<td><form:input path="totalseats" /></td>
				</tr>
				<tr>
					<td>Total Seats Available:</td>
					<td><form:input path="totalavailableseats" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Update" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>