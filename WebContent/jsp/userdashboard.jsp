
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.css" type="text/css">

    </head>

    <body>
    
    <jsp:include page="/template/header.jsp"></jsp:include>
    <jsp:include page="/template/userdashboardmenu.jsp"></jsp:include>
    <jsp:include page="/template/footer.jsp"></jsp:include>    
   
   <table style="height: 600px; width: 2000px;"><tr><td valign="middle" align="center">
	 <div class="row" >
	  <div class="col-xs-6 col-md-3"  style="box-shadow: 10px 10px 5px #888888;">
	  	<a href="<%=request.getContextPath() %>/profile.do" class="thumbnail">
	    <h4>PROFILE</h4>
	      <img src="<%=request.getContextPath() %>/icons/user.png" alt="USER">
	    </a>
	  </div>
	  <div class="col-xs-6 col-md-3"  style="box-shadow: 10px 10px 5px #888888;">
	    <a href="#" class="thumbnail">
	      <h4>REPORT</h4>
	      <img src="<%=request.getContextPath() %>/icons/report.png" alt="REPORT">
	    </a>
	  </div>
	  <div class="col-xs-6 col-md-3"  style="box-shadow: 10px 10px 5px #888888;">
	    <a href="#" class="thumbnail">
	      <h4>STATISTICS</h4>
	      <img src="<%=request.getContextPath() %>/icons/statistics.png" alt="STATISTICS">
	    </a>
	  </div>
	    <div class="col-xs-6 col-md-3"  style="box-shadow: 10px 10px 5px #888888;">
	    <a href="#" class="thumbnail">
	      <h4>TAX</h4>
	      <img src="<%=request.getContextPath() %>/icons/addtax.png" alt="TAX ADD">
	    </a>
	  </div>
	</div>
</td></tr></table>		

    </body>

</html>
