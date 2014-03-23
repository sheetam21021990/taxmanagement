package com.taxmanagement.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.taxmanagement.vo.IncomeTaxDetailVo;


/**
 * The persistent class for the income_tax_details database table.
 * 
 */
public class IncomeTaxDetail extends ActionForm {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private String assesmentYear;

	private int paidIncometax;

	private String userId;
	
	private String month;
	
	

	public String getMonth() {
		return month;
	}



	public void setMonth(String month) {
		this.month = month;
	}

	private List<IncomeTaxDetailVo> incomeTaxDetailVo;
	
	public IncomeTaxDetail() {
	}

	
	
	public List<IncomeTaxDetailVo> getIncomeTaxDetailVo() {
		return incomeTaxDetailVo;
	}



	public void setIncomeTaxDetailVo(List<IncomeTaxDetailVo> incomeTaxDetailVo) {
		this.incomeTaxDetailVo = incomeTaxDetailVo;
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