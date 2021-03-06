package com.taxmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.taxmanagement.common.Common;
import com.taxmanagement.form.PerquisitesDetail;
import com.taxmanagement.impl.PerquisitesDetailImpl;
import com.taxmanagement.interfaces.ActionInterface;


public class PerquisitesDetailAction extends Action implements ActionInterface {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		try {
			PerquisitesDetail perquisitesDetail = (PerquisitesDetail)form;
			perquisitesDetail.setUserId(request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERNAME.name()).toString());
			
			PerquisitesDetailImpl impl = new PerquisitesDetailImpl(perquisitesDetail);
			
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
			e.printStackTrace();
		}
		return mapping.findForward("login");

	}
	
	
	
	
	
	
}