package com.taxmanagement.vo;

import java.io.Serializable;


/**
 * The persistent class for the perquisites_details database table.
 * 
 */
public class PerquisitesDetailVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private String freeHousing;

	private String userId;

	public PerquisitesDetailVo() {
	}

	
	public PerquisitesDetailVo(int slNo, String freeHousing, String userId) {
		this.slNo = slNo;
		this.freeHousing = freeHousing;
		this.userId = userId;
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