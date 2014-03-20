<div style="width: 100%; height:50px; position:fixed;top:80px; box-shadow: 10px 10px 5px #888888;">
		
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/mycss.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" type="text/css"/>	

<%@ page import="com.taxmanagement.form.*" %>
<%@ page import="com.taxmanagement.common.*" %>

	               
<div align="center">

	<img src="<%=request.getContextPath()%>/icons/personal-information-icon.png" title="personal information"  height="50px"  class="img-rounded menu" style="float: left; display: inline;" data-toggle="modal" data-target="#myModal" >
	<img src="<%=request.getContextPath()%>/icons/logout.png" alt="Logout" height="50px"  class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/Logout.do')" style="float: right; display: inline;">

</div>
</div>

 <%  DashBoard dash = (DashBoard)session.getAttribute("DashBoard");  %>
 
<!-- Modal -->
<form action="useraction.do" method="post">
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            <img src="<%= dash.getUserDetailsVo().get(0).getStatus() %>" height="20px" width="20px" style="float: left; display: inline;">
            <h4 class="modal-title" id="myModalLabel">Profile </h4>
            
      </div>
      <div class="modal-body">
       
      
       
	       	<table align="center" height="400px"">
	
	        <tr><td align="left">USERNAME </td><td>:<input readonly="readonly"  type="text" id="username" name="username" value="<%= dash.getUserDetailsVo().get(0).getUsername() %>"></td></tr>
			<tr><td align="left">PASSWORD </td><td>:<input  type="password" id="password" name="password" value="<%= dash.getUserDetailsVo().get(0).getPassword() %>"></td></tr>
			<tr><td align="left">FULLNAME </td><td>:<input  type="text" id="fullname" name="fullname" value="<%= dash.getUserDetailsVo().get(0).getFullname() %>"></td></tr>
			<tr><td align="left">PANCARDNO </td><td>:<input  type="text" id="pancardNo" name="pancardNo" value="<%= dash.getUserDetailsVo().get(0).getPancardNo() %>"></td></tr>
			<tr><td align="left">VOTERID </td><td>:<input  type="text" id="voterId" name="voterId" value="<%= dash.getUserDetailsVo().get(0).getVoterId() %>"></td></tr>
			<tr><td align="left">FAXNO </td><td>:<input  type="text" id="faxNo" name="faxNo" value="<%= dash.getUserDetailsVo().get(0).getFaxNo() %>"></td></tr>
			<tr><td align="left">PHONENO </td><td>:<input  type="text" id="phoneNo" name="phoneNo" value="<%= dash.getUserDetailsVo().get(0).getPhoneNo() %>"></td></tr>
			<tr><td align="left">MOBILENO </td><td>:<input  type="text" id="mobileNo" name="mobileNo" value="<%= dash.getUserDetailsVo().get(0).getMobileNo() %>"></td></tr>
			<tr><td align="left">ADDRESS </td><td>:<input  type="text" id="address" name="address" value="<%= dash.getUserDetailsVo().get(0).getAddress() %>"></td></tr>
			<tr><td align="left">EMAILID </td><td>:<input  type="text" id="emailId" name="emailId" value="<%= dash.getUserDetailsVo().get(0).getEmailId() %>"></td></tr>
	
	        
	        </table>
       			
       		<input type="hidden" name="task" value="updateuser">
       
      
       
       
       
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
 </form>




<script type="text/javascript">
function forwardTo(url){
	window.location = url;
}
</script>