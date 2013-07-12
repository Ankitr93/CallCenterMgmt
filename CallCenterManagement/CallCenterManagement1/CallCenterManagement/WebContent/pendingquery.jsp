
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>pending query</title>
</head>
<body bgcolor="grey"><center>
<%

response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Expires","0");
response.setDateHeader("Expires",-1);

HttpSession sess=request.getSession(false);
if(sess!=null && sess.getAttribute("username")!= null && !sess.isNew()){

	
	
	%>

<form action="uqueryview.do" method="get">
<pre>



<h2>
<a href='pending.jsp'>view</a><br><br>
<a href='admin.jsp'>Back</a></h2>
<br><br><br><br><br><br><br><br><br><a href ="LogoutController"><h1>logout!</h1></a>
</pre></form></center>
<% 

}
else
	
{
	response.sendRedirect("homepage.jsp");
	
}
%>


</body>
</html>