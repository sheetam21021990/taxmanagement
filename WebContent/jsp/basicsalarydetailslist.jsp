
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/js/myscript.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.js"></script>
        <link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.css" type="text/css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/css/mycss.css" type="text/css">
    </head>

    <body>
    <jsp:include page="/template/header.jsp"></jsp:include>
    <jsp:include page="/template/menu.jsp"></jsp:include>
    <jsp:include page="/template/footer.jsp"></jsp:include>    
   	
  <div align="center">
  
<display:table id="data" name="sessionScope.BasicSalaryDetails.basicSalaryDetailsVo" cellspacing="2" export="true"  pagesize="10" cellpadding="2" class="datatable" >
		<display:column property="slNo" title="SLNO" />
		<display:column property="userId" title="USERID" />
		<display:column property="jobDescription" title="JOBDESCRIPTION" />
		<display:column property="grossSalary" title="GROSSSALARY" />
		<display:column property="da" title="DA" />
		<display:column property="allowance" title="ALLOWANCE" />
		<display:column property="medical" title="MEDICAL" />
		<display:column property="servant" title="SERVANT" />
	<display:setProperty name="export.csv" value="true" />
</display:table>


  </div>
<div align="right" style="float: right;">
		<button class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal">Add</button>
</div>
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
    <html:form action="/user">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">ADD</h4>
      </div>
      <div class="modal-body">
        <table align="center" height="400px"">

	        <tr><td align="left">SLNO </td><td>:<input type="text" id="slNo" name="slNo"></td></tr>
			<tr><td align="left">USERID </td><td>:<input type="text" id="userId" name="userId"></td></tr>
			<tr><td align="left">JOBDESCRIPTION </td><td>:<input type="text" id="jobDescription" name="jobDescription"></td></tr>
			<tr><td align="left">GROSSSALARY </td><td>:<input type="text" id="grossSalary" name="grossSalary"></td></tr>
			<tr><td align="left">DA </td><td>:<input type="text" id="da" name="da"></td></tr>
			<tr><td align="left">ALLOWANCE </td><td>:<input type="text" id="allowance" name="allowance"></td></tr>
			<tr><td align="left">MEDICAL </td><td>:<input type="text" id="medical" name="medical"></td></tr>
			<tr><td align="left">SERVANT </td><td>:<input type="text" id="servant" name="servant"></td></tr>

        
		</table>

      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal" >Close</button>
        <button type="button" class="btn btn-primary" onclick="addElement()">ADD</button>
      </div>
      </html:form>
    </div>
  </div>
</div>
</body>
</html>
