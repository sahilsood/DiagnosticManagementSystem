package com.tricare.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

//    public SignupController() {
//      super();
//    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();	
			SignupDAO DAOobj = new SignupDAO();
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String dateofbirth = request.getParameter("dateofbirth");
			String email = request.getParameter("email");
			
			SignupTO TOobj = new SignupTO();
			
			TOobj.setUsername(username);
			TOobj.setPassword(password);
			TOobj.setDateofbirth(dateofbirth);
			TOobj.setEmail(email);
			
			String msg = DAOobj.addUser(TOobj);
			
			request.setAttribute("msg", msg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
        }
	}

}
