package com.taxmanagement.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.taxmanagement.DBConnect.DBConnect;
import com.taxmanagement.form.Login;

public class LoginImpl {

	public void login(Login form){
		
		try {
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			con = DBConnect.openConnection();
			stmt = con.createStatement();
			String sql = "SELECT id, username, fullname, pancard_no, voter_id, fax_no, phone_no, mobile_no, address, email_id, STATUS, user_type  FROM user_details where username ='"+form.getUsername()+"' AND PASSWORD = '"+form.getPassword()+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				
				form.setId(rs.getInt("id"));
				form.setAddress(rs.getString("address"));
				form.setEmailId(rs.getString("email_id"));
				form.setFaxNo(rs.getString("fax_no"));
				form.setFullname(rs.getString("fullname"));
				form.setMobileNo(rs.getString("mobile_no"));
				form.setPancardNo(rs.getString("pancard_no"));
				form.setPhoneNo(rs.getString("phone_no"));
				form.setUsername(rs.getString("username"));
				form.setVoterId(rs.getString("voter_id"));
				form.setStatus(rs.getString("STATUS"));
				form.setUserType(rs.getString("user_type"));
				
				 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
