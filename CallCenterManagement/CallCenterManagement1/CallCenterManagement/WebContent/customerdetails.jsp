<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert new customer</title>
</head>
<body bgcolor="skyblue"><font size=500>
 <%

response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Expires","0");
response.setDateHeader("Expires",-1);

HttpSession sess=request.getSession(false);
if(sess!=null && sess.getAttribute("username")!= null && !sess.isNew()){

	
	
	%>

<marquee direction right><b> CustomerDetails</b></marquee></font>

<form method="post" action="InsertCustomer"><align=left>
<font size=5>
Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="customer_name"/><br/><br/>
Sex:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="customer_sex" value="male"/>male<input type="radio" name="customer_sex" value="female"/>female<br/><br/>
Address:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="customer_address"/><br/><br/>
ContactNo:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="customer_mobile"/><br/><br/>
Email_id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="email_id"/><br/><br/>
Date of Birth:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="date_of_birth"/><br/><br/>
Date of Register:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="date_of_register"/><br/><br/>
<center>
<input type="submit" value="ADD"/>&nbsp;&nbsp;
<input type="Reset" value="Clear"/>
</center>
<br><br><br><a href="LogoutController"><h1>logout!</h1></a>
<br><a href ="employee.jsp"><h2>Back</h2></a>
</font>
</form>
<% 

}
else
	
{
	response.sendRedirect("homepage.jsp");
	
}
%>

</body>
</html>