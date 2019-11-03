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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<title>Register New User</title>
</head>
<body>

	<div class="container">

		<div class="jumbotron">
			<h1 class="display-4">User Registeretd!</h1>
			<p class="lead">Hello ${user.firstname} ,you have registered.</p>

		</div>

		<div class="container">
			<div class="row">

				<legend>User Details </legend>

			</div>

			<div class="row">

				<div class="col-md-2"></div>
				<div class="col-md-2">ID :</div>
				<div class="col-md-2">${user.id}</div>
				<div class="col-md-6"></div>
			</div>

			<div class="row">

				<div class="col-md-2"></div>
				<div class="col-md-2">First Name :</div>
				<div class="col-md-2">${user.firstname}</div>
				<div class="col-md-6"></div>
			</div>

			<div class="row">

				<div class="col-md-2"></div>
				<div class="col-md-2">Last Name :</div>
				<div class="col-md-2">${user.lastname}</div>
				<div class="col-md-6"></div>
			</div>

			<div class="row">

				<div class="col-md-2"></div>
				<div class="col-md-2">Email :</div>
				<div class="col-md-2">${user.email}</div>
				<div class="col-md-6"></div>
			</div>

		</div>

		<div>

			<a href="<spring:url value="user"/>"class="btn btn-primary">Add new User/Login </a>

		</div>
	</div>

	</div>


</body>
</html>