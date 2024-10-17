<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Feedbacks</title>
<style type="text/css">
input[type=text], select, textarea {
	  width: 100%; /* Full width */
	  padding: 12px; /* Some padding */ 
	  border: 1px solid #ccc; /* Gray border */
	  border-radius: 4px; /* Rounded borders */
	  box-sizing: border-box; /* Make sure that padding and width stays in place */
	  margin-top: 6px; /* Add a top margin */
	  margin-bottom: 16px; /* Bottom margin */
	  resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */
	}

	/* Style the submit button with a specific background color etc */
	input[type=submit] {
	  background-color: #04AA6D;
	  color: white;
	  padding: 12px 20px;
	  border: none;
	  border-radius: 4px;
	  cursor: pointer;
	}

	/* When moving the mouse over the submit button, add a darker green color */
	input[type=submit]:hover {
	  background-color: #45a049;
	}

	/* Add a background color and some padding around the form */
	.container {
	  border-radius: 5px;
	  background-color: #f2f2f2;
	  padding: 20px;
	}

</style>
</head>
<body>

<h2 align="center">Delete Your Feedback</h2>
<div class="container">


<form action="deleteFeed" method="post">
	<label>Enter user ID : </label>
	<input type = "text" name="uID">
	<input type ="submit" value="Delete feedback">
</form>

</div>

<br>


</body>
</html>