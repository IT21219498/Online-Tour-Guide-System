<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ContactUS Form</title>
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
<h2 align="center" style="font-weight:bold">CONTACT US</h2>
<h4 align="center">Please fill this form in decent manner..</h4>

<div class="container">
  <form action="insertCon" method = "post">

    <label for="uID">Enter user ID : </label>
    <input type="text" id="uID" name="userID" placeholder="Your ID.." required>

    <label for="touristType">Enter tourist type : </label>
    <select id="tType" name="tType">
      <option value="Foreign">Foreign tourist</option>
      <option value="Local">Local tourist</option>
    </select>
    
    <label for="guideMode">Enter guide mode : </label>
    <select id="gMode" name="gMode">
      <option value="Online">Online mode</option>
      <option value="Physical">Physical mode</option>
    </select>
    
    <label for="contact">Enter contact number : </label>
    <input type="text" id="cNo" name="cNo" placeholder="Your contact No..." required>

    <label for="subject">Subject</label>
    <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px" required></textarea>

    <input type="submit" value="Submit">

  </form>
 </div>

</body>
</html>