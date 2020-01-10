package ovp.frontend.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ovp.common.resources.dto.UserDTO;
import ovp.frontend.AppMain;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			HttpSession session = request.getSession();
			
			UserDTO user = AppMain.login(userName, password);
			
			if (user.getUserName() != null) {
				session.setAttribute("user", user);
				session.setAttribute("logged", 1);
				request.getRequestDispatcher("/logged.jsp").forward(request, response);
			} else {
				session.setAttribute("logged", 0);
				response.sendRedirect("http://localhost:8090/ovp.frontend/login.jsp"); 
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
