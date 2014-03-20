package com.taxmanagement.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import com.taxmanagement.DBConnect.DBConnect;
import com.taxmanagement.form.IncomeTaxDetail;
import com.taxmanagement.interfaces.Impl;
import com.taxmanagement.vo.IncomeTaxDetailVo;



public class IncomeTaxDetailImpl implements Impl {


	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	IncomeTaxDetail bean = null;
	
	public IncomeTaxDetailImpl(ActionForm form){
		this.bean = (IncomeTaxDetail)form;
	}
	
	
	
	public void selectAll() {
		
		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT sl_no,user_id,assesment_year,paid_incometax FROM income_tax_details");

			ArrayList<IncomeTaxDetailVo> incomeTaxDetailVo = new ArrayList<IncomeTaxDetailVo>();
			
			while (rs.next()) {
				
				IncomeTaxDetailVo vo = new IncomeTaxDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("user_id"), 						
						rs.getInt("paid_incometax"),
						rs.getString("assesment_year"));

				incomeTaxDetailVo.add(vo);
			}
			bean.setIncomeTaxDetailVo(incomeTaxDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("SELECT sl_no,user_id,assesment_year,paid_incometax FROM income_tax_details WHERE sl_no = '"+bean.getSlNo()+"'");

			ArrayList<IncomeTaxDetailVo> incomeTaxDetailVo = new ArrayList<IncomeTaxDetailVo>();
			
			while (rs.next()) {
				
				IncomeTaxDetailVo vo = new IncomeTaxDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("user_id"), 						
						rs.getInt("paid_incometax"),
						rs.getString("assesment_year"));

				incomeTaxDetailVo.add(vo);
			}
			bean.setIncomeTaxDetailVo(incomeTaxDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("INSERT INTO income_tax_details(user_id,assesment_year,paid_incometax) VALUES ('"+bean.getSlNo()+"','"+bean.getUserId()+"','"+bean.getAssesmentYear()+"','"+bean.getPaidIncometax()+"')");

			ArrayList<IncomeTaxDetailVo> incomeTaxDetailVo = new ArrayList<IncomeTaxDetailVo>();
			
			while (rs.next()) {
				
				IncomeTaxDetailVo vo = new IncomeTaxDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("user_id"), 						
						rs.getInt("paid_incometax"),
						rs.getString("assesment_year"));

				incomeTaxDetailVo.add(vo);
			}
			bean.setIncomeTaxDetailVo(incomeTaxDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("UPDATE income_tax_details SET user_id = '"+bean.getUserId()+"',assesment_year = '"+bean.getAssesmentYear()+"',paid_incometax = '"+bean.getPaidIncometax()+"' WHERE sl_no = '"+bean.getSlNo()+"'");

			ArrayList<IncomeTaxDetailVo> incomeTaxDetailVo = new ArrayList<IncomeTaxDetailVo>();
			
			while (rs.next()) {
				
				IncomeTaxDetailVo vo = new IncomeTaxDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("user_id"), 						
						rs.getInt("paid_incometax"),
						rs.getString("assesment_year"));

				incomeTaxDetailVo.add(vo);
			}
			bean.setIncomeTaxDetailVo(incomeTaxDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("UPDATE income_tax_details SET user_id = '"+bean.getUserId()+"',assesment_year = '"+bean.getAssesmentYear()+"',paid_incometax = '"+bean.getPaidIncometax()+"'");

			ArrayList<IncomeTaxDetailVo> incomeTaxDetailVo = new ArrayList<IncomeTaxDetailVo>();
			
			while (rs.next()) {
				
				IncomeTaxDetailVo vo = new IncomeTaxDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("user_id"), 						
						rs.getInt("paid_incometax"),
						rs.getString("assesment_year"));

				incomeTaxDetailVo.add(vo);
			}
			bean.setIncomeTaxDetailVo(incomeTaxDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("DELETE FROM income_tax_details WHERE sl_no = '"+bean.getSlNo()+"'");

			ArrayList<IncomeTaxDetailVo> incomeTaxDetailVo = new ArrayList<IncomeTaxDetailVo>();
			
			while (rs.next()) {
				
				IncomeTaxDetailVo vo = new IncomeTaxDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("user_id"), 						
						rs.getInt("paid_incometax"),
						rs.getString("assesment_year"));

				incomeTaxDetailVo.add(vo);
			}
			bean.setIncomeTaxDetailVo(incomeTaxDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("DELETE FROM income_tax_details");

			ArrayList<IncomeTaxDetailVo> incomeTaxDetailVo = new ArrayList<IncomeTaxDetailVo>();
			
			while (rs.next()) {
				
				IncomeTaxDetailVo vo = new IncomeTaxDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("user_id"), 						
						rs.getInt("paid_incometax"),
						rs.getString("assesment_year"));

				incomeTaxDetailVo.add(vo);
			}
			bean.setIncomeTaxDetailVo(incomeTaxDetailVo);
			
			DBConnect.closeConnection(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}

		
	}
	
}