package com.tricare.checkup;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			CheckupDAO DAOobj = new CheckupDAO();
			
			String username = request.getParameter("username");
			String dob = request.getParameter("dob");			
			String email = request.getParameter("email");
			String country = request.getParameter("country");
			String state = request.getParameter("state");
			String city = request.getParameter("city");
			String pincode = request.getParameter("pincode");
			String plan = request.getParameter("plan");
			
			CheckupTO TOobj = new CheckupTO();
			
			TOobj.setUsername(username);
			TOobj.setDob(dob);
			TOobj.setEmail(email);
			TOobj.setCountry(country);
			TOobj.setState(state);
			TOobj.setCity(city);
			TOobj.setPincode(pincode);
			TOobj.setPlan(plan);
			
			String msg = DAOobj.addCheckup(TOobj);
			
			request.setAttribute("msg", msg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("apply.jsp");
			dispatcher.forward(request, response);
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
        }
	}

}
