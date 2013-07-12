<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert key</title>
</head>
<body bgcolor="grey">
 <%

response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Expires","0");
response.setDateHeader("Expires",-1);

HttpSession sess=request.getSession(false);
if(sess!=null && sess.getAttribute("username")!= null && !sess.isNew()){

	
	
	%>

<table border=2 bordercolor="black" align=center>
<form action="InsertKeyword"  method="post">
<tr>

<td>Keyword</td>
<td>Keyword Description:</td>
<td>Date_of_entry</td>
</tr>
<tr>

<td><input type= "text" name="keyword"/></td>
<td><input type= "text" name="key_description"/></td>
<td><input type= "text" name="date_of_entry"/></td>
</tr>

</table>

<center><input type="submit" value="add!"/>
<input type ="reset" value="Reset"/></center>
<br><br><br><br><br><br><a href ="admin.jsp"><h2>back</h2></a>
<br><br><br><br><br><br><br><br><br><br><br><br><a href ="LogoutController"><h1>logout!</h1></a>
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