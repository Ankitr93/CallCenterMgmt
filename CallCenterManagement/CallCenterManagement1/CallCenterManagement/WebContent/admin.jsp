<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>administrator</title>
</head>

<body style="background-color:grey">
 <%

response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Expires","0");
response.setDateHeader("Expires",-1);

HttpSession sess=request.getSession(false);
if(sess!=null && sess.getAttribute("username")!= null && !sess.isNew()){

	
	
	%>

<center>
<font size="8" face="times new roman" color="black">
WELCOME<br>  You have successfully logged in!! </font>
</center><br>
<br><br><br><br><a><img src="C:\Users\SHAMIK\CallCenterManagement1\talent.jpg" height="400"width="450" align="right"></a>
<pre><right>
                                          <br><br><br><br><br><br><LI><font face="georgia" size="6"><a href="newemp.jsp">Add new employee</a></font></LI>
                                           <LI><font face= "georgia" size="6"><a href="keyword.jsp">Keyword Entry</a></font></LI>
                                            <LI><font face= "georgia" size="6"><a href="pendingquery.jsp">Pending query</a></font></LI>
                                            <LI><font face= "georgia" size="6"><a href="updatequery.jsp">Update query</a></font></LI>
                                             <LI><font face= "georgia" size="6"><a href="emp.jsp">View Employee Database</a></font></LI>
                                              <LI><font face= "georgia" size="6"><a href="keydetails.jsp">View keyword Database</a></font></LI>
<br><br><a href ="LogoutController"><h1>logout!</h1></a></right></pre>

<% 

}
else
	
{
	response.sendRedirect("homepage.jsp");
	
}
%>
</body>
</html>