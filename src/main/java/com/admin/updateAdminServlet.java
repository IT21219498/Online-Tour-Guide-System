package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateAdminServlet")
public class updateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		String id = request.getParameter("adID");
		String name = request.getParameter("adName");
		String type = request.getParameter("adType");
		String contact = request.getParameter("cNo");
		String email = request.getParameter("email");
		
		boolean isValue;
		
		isValue = adminDBUtil.updateAdmin(id, name, type, contact, email);
		
		if(isValue == true) {
			
			List<admin> admDetails = adminDBUtil.getAdmin(id);
			
			request.setAttribute("admDetails", admDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("adminAccount.jsp");
			dis.forward(request, response);
			
		
			
		}
		else {
			
			List<admin> admDetails = adminDBUtil.getAdmin(id);
			
			request.setAttribute("admDetails", admDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("adminAccount.jsp");
			dis.forward(request, response);
		
		}
		
	}

}
