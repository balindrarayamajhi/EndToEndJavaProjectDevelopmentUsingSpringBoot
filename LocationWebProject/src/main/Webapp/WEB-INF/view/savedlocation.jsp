<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Saved Location</title>
</head>
<body>
<pre>
	<h4>A new location with following is created and persisted</h4>
	
	Id:${savedloc.id}
	Code:${savedloc.code}
	Name:${savedloc.name}
	Type:${savedloc.type}
	
	 <a href="<spring:url value="location"/>">Add New Location </a>     
	  <a href="<spring:url value="locations"/>">View All</a> 
</pre>
</body>
</html>