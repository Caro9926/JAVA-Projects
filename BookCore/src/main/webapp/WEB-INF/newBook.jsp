<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %> <!--Unicamente para update-->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> New book</title>
</head>
	<body>
		<div class="container">
		<div >
			<div>
				<h1>Add a book to your shelf!</h1>
			</div>
			<div>
				<div >
					<a href="/books" >Back to the shelves</a><br>
				</div>
			</div>
		</div>
		<div>
			<div >
				<h2>Register</h2>
				<form:form action="/books/create" method="post" modelAttribute="newBook" >
					<div >
						<div >
							<h5><form:label path="title">Title:</form:label></h5>
						</div>
						<div>
							<form:input path="title" />
						</div>
						<div >
							<p><form:errors path="title"/></p>
						</div>
					</div>
					<div >
						<div >
							<h5><form:label path="author">Author:</form:label></h5>
						</div>
						<div class="col-6">
							<form:input path="author"/>
						</div>
						<div class="col-12">
							<p class="text-danger"><form:errors path="author"/></p>
						</div>
					</div>
					<div>
						<div >
							<h5><form:label path="think">My thoughts:</form:label></h5>
						</div>
						<div>
							<form:textarea path="think" />
						</div>
						<div >
							<p ><form:errors path="think"/></p>
						</div>
					</div>
					<div >
					  <input type="submit" value="Submit" />
					</div>
				</form:form>    
			</div>
		</div>
	</div>
	</body>
</html>