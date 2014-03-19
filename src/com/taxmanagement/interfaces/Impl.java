package com.taxmanagement.interfaces;

import org.apache.struts.action.ActionForm;

public interface Impl {
	
	public void selectAll(ActionForm form);

	public void select(ActionForm form);

	public void insert(ActionForm form);

	public void insertAll(ActionForm form);
	
	public void update(ActionForm form);
	
	public void updateAll(ActionForm form);

	public void delete(ActionForm form);
	
	public void deleteAll(ActionForm form);
	
}
