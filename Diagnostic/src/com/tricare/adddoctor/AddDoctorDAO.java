package com.tricare.adddoctor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.org.util.ConnectDB;
import java.sql.PreparedStatement;

public class AddDoctorDAO {
	public String addDoctor(AddDoctorTO TOobj) throws SQLException {
		try {
			Connection con = ConnectDB.connect();
			
			PreparedStatement selectUsername = con.prepareStatement("select * from usermaster where username=?");
			selectUsername.setString(1, TOobj.getUsername());
			
			PreparedStatement selectEmail = con.prepareStatement("select * from usermaster where email=?");
			selectEmail.setString(1, TOobj.getEmail());
			
			PreparedStatement ps = con.prepareStatement("insert into usermaster values(?,?,?,?,'Doctor')");
			ps.setString(1, TOobj.getUsername());
			ps.setString(2, TOobj.getPassword());
			ps.setString(3, TOobj.getDateofbirth());
			ps.setString(4, TOobj.getEmail());
			
			ResultSet resultUsername = selectUsername.executeQuery();
			ResultSet resultEmail = selectEmail.executeQuery();
			
			if(resultUsername.next()){
				return "Sorry, that username is already taken.";
			}
			else if(resultEmail.next()){
				return "Sorry, that email is already taken.";
			}
			else {
				int result = ps.executeUpdate();
				
				if(result != 0){
					return "Doctor details have been added successfully.";
				}
				else {
					return "Something went wrong! Sorry!";
				}
			}			
		} finally {}
	}
}
