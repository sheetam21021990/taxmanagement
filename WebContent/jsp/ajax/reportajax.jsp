<%@ page import ="com.taxmanagement.impl.IncomeTaxDetailImpl"%>
<%@ page import ="java.sql.Date"%>
<%@ page session ="true" %>

<%

response.setContentType("text/html");
response.setHeader("Cache-Control", "no-cache");
String finalSearch="";

String username = request.getParameter("username");
String datestring = request.getParameter("datestring");

IncomeTaxDetailImpl impl = new IncomeTaxDetailImpl(); 

try{

finalSearch = impl.getTaxReport(username, datestring);

}

catch(Exception ex)
{
ex.printStackTrace();
}
response.setStatus(200);
response.getWriter().write(finalSearch);

%>