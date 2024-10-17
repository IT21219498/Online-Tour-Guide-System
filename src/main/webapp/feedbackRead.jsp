<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Feedbacks</title>
</head>
<body>

	<h2>User Reviews and Ratings</h2>
	
	<table>
	<c:forEach var="feed" items="${fdDetails}">
	
	<tr>
		<td>User ID : </td>
		<td>${feed.userID}</td>
	</tr>
	
	<tr>
		<td>Feedback : </td>
		<td>${feed.details}</td>
	</tr>
	
	
	
	</c:forEach>
	
	
	</table>

</body>
</html>