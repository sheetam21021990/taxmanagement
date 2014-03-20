/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taxmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.taxmanagement.common.Common;




public class LogoutAction extends org.apache.struts.action.Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {

		request.getSession().removeAttribute(Common.SESSIONKEY.LOGGEDINUSERID.name());
		request.getSession().removeAttribute(Common.SESSIONKEY.LOGGEDINUSERNAME.name());
		request.getSession().removeAttribute(Common.SESSIONKEY.LOGGEDINUSERTYPE.name());


		return mapping.findForward("login");
	}
}
