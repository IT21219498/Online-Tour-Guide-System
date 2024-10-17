<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrator Profile</title>

<style type="text/css">
		body{
			font-family: Hind SemiBold;
			
		}
	
		table, th, td {
  			border: 2px solid black;
 
		}
		
		/*.container { 
  			height: 300px;
  			position: relative;
 			border: 3px solid green; 
		}*/
		.container {
	  border-radius: 5px;
	  background-color: #f2f2f2;
	  padding: 20px;
	}
	.center{
	        margin: 1;
			top: 50%;
 		    left: 50%;
 		    position: relative;
			transform: translate(-50%, -5%);
	}
	

		/*.center {
 			 margin: 1;
  			position: relative;
  			top: 50%;
 		    left: 50%;
  			-ms-transform: translate(-50%, -50%);
 			 transform: translate(-50%, -50%);
		}*/
		/* Style the submit button with a specific background color etc */
	input[type=button] {
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
	</style>
	
</head>
<body>
	<h2 align = "center">Admin Profile</h2>


	
	
	
	
<div class="container">
  
  	<table class="center">
	
	<c:forEach var="adm" items="${admDetails}">
	
	<c:set var="aId" value="${adm.aID}"/>
	<c:set var="aName" value="${adm.aName}"/>
	<c:set var="aType" value="${adm.aType}"/>
	<c:set var="cNum" value="${adm.contact}"/>
	<c:set var="mail" value="${adm.email}"/>
	
	<tr>
		<td>Admin ID : </td>
		<td>${adm.aID}</td>
	</tr>
	
	<tr>
		<td>Admin Name : </td>
		<td>${adm.aName}</td>
	</tr>
	
	<tr>
		<td>Admin Type : </td>
		<td>${adm.aType}</td>
	</tr>
	
	<tr>
		<td>Contact Number : </td>
		<td>${adm.contact}</td>
	</tr>
	
	<tr>
		<td>E-mail : </td>
		<td>${adm.email}</td>
	</tr>
	
	
	</c:forEach>
	
	</table>
	
	<c:url value="updateAdmin.jsp" var = "adminUpdate">
		<c:param name="adId" value="${aId}"></c:param>
		<c:param name="adName" value="${aName}"></c:param>
		<c:param name="adType" value="${aType}"></c:param>
		<c:param name="conNo" value="${cNum}"></c:param>
		<c:param name="email" value="${mail}"></c:param>
	</c:url>
	</div>
	
	

<br>

 <a href="${adminUpdate}">
	<input type="button" name="submit" value="Update Profile Info">
	</a>

	

</body>
</html>

