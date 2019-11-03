<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create new location</title>
</head>
<body>
	<form:form action="location" modelAttribute="location" method="post">
	<pre>
		Id: <form:input type="text" path="id" name="id" /> 
		Code: <form:input type="text" path="code" name="code" /> 
		Name: <form:input type="text" path="name" name="name" /> 
		<%-- Type: Urban <form:input type="radio" path="type" name="type" value="URBAN" /> 
		Rural <form:input type="radio" path="type" name="type" value="RURAL" /> --%>
		
		Type: Urban <form:checkbox path="type" name="type" value="URBAN" />   Rural <form:checkbox path="type" name="type" value="RURAL" />

		<input type="submit" value="SAVE" />
	</pre>
	</form:form>
</body>
</html>