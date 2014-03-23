package com.taxmanagement.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import com.taxmanagement.DBConnect.DBConnect;
import com.taxmanagement.form.UserDetail;
import com.taxmanagement.interfaces.Impl;
import com.taxmanagement.vo.UserDetailVo;


/**
 * The persistent class for the user_details database table.
 * 
 */
public class UserDetailImpl implements Impl {

	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	UserDetail bean = null;
	
	public UserDetailImpl(ActionForm form){
		this.bean = (UserDetail)form;
	}
	
	
	public void selectAll() {		
			
		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT id,username,PASSWORD,fullname,pancard_no,voter_id,fax_no,phone_no,mobile_no,address,email_id,STATUS FROM user_details ");

			ArrayList<UserDetailVo> userDetailsVo = new ArrayList<UserDetailVo>();
			
			while (rs.next()) {
				
				UserDetailVo vo = new UserDetailVo(
						rs.getInt("id"), 
						rs.getString("username"), 						
						rs.getString("PASSWORD"),
						rs.getString("fullname"),
						rs.getString("pancard_no"),
						rs.getString("voter_id"),
						rs.getString("fax_no"),
						rs.getString("phone_no"),
						rs.getString("mobile_no"),
						rs.getString("address"),
						rs.getString("email_id"),
						rs.getString("STATUS"));

				userDetailsVo.add(vo);
			}
			bean.setUserDetailsVo(userDetailsVo);
			
			DBConnect.closeConnection(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}

		
	}

	
	public void select() {
		
		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT id,username,PASSWORD,fullname,pancard_no,voter_id,fax_no,phone_no,mobile_no,address,email_id,STATUS FROM user_details WHERE id = '"+bean.getId()+"'");

			ArrayList<UserDetailVo> userDetailsVo = new ArrayList<UserDetailVo>();
			
			while (rs.next()) {
				
				UserDetailVo vo = new UserDetailVo(
						rs.getInt("id"), 
						rs.getString("username"), 						
						rs.getString("PASSWORD"),
						rs.getString("fullname"),
						rs.getString("pancard_no"),
						rs.getString("voter_id"),
						rs.getString("fax_no"),
						rs.getString("phone_no"),
						rs.getString("mobile_no"),
						rs.getString("address"),
						rs.getString("email_id"),
						rs.getString("STATUS"));

				userDetailsVo.add(vo);
			}
			bean.setUserDetailsVo(userDetailsVo);
			
			DBConnect.closeConnection(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}

		
	}

	
	public void insert() {
		
		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			int count = stmt.executeUpdate("INSERT INTO user_details(username,PASSWORD,fullname,pancard_no,voter_id,fax_no,phone_no,mobile_no,address,email_id,STATUS,user_type) VALUES ('"+bean.getUsername()+"','"+bean.getPassword()+"','"+bean.getFullname()+"','"+bean.getPancardNo()+"','"+bean.getVoterId()+"','"+bean.getFaxNo()+"','"+bean.getPhoneNo()+"','"+bean.getMobileNo()+"','"+bean.getAddress()+"','"+bean.getEmailId()+"','A','USER')");
			DBConnect.closeConnection(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public void insertAll() {
		
		
	}

	
	public void update() {
		
		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			int count = stmt.executeUpdate("UPDATE user_details SET username = '"+bean.getUsername()+"',PASSWORD = '"+bean.getPassword()+"',fullname = '"+bean.getFullname()+"',pancard_no = '"+bean.getPancardNo()+"',voter_id = '"+bean.getVoterId()+"',fax_no = '"+bean.getFaxNo()+"',phone_no = '"+bean.getPhoneNo()+"',mobile_no = '"+bean.getMobileNo()+"',address = '"+bean.getAddress()+"',email_id = '"+bean.getEmailId()+"' WHERE id = '"+bean.getId()+"'");
			DBConnect.closeConnection(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public void updateAll() {
		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("UPDATE user_details SET username = '"+bean.getUsername()+"',PASSWORD = '"+bean.getPassword()+"',fullname = '"+bean.getFullname()+"',pancard_no = '"+bean.getPancardNo()+"',voter_id = '"+bean.getVoterId()+"',fax_no = '"+bean.getFaxNo()+"',phone_no = '"+bean.getPhoneNo()+"',mobile_no = '"+bean.getMobileNo()+"',address = '"+bean.getAddress()+"',email_id = '"+bean.getEmailId()+"',STATUS = '"+bean.getStatus()+"'");

			ArrayList<UserDetailVo> userDetailsVo = new ArrayList<UserDetailVo>();
			
			while (rs.next()) {
				
				UserDetailVo vo = new UserDetailVo(
						rs.getInt("id"), 
						rs.getString("username"), 						
						rs.getString("PASSWORD"),
						rs.getString("fullname"),
						rs.getString("pancard_no"),
						rs.getString("voter_id"),
						rs.getString("fax_no"),
						rs.getString("phone_no"),
						rs.getString("mobile_no"),
						rs.getString("address"),
						rs.getString("email_id"),
						rs.getString("STATUS"));

				userDetailsVo.add(vo);
			}
			bean.setUserDetailsVo(userDetailsVo);
			
			DBConnect.closeConnection(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public void delete() {
		
		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("DELETE FROM user_details WHERE id = '"+bean.getId()+"'");

			ArrayList<UserDetailVo> userDetailsVo = new ArrayList<UserDetailVo>();
			
			while (rs.next()) {
				
				UserDetailVo vo = new UserDetailVo(
						rs.getInt("id"), 
						rs.getString("username"), 						
						rs.getString("PASSWORD"),
						rs.getString("fullname"),
						rs.getString("pancard_no"),
						rs.getString("voter_id"),
						rs.getString("fax_no"),
						rs.getString("phone_no"),
						rs.getString("mobile_no"),
						rs.getString("address"),
						rs.getString("email_id"),
						rs.getString("STATUS"));

				userDetailsVo.add(vo);
			}
			bean.setUserDetailsVo(userDetailsVo);
			
			DBConnect.closeConnection(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public void deleteAll() {
		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("DELETE FROM user_details");

			ArrayList<UserDetailVo> userDetailsVo = new ArrayList<UserDetailVo>();
			
			while (rs.next()) {
				
				UserDetailVo vo = new UserDetailVo(
						rs.getInt("id"), 
						rs.getString("username"), 						
						rs.getString("PASSWORD"),
						rs.getString("fullname"),
						rs.getString("pancard_no"),
						rs.getString("voter_id"),
						rs.getString("fax_no"),
						rs.getString("phone_no"),
						rs.getString("mobile_no"),
						rs.getString("address"),
						rs.getString("email_id"),
						rs.getString("STATUS"));

				userDetailsVo.add(vo);
			} 
			bean.setUserDetailsVo(userDetailsVo);
			
			DBConnect.closeConnection(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	
	
}