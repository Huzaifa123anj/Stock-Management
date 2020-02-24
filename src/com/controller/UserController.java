 package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.huzaifa.data.UserDAOImpl;
import com.huzaifa.model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UserDAOImpl userUtil = null;  
	
	// very imp made it khud
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		userUtil = new UserDAOImpl();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   // thios can be any name like singup aur else;	   
       try {
    	   String command=request.getParameter("command");
    	   switch(command) {
    	   case "ADD":
    		   addUser(request,response);
    		   break;
    	 
    	   case "USER":
    		   getUser(request,response);
    		   break;
    	   case "LOGOUT":
    		   LogOut(request,response);
    	   }
    	   
    	   
       }
       catch(Exception e)
       {
    	   throw new ServletException(e);
       }
		
		
	}

	private void LogOut(HttpServletRequest request, HttpServletResponse response)throws Exception {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		session.invalidate();
		String message="LOG OUT Sucessfully";
		RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
		request.setAttribute("msg", message);
		rd.forward(request,response);
		
		
	}

	private void getUser(HttpServletRequest request, HttpServletResponse response)throws Exception {
		// TODO Auto-generated method stub
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		
		String message=null;
		String resource="login.jsp";
		
		try 
		{
			User user=userUtil.getUser(userId);
			if(user.getPassword().equals(password)) {
			    resource="Welcome.jsp";
			    HttpSession session=request.getSession();
			    session.setAttribute("user", user);
			}
			else
				message="wrong password pls try again ";
		}
		catch(Exception e)
		{
			message = e.getMessage();
		}
		
		request.setAttribute("msg", message);
		RequestDispatcher rd = request.getRequestDispatcher(resource);
		rd.forward(request, response);
		
		
		
	}

	private void addUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 //TODO Auto-generated method stub
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		
		User user = new User(userId, password, firstName, lastName, address, city);
		
		System.out.println(user);
		
		//UserDAOImpl userUtil = new UserDAOImpl();
		
		
		String message=null;
		String resource="registration.jsp";
		
		try 
		{
			userUtil.addUser(user);
			message="registration successfull pls login";
			resource="login.jsp";
		}
		catch(Exception e)
		{
			System.out.println(e);
			message = e.getMessage();
		}
		// to send msg to  main page
		request.setAttribute("msg", message);
		RequestDispatcher rd = request.getRequestDispatcher(resource);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
