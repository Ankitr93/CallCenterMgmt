<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<form action="InsertQuery"  method="post">
<tr>
<td>Employee ID:</td>
<td>Customer ID:</td>
<td>Query:</td>
<td>Query Solution:</td>
<td>Status:</td>
<td>Date of Query:</td>
</tr>
<tr>
<td><input type= "text" name="emp_id"/></td>
<td><input type= "text" name="customer_id"/></td>
<td><input type= "text" name="query"/></td>
<td><input type= "text" name="query_solution"/></td>
<td>Status:&nbsp;&nbsp;<select name="query_status">
<option value="notdone">notdone</option>
<option value="done">done</option>
</select>
<td><input type= "text" name="date_of_query"/></td>
<br/>
</td></tr>
</table>

<center>

<input type="submit" value="add"/>
<input type ="reset" value="Reset"/></center>
<br><br><br><br><br><br><br><br><br><br><br><br><a href ="LogoutController"><h1>logout!</h1></a>
<br><br><br><br><br><br><a href ="newquery.jsp"><h2>back</h2></a>
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