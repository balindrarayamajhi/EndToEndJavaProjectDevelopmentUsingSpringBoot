<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,intial-scale=1" />
		
		<title>Complete Reservation</title>
	</head>
	<body>
		<pre>
		<h2>Flight Details</h2>
		AirLine:${flight.operatingAirline}<br/>
		Departure City:${flight.departureCity}<br/>
		Arrival City:${flight.arrivalCity}<br/>
		</pre>
		<form:form action="completereservation" modelAttribute="revsrequest" method="post">
		<pre>
		<h2>Passenger Details</h2>		
		First Name <form:input type="text" path="passengerfirstname" name="passengerfirstname"/>
		Last Name <form:input type="text" path="passengerlastname" name="passengerlastname"/>
		Email <form:input type="text" path="passengeremail" name="passengeremail"/>
		Phone Number Name <form:input type="text" path="passengerphone" name="passengerphone"/>
					
		<h2>Card Details</h2>		
		Name on card :<form:input type="text" path="nameoncard" name="nameoncard"/>
		Card No: <form:input type="text" path="cardnumber" name ="cardnumber"/>
		Expire Date:<form:input type="text" path="expiredate" name="expiredate"/>
		Security Code:<form:input type="text" path="securitycode" name="securitycode"/>
		<form:input type="hidden" path="flightId" name="flightId" value="${flight.id}"/>
	<input type="submit" value="confirm"/>
	</pre>
			
			
			
	</form:form>
	</body>
</html>
