<div style="padding:5px;background-color:teal; position: fixed; top: 0px; right:0px; height:80px; width: 100%;" align="center">
	<h1> Tax Management </h1>
</div> 
<% if( session.getAttribute("loggedin") == null ){
	response.sendRedirect(request.getContextPath());
} %>

