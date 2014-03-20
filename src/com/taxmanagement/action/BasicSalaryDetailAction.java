package com.taxmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.taxmanagement.common.Common;
import com.taxmanagement.form.BasicSalaryDetail;
import com.taxmanagement.impl.BasicSalaryDetailImpl;
import com.taxmanagement.interfaces.ActionInterface;

public class BasicSalaryDetailAction extends Action implements ActionInterface{

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		try {
			BasicSalaryDetail salaryDetail = (BasicSalaryDetail)form;
			salaryDetail.setUserId(request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERNAME.name()).toString());
			
			BasicSalaryDetailImpl impl = new BasicSalaryDetailImpl(salaryDetail);
			
			if(request.getParameter("task") != null){
				if("update".equalsIgnoreCase(request.getParameter("task").toString())){
					impl.update();
				}
				else if("add".equalsIgnoreCase(request.getParameter("task").toString())){
					impl.insert();
				}
			}
			
			impl.select();
			
			if("ADMIN".equalsIgnoreCase(request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERTYPE.name()).toString()) ){
				return mapping.findForward("dashboard");
			}else if("USER".equalsIgnoreCase(request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERTYPE.name()).toString())){
				return mapping.findForward("userdashboard");
			}
			
			return mapping.findForward("error");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapping.findForward("login");
	}
	
	
	
}