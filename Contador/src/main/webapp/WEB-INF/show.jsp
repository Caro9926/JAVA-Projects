<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
</head>
<body>
	
		<h1> Counter </h1>
		<h1>You have visited <a href="/">http://localhost:8080/</a> <c:out value="${MostrarConteo}"></c:out> times.</h1>
		<h2><a href="/">Test another visit?</a></h2>
	    <h2><a href="/countdouble">Count +2?</a></h2>
	    <a href="/back">Reset Counter</a>	
					
						

</body>
</html>