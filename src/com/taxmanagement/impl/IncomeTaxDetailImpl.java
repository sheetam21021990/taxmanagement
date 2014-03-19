package com.taxmanagement.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.struts.action.ActionForm;

import com.taxmanagement.form.IncomeTaxDetail;
import com.taxmanagement.interfaces.Impl;



public class IncomeTaxDetailImpl implements Impl {


	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	IncomeTaxDetail bean = null;
	
	public IncomeTaxDetailImpl(ActionForm form){
		this.bean = (IncomeTaxDetail)form;
	}
	
	
	
	public void selectAll() {
		
		
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