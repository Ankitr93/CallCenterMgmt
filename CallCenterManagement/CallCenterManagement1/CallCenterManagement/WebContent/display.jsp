<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<title>Query Details</title>
</head>
<body bgcolor="grey">



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
String QueryString = "SELECT * from enquiry_details";
rs = statement.executeQuery(QueryString);
%>
<font color="blue"><center><u><h2>Details of query </h2></u></center></font>

<table align="center" cellpadding="25" border="1" style="background-color: grey">

<tr>
<th>Query_ID</th>
<th>Employee_ID</th>
<th>Customer_ID</th>
<th>Query</th>
<th>Query Solution</th>
<th>Query Status</th>
<th>Date of Query</th>
</tr>



<%
while (rs.next()) {
%>
<tr>
<td><%=rs.getInt(1)%></td>
<td><%=rs.getInt(2)%></td>
<td><%=rs.getInt(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getString(7) %></td>
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

<form action="employee.jsp" method="get" >
<button type="submit"> Back</button>
</form>


</body>
</html>