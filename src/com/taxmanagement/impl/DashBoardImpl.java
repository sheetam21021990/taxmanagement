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
import com.taxmanagement.form.DashBoard;
import com.taxmanagement.interfaces.Impl;
import com.taxmanagement.vo.BasicSalaryDetailVo;
import com.taxmanagement.vo.IncomeTaxDetailVo;
import com.taxmanagement.vo.PerquisitesDetailVo;
import com.taxmanagement.vo.UserDetailVo;


/**
 * The persistent class for the basic_salary_details database table.
 * 
 */
public class DashBoardImpl{

	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	DashBoard bean = null;

	public DashBoardImpl(ActionForm form){
		this.bean = (DashBoard)form;
	}

	public void getDashboardData(){

		try {
			con = DBConnect.openConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT sl_no,user_id,free_housing FROM perquisites_details where user_id='"+bean.getUserid()+"'");
			ArrayList<PerquisitesDetailVo> perquisitesDetailVo = new ArrayList<PerquisitesDetailVo>();
			while (rs.next()) {
				PerquisitesDetailVo vo = new PerquisitesDetailVo(rs.getInt("sl_no"), rs.getString("free_housing"), rs.getString("user_id"));
				perquisitesDetailVo.add(vo);
			}
			bean.setPerquisitesDetailVo(perquisitesDetailVo);
			stmt.close();
			rs.close();
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT sl_no,user_id,assesment_year,paid_incometax FROM income_tax_details where user_id='"+bean.getUserid()+"'");
			ArrayList<IncomeTaxDetailVo> incomeTaxDetailVo = new ArrayList<IncomeTaxDetailVo>();
			while (rs.next()) {
				IncomeTaxDetailVo vo = new IncomeTaxDetailVo( rs.getInt("sl_no"), rs.getString("assesment_year"), rs.getInt("paid_incometax"), rs.getString("user_id"));
				incomeTaxDetailVo.add(vo);
			}
			bean.setIncomeTaxDetailVo(incomeTaxDetailVo);
			stmt.close();
			rs.close();
			
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT sl_no, user_id, job_description, gross_salary, da, allowance, medical, servant, transport  FROM basic_salary_details  where user_id='"+bean.getUserid()+"'");

			ArrayList<BasicSalaryDetailVo> basicSalaryDetailVo = new ArrayList<BasicSalaryDetailVo>();
			
			while (rs.next()) {
				
				BasicSalaryDetailVo vo = new BasicSalaryDetailVo( rs.getInt("sl_no"), rs.getString("allowance"), rs.getString("da"), rs.getString("gross_salary"), rs.getString("job_description"), rs.getString("medical"), rs.getString("servant"), rs.getString("transport"), rs.getString("user_id"));

				basicSalaryDetailVo.add(vo);
			}
			bean.setBasicSalaryDetailVo(basicSalaryDetailVo);
			
			stmt.close();
			rs.close();
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT id,username,PASSWORD,fullname,pancard_no,voter_id,fax_no,phone_no,mobile_no,address,email_id,STATUS FROM user_details   where username='"+bean.getUserid()+"'");

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
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBConnect.closeConnection(con);
		}



	}


}