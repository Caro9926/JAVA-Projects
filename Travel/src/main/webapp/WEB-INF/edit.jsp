<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
		<title>Edit expense</title>
		
	</head>
	<body>
		<div class="titulo">
			<h1>
				Add an Expense
			</h1>
			<div>
				<form action="/logout" method="GET" >
					<button type="submit" class="button1">
						<strong>Go back</strong>
					</button>
				</form>
			</div>
		</div>
		<div class="registro">
			<form:form method="POST" action="/expenses/edit/${id}" modelAttribute="travel">
				<input type="hidden" name="_method" value="PUT" />
				<div>
					<form:label path="expense" for="expense">
						Expense Name:
					</form:label>
					<form:input path="expense" type="text" name="expense" id="expense" placeholder="${expense}"  />
					<form:errors path="expense" />
				</div>
				<div>
					<form:label path="vendor" for="vendor">
						Vendor:
					</form:label>
					<form:input path="vendor" type="text" name="vendor" id="vendor" placeholder="${vendor}"  />
					<form:errors path="vendor" />
				</div>
				<div>
					<form:label path="amount" for="amount">
						Amount:
					</form:label>
					<form:input path="amount" type="number" name="amount" id="amount" value="null" placeholder="${amount}" min="1"/>
					<form:errors path="amount"/>
				</div>
				<div>
					<form:label path="description" for="description">
						Description:
					</form:label>
					<form:textarea path="description" type="text" name="description" id="description"  placeholder="${description}" value="null"/>
					<form:errors path="description" />
				</div>
				<button type="submit" >
					Submit
				</button>
			</form:form>
		</div>
	</body>
</html>