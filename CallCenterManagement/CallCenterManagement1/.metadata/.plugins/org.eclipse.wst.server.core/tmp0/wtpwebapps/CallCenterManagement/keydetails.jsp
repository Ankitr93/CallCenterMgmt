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

                                                                                                        <a href ='LogoutController'>[Logout]</a>

</pre>
    
                                                                                                       
<%
try {

String connectionURL = "jdbc:mysql://localhost:3306/call_centre_management";

Connection connection = null;

Statement statement = null;

ResultSet rs = null;

Class.forName("com.mysql.jdbc.Driver").newInstance();

connection = DriverManager.getConnection(connectionURL, "root", "");

statement = connection.createStatement();
String QueryString = "SELECT * from keyword";
rs = statement.executeQuery(QueryString);
%>
<font color="blue"><center><u><h2>Keyword Details </h2></u></center></font>

<table align="center" cellpadding="25" border="1" style="background-color: grey">

<tr>
<th>key Id</th>
<th>key</th>
<th>key Description</th>
<th>date of entry</th>
</tr>



<%
while (rs.next()) {
%>
<tr>
<td><%=rs.getInt(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
</tr>
<% } %>
<%
rs.close();
statement.close();
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

<form action="admin.jsp" method="get" >
<button type="submit"> Back</button>
</form>


</body>
</html>