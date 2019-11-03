<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@page isELIgnored="false"%>
<%-- <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details </title>
</head>
<body>
	<pre>
	<h3>Flight Details</h3>
	Airlines : ${reservation.flight.operatingAirline}
	Flight No : ${reservation.flight.fightnumber}
	Departure City : ${reservation.flight.departureCity}
	Arrival City : ${reservation.flight.arrivalCity}
	Date of Departure : ${reservation.flight.dateOfDeparture}
	Estimated Departure Time : ${reservation.flight.estimatedDepartureTime}
	
	
	<h3>Passenger Details </h3>
	First Name : ${reservation.passenger.firstname}
	Last Name : ${reservation.passenger.lastname}
	Email : ${reservation.passenger.email}
	Phone : ${reservation.passenger.phone}
	</pre>
	<form action="completecheckin"/>
	<pre>
	No. of bags for check in : <input type="number" name="numOfBags"/> 
	<input type="hidden" name ="reservationId" value="${reservation.id}"/>
	<input type="submit" value="Check In"/>
	</pre>
	</from>
</body>
</html>