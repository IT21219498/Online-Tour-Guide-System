package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/adminLoginServlet")
public class adminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");		

		
		String adminID = request.getParameter("aID");
		String password = request.getParameter("apsw");
		boolean isValue;
		
		isValue = adminDBUtil.validate(adminID, password);
		
		if(isValue == true) {
			List<admin> admDetails = adminDBUtil.getAdmin(adminID);
			
			request.setAttribute("admDetails", admDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("adminAccount.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type ='text/javascript'>");
			out.println("alert('Your ID or password is incorrect!');");
			out.println("location='adminLogin.jsp'");
			out.println("</script>");
		}
		
		
		
		
	}

}
