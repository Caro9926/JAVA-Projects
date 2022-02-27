<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recibo Hooper</title>
</head>
<body>
	
	
	
	<c:forEach var="vendedor" items="${listaPersonas}"> 
		<h1>
		Customer name: <c:out value="${vendedor.getNombre()}"/>
		</h1>
		<h4>
		Item: <c:out value="${vendedor.getItem()}"/> 
		</h4>
		<h4>
		Price: <c:out value="${vendedor.getPrice()}"/> 
		</h4>
		<h4>
		Description: <c:out value="${vendedor.getDescription()}"/> 
		</h4>
		<h4>
		Vendor: <c:out value="${vendedor.getVendor()}"/> 
		</h4>
	</c:forEach>
	

</body>
</html>