<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<title>Display keyword Details</title>
</head>
<body bgcolor="#CDFFFF">



<pre>

                                                                                                        <a href ='logout.do'>[Logout]</a>

</pre>
    
                                                                                                       
<%
try {

String connectionURL = "jdbc:mysql://localhost:3306/call_centre_management";

Connection connection = null;

ResultSet keyrs = null;

Class.forName("com.mysql.jdbc.Driver").newInstance();

connection = DriverManager.getConnection(connectionURL, "root", "");

keyrs =(ResultSet)request.getAttribute("keyrs"); 
%>
<font color="blue"><center><u><h2>Desired Keyword Details </h2></u></center></font>

<table align="center" cellpadding="25" border="1" style="background-color: grey">

<tr>
<th>key Id</th>
<th>key</th>
<th>key Description</th>
<th>date of entry</th>
</tr>



<%
while (keyrs.next()) {
%>
<tr>
<td><%=keyrs.getInt(1)%></td>
<td><%=keyrs.getString(2)%></td>
<td><%=keyrs.getString(3)%></td>
<td><%=keyrs.getString(4)%></td>
</tr>
<% } %>
<%
keyrs.close();

connection.close();
} catch (Exception ex) {
%>

<font size="+3" color="red">
<%
out.println("Unable to connect to database.");
}
%>
</font>
</table>

<form action="employee.jsp" method="get" >
<button type="submit"> Back</button>
</form>


</body>
</html>