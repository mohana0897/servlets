package com.ssd.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.service.UserService;
import com.ssd.user.UserDto;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		String email=request.getParameter("email");
		String pswd=request.getParameter("password");
	
		UserDto user=new UserDto();
		
		boolean isValid=true;
		UserService us=new UserService();
		user= us.getUser(email, pswd);
		
		if(user!=null) {
			
			
			
			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("/productservlet").forward(request, response);
			
		}
		
	}

}
