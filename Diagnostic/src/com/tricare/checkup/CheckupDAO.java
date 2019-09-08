package com.tricare.checkup;

import java.sql.Connection;
import java.sql.SQLException;

import com.org.util.ConnectDB;
import java.sql.PreparedStatement;

public class CheckupDAO {
	public String addCheckup(CheckupTO TOobj) throws SQLException {
		try {
			Connection con = ConnectDB.connect();
			
			PreparedStatement ps = con.prepareStatement("insert into apply_checkup values(?,?,?,?,?,?,?,?)");
			ps.setString(1, TOobj.getUsername());
			ps.setString(2, TOobj.getDob());
			ps.setString(3, TOobj.getEmail());
			ps.setString(4,TOobj.getCountry());
			ps.setString(5, TOobj.getState());
			ps.setString(6, TOobj.getCity());
			ps.setString(7, TOobj.getPincode());
			ps.setString(8,TOobj.getPlan());

			int result = ps.executeUpdate();
			
			if(result != 0){
				return "You have successfully applied for medical checkup!" +
						" Kindly wait for further intimation.";
			}
			else {
				return "Something went wrong! Sorry!";
			}			
			} finally {}
	}
}

