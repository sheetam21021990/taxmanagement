package com.taxmanagement.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.taxmanagement.vo.BasicSalaryDetailVo;
import com.taxmanagement.vo.IncomeTaxDetailVo;
import com.taxmanagement.vo.PerquisitesDetailVo;
import com.taxmanagement.vo.UserDetailVo;


public class DashBoard extends ActionForm {
	
	private static final long serialVersionUID = 1L;

	private String userid;
	
	private List<UserDetailVo> userDetailsVo ;
	
	private List<PerquisitesDetailVo> perquisitesDetailVo;
	
	private List<IncomeTaxDetailVo> incomeTaxDetailVo;
	
	private List<BasicSalaryDetailVo> basicSalaryDetailVo;

	
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public List<UserDetailVo> getUserDetailsVo() {
		return userDetailsVo;
	}

	public void setUserDetailsVo(List<UserDetailVo> userDetailsVo) {
		this.userDetailsVo = userDetailsVo;
	}

	public List<PerquisitesDetailVo> getPerquisitesDetailVo() {
		return perquisitesDetailVo;
	}

	public void setPerquisitesDetailVo(List<PerquisitesDetailVo> perquisitesDetailVo) {
		this.perquisitesDetailVo = perquisitesDetailVo;
	}

	public List<IncomeTaxDetailVo> getIncomeTaxDetailVo() {
		return incomeTaxDetailVo;
	}

	public void setIncomeTaxDetailVo(List<IncomeTaxDetailVo> incomeTaxDetailVo) {
		this.incomeTaxDetailVo = incomeTaxDetailVo;
	}

	public List<BasicSalaryDetailVo> getBasicSalaryDetailVo() {
		return basicSalaryDetailVo;
	}

	public void setBasicSalaryDetailVo(List<BasicSalaryDetailVo> basicSalaryDetailVo) {
		this.basicSalaryDetailVo = basicSalaryDetailVo;
	}
	
	
	
}