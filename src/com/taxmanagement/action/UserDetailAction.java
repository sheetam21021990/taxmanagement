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

		try {
			UserDetail userDetail = (UserDetail)form;
			
			
			if(request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERID.name()) != null)
				userDetail.setId((Integer)request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERID.name()));
			
			UserDetailImpl impl = new UserDetailImpl(userDetail);
			
			if(request.getParameter("task") != null){
				if("updateuser".equalsIgnoreCase(request.getParameter("task").toString())){
					impl.update();
				}
				
				if("newuser".equalsIgnoreCase(request.getParameter("task").toString())){
					impl.insert();
					return mapping.findForward("login");
				}
			}
			
			impl.select();
			
			if("ADMIN".equalsIgnoreCase(request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERTYPE.name()).toString()) ){
				return mapping.findForward("dashboard");
			}else if("USER".equalsIgnoreCase(request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERTYPE.name()).toString())){
				return mapping.findForward("userdashboard");
			}
			
			
			return mapping.findForward("userdashboard");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mapping.findForward("login");
		
	}

}