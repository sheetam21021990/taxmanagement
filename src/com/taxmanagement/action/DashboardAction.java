package com.taxmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.taxmanagement.common.Common;
import com.taxmanagement.form.DashBoard;
import com.taxmanagement.form.UserDetail;
import com.taxmanagement.impl.DashBoardImpl;
import com.taxmanagement.impl.UserDetailImpl;
import com.taxmanagement.interfaces.ActionInterface;


public class DashboardAction extends Action implements ActionInterface {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		try {
			DashBoard dashBoard = (DashBoard)form;
			dashBoard.setUserid((String)request.getSession().getAttribute(Common.SESSIONKEY.LOGGEDINUSERNAME.name()));
			
			DashBoardImpl impl = new DashBoardImpl(dashBoard);
			
			impl.getDashboardData();
			
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