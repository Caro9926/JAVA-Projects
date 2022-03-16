<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isErrorPage="true" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
	<body>
		<div class="container">
			<header class="row">
				<div >
					<h1 >Welcome, <c:out value="${user.name}"></c:out></h1>
					<p>Books from everyone's shelves:</p>
					
				</div>
				<div >
					<a href="/logout" >Log out</a>
					<a href="/books/new" >+ Add to my shelf!</a>
				</div>
			</header>
			<main class="row">
				<div >
					<table class="table">
						<thead>
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Title</th>
								<th scope="col">Author Name</th>
								<th scope="col">Posted By</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="libro" items="${books}">
								<th scope="row"><c:out value="${libro.id}"></c:out></th>
								<th scope="row"><a href="/books/${libro.id}" ><c:out value="${libro.title}"></c:out></a></th>
								<th scope="row"><c:out value="${libro.author}"></c:out></th>
								<th scope="row"><c:out value="${libro.user.name}"></c:out></th>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</main>
		</div>
		
	</body>
</html>