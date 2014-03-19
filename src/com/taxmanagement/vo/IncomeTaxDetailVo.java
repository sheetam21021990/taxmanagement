package com.taxmanagement.vo;

import java.io.Serializable;


/**
 * The persistent class for the income_tax_details database table.
 * 
 */
public class IncomeTaxDetailVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private String assesmentYear;

	private int paidIncometax;

	private String userId;

	public IncomeTaxDetailVo() {
	}

	
	
	
	public IncomeTaxDetailVo(int slNo, String assesmentYear, int paidIncometax, String userId) { 
		this.slNo = slNo;
		this.assesmentYear = assesmentYear;
		this.paidIncometax = paidIncometax;
		this.userId = userId;
	}




	public int getSlNo() {
		return this.slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public String getAssesmentYear() {
		return this.assesmentYear;
	}

	public void setAssesmentYear(String assesmentYear) {
		this.assesmentYear = assesmentYear;
	}

	public int getPaidIncometax() {
		return this.paidIncometax;
	}

	public void setPaidIncometax(int paidIncometax) {
		this.paidIncometax = paidIncometax;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}