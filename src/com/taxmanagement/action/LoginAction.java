package com.taxmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.taxmanagement.common.Common;
import com.taxmanagement.form.Login;
import com.taxmanagement.impl.LoginImpl;
import com.taxmanagement.interfaces.ActionInterface;

public class LoginAction extends Action implements ActionInterface {


	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		Login login = (Login)form;

		LoginImpl impl = new LoginImpl();
		impl.login(login);

		if("ADMIN".equalsIgnoreCase(login.getUserType()) || "USER".equalsIgnoreCase(login.getUserType())){

			request.getSession().setAttribute(Common.SESSIONKEY.LOGGEDINUSERID.name(), login.getId());
			request.getSession().setAttribute(Common.SESSIONKEY.LOGGEDINUSERTYPE.name(), login.getUserType());
			request.getSession().setAttribute(Common.SESSIONKEY.LOGGEDINUSERNAME.name(), login.getUsername());

			return mapping.findForward("dashboard");
		}
		return mapping.findForward("loginfailure");

	}

}
