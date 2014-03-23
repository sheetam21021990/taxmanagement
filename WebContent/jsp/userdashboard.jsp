
<%@page import="com.taxmanagement.common.Common"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

		<script type="text/javascript" src="<%= request.getContextPath() %>/js/jscharts.js"></script>

		<style type="text/css">
		th{
			text-align: center;
		}
		
		.shadow{
			box-shadow: 10px 10px 5px #888888;
		}
		
		</style>

    </head>

    <body>
    
    <jsp:include page="/template/header.jsp"></jsp:include>
    <jsp:include page="/template/userdashboardmenu.jsp"></jsp:include>
    <jsp:include page="/template/footer.jsp"></jsp:include>    
	<jsp:include page="/template/userdashboardsupermenu.jsp"></jsp:include>
	
<div id="displayset1"  class="displayset" style="display: none;">
	<table border="0" width="100%" height="90%">
	<tr>
		<td align="center">
		
				<h4><u>TAX PAID</u></h4>
				<display:table id="data" name="sessionScope.DashBoard.incomeTaxDetailVo" cellspacing="2"   pagesize="5" cellpadding="2" class="datatable shadow" >
					
					<display:column property="slNo" title="SLNO" />
					<display:column property="userId" title="USERID" />
					<display:column property="assesmentYear" title="ASSESMENTYEAR" />
					<display:column property="paidIncometax" title="PAID INCOME TAX" />
				
				</display:table>
		
		   </td>
		   <td align="center">   
		   		<h4><u>PERQUISITES DETAILS</u></h4>
		       <display:table id="data" name="sessionScope.DashBoard.perquisitesDetailVo" cellspacing="2"   pagesize="5" cellpadding="2" class="datatable shadow" >
					<display:column property="slNo" title="SLNO" />
					<display:column property="userId" title="USERID" />
					<display:column property="freeHousing" title="Free Housing" />
				</display:table>
		   
		   
		   </td>
	</tr>
	
	<tr>
			<td align="center" colspan="2"> 
			<h4><u>BASIC SALARY DEAILS</u></h4>  
				 <display:table id="data" name="sessionScope.DashBoard.basicSalaryDetailVo" cellspacing="2"   pagesize="5" cellpadding="2" class="datatable shadow" >
					<display:column property="slNo" title="SLNO" />
					<display:column property="userId" title="USERID" />
					<display:column property="jobDescription" title="JOBDESCRIPTION" />
					<display:column property="grossSalary" title="GROSSSALARY" />
					<display:column property="da" title="DA" />
					<display:column property="allowance" title="ALLOWANCE" />
					<display:column property="medical" title="MEDICAL" />
					<display:column property="servant" title="SERVANT" />
				
				</display:table>
		
			</td>
			
	</tr>
	</table>
</div>

<script type="text/javascript">


showreport('2014_01_01');
$("#datefilter").val('2014_01_01');

var colors = ['#C0C0C0','#A5DBFC', '#CDE8FA', '#D9F0FA', '#0099F9', '#1BA4F9', '#41B2FA', '#63C1FA', '#83CDFA']; 

function makereport(d){
 	$.ajax({
   		type:'GET',
   		url:"/taxmanagement/jsp/ajax/reportajax.jsp?username=<%=session.getAttribute(Common.SESSIONKEY.LOGGEDINUSERNAME.name())%>&datestring="+d,
   		cache:false,
   		success: function(response) {
   			
   			$("#datatable").find("tr:gt(0)").remove();
   			
   			if(response != null && response != 'null'){
   				var x = JSON.parse(response);
    			makechart(x.paidtax);
    			datatable(x.paidtax);
    			
    			$("#totaltax").html(x.tax);
    			$("#grosssalary").html(x.grosssalary);
    			
   			}
   		}
   	}); 
}
 
 function showreport(f){
	 makereport(f);
 }
 
 
 
 function datatable(y){
	 for(var i=0 ; i < y.length ; i++){
		 $('#datatable tr:last').after('<tr style="background-color: '+colors[i]+'"><td>'+y[i][0]+'</td><td>'+y[i][1]+'</td></tr>');
	 }
 }
 
 
 </script>

<div id="displayset2"  class="displayset">
	<table border="0" width="100%" height="90%" >
	<tr>
	
	
			<td align="center" width="30%">
			
			<div class="shadow">
			YEAR OF ASSESSMENT : 
			<select id="datefilter" onchange="showreport(this.value)" > 
				<option value="2014_01_01">2014</option>
				<option value="2013_01_01">2013</option>
				<option value="2012_01_01">2012</option>
				<option value="2011_01_01">2011</option>
			</select>
			</div>
			<br><br><br><br>
	
				<table border="0" width="200px" align="center" class="shadow">
					<tr>
						<th align="center">Total Tax - </th>
						<td align="center"><span id="totaltax"></span></td>
					</tr>
					<tr>
						<th align="center">Gross salary - </th>
						<td align="center"><span id="grosssalary"></span></td>
					</tr>
				</table>
	
	
	
	
			</td>
	
	
	
		<td align="center" width="35%">
		
				<h4 class="shadow"><u>TAX PAID</u></h4>
				
				<table border="0" width="300px" align="center" id="datatable" class="shadow">
					<tr><th align="center">MONTH</th><th align="center">TAX PAID</th></tr>
					<tr style="background-color: #A5DBFC"><td colspan="2">NO DATA FOUND</td></tr>
				</table>
				
		
		   </td>
		   <td align="center" width="35%">   
		   	
		       <div id="graph" class="shadow">Loading graph...</div>
		       
		       <script type="text/javascript">
			       
			       function makechart(y){
		    			var usecolor = new Array(); 
		    			
		    			for(var i=0 ; i < y.length ; i++){
		    				usecolor[i] = colors[i];
		    			}
		    			
						var myChart = new JSChart('graph', 'pie');
						myChart.setDataArray(y);
						myChart.colorizePie(usecolor);
						myChart.setTitle('INCOME TAX PAID (MONTHLY)');
						myChart.setTitleColor('#8E8E8E');
						myChart.setTitleFontSize(11);
						myChart.setTextPaddingTop(30);
						myChart.setPieUnitsColor('#8F8F8F');
						myChart.setPieValuesColor('#000000');
						myChart.setSize(616, 321);
						myChart.setPiePosition(308, 190);
						myChart.setPieRadius(100);
						myChart.setBackgroundImage('chart_bg.jpg');
						myChart.draw();
			    	   
			       }
			       
				</script>
		   </td>
	</tr>
	
	
	</table>
</div>

    </body>

</html>
