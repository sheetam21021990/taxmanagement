package com.taxmanagement.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.taxmanagement.vo.BasicSalaryDetailVo;


/**
 * The persistent class for the basic_salary_details database table.
 * 
 */
public class BasicSalaryDetail extends ActionForm {
	private static final long serialVersionUID = 1L;
	private int slNo;
	private String allowance;
	private String da;
	private String grossSalary;
	private String jobDescription;
	private String medical;
	private String servant;
	private String transport;
	private String userId;
	private List<BasicSalaryDetailVo> basicSalaryDetailVo;
	
	public BasicSalaryDetail() {
	}


	
	public List<BasicSalaryDetailVo> getBasicSalaryDetailVo() {
		return basicSalaryDetailVo;
	}



	public void setBasicSalaryDetailVo(List<BasicSalaryDetailVo> basicSalaryDetailVo) {
		this.basicSalaryDetailVo = basicSalaryDetailVo;
	}



	public int getSlNo() {
		return this.slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}


	public String getAllowance() {
		return this.allowance;
	}

	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}


	public String getDa() {
		return this.da;
	}

	public void setDa(String da) {
		this.da = da;
	}


	public String getGrossSalary() {
		return this.grossSalary;
	}

	public void setGrossSalary(String grossSalary) {
		this.grossSalary = grossSalary;
	}


	public String getJobDescription() {
		return this.jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}


	public String getMedical() {
		return this.medical;
	}

	public void setMedical(String medical) {
		this.medical = medical;
	}


	public String getServant() {
		return this.servant;
	}

	public void setServant(String servant) {
		this.servant = servant;
	}


	public String getTransport() {
		return this.transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}


	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}