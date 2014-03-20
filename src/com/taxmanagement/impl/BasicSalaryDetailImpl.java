package com.taxmanagement.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import com.taxmanagement.DBConnect.DBConnect;
import com.taxmanagement.form.BasicSalaryDetail;
import com.taxmanagement.interfaces.Impl;
import com.taxmanagement.vo.BasicSalaryDetailVo;


/**
 * The persistent class for the basic_salary_details database table.
 * 
 */
public class BasicSalaryDetailImpl implements Impl{

	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	BasicSalaryDetail bean = null;
	
	public BasicSalaryDetailImpl(ActionForm form){
		this.bean = (BasicSalaryDetail)form;
	}

	
	public void selectAll() {
		
		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT sl_no, user_id, job_description, gross_salary, da, allowance, medical, servant, transport  FROM basic_salary_details ");

			ArrayList<BasicSalaryDetailVo> basicSalaryDetailVo = new ArrayList<BasicSalaryDetailVo>();
			
			while (rs.next()) {
				
				BasicSalaryDetailVo vo = new BasicSalaryDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("allowance"), 
						rs.getString("da"), 
						rs.getString("gross_salary"), 
						rs.getString("job_description"), 
						rs.getString("medical"), 
						rs.getString("servant"), 
						rs.getString("transport"), 
						rs.getString("user_id"));

				basicSalaryDetailVo.add(vo);
			}
			bean.setBasicSalaryDetailVo(basicSalaryDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("SELECT sl_no, user_id, job_description, gross_salary, da, allowance, medical, servant, transport  FROM basic_salary_details WHERE sl_no = '"+bean.getSlNo()+"'");

			ArrayList<BasicSalaryDetailVo> basicSalaryDetailVo = new ArrayList<BasicSalaryDetailVo>();
			
			while (rs.next()) {
				
				BasicSalaryDetailVo vo = new BasicSalaryDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("allowance"), 
						rs.getString("da"), 
						rs.getString("gross_salary"), 
						rs.getString("job_description"), 
						rs.getString("medical"), 
						rs.getString("servant"), 
						rs.getString("transport"), 
						rs.getString("user_id"));

				basicSalaryDetailVo.add(vo);
			}
			bean.setBasicSalaryDetailVo(basicSalaryDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("INSERT INTO basic_salary_details(user_id,job_description,gross_salary,da,allowance,medical,servant,transport) VALUES ('"+bean.getSlNo()+"','"+bean.getUserId()+"','"+bean.getJobDescription()+"','"+bean.getGrossSalary()+"','"+bean.getDa()+"','"+bean.getAllowance()+"','"+bean.getMedical()+"','"+bean.getServant()+"','"+bean.getTransport()+"')");

			ArrayList<BasicSalaryDetailVo> basicSalaryDetailVo = new ArrayList<BasicSalaryDetailVo>();
			
			while (rs.next()) {
				
				BasicSalaryDetailVo vo = new BasicSalaryDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("allowance"), 
						rs.getString("da"), 
						rs.getString("gross_salary"), 
						rs.getString("job_description"), 
						rs.getString("medical"), 
						rs.getString("servant"), 
						rs.getString("transport"), 
						rs.getString("user_id"));

				basicSalaryDetailVo.add(vo);
			}
			bean.setBasicSalaryDetailVo(basicSalaryDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("UPDATE basic_salary_details SET user_id = '"+bean.getUserId()+"',job_description = '"+bean.getJobDescription()+"',gross_salary = '"+bean.getGrossSalary()+"',da = '"+bean.getDa()+"',allowance = '"+bean.getAllowance()+"',medical = '"+bean.getMedical()+"',servant = '"+bean.getServant()+"',transport = '"+bean.getTransport()+"' WHERE sl_no = '"+bean.getSlNo()+"'");

			ArrayList<BasicSalaryDetailVo> basicSalaryDetailVo = new ArrayList<BasicSalaryDetailVo>();
			
			while (rs.next()) {
				
				BasicSalaryDetailVo vo = new BasicSalaryDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("allowance"), 
						rs.getString("da"), 
						rs.getString("gross_salary"), 
						rs.getString("job_description"), 
						rs.getString("medical"), 
						rs.getString("servant"), 
						rs.getString("transport"), 
						rs.getString("user_id"));

				basicSalaryDetailVo.add(vo);
			}
			bean.setBasicSalaryDetailVo(basicSalaryDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("UPDATE basic_salary_details SET user_id = '"+bean.getUserId()+"',job_description = '"+bean.getJobDescription()+"',gross_salary = '"+bean.getGrossSalary()+"',da = '"+bean.getDa()+"',allowance = '"+bean.getAllowance()+"',medical = '"+bean.getMedical()+"',servant = '"+bean.getServant()+"',transport = '"+bean.getTransport()+"'");

			ArrayList<BasicSalaryDetailVo> basicSalaryDetailVo = new ArrayList<BasicSalaryDetailVo>();
			
			while (rs.next()) {
				
				BasicSalaryDetailVo vo = new BasicSalaryDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("allowance"), 
						rs.getString("da"), 
						rs.getString("gross_salary"), 
						rs.getString("job_description"), 
						rs.getString("medical"), 
						rs.getString("servant"), 
						rs.getString("transport"), 
						rs.getString("user_id"));

				basicSalaryDetailVo.add(vo);
			}
			bean.setBasicSalaryDetailVo(basicSalaryDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("DELETE FROM basic_salary_details WHERE sl_no = '"+bean.getSlNo()+"'");

			ArrayList<BasicSalaryDetailVo> basicSalaryDetailVo = new ArrayList<BasicSalaryDetailVo>();
			
			while (rs.next()) {
				
				BasicSalaryDetailVo vo = new BasicSalaryDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("allowance"), 
						rs.getString("da"), 
						rs.getString("gross_salary"), 
						rs.getString("job_description"), 
						rs.getString("medical"), 
						rs.getString("servant"), 
						rs.getString("transport"), 
						rs.getString("user_id"));

				basicSalaryDetailVo.add(vo);
			}
			bean.setBasicSalaryDetailVo(basicSalaryDetailVo);
			
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
			ResultSet rs = stmt.executeQuery("DELETE FROM basic_salary_details");

			ArrayList<BasicSalaryDetailVo> basicSalaryDetailVo = new ArrayList<BasicSalaryDetailVo>();
			
			while (rs.next()) {
				
				BasicSalaryDetailVo vo = new BasicSalaryDetailVo(
						rs.getInt("sl_no"), 
						rs.getString("allowance"), 
						rs.getString("da"), 
						rs.getString("gross_salary"), 
						rs.getString("job_description"), 
						rs.getString("medical"), 
						rs.getString("servant"), 
						rs.getString("transport"), 
						rs.getString("user_id"));

				basicSalaryDetailVo.add(vo);
			}
			bean.setBasicSalaryDetailVo(basicSalaryDetailVo);
			
			DBConnect.closeConnection(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	
}