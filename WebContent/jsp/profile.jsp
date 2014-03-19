
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%-- <jsp:root version="1.2" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:display="urn:jsptld:http://displaytag.sf.net">
 --%>
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
    <jsp:include page="/template/usermenu.jsp"></jsp:include>
    <jsp:include page="/template/footer.jsp"></jsp:include>    
   	
	<bean:define id="userlist" name="UserForm"></bean:define>

<!-- Modal -->
      
		<div align="right" style="float: right;">
				<button class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal">PROFILE</button>
		</div>
		
      <logic:iterate id="user" name="userlist" property="users">  	
        <table align="center" height="400px" width="400px"> 
        <tr><td align="left">USER NAME  </td><td align="left">:<bean:write name="user" property="userName"/></td></tr>
        <tr><td align="left">NAME  </td><td align="left">:<bean:write name="user" property="fullName"/></td></tr>
        <tr><td align="left">ADDRESS  </td><td align="left">:<bean:write name="user" property="address"/></td></tr>
        <tr><td align="left">PHONE NUMBER  </td><td align="left">:<bean:write name="user" property="phoneNumber"/></td></tr>
        <tr><td align="left">PANCARD NO  </td><td align="left">:<bean:write name="user" property="pancardno"/></td></tr>
        <tr><td align="left">EMAIL ID  </td><td align="left">:<bean:write name="user" property="email"/></td></tr>
        </table>
      </logic:iterate>


<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
    <html:form action="/user">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">ADD USER</h4>
      </div>
      <div class="modal-body">
        <table align="center" height="400px"">
        <tr><td align="left">USER NAME  </td><td>:<input type="text" id="userName" name="userName"></td></tr>
        <tr><td align="left">PASSWORD  </td><td>:<input type="password" id="password" name="password"></td></tr>
        <tr><td align="left">NAME  </td><td>:<input type="text" id="fullName" name="fullName"></td></tr>
        <tr><td align="left">ADDRESS  </td><td>:<input type="text" id="address" nam="address"></td></tr>
        <tr><td align="left">PHONE NUMBER  </td><td>:<input type="text" id="phoneNumber" name="phoneNumber"></td></tr>
        <tr><td align="left">PANCARD NO  </td><td>:<input type="text" id="pancardno" name="pancardno"></td></tr>
        <tr><td align="left">EMAIL ID  </td><td>:<input type="text" id="email" name="email"></td></tr>
        </table>
        
        <!-- DOB : <input type="text" id="dateofbirth" name="dateOfBirth"> -->
        
        <input type="hidden" id="createdBy" value="ADMIN" name="createdBy">
        <input type="hidden" id="userType" name="userType" value="USER">
        <input type="hidden" id="task" name="task" value="">
		<input type="hidden" id="operationon" name="operationon" value="">
		
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal" >Close</button>
        <button type="button" class="btn btn-primary" onclick="addElement()">ADD</button>
      </div>
      
        <input type="hidden" id="createdBy" value="ADMIN" name="createdBy">
        <input type="hidden" id="userType" name="userType" value="USER">
        <input type="hidden" id="task" name="task" value="">
		<input type="hidden" id="operationon" name="operationon" value="">
      
      </html:form>
    </div>
  </div>
</div>



    </body>

</html>
