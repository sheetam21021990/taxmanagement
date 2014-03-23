<div style="box-shadow: 0px -4px 7px #888888; padding:5px; height:20px; position: fixed; bottom:60px; right:0px; width: 100%; vertical-align: top;" align="center">
		
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.validate.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/mycss.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" type="text/css"/>	

<%@ page import="com.taxmanagement.form.*" %>
<%@ page import="com.taxmanagement.common.*" %>

		               
	<div align="center">
	
		<div id="supermenuset1">
			<img src="<%=request.getContextPath()%>/icons/user.png" title="User Details"  height="50px"  class="img-rounded menu" onclick="showmenu('1')" >
			<img src="<%=request.getContextPath()%>/icons/statistics.png" title="Tax Details"  height="50px"  class="img-rounded menu" onclick="showmenu('2')">
		</div>
		
	</div>
</div>
