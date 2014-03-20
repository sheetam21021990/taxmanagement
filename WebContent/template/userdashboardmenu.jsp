<div style="width: 100%; height:50px; position:fixed;top:80px; box-shadow: 10px 10px 5px #888888;">
		
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/mycss.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" type="text/css"/>	

<%@ page import="com.taxmanagement.form.*" %>
	               
<div align="center">

	<img src="<%=request.getContextPath()%>/icons/personal-information-icon.png" title="personal information"  height="50px"  class="img-rounded menu" style="float: left; display: inline;" data-toggle="modal" data-target="#myModal" >
	<img src="<%=request.getContextPath()%>/icons/payment-icon.png" title="Basic Salary"  height="50px"  class="img-rounded menu" data-toggle="modal" data-target="#myModalbasicsalary"  >
	<img src="<%=request.getContextPath()%>/icons/hopusing-info.png" title="Precious Details"  height="50px"  class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/Logout.do')" >
	<img src="<%=request.getContextPath()%>/icons/deduction.png" title="Deduction Details" height="50px"  class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/Logout.do')" >
	<img src="<%=request.getContextPath()%>/icons/incometax.png" title="Income Tax"  height="50px"  class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/Logout.do')" >
	<img src="<%=request.getContextPath()%>/icons/pay-tax.png" title="Pay Tax"  height="50px"  class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/Logout.do')" >
	<img src="<%=request.getContextPath()%>/icons/statistics.png" title="Statistical Report"  height="50px"  class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/Logout.do')" >

	<img src="<%=request.getContextPath()%>/icons/logout.png" alt="Logout" height="50px"  class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/Logout.do')" style="float: right; display: inline;">

</div>
</div>

 <%  UserDetail user = (UserDetail)session.getAttribute("UserDetail");  %>
 
<!-- Modal -->
<form action="useraction.do" method="post">
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            <img src="<%= user.getUserDetailsVo().get(0).getStatus() %>" height="20px" width="20px" style="float: left; display: inline;">
            <h4 class="modal-title" id="myModalLabel">Profile </h4>
            
      </div>
      <div class="modal-body">
       
      
       
	       	<table align="center" height="400px"">
	
	        <tr><td align="left">USERNAME </td><td>:<input readonly="readonly"  type="text" id="username" name="username" value="<%= user.getUserDetailsVo().get(0).getUsername() %>"></td></tr>
			<tr><td align="left">PASSWORD </td><td>:<input  type="password" id="password" name="password" value="<%= user.getUserDetailsVo().get(0).getPassword() %>"></td></tr>
			<tr><td align="left">FULLNAME </td><td>:<input  type="text" id="fullname" name="fullname" value="<%= user.getUserDetailsVo().get(0).getFullname() %>"></td></tr>
			<tr><td align="left">PANCARDNO </td><td>:<input  type="text" id="pancardNo" name="pancardNo" value="<%= user.getUserDetailsVo().get(0).getPancardNo() %>"></td></tr>
			<tr><td align="left">VOTERID </td><td>:<input  type="text" id="voterId" name="voterId" value="<%= user.getUserDetailsVo().get(0).getVoterId() %>"></td></tr>
			<tr><td align="left">FAXNO </td><td>:<input  type="text" id="faxNo" name="faxNo" value="<%= user.getUserDetailsVo().get(0).getFaxNo() %>"></td></tr>
			<tr><td align="left">PHONENO </td><td>:<input  type="text" id="phoneNo" name="phoneNo" value="<%= user.getUserDetailsVo().get(0).getPhoneNo() %>"></td></tr>
			<tr><td align="left">MOBILENO </td><td>:<input  type="text" id="mobileNo" name="mobileNo" value="<%= user.getUserDetailsVo().get(0).getMobileNo() %>"></td></tr>
			<tr><td align="left">ADDRESS </td><td>:<input  type="text" id="address" name="address" value="<%= user.getUserDetailsVo().get(0).getAddress() %>"></td></tr>
			<tr><td align="left">EMAILID </td><td>:<input  type="text" id="emailId" name="emailId" value="<%= user.getUserDetailsVo().get(0).getEmailId() %>"></td></tr>
	
	        
	        </table>
       			
       		<input type="hidden" name="task" value="update">
       
      
       
       
       
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
 </form>


<form action="basicsalaryaction.do" method="post">
<div class="modal fade" id="myModalbasicsalary" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
    <html:form action="/user">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">ADD</h4>
      </div>
      <div class="modal-body">
        <table align="center" height="400px"">

			<tr><td align="left">USERID </td><td>:<input readonly="readonly" type="text" id="userId" name="userId" value="<%= user.getUserDetailsVo().get(0).getUsername() %>"></td></tr>
			<tr><td align="left">JOBDESCRIPTION </td><td>:<input type="text" id="jobDescription" name="jobDescription"></td></tr>
			<tr><td align="left">GROSSSALARY </td><td>:<input type="text" id="grossSalary" name="grossSalary"></td></tr>
			<tr><td align="left">DA </td><td>:<input type="text" id="da" name="da"></td></tr>
			<tr><td align="left">ALLOWANCE </td><td>:<input type="text" id="allowance" name="allowance"></td></tr>
			<tr><td align="left">MEDICAL </td><td>:<input type="text" id="medical" name="medical"></td></tr>
			<tr><td align="left">SERVANT </td><td>:<input type="text" id="servant" name="servant"></td></tr>

        
		</table>
		<input type="hidden" name="task" value="add">
			
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal" >Close</button>
        <button type="submit" class="btn btn-primary">ADD</button>
      </div>
      </html:form>
    </div>
  </div>
</div>
 </form>


<script type="text/javascript">
function forwardTo(url){
	window.location = url;
}
</script>