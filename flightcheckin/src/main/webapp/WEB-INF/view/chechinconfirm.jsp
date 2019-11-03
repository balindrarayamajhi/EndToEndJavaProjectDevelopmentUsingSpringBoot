<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Checked in  Confirmed</title>
</head>
<body>
	 <h3>Check-in Completed</h3>
	 <p> Check in of reservation with id ${reservation.id} has been completed .</p>
	 <p> Numbers of bag :${reservation.numberofbags}</p>
</body>
</html>