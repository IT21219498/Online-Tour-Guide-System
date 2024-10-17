package com.feedback;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/feedbackInsertServlet")
public class feedbackInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");	
		
		String userID = request.getParameter("userID");
		String feedType = request.getParameter("fType");
		String feedDetails = request.getParameter("subject");
		
		boolean isValue;
		
		isValue = feedbackDBUtil.insertFeedback(userID, feedType, feedDetails);
		
		if(isValue == true) {
			out.println("<script type ='text/javascript'>");
			out.println("alert('Thank You for your feedback!');");
			out.println("location='feedback.jsp'");
			out.println("</script>");
					
		}
		else {
			
			out.println("<script type ='text/javascript'>");
			out.println("alert('Error! Please try again..');");
			out.println("location='feedbackInsert.jsp'");
			out.println("</script>");
			
		}
	}

}
