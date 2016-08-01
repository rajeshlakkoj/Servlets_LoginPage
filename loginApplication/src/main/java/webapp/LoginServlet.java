package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{

	UserValidationService ser_obj = new UserValidationService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
	}
	  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("name");
		String userpassword = request.getParameter("password");
		
		Boolean status = ser_obj.isUserValid(username, userpassword);
		if(status == true){
		request.setAttribute("names", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));
	    request.getRequestDispatcher("/WEB-INF/views/Welcome.jsp").forward(request, response);
	    }	
		request.setAttribute("ErroMessage", "Either Password or Username is incorrect: Please enter valid credentials");
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
	}	
}
