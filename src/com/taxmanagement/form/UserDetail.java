package com.taxmanagement.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.taxmanagement.vo.UserDetailVo;


/**
 * The persistent class for the user_details database table.
 * 
 */
public class UserDetail extends ActionForm {
	private static final long serialVersionUID = 1L;

	private int id;

	private String address;

	private String emailId;

	private String faxNo;

	private String fullname;

	private String mobileNo;

	private String pancardNo;

	private String password;

	private String phoneNo;

	private String status;

	private String username;

	private String voterId;

	private List<UserDetailVo> userDetailsVo ;
	
	
	

	public List<UserDetailVo> getUserDetailsVo() {
		return userDetailsVo;
	}



	public void setUserDetailsVo(List<UserDetailVo> userDetailsVo) {
		this.userDetailsVo = userDetailsVo;
	}



	public UserDetail() {
	}
	
	

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPancardNo() {
		return this.pancardNo;
	}

	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getVoterId() {
		return this.voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

}