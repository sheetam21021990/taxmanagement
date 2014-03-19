<div style="width: 100%; position:fixed;top:80px; box-shadow: 10px 10px 5px #888888;">

<img src="<%=request.getContextPath()%>/icons/logout.png" alt="Logout" class="img-rounded menu" onclick="forwardTo('<%=request.getContextPath()%>/Logout.do')" style="float: right;">

</div>
<script type="text/javascript">
function forwardTo(url){
	window.location = url;
}
</script>