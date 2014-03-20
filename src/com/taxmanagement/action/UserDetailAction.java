package com.taxmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.taxmanagement.common.Common;
import com.taxmanagement.form.UserDetail;
import com.taxmanagement.impl.UserDetailImpl;
import com.taxmanagement.interfaces.ActionInterface;


public class UserDetailAction extends Action implements ActionInterface {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		UserDetail userDetail = (UserDetail)form;
		userDetail.setId((Integer)request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERID.name()));
		
		UserDetailImpl impl = new UserDetailImpl(userDetail);
		
		if(request.getParameter("task") != null){
			if("update".equalsIgnoreCase(request.getParameter("task").toString())){
				impl.update();
			}
		}
		
		impl.select();
		
		if("ADMIN".equalsIgnoreCase(request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERTYPE.name()).toString()) ){
			return mapping.findForward("dashboard");
		}else if("USER".equalsIgnoreCase(request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERTYPE.name()).toString())){
			return mapping.findForward("userdashboard");
		}
		
		
		return mapping.findForward("userdashboard");
		
		
	}

}