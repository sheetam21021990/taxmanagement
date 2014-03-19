<div style="width: 100%; position:fixed;top:80px; box-shadow: 10px 10px 5px #888888;">

<img src="<%=request.getContextPath()%>/icons/dashboard.png" alt="DashBoard" class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/jsp/dashboard.jsp')" style="float: left;">

<img src="<%=request.getContextPath()%>/icons/user.png" alt="User" class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/user.do')" >&nbsp;&nbsp;&nbsp;
<img src="<%=request.getContextPath()%>/icons/report.png" alt="Report" class="img-rounded menu" >&nbsp;&nbsp;&nbsp;
<img src="<%=request.getContextPath()%>/icons/statistics.png"  alt="Statistics" class="img-rounded menu">&nbsp;&nbsp;&nbsp;
<img src="<%=request.getContextPath()%>/icons/addtax.png" alt="Tax" class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/tax.do')" >&nbsp;&nbsp;&nbsp;

<img src="<%=request.getContextPath()%>/icons/logout.png" alt="Logout" class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/Logout.do')" style="float: right;">

</div>
<script type="text/javascript">
function forwardTo(url){
	window.location = url;
}
</script>