<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>employee</title>
</head>
<body>
<body style="background-color:grey">
 <%

response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Expires","0");
response.setDateHeader("Expires",-1);

HttpSession sess=request.getSession(false);
if(sess!=null && sess.getAttribute("username")!= null && !sess.isNew()){

	
	
	%>
	<a><img alt="employee" src="C:\Users\SHAMIK\CallCenterManagement1\1.jpg" height="200"width="800"></a><br>
<center>
<font size="8" face="times new roman" color="black">
WELCOME<br>  You have successfully logged in!! </font>
</center>

<LI><br><br><br><br><br><br><br><br><br><font face="georgia" size="6"><a href="customerdetails.jsp">Add new Customer</a></font></LI>
<LI><font face="georgia" size="6"><a href="query1.jsp">new query</a></font></LI>
<LI><font face="georgia" size="6"><a href="display.jsp">view query database</a></font></LI>
<LI><font face="georgia" size="6"><a href="cust.jsp">view customer database</a></font></LI>
<LI><font face="georgia" size="6"><a href="searchkey.jsp">search keyword database</a></font></LI>
<LI><font face="georgia" size="6"><a href="updateprofile.jsp">update your profile</a></font></LI>
<a href ="LogoutController" ><h1>logout!</h1></a>

<% 

}
else
	
{
	response.sendRedirect("homepage.jsp");
	
}
%>
</body>
</html>