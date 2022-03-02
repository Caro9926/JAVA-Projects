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
	<h1> Send an Omikuji</h1>
		<form action="/omikuji/save" method="post">
		  	<label for="number">Pick any number from 5 to 25</label>
		  	<input type="text" id="number" name="number"><br> 	 	
		  	<label for="name" > Enter the name of any city: </label>
		  	<input type="text" id="name" name="name"><br>
		  	<label for="nameperson" > Enter the name of any real person: </label>
		  	<input type="text" id="nameperson" name="nameperson"><br>
		  	<label for="hobby" > Enter a professional endeavor or hobby: </label>
		  	<input type="text" id="hobby" name="hobby"><br>
		  	<label for="nameperson" > Enter any type of living thing: </label>
		  	<input type="text" id="nameperson" name="nameperson"><br>
		  	<label for="comment" > Say something nice to someone: </label>
		  	<input type="text" id="comment" name="comment"><br>
		  	<p> Send and show a friend </p>
		  	<input type="submit" value="Send">
	  	</form>	  	
	  		  	
	</body>
</html>