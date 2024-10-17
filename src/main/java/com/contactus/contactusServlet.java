package com.contactus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/contactusServlet")
public class contactusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userID = request.getParameter("userID");
		String tType = request.getParameter("tType");
		String gMOde = request.getParameter("gMode");
		String conNo = request.getParameter("cNo");
		String subject = request.getParameter("subject");
		
		boolean isValue;
		
		isValue = contactusDBUtil.insertContactUS(userID, tType, gMOde, conNo, subject);
		
		if(isValue == true) {
			
			out.println("<script type ='text/javascript'>");
			out.println("alert('Successfully sent your request. Thank You..!');");
			out.println("location='contactusInsert.jsp'");
			out.println("</script>");		
		}
		else {
			
			out.println("<script type ='text/javascript'>");
			out.println("alert('Error..!Please try again..!');");
			out.println("location='contactusInsert.jsp'");
			out.println("</script>");
		}
		
		
	}

}
