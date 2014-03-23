
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<%@ page import="java.awt.image.BufferedImage" %>
<%@ page import="com.taxmanagement.common.JFreeChart" %>
<%@ page import="java.io.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/mycss.css" type="text/css">
		
		<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.css" type="text/css"/>
		<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.validate.js"></script>
		
        <script type="text/javascript">
        function showregister(){
	        $('#registerdiv').show(500);	
    	    $('#logindiv').hide(500);
    	    $('#username').focus();
    	    
    	    
        }
        
        function showlogin(){
	        $('#registerdiv').hide(500);	
    	    $('#logindiv').show(500);
    	    $('#loginusername').focus();
        }
        
        
        </script>
        
        
    </head>

    <body>
    <jsp:include page="/template/header.jsp"></jsp:include>
    <jsp:include page="/template/footer.jsp"></jsp:include>    
   
        <div style="color:red">
            <html:errors />
        </div>
        <html:form action="/login" >
            
        <!-- <table><tr><td width="1500px" height="500px" valign="middle" align="center">    -->
        
        <div style="position:fixed;top: 40%; background-color: teal; width:400px; height:200px; box-shadow: 10px 10px 5px #888888;" id="logindiv" align="center">
            <table align="center" style="vertical-align: middle;" height="100%">
           	 	<tr><td>User Name : </td><td><html:text name="Login" styleId="loginusername" property="username" /></td></tr>
           		<tr><td>Password  : </td><td><html:password name="Login" property="password" /> </td></tr>
            	<tr><td colspan="2" align="center">
            			<button type="button" onclick="showregister()" class="btn btn-default">Register here</button>
            			<button type="submit" class="btn btn-success">Login</button>
            		</td>
            	</tr>
            </table>
        </div>
         </html:form>
        <img src="<%=request.getContextPath() %>/images/taxation.jpg" width="500px" height="500px">
        
        <div style="position:fixed;top: 13%; right:0px; background-color: teal; width:400px; box-shadow: 10px 10px 5px #888888; display: none;" id="registerdiv" align="center">
            <form action="useraction.do" method="post" id="form1" name="form1">
		       
			       	<table align="center" height="400px"">
			
				        <tr><td align="left">USERNAME </td><td>:<input type="text" id="username" name="username" ></td></tr>
						<tr><td align="left">PASSWORD </td><td>:<input  type="password" id="password" name="password" ></td></tr>
						<tr><td align="left">FULLNAME </td><td>:<input class="required" type="text" id="fullname" name="fullname" ></td></tr>
						<tr><td align="left">PANCARDNO </td><td>:<input  type="text" id="pancardNo" name="pancardNo" ></td></tr>
						<tr><td align="left">VOTERID </td><td>:<input  type="text" id="voterId" name="voterId" ></td></tr>
						<tr><td align="left">FAXNO </td><td>:<input  type="text" id="faxNo" name="faxNo" ></td></tr>
						<tr><td align="left">PHONENO </td><td>:<input  type="text" id="phoneNo" name="phoneNo" ></td></tr>
						<tr><td align="left">MOBILENO </td><td>:<input  type="text" id="mobileNo" name="mobileNo" ></td></tr>
						<tr><td align="left">ADDRESS </td><td>:<input  type="text" id="address" name="address" ></td></tr>
						<tr><td align="left">EMAILID </td><td>:<input  type="text" id="emailId" name="emailId" ></td></tr>
			        
			        </table>
		       			
		       		<input type="hidden" name="task" value="newuser">
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" onclick="showlogin()">Login</button>
		        <button type="submit" class="btn btn-success">Register</button>
		      </div>
		 </form>
        </div>
        
    </body>

</html>
