package ovp.frontend.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {  

	private static final long serialVersionUID = -3721965800980759308L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
         
            PrintWriter out=response.getWriter();  
              
            HttpSession session=request.getSession();  
            session.invalidate();  
              
            out.print("You are successfully logged out!");  
              
            response.sendRedirect("http://localhost:8090/ovp.frontend/index.jsp");
            out.close();
    }  
}  
