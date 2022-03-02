<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
	<body>
		<h1> Here's Your Omikuji!</h1>
		<p>In <c:out value="${usuario.number}"></c:out> years, you will live in 
		<c:out value="${usuario.name}"></c:out> with <c:out value="${usuario.nameperson}"></c:out>
		as your roommate <c:out value="${usuario.hobby}"></c:out> for a living. 
		The next time you see a <c:out value="${usuario.thing}"></c:out> you will have a good luck.
		Also, <c:out value="${usuario.comment}"></c:out>
		</p>
		<a href="/omikuji">Go back</a>
	</body>
</html>