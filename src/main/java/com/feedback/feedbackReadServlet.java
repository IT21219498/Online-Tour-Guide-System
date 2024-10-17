package com.feedback;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/feedbackReadServlet")
public class feedbackReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String uID = request.getParameter("userID");
		
		boolean isValue;
		
		isValue = feedbackDBUtil.validate(uID);
		
		if(isValue == true) {
			List<feedback> fdDetails = feedbackDBUtil.getFeedback(uID);
			
			request.setAttribute("fdDetails", fdDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("feedbackRead.jsp");
			dis.forward(request, response);
			
		}
		else {
			out.println("<script type ='text/javascript'>");
			out.println("alert('Invalid ID..!Please enter again..');");
			out.println("location='feedback.jsp'");
			out.println("</script>");
			
		}
		
		
	}

}
