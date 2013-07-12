<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body bgcolor='skyblue'><font size=500>
<%

response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Expires","0");
response.setDateHeader("Expires",-1);

HttpSession sess=request.getSession(false);
if(sess!=null && sess.getAttribute("username")!= null && !sess.isNew()){

	
	
	%>

<marquee direction right><b>Update your Details</b></marquee></font>

<form method="post" action="UpdateEmployee"><align=left>
<font size=5>
Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="password"/><br/><br/>
Address:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="emp_address"/><br/><br/>
ContactNo:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="emp_mobile"/><br/><br/>
Email_id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="email_id"/><br/><br/>
<center>
<input type="submit" value="Update"/>&nbsp;&nbsp;
<input type="Reset" value="Clear"/>
</center>
<a href ="LogoutController"><h1>logout!</h1></a>
<a href="employee.jsp">Back</a>
</form>
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