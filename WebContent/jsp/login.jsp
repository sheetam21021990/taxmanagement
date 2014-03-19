
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/mycss.css" type="text/css">
		
        
    </head>

    <body>
    <jsp:include page="/template/header.jsp"></jsp:include>
    <jsp:include page="/template/footer.jsp"></jsp:include>    
   
        <div style="color:red">
            <html:errors />
        </div>
        <html:form action="/Login" >
            
        <!-- <table><tr><td width="1500px" height="500px" valign="middle" align="center">    -->
        
        <div style="position:fixed;top: 40%; background-color: teal; width:400px; box-shadow: 10px 10px 5px #888888;" align="center">
            <table align="center" style="vertical-align: middle;">
           	 	<tr><td>User Name : </td><td><html:text name="LoginForm" property="userName" /></td></tr>
           		<tr><td>Password  : </td><td><html:password name="LoginForm" property="password" /> </td></tr>
            	<tr><td colspan="2"><html:submit value="Login" /></td></tr>
            </table>
        </div>
        
        <img src="<%=request.getContextPath() %>/images/taxation.jpg" width="500px" height="500px">
        
        
        
        <!-- </td></tr></table> -->
        
        
        </html:form>

    </body>

</html>
