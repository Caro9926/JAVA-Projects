<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Expense</title>
</head>
<body>
	<div>
			<h1>Expense Details</h1>
			<div>
				<form action="/logout" method="GET">
					<button type="submit" class="button1">
						<strong>Go back</strong>
					</button>
				</form>
			</div>
		</div>
		<div>
		 	<div> <!-- Si solo necesitamos uno -->
				<p> <strong>Expense Name:</strong> <c:out value="${expense}"/></p>
				<p> <strong>Expense Description:</strong> <c:out value="${description}"/></p>
				<p> <strong>Vendor:</strong> <c:out value="${vendor}"/></p>
				<p> <strong>Amount Spent:</strong> $<c:out value="${amount}"/></p>
			</div>
		</div>

</body>
</html>