<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruity Loops</title>
<link rel="stylesheet" href="/css/index.css"/>
</head>
<body>
	<h1> Fruit Store </h1>
	<table class="table">
		<tbody>
		<tr>
		<th> Name </th>
		<th> Price </th>
		</tr>
		<c:forEach var="fruta" items="${listaFrutas}"> 
		<tr>
	    <td> <c:out value="${fruta.getName()}"/> </td>
	    <td> <c:out value="${fruta.getPrice()}"/> </td>
	    </tr>
	    </c:forEach>
		
		</tbody>
	</table>
	
	
</body>
</html>