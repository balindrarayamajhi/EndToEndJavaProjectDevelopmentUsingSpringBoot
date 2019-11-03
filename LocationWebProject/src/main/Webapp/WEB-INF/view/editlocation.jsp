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
		Id: <form:input type="text" path="id" value="${locatio.id}" readonly="true" /> 
		Code: <form:input type="text" path="code" name="code" value="${locatio.code}" /> 
		Name: <form:input type="text" path="name" name="name" value="${locatio.name}" /> 
		<%-- Type: Urban <form:input type="radio" path="type" name="type" value="URBAN" /> 
		Rural <form:input type="radio" path="type" name="type" value="RURAL" /> --%>
		
		Type: Urban <input type="radio"  name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/> 
		Rural <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/>

		<input type="submit" value="SAVE" />
	</pre>
	</form:form>
</body>
</html>