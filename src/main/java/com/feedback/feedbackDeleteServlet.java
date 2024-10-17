package com.feedback;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/feedbackDeleteServlet")
public class feedbackDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("uID");
		boolean isValue;
		
		isValue = feedbackDBUtil.deleteFeedback(id);
		
		if(isValue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("feedbackInsert.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type ='text/javascript'>");
			out.println("alert('Error..!Please try again..!');");
			out.println("location='feedback.jsp'");
			out.println("</script>");
			
		}
		
	}

}
