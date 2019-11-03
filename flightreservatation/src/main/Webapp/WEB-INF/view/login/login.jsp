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

		<form:form action="login" method="post">

			<div class="form-group">
				<legend>Sign-in</legend>
			</div>
			
			<div class=row>
				
				<div >${msg}</div>
			</div>
			<br/>
			<div class=row>
				
				<div class="col-md-1">Name</div> 
				<div class="col-md-3"><input type="email" name="email"/></div>
				<div class="col-md-8"></div>
			</div>
			<br/>
			<div class=row>
				
				<div class="col-md-1">Password</div> 
				<div class="col-md-3"><input type="password" name="password"/></div>
				<div class="col-md-8"></div>
			</div>

			<!-- <div class="form-group">
				<label class="control-label col-md-2" for="email">Email</label>
				<div class="col-md-6">
					<input type="email" name="email" class="form-control" />

				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-md-2" for="password">Password</label>
				<div class="col-md-6">
					<input type="password" name="password" class="form-control" />

				</div>
			</div> -->

			<br/>
			
			<div class=row>
				
				<div class="col-md-1"></div>
				<div class="col-md-10 col-md-offset-2">

				<input type="submit" class="btn btn-primary" value="Sign-in" />
			</div>
			</div>



		</form:form>

	</div>



</body>
</html>