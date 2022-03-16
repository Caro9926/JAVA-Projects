<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %> <!--Unicamente para update-->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>>${ book.title }</title>
</head>
	<body>
		<div class="container">
		<div class="row mt-5">
			<div class="col-6">
				<h1 class="text-info">${ book.title }</h1>
			</div>
			<div class="col-6">
				<div class="col-12 d-flex flex-row-reverse">
					<a href="/books" class="btn btn-primary">Back to the shelves</a><br>
				</div>
			</div>
		</div>
		<div class="row mt-5">
			<div class="col-6">
				<h2>
					<c:choose>
					    <c:when test="${ book.user.name.equals(user.name)}">You</c:when>    
					    <c:otherwise>
					    	<span class="text-danger"><c:out value="${ book.user.name}"/></span>
					    </c:otherwise>
					</c:choose> read 
					<span class="text-info"><c:out value="${ book.title }" /></span> by 
					<span class="text-success"><c:out value="${ book.author }" /></span>
				</h2>
				<div class="card mt-4">
				  <div class="card-header p-4">
				  	<h4>Here are
						<c:choose>
						    <c:when test="${ book.user.name.equals(user.name)}">your</c:when>    
						    <c:otherwise>
						    	<c:out value="${ book.user.name}"/>'s
						    </c:otherwise>
						</c:choose>
						thoughts
					</h4>
				  </div>
				  <div class="card-body p-4">
				    <p>${ book.think}</p>
				  </div>
				</div>
			</div>
		</div>
		<c:if test="${ book.user.email.equals(user.email)}">
			<div class="row mt-5">
				<div class="col-12">
					<a href="/books/${ book.id }/edit" class="btn btn-primary">Edit book</a>
				</div>
			</div>
		</c:if>
	</div>
	</body>
</html>