package ovp.frontend.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ovp.common.resources.dto.FullUserDTO;
import ovp.frontend.AppMain;

/**
 * Servlet implementation class CreateUserServlet
 */
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			
			String email = request.getParameter("email");
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			int userTypeId = Integer.parseInt(request.getParameter("userTypeId"));
			
			AppMain.addUser(email, userName, password, userTypeId);
						
			request.getRequestDispatcher("/login.jsp").forward(request, response);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
