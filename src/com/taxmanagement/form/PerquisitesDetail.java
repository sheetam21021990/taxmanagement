package com.taxmanagement.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.taxmanagement.vo.PerquisitesDetailVo;


/**
 * The persistent class for the perquisites_details database table.
 * 
 */
public class PerquisitesDetail extends ActionForm {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private String freeHousing;

	private String userId;

	private List<PerquisitesDetailVo> perquisitesDetailVo;
	
	public PerquisitesDetail() {
	}

	
	
	public List<PerquisitesDetailVo> getPerquisitesDetailVo() {
		return perquisitesDetailVo;
	}



	public void setPerquisitesDetailVo(List<PerquisitesDetailVo> perquisitesDetailVo) {
		this.perquisitesDetailVo = perquisitesDetailVo;
	}



	public int getSlNo() {
		return this.slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public String getFreeHousing() {
		return this.freeHousing;
	}

	public void setFreeHousing(String freeHousing) {
		this.freeHousing = freeHousing;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}