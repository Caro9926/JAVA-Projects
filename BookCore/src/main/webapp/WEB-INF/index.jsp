<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %> <!--Únicamente para update-->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read share</title>
</head>
	<body>
		<div class="container">
			<h1>Welcome!</h1>
			<p>Join our growing community</p>
			<div class="row">
				<div class="col-8">
					<h2 class="text-primary">Register</h2>
					<form:form action="/register" method="post" modelAttribute="newUser">
						<form:errors path="name" ></form:errors>
						<form:errors path="email" ></form:errors>
						<form:errors path="birthday"></form:errors>
						<form:errors path="password" ></form:errors>
						<form:errors path="confirm" ></form:errors>
						
						<div class="form-group mb-3">
							<form:label path="name">Name:</form:label>
							<form:input path="name"/>
						</div>
						<div class="form-group mb-3">
							<form:label path="email">Email:</form:label>
							<form:input path="email"  />
						</div>
						<div class="form-group mb-3">
							<form:label path="birthday">BirthDate:</form:label>
							<form:input path="birthday" type="date"  />
						</div>
						<div class="form-group mb-3">
							<form:label path="password">Password:</form:label>
							<form:input path="password"  type="password"/>
						</div>
						<div class="form-group mb-3">
							<form:label path="confirm">Confirm Password:</form:label>
							<form:input path="confirm"  type="password"/>
						</div>
						
						<button type="submit" class="btn btn-primary">Register</button>
					</form:form>

				</div>
				<div class="col-4">
					<h2 class="text-primary">Log in</h2>
					<form:form action="/login" method="post" modelAttribute="newLogin">
						<form:errors path="email" class="alert alert-danger d-block"></form:errors>
						<form:errors path="password" class="alert alert-danger d-block"></form:errors>
						<div class="form-group mb-3">
							<form:label path="email">Email:</form:label>
							<form:input path="email" class="form-control" />
						</div>
						<div class="form-group mb-3">
							<form:label path="password">Password:</form:label>
							<form:input path="password" class="form-control" type="password"/>
						</div>
						
						<button type="submit" class="btn btn-primary">Log in</button>
					</form:form>
				</div>
			</div>
		</div>
		
	
	</body>
</html>