<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

<marquee direction right><b>Employee Details</b></marquee></font>

<form method="post" action="InsertEmployee"><align=left>
<font size=5>
Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="password"/><br/><br/>
Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="emp_name"/><br/><br/>
Sex:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="emp_sex" value="male"/>male<input type="radio" name="emp_sex" value="female"/>female<br/><br/>
Address:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="emp_address"/><br/><br/>
ContactNo:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="emp_mobile"/><br/><br/>
Email_id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="email_id"/><br/><br/>
Designation:&nbsp;&nbsp;<select name="emp_designation">
<option value="admin">Administrator</option>
<option value="employee">Customer Executive</option>
</select><br/><br/>
Salary:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="emp_salary"><br/><br/><br/><align/>
Date of Birth:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="date_of_birth"/><br/><br/>
Date of Join:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="date_of_join"/><br/><br/>
<center>
<input type="submit" value="ADD"/>&nbsp;&nbsp;
<input type="Reset" value="Clear"/>
</center>
<a href ="LogoutController"><h1>logout!</h1></a>
<a href="admin.jsp">Back</a>
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