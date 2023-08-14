<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Data Module</title>
</head>
<body>
	<div align="center">
		<h1>Flight Details</h1>
		<h3><a href="new">New Flight Data</a></h3>
		<table border="1" cellpadding="5">
			<tr>
				<th>No</th>
				<th>Flight Id</th>
				<th>Flight Detail ID</th>
				<th>Admin Id</th>
				<th>Flight Company</th>
				<th>Flight Source</th>
				<th>Flight Destination</th>
				<th>Travel Date & Time</th>
				<th>BTotal Seats</th>
				<th>BSeats Available</th>
				<th>BPrice</th>
				<th>FTotal Seats</th>
				<th>FSeats Available</th>
				<th>FPrice</th>
				<th>ETotal Seats</th>
				<th>ESeats Available</th>
				<th>EPrice</th>
				<th>Total Seats</th>
				<th>Seats Available</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${listFlightData}" var="flight" varStatus="status">
				<tr>
				<td>${status.index + 1}</td>
				<td>${flight.flightid}</td>
				<td>${flight.flightdetailid}</td>
				<td>${flight.adminid}</td>
				<td>${flight.flightcompany}</td>
				<td>${flight.flightsrc}</td>
				<td>${flight.flightdesc}</td>
				<td>${flight.traveldatetime}</td>
				<td>${flight.btotalseats}</td>
				<td>${flight.bseatavailable}</td>
				<td>${flight.bprice}</td>
				<td>${flight.ftotalseats}</td>
				<td>${flight.fseatavailable}</td>
				<td>${flight.fprice}</td>
				<td>${flight.etotalseats}</td>
				<td>${flight.eseatavailable}</td>
				<td>${flight.eprice}</td>
				<td>${flight.totalseats}</td>
				<td>${flight.totalavailableseats}</td> 
			 	<td>
				<a href="edit?id=${flight.flightid}">Edit</a>
				&nbsp;&nbsp;
				<a href="delete?id=${flight.flightid}">Delete</a>
				</td> 
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>