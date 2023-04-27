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
 * Servlet implementation class SignupServlet
 */
@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		boolean isValid=false;
		
		String displayMsg=null;
		
		String errMsg=null;

		
		String fname=	request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String pswd=request.getParameter("password");
		
		String name=fname+lname;
		
		UserDto dto=new UserDto();
		
		dto.setName(name);
		dto.setEmail(email);
		dto.setPassword(pswd);
		
		
		
		UserService us= new UserService();
		
		if(us.userCreated(dto)) {
			
			displayMsg="User Created Successfully";
			
			request.setAttribute("displayMsg", displayMsg);
			
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}else {
			
			isValid =true;
			
			errMsg="please enter valid details!!!!!!!";
			
			request.setAttribute("errMsg", errMsg);
			
			request.getRequestDispatcher("signup.jsp").forward(request, response);
			
			
		}
		
	
	}

}
