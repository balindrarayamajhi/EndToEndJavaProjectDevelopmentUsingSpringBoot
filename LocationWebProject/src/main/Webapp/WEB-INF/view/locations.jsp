<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page isELIgnored="false"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
 <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All locations</title>
</head>
<body>

<h3> All Locations</h3>
<table>
	<tr>
		<th>ID</th>
		<th>Code</th>
		<th>Name</th>
		<th>Type</th>
		<th colspan="2">Action</th>
		
	</tr>
	<c:forEach items="${locations}" var="location"> 
		<tr>
			<td>${location.id}</td>
			<td>${location.code}</td>
			<td>${location.name}</td>
			<td>${location.type}</td>
			
			
			 <td>
				 <a style="text-decoration:none" href="<spring:url value="delete?id=${location.id}"/>" method="post">DELETE   </a> 
			</td>
			<td>   
				 <a style="text-decoration:none" href="<spring:url value="update?id=${location.id}"/>">Edit</a> 
			</td>
			
			
			<%-- <td>
				 <form:form action="location?id=${location.id}" method="delete">
					<input type="submit" value="Delete"/>
				</form:form>
			</td>
			
			<td>
				<form:form action="edit?id=${location.id}">
					<input type="submit" value="Edit"/>
				</form:form> 
			</td> --%>
			
		</tr>
	</c:forEach>
</table>
<a href="<spring:url value="location"/>">Add new Location</a>
</body>
</html>