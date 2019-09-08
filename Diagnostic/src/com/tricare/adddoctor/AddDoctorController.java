package com.tricare.adddoctor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddDoctorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {	
			AddDoctorDAO DAOobj = new AddDoctorDAO();
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String dateofbirth = request.getParameter("dateofbirth");
			String email = request.getParameter("email");
			
			AddDoctorTO TOobj = new AddDoctorTO();
			
			TOobj.setUsername(username);
			TOobj.setPassword(password);
			TOobj.setDateofbirth(dateofbirth);
			TOobj.setEmail(email);
			
			String msg = DAOobj.addDoctor(TOobj);
			
			request.setAttribute("msg", msg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("adddoctor.jsp");
			dispatcher.forward(request, response);
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
        }
	}

}
