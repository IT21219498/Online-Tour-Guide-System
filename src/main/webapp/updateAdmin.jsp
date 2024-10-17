<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrator Profile</title>
<style>
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

	<%
		String id = request.getParameter("adId");
		String name = request.getParameter("adName");
		String type = request.getParameter("adType");
		String contact = request.getParameter("conNo");
		String email = request.getParameter("email");
	%>
	
	<h2 align="center">Update Administrator Profile</h2>
	
<div class="container">
	<form action="updateAdmin" method="post">
		Admin ID : <input type="text" name="adID" value="<%=id%>" readonly><br>
		
		Admin Name : <input type ="text" name="adName" value="<%=name%>"><br>
		
		Admin Type : <input type ="text" name="adType" value="<%=type%>"><br>
		
		Contact No : <input type ="text" name="cNo" value="<%=contact%>"><br>
		
		Email Address : <input type="text" name="email" value="<%=email%>"><br>
		
		<input type="submit" name="submit" value="Update Info"><br>
	
	</form>
</div>
 
</body>
</html>