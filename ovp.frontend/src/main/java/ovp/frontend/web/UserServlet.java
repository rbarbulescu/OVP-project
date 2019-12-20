package ovp.frontend.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ovp.common.resources.dto.UserDTO;
import ovp.frontend.AppMain;

/**
 * Servlet implementation class User
 */

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */

	public UserServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {

			response.setContentType("text/html;charset=UTF-8");

			String userName = request.getParameter("userName");

			List<UserDTO> users = new ArrayList<UserDTO>();
			
			if(userName.equals("")) {
				response.setContentType("text/html;charset=UTF-8");

				users = AppMain.getUsers();

			} else {
				users.add(AppMain.getUser(userName));
			}
			
			request.setAttribute("users", users);
			request.getRequestDispatcher("/showUsers.jsp").forward(request, response);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
