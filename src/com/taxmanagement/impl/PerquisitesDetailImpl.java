package com.taxmanagement.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import com.taxmanagement.DBConnect.DBConnect;
import com.taxmanagement.form.PerquisitesDetail;
import com.taxmanagement.interfaces.Impl;
import com.taxmanagement.vo.IncomeTaxDetailVo;
import com.taxmanagement.vo.PerquisitesDetailVo;


/**
 * The persistent class for the perquisites_details database table.
 * 
 */
public class PerquisitesDetailImpl implements Impl {
	
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	PerquisitesDetail bean = null;
	
	public PerquisitesDetailImpl(ActionForm form){
		this.bean = (PerquisitesDetail)form;
	}
	
	public void selectAll() {		

		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT sl_no,user_id,free_housing FROM perquisites_details");

			ArrayList<PerquisitesDetailVo> perquisitesDetailVo = new ArrayList<PerquisitesDetailVo>();
			
			while (rs.next()) {
				
				PerquisitesDetailVo vo = new PerquisitesDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("free_housing"), 						
						rs.getString("user_id"));

				perquisitesDetailVo.add(vo);
			}
			bean.setPerquisitesDetailVo(perquisitesDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("SELECT sl_no,user_id,free_housing FROM perquisites_details WHERE sl_no = '"+bean.getSlNo()+"'");

			ArrayList<PerquisitesDetailVo> perquisitesDetailVo = new ArrayList<PerquisitesDetailVo>();
			
			while (rs.next()) {
				
				PerquisitesDetailVo vo = new PerquisitesDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("free_housing"), 						
						rs.getString("user_id"));

				perquisitesDetailVo.add(vo);
			}
			bean.setPerquisitesDetailVo(perquisitesDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("INSERT INTO perquisites_details(user_id,free_housing) VALUES ('"+bean.getSlNo()+"','"+bean.getUserId()+"','"+bean.getFreeHousing()+"')");

			ArrayList<PerquisitesDetailVo> perquisitesDetailVo = new ArrayList<PerquisitesDetailVo>();
			
			while (rs.next()) {
				
				PerquisitesDetailVo vo = new PerquisitesDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("free_housing"), 						
						rs.getString("user_id"));

				perquisitesDetailVo.add(vo);
			}
			bean.setPerquisitesDetailVo(perquisitesDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("UPDATE perquisites_details SET user_id = '"+bean.getUserId()+"',free_housing = '"+bean.getFreeHousing()+"' WHERE sl_no = '"+bean.getSlNo()+"'");

			ArrayList<PerquisitesDetailVo> perquisitesDetailVo = new ArrayList<PerquisitesDetailVo>();
			
			while (rs.next()) {
				
				PerquisitesDetailVo vo = new PerquisitesDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("free_housing"), 						
						rs.getString("user_id"));

				perquisitesDetailVo.add(vo);
			}
			bean.setPerquisitesDetailVo(perquisitesDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("UPDATE perquisites_details SET user_id = '"+bean.getUserId()+"',free_housing = '"+bean.getFreeHousing()+"'");

			ArrayList<PerquisitesDetailVo> perquisitesDetailVo = new ArrayList<PerquisitesDetailVo>();
			
			while (rs.next()) {
				
				PerquisitesDetailVo vo = new PerquisitesDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("free_housing"), 						
						rs.getString("user_id"));

				perquisitesDetailVo.add(vo);
			}
			bean.setPerquisitesDetailVo(perquisitesDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("DELETE FROM perquisites_details WHERE sl_no = '"+bean.getSlNo()+"'");

			ArrayList<PerquisitesDetailVo> perquisitesDetailVo = new ArrayList<PerquisitesDetailVo>();
			
			while (rs.next()) {
				
				PerquisitesDetailVo vo = new PerquisitesDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("free_housing"), 						
						rs.getString("user_id"));

				perquisitesDetailVo.add(vo);
			}
			bean.setPerquisitesDetailVo(perquisitesDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("DELETE FROM perquisites_details");

			ArrayList<PerquisitesDetailVo> perquisitesDetailVo = new ArrayList<PerquisitesDetailVo>();
			
			while (rs.next()) {
				
				PerquisitesDetailVo vo = new PerquisitesDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("free_housing"), 						
						rs.getString("user_id"));

				perquisitesDetailVo.add(vo);
			}
			bean.setPerquisitesDetailVo(perquisitesDetailVo);
			
			DBConnect.closeConnection(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	
	
}