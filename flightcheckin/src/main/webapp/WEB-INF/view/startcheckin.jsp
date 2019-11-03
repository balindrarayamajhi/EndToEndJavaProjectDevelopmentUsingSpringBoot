<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Start Check In</title>
</head>
<body>
	<form:form action="startcheckin">
	Enter Reservation Id: <input type="text" name="reservationId"/>
	<input type="submit" Value="Start">
	</form:form>
</body>
</html>