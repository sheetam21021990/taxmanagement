package com.taxmanagement.vo;

import java.io.Serializable;


/**
 * The persistent class for the basic_salary_details database table.
 * 
 */
public class BasicSalaryDetailVo implements Serializable {
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

	public BasicSalaryDetailVo() {
	}

	
	

	public BasicSalaryDetailVo(int slNo, String allowance, String da, String grossSalary, String jobDescription, String medical, String servant, String transport, String userId) {
		this.slNo = slNo;
		this.allowance = allowance;
		this.da = da;
		this.grossSalary = grossSalary;
		this.jobDescription = jobDescription;
		this.medical = medical;
		this.servant = servant;
		this.transport = transport;
		this.userId = userId;
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