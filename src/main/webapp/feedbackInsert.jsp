<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback Form</title>
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
	input[type=button]:hover {
	  background-color: #45a049;
	}
	
	input[type=button] {
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

<h2 align="center">USER FEEDBACK FORM</h2>    
<div class="container">    
  <form action ="insertfeedback" method = "post">    
    <div class="row">    
      <div class="col-25">    
        <label for="uID">User ID : </label>    
      </div>    
      <div class="col-75">    
        <input type="text" id="uID" name="userID" placeholder="Enter user ID.." required>    
      </div>    
    </div>    
       
    <div class="row">    
      <div class="col-25">    
        <label for="fType">Feedback Type : </label>    
      </div>    
      <div class="col-75">    
        <select id="fType" name="fType" required>    
            <option value="none">Select feedback type</option>  
            <option value="positive_fb">Positive feedback</option>  
          <option value="negative_fb">Negative feedback </option>    
          <option value="suggestion">Suggestion</option>    
          <option value="other">Other</option>        
        </select>    
      </div>    
    </div>    
    <div class="row">    
      <div class="col-25">    
        <label for="feed_back">FeedBack : </label>    
      </div>    
      <div class="col-75">    
        <textarea id="subject" name="subject" placeholder="Write your feedback here.." style="height:200px" required></textarea>    
      </div>    
    </div>    
    <div class="row">    
      <input type="submit" value="Submit">    
    </div>    
  </form>    
</div>   

<br> 

<a href="feedback.jsp">
	<input type="button" value="Delete your feedback" name="fee">
</a>

</body>
</html>