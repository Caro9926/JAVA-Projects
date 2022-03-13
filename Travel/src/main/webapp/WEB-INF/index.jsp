<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
		<title>Read Share</title>
		
	</head>
	<body>
		<div >
			<h1>
				Save Travels
			</h1>
			<div>
				<table>
				    <thead>
				        <tr>
				            <th>Expense</th>
				            <th>Vendor</th>
				            <th>Amount</th>
				            <th>Actions</th>
				        </tr>
				    </thead>
			    <tbody>
			         <c:forEach var="travels" items="${listaTravels}"> <!-- Para múltiples datos visualización -->
			         	<tr>		
									<th><a href="/expenses/${travels.getId()}"><c:out value="${travels.getExpense()}"/></a></th> 
									<th><c:out value="${travels.getVendor()}"/></th> 
									<th><c:out value="${travels.getAmount()}"/></th>
									<th>
										<a href="/expenses/edit/${travels.getId()}">Edit</a>
										<form action="/expenses/eliminar/${travels.getId()}" method="POST" > <!-- Form importante! -->
											<input type="hidden" name="_method" value="DELETE" /> <!-- Forma predeterminada -->
											<button type="submit" >
														<Strong>Delete</Strong> 
											</button>
										</form>
									</th>
						</tr>
			         </c:forEach>
			    </tbody>
			   </table>
			</div>
		</div>
		<div>
			<h1>
				Add an Expense
			</h1>
			<div class="registro">
				<form:form method="POST" action="/expenses" modelAttribute="travel"> <!-- en el action coloco la ruta -->
					<div>
						<form:label path="expense" for="expense"> <!-- Tres clases de form -->
							Expense Name:
						</form:label>
						<form:input path="expense" type="text" name="expense" id="expense" />
						<form:errors path="expense" 
						/>
					</div>
					<div>
						<form:label path="vendor" for="vendor">
							Vendor:
						</form:label>
						<form:input path="vendor" type="text" name="vendor" id="vendor" />
						<form:errors path="vendor" class="error"/>
					</div>
					<div>
						<form:label path="amount" for="amount">
							Amount:
						</form:label>
						<form:input path="amount" type="number" name="amount" id="amount" value="null" min="1" />
						<form:errors path="amount"/>
					</div>
					<div>
						<form:label path="description" for="description">
							Description:
						</form:label>
						<form:textarea path="description" type="text" name="description" id="description" />
						<form:errors path="description" class="error"/>
					</div>
					<button type="submit" class="button1">
						Submit
					</button>
				</form:form>
			</div>
		</div>
	</body>
</html>