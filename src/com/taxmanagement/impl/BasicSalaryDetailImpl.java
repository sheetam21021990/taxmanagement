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
		
		
	}

	
	public void insert() {
		
		
	}

	
	public void insertAll() {
		
		
	}

	
	public void update() {
		
		
	}

	
	public void updateAll() {
		
		
	}

	
	public void delete() {
		
		
	}

	
	public void deleteAll() {
		
		
	}
	
	
}