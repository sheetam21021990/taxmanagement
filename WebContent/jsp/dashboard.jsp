
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/mycss.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" type="text/css"/>	

    </head>

    <body>
    
    <jsp:include page="/template/header.jsp"></jsp:include>
     <jsp:include page="/template/dashboardmenu.jsp"></jsp:include>
    <jsp:include page="/template/footer.jsp"></jsp:include>    

	<table border="1" width="100%" height="90%">
	<tr>
		<td align="center">
		
				<display:table id="data" name="sessionScope.DashBoard.incomeTaxDetailVo" cellspacing="2"   pagesize="5" cellpadding="2" class="datatable" >
					<display:column property="slNo" title="SLNO" />
					<display:column property="userId" title="USERID" />
					<display:column property="assesmentYear" title="ASSESMENTYEAR" />
					<display:column property="paidIncometax" title="PAID INCOME TAX" />
				
				</display:table>
		
		   </td>
		   <td align="center">   
		   
		       <display:table id="data" name="sessionScope.DashBoard.perquisitesDetailVo" cellspacing="2"   pagesize="5" cellpadding="2" class="datatable" >
					<display:column property="slNo" title="SLNO" />
					<display:column property="userId" title="USERID" />
					<display:column property="freeHousing" title="Free Housing" />
				</display:table>
		   
		   
		   </td>
	</tr>
	
	<tr>
			<td align="center" colspan="2">   
				 <display:table id="data" name="sessionScope.DashBoard.basicSalaryDetailVo" cellspacing="2"   pagesize="5" cellpadding="2" class="datatable" >
					<display:column property="slNo" title="SLNO" />
					<display:column property="userId" title="USERID" />
					<display:column property="jobDescription" title="JOBDESCRIPTION" />
					<display:column property="grossSalary" title="GROSSSALARY" />
					<display:column property="da" title="DA" />
					<display:column property="allowance" title="ALLOWANCE" />
					<display:column property="medical" title="MEDICAL" />
					<display:column property="servant" title="SERVANT" />
				
				</display:table>
		
			</td>
			
	</tr>
	</table>


    </body>

</html>
