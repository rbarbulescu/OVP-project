package ovp.frontend.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ovp.common.resources.dto.UserDTO;
import ovp.frontend.AppMain;

/**
 * Servlet implementation class UpdateUserServlet
 */
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String oldPassword = request.getParameter("oldPassword");
		String newPassword = request.getParameter("newPassword");
		
		UserDTO user = AppMain.updateUser(userName, oldPassword, newPassword);
		
		System.out.println(user.getUserName() + " was updated!");
		
		response.sendRedirect("http://localhost:8090/ovp.frontend/login.jsp"); 
	}

}
